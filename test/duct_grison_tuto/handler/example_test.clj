(ns duct-grison-tuto.handler.example-test
  (:require [clojure.test :refer :all]
            [integrant.core :as ig]
            [ring.mock.request :as mock]
            [duct-grison-tuto.handler.example :as example]))

(deftest smoke-test
  (testing "example page exists"
    (let [handler  (ig/init-key :duct-grison-tuto.handler/example {})
          response (handler (mock/request :get "/example"))]
      (is (= :ataraxy.response/ok (first response)) "response ok"))))
