-- Haskell Example 2
-- Type inference

-- the type of foo is inferred to be Integer -> Integer -> Integer  
-- since performing a '+' operation on a number literal must mean that x is an integer
-- Type inference is done at compile time in Haskell
foo x = x + 1

main = do
    putStrLn "5 + 1: "
    print(foo 5)