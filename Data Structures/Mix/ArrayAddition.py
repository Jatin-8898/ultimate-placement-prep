def ArrayAdditionI(arr): 

  # get largest number and remove it from array
  goal = max(arr)
  arr.remove(goal)  
  
  # power set
  sets = [[]]
  
  # generate the power set and for each new set
  # check if the temporary sum equals our sum above
  for i in range(0, len(arr)):
    sets_len = len(sets)
    for j in range(0, sets_len):
      temp = sets[j] + [arr[i]]
      sets.append(temp)
      if sum(temp) == goal:
        return "true"
      
  return "false"
    
print ArrayAdditionI(raw_input()) 