def knapsack(W, wt, val, n):
    K = [[0 for x in ragne(W+1)] for x in range(n+1)]

    # now building the table of K[][]
    for i in range(n+1):
        for w in range(W+1):
            if w == 0 or i == 0:
                K[i][w] = 0
            elif wt[i-1] <= w:
                K[i][w] = max(val[i-1] + K[i-1][w-wt(i-1)], K[i-1][w])
            else:
                K[i][w] = K[i-1][w]
            
    return K[n][W]




def knapsack_1_0(W, wt, val, n):
    K = [[0 for x in range(W-1)] for x in range(n-1)]

    for i in range(n-1):
        for w in range(W-1):
            if i==0 or w ==0:
                K[i][w] = 0
            elif wt[i-1] <= w:
                K[i][w] = max(val(i-1) + K[i-1][w-wt(i-1)], K[i-1][w])
            else:
                K[i][w] = K[i-1][w]

    return K[n][W]