# our two sum function which will return
# all pairs in the list that sum up to S
def twoSum(arr, S):

  sums = []
  hashTable = {}

  # check each element in array
  for i in range(0, len(arr)):

    # calculate S minus current element
    sumMinusElement = S - arr[i]

    # check if this number exists in hash table
    # if so then we found a pair of numbers that sum to S
    if sumMinusElement in hashTable:
      sums.append([arr[i], sumMinusElement])

    # add the current number to the hash table
    hashTable[arr[i]] = arr[i]

  # return all pairs of integers that sum to S
  return sums

print twoSum([3, 5, 2, -4, 8, 11], 7) 