-- Haskell Example 3
-- Variable Immutability

import Data.List

main = do
    let x = 5
    -- raises an error since variables cannot be changed after assignment in Haskell
    --x = x + 1
    
    -- returns 5
    print(x)
    
    let arr = [8,2,5,15,5,5,7,1]
    
    -- prints sorted array: [1,2,5,5,5,7,8,15]
    print(sort arr)
    
    -- prints the original array above, since the array is immutable
    print(arr)
    