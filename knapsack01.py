
# Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. 
# In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. 
# Also given an integer W which represents knapsack capacity, 
# find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. 
# You cannot break an item, either pick the complete item or don’t pick it (0-1 property).

# Input:
# N = 3
# W = 4
# values[] = {1,2,3}
# weight[] = {4,5,1}
# Output: 3
# Example 2:

# Input:
# N = 3
# W = 3
# values[] = {1,2,3}
# weight[] = {4,5,6}
# Output: 0

# production level code. -- 
# time and space complexity. -- 


def knapsack(capacity, weights, values, numberOfGoods):

    maxValue = [0 for i in range (capacity + 1)]

    for i in range(1, numberOfGoods + 1):
        for j in range(capacity, 0, -1):

            if j >= weights[i-1]:

                maxValue[j] = max(maxValue[j], maxValue[j - weights[i-1]] + values[i-1])


    return maxValue[capacity]



N = 3
W = 50
values = [60,100,120]
weight = [10,20,30]

print(knapsack(W, weight, values, N))