rotation :: [a] -> Int -> [a]
rotation arr k = reverse(whole)
    where whole = reverse(take k arr) ++ reverse(drop k arr)

main = do
    print(rotation [1..5] 3)