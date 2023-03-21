module Main where

import Prelude

import Effect (Effect)
import Effect.Console (log)

import Data.List (List(..))
import Data.List.Types ((:))

singleton :: forall a. a -> List a
singleton a = a : Nil

null :: forall a. List a -> Boolean
null Nil = true
null _ = false

snoc :: forall a. List a -> a -> List a
snoc Nil x = x : Nil
snoc (y : ys) x = y : snoc ys x

length :: forall a. List a -> Int
length Nil = 0
length (x : xs) = 1 + length xs

main :: Effect Unit
main = do
  let list = singleton 5
  log $ "singleton: " <> show list

  log $ "null: " <> show (null list)

  let list2 = snoc list 4
  log $ "snoc: " <> show list2

  log $ "length: " <> show (length list2)
