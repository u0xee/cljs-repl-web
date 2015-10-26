(ns ^:figwheel-load cljs-bootstrap.core-test
  (:require [cljs.test :refer-macros [deftest is]]
            [cljs-bootstrap.core :as core]
            [cljs-bootstrap.common :as common]))

(deftest prompt
  (is (not (empty? (re-seq #"=>" (core/get-prompt))))))