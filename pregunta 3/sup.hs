
fibo :: Int -> Int
fibo n| n == 1 = 1
      | n == 2 = 1 
      | n > 2 = fibo (n-1) + fibo (n-2)
        

fibo1 :: (x -> x)->x->x
fibo1 f x = f x

main = do
   print "ingrese los valor :"
   x <- getLine
   putStr "El resultado de la fibo sup es: "
   print $ (fibo1 fibo(read x))
