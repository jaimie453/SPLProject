-- Haskell Example 1

getSquareArea :: Integer -> Integer     -- function declaration
getSquareArea size = size * size        -- function declaration

main = do
    putStrLn("Area of square size 5 has area: ")
    print(getSquareArea 5)              -- prints 25
    
    putStrLn("Area of square size 10 has area: ")
    print(getSquareArea 10)             -- prints 100
