(ns cljs-browser-repl.cljs-api)

(def cljs-api-edn {:symbols
 {"butlast"
  {:description
   "Returns a sequence of all but the last item in `s`.\n\n`butlast` runs in linear time.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;butlast &#91;1 2 3&#93;&#41;\n;;=&gt; &#40;1 2&#41;\n\n&#40;butlast &#91;1 2&#93;&#41;\n;;=&gt; &#40;1&#41;\n\n&#40;butlast &#91;1&#93;&#41;\n;;=&gt; nil\n\n&#40;butlast &#91;&#93;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "butlast",
   :signature ["[s]"],
   :type "function",
   :related
   ["cljs.core/first"
    "cljs.core/rest"
    "cljs.core/last"
    "cljs.core/next"
    "cljs.core/drop-last"
    "cljs.core/take-last"],
   :examples-strings
   [[["(butlast [1 2 3]) ;;=> (1 2)"
      "(butlast [1 2]) ;;=> (1)"
      "(butlast [1]) ;;=> nil"
      "(butlast []) ;;=> nil"]]],
   :description-html
   "<p>Returns a sequence of all but the last item in <code>s</code>.</p><p><code>butlast</code> runs in linear time.</p>",
   :examples
   [{:id "7a4676",
     :content
     "```clj\n(butlast [1 2 3])\n;;=> (1 2)\n\n(butlast [1 2])\n;;=> (1)\n\n(butlast [1])\n;;=> nil\n\n(butlast [])\n;;=> nil\n```"}],
   :full-name "cljs.core/butlast",
   :docstring
   "Return a seq of all but the last item in coll, in linear time"},
  "read-2-chars"
  {:ns "cljs.reader",
   :name "read-2-chars",
   :signature ["[reader]"],
   :type "function",
   :full-name "cljs.reader/read-2-chars",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMap.EMPTY"
  {:ns "cljs.core",
   :name "PersistentArrayMap.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentArrayMap.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "float"
  {:ns "cljs.core",
   :name "float",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/float",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ignore"
  {:description
   "Causes the following form to be completely skipped by the reader.  This is a\nmore complete removal than the `comment` macro which yields nil.",
   :examples-htmls
   ["<pre><code class=\"clj\">{:foo #&#95;bar 2}\n;;=&gt; {:foo 2}\n</code></pre><p>To comment out the last line of a function without worrying about commenting out the trailing parentheses:</p><pre><code class=\"clj\">&#40;defn foo &#91;&#93;\n  &#40;println &quot;hello&quot;&#41;\n  #&#95;&#40;println &quot;world&quot;&#41;&#41;\n</code></pre>"],
   :ns "syntax",
   :name "ignore",
   :type "syntax",
   :related ["syntax/comment" "cljs.core/comment"],
   :examples-strings
   [[["{:foo #_bar 2} ;;=> {:foo 2}"]
     ["(defn foo []"
      "  (println \"hello\")"
      "  #_(println \"world\"))"]]],
   :description-html
   "<p>Causes the following form to be completely skipped by the reader.  This is a more complete removal than the <code>comment</code> macro which yields nil.</p>",
   :examples
   [{:id "f36d7a",
     :content
     "```clj\n{:foo #_bar 2}\n;;=> {:foo 2}\n```\n\nTo comment out the last line of a function without worrying about commenting out\nthe trailing parentheses:\n\n```clj\n(defn foo []\n  (println \"hello\")\n  #_(println \"world\"))\n```"}],
   :full-name "syntax/ignore"},
  "*print-level*"
  {:ns "cljs.core",
   :name "*print-level*",
   :type "dynamic var",
   :full-name "cljs.core/*print-level*",
   :docstring
   "*print-level* controls how many levels deep the printer will\nprint nested objects. If it is bound to logical false, there is no\nlimit. Otherwise, it must be bound to an integer indicating the maximum\nlevel to print. Each argument to print is at level 0; if an argument is a\ncollection, its items are at level 1; and so on. If an object is a\ncollection and is at a level greater than or equal to the value bound to\n*print-level*, the printer prints '#' to represent it. The root binding\nis nil indicating no limit.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "re-pattern"
  {:description
   "Returns an instance of RegExp which has compiled the provided string.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "re-pattern",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns an instance of RegExp which has compiled the provided string.</p>",
   :full-name "cljs.core/re-pattern",
   :docstring
   "Returns an instance of RegExp which has compiled the provided string."},
  "gen-apply-to"
  {:ns "cljs.core",
   :name "gen-apply-to",
   :signature ["[]"],
   :type "macro",
   :full-name "cljs.core/gen-apply-to",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Subvec"
  {:ns "cljs.core",
   :name "Subvec",
   :signature ["[meta v start end __hash]"],
   :type "type",
   :full-name "cljs.core/Subvec",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ICrossPageChannel"
  {:ns "clojure.browser.net",
   :name "ICrossPageChannel",
   :type "protocol",
   :full-name "clojure.browser.net/ICrossPageChannel",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pprint"
  {:ns "cljs.pprint",
   :name "pprint",
   :signature ["[object]" "[object writer]"],
   :type "function",
   :full-name "cljs.pprint/pprint",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-mod"
  {:description
   "Returns the modulus of dividing numerator `n` by denominator `d`, with JavaScript's\noriginal behavior for negative numbers.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).\n\nEquivalent to `x % y` in JavaScript.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;js-mod -5 3&#41;\n;;=&gt; -2\n\n&#40;js-mod 5 3&#41;\n;;=&gt; 2\n\n&#40;js-mod 5 0&#41;\n;;=&gt; NaN\n</code></pre>"],
   :ns "cljs.core",
   :name "js-mod",
   :signature ["[n d]"],
   :type "function/macro",
   :related ["cljs.core/mod"],
   :examples-strings
   [[["(js-mod -5 3) ;;=> -2"
      "(js-mod 5 3) ;;=> 2"
      "(js-mod 5 0) ;;=> NaN"]]],
   :description-html
   "<p>Returns the modulus of dividing numerator <code>n</code> by denominator <code>d</code>, with JavaScript's original behavior for negative numbers.</p><p>Returns <code>NaN</code> when <code>d</code> is 0 (divide by 0 error).</p><p>Equivalent to <code>x % y</code> in JavaScript.</p>",
   :examples
   [{:id "75fa6d",
     :content
     "```clj\n(js-mod -5 3)\n;;=> -2\n\n(js-mod 5 3)\n;;=> 2\n\n(js-mod 5 0)\n;;=> NaN\n```"}],
   :full-name "cljs.core/js-mod",
   :docstring
   "Modulus of num and div with original javascript behavior. i.e. bug for negative numbers"},
  "partial"
  {:description
   "Takes a function `f` and fewer than the normal arguments to `f`. Returns a\nfunction that takes a variable number of additional arguments. When called, the\nreturned function calls `f` with the original arguments plus the additional\narguments.\n\n`((partial f a b) c d)` => `(f a b c d)`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "partial",
   :signature
   ["[f]"
    "[f arg1]"
    "[f arg1 arg2]"
    "[f arg1 arg2 arg3]"
    "[f arg1 arg2 arg3 & more]"],
   :type "function",
   :related ["cljs.core/comp" "cljs.core/juxt"],
   :examples-strings [],
   :description-html
   "<p>Takes a function <code>f</code> and fewer than the normal arguments to <code>f</code>. Returns a function that takes a variable number of additional arguments. When called, the returned function calls <code>f</code> with the original arguments plus the additional arguments.</p><p><code>&#40;&#40;partial f a b&#41; c d&#41;</code> => <code>&#40;f a b c d&#41;</code></p>",
   :full-name "cljs.core/partial",
   :docstring
   "Takes a function f and fewer than the normal arguments to f, and\nreturns a fn that takes a variable number of additional args. When\ncalled, the returned function calls f with args + additional args."},
  "stop"
  {:ns "cljs.repl.server",
   :name "stop",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl.server/stop",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "TaggedLiteral"
  {:ns "cljs.core",
   :name "TaggedLiteral",
   :signature ["[tag form]"],
   :type "type",
   :full-name "cljs.core/TaggedLiteral",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "NaN"
  {:description
   "The IEEE 754 Floating Point representation of NaN (not a number), an undefined\nor unrepresentable value.\n\nTo test for NaN, use the native JavaScript [`js/isNaN`] or the safer [`js/Number.isNaN`].\n\n[`js/isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isNaN\n[`js/Number.isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN",
   :examples-htmls
   ["<pre><code class=\"clj\">NaN\n;;=&gt; NaN\n</code></pre><p>Testing for NaN:</p><pre><code class=\"clj\">&#40;js/Number.isNaN &#40;/ 0 0&#41;&#41;\n;;=&gt; true\n\n&#40;js/Number.isNaN 1&#41;\n;;=&gt; false\n</code></pre><p>Equivalent to the JavaScript symbol:</p><pre><code class=\"clj\">js/NaN\n;;=&gt; NaN\n</code></pre>"],
   :ns "syntax",
   :name "NaN",
   :type "special symbol",
   :related ["syntax/Infinity" "syntax/nil"],
   :examples-strings
   [[["NaN ;;=> NaN"]
     ["(js/Number.isNaN (/ 0 0)) ;;=> true"
      "(js/Number.isNaN 1) ;;=> false"]
     ["js/NaN ;;=> NaN"]]],
   :description-html
   "<p>The IEEE 754 Floating Point representation of NaN (not a number), an undefined or unrepresentable value.</p><p>To test for NaN, use the native JavaScript [<code>js/isNaN</code>] or the safer [<code>js/Number.isNaN</code>].</p><p>[<code>js/isNaN</code>]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isNaN [<code>js/Number.isNaN</code>]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN</p>",
   :examples
   [{:id "9661ba",
     :content
     "```clj\nNaN\n;;=> NaN\n```\n\nTesting for NaN:\n\n```clj\n(js/Number.isNaN (/ 0 0))\n;;=> true\n\n(js/Number.isNaN 1)\n;;=> false\n```\n\nEquivalent to the JavaScript symbol:\n\n```clj\njs/NaN\n;;=> NaN\n```"}],
   :full-name "syntax/NaN"},
  "test-var-block"
  {:ns "cljs.test",
   :name "test-var-block",
   :signature ["[v]"],
   :type "function",
   :full-name "cljs.test/test-var-block",
   :docstring
   "Like test-var, but returns a block for further composition and\nlater execution.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parse-stacktrace"
  {:ns "cljs.repl.browser",
   :name "parse-stacktrace",
   :signature ["[repl-env st err opts]"],
   :type "multimethod",
   :full-name "cljs.repl.browser/parse-stacktrace",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "boolean"
  {:description
   "Special symbols representing the boolean literals `true` and `false`.\nBoth evaluate to themselves.",
   :examples-htmls
   ["<pre><code class=\"clj\">true\n;;=&gt; true\n\nfalse\n;;=&gt; false\n</code></pre>"],
   :ns "syntax",
   :name "boolean",
   :type "special symbol",
   :related
   ["cljs.core/boolean"
    "special/if"
    "cljs.core/not"
    "cljs.core/true?"
    "cljs.core/false?"],
   :examples-strings [[["true ;;=> true" "false ;;=> false"]]],
   :description-html
   "<p>Special symbols representing the boolean literals <code>true</code> and <code>false</code>. Both evaluate to themselves.</p>",
   :examples
   [{:id "1afc59",
     :content "```clj\ntrue\n;;=> true\n\nfalse\n;;=> false\n```"}],
   :full-name "syntax/boolean"},
  "remove-method"
  {:ns "cljs.core",
   :name "remove-method",
   :signature ["[multifn dispatch-val]"],
   :type "function",
   :full-name "cljs.core/remove-method",
   :docstring
   "Removes the method of multimethod associated with dispatch-value.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "sorted-set"
  {:description "Returns a new sorted set with supplied `keys`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sorted-set",
   :signature ["[& keys]"],
   :type "function",
   :related
   ["cljs.core/sorted-set-by"
    "cljs.core/subseq"
    "cljs.core/rsubseq"
    "cljs.core/sorted-map"],
   :examples-strings [],
   :description-html
   "<p>Returns a new sorted set with supplied <code>keys</code>.</p>",
   :full-name "cljs.core/sorted-set",
   :docstring "Returns a new sorted set with supplied keys."},
  "drop-last"
  {:description
   "Return a lazy sequence of all but the last `n` items in `s`.\n\n`n` defaults to 1.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "drop-last",
   :signature ["[s]" "[n s]"],
   :type "function",
   :related ["cljs.core/drop" "cljs.core/drop-while"],
   :examples-strings [],
   :description-html
   "<p>Return a lazy sequence of all but the last <code>n</code> items in <code>s</code>.</p><p><code>n</code> defaults to 1.</p>",
   :full-name "cljs.core/drop-last",
   :docstring
   "Return a lazy sequence of all but the last n (default 1) items in coll"},
  "vector-seq"
  {:ns "cljs.core",
   :name "vector-seq",
   :signature ["[v offset]"],
   :type "function",
   :full-name "cljs.core/vector-seq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-negate"
  {:ns "cljs.core",
   :name "unchecked-negate",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-negate",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "eval-result"
  {:ns "cljs.repl.rhino",
   :name "eval-result",
   :type "multimethod",
   :full-name "cljs.repl.rhino/eval-result",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ratio-pattern"
  {:ns "cljs.reader",
   :name "ratio-pattern",
   :type "var",
   :full-name "cljs.reader/ratio-pattern",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "split-lines"
  {:description "Splits `s` on `\\n` or `\\r\\n`.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "split-lines",
   :signature ["[s]"],
   :type "function",
   :related ["clojure.string/split"],
   :examples-strings [],
   :description-html
   "<p>Splits <code>s</code> on <code>\\n</code> or <code>\\r\\n</code>.</p>",
   :full-name "clojure.string/split-lines",
   :docstring "Splits s on \n or \r\n."},
  "read-meta"
  {:ns "cljs.reader",
   :name "read-meta",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-meta",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "register-default-tag-parser!"
  {:ns "cljs.reader",
   :name "register-default-tag-parser!",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.reader/register-default-tag-parser!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "map"
  {:description
   "Returns a lazy sequence of applying function `f` to every element of `coll`.\n\nWhen more than one collection is provided, returns a lazy sequence consisting of\nthe result of applying `f` to the set of first items of each `c`, followed by\napplying `f` to the set of second items in each `c`, until any one of the `c`s\nis exhausted. Any remaining items in other `c`s are ignored. Function `f` should\naccept number-of-`c`s arguments.\n\nReturns a transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "map",
   :signature
   ["[f]"
    "[f coll]"
    "[f c1 c2]"
    "[f c1 c2 c3]"
    "[f c1 c2 c3 & colls]"],
   :type "function",
   :related
   ["cljs.core/map-indexed"
    "cljs.core/amap"
    "cljs.core/mapcat"
    "cljs.core/keep"
    "cljs.core/juxt"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of applying function <code>f</code> to every element of <code>coll</code>.</p><p>When more than one collection is provided, returns a lazy sequence consisting of the result of applying <code>f</code> to the set of first items of each <code>c</code>, followed by applying <code>f</code> to the set of second items in each <code>c</code>, until any one of the <code>c</code>s is exhausted. Any remaining items in other <code>c</code>s are ignored. Function <code>f</code> should accept number-of-<code>c</code>s arguments.</p><p>Returns a transducer when no collection is provided.</p>",
   :full-name "cljs.core/map",
   :docstring
   "Returns a lazy sequence consisting of the result of applying f to\nthe set of first items of each coll, followed by applying f to the\nset of second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments. Returns a transducer when\nno collection is provided."},
  "set-connection"
  {:ns "cljs.repl.server",
   :name "set-connection",
   :signature ["[conn]"],
   :type "function",
   :full-name "cljs.repl.server/set-connection",
   :docstring
   "Given a new available connection, either use it to deliver the\nconnection which was promised or store the connection for later\nuse.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "select-keys"
  {:description
   "Returns a map containing only those entries in `map` whose key is in `keys`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "select-keys",
   :signature ["[map keys]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns a map containing only those entries in <code>map</code> whose key is in <code>keys</code>.</p>",
   :full-name "cljs.core/select-keys",
   :docstring
   "Returns a map containing only those entries in map whose key is in keys"},
  "zipmap"
  {:description
   "Returns a map with `keys` mapped to corresponding `vals`.\n\n<pre>user=> (zipmap [:a :b :c :d] [1 2 3 4])\n{:a 1, :b 2, :c 3, :d 4}</pre>",
   :examples-htmls [],
   :ns "cljs.core",
   :name "zipmap",
   :signature ["[keys vals]"],
   :type "function",
   :related ["cljs.core/interleave"],
   :examples-strings [],
   :description-html
   "<p>Returns a map with <code>keys</code> mapped to corresponding <code>vals</code>.</p><p><pre>user=> (zipmap [:a :b :c :d] [1 2 3 4]) {:a 1, :b 2, :c 3, :d 4}</pre></p>",
   :full-name "cljs.core/zipmap",
   :docstring
   "Returns a map with the keys mapped to the corresponding vals."},
  "rseq"
  {:description
   "Returns a sequence of the items in `coll` in reverse order in constant time.\n\nReturns nil if `coll` is empty.\n\n`coll` must be a vector or a sorted-map.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "rseq",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/reverse"],
   :examples-strings [],
   :description-html
   "<p>Returns a sequence of the items in <code>coll</code> in reverse order in constant time.</p><p>Returns nil if <code>coll</code> is empty.</p><p><code>coll</code> must be a vector or a sorted-map.</p>",
   :full-name "cljs.core/rseq",
   :docstring
   "Returns, in constant time, a seq of the items in rev (which\ncan be a vector or sorted-map), in reverse order. If rev is empty returns nil"},
  "file->ns"
  {:ns "cljs.js",
   :name "file->ns",
   :signature ["[file]"],
   :type "function",
   :full-name "cljs.js/file->ns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-int"
  {:ns "cljs.core",
   :name "unchecked-int",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/unchecked-int",
   :docstring "Coerce to int by stripping decimal places.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IConnection"
  {:ns "clojure.browser.net",
   :name "IConnection",
   :type "protocol",
   :full-name "clojure.browser.net/IConnection",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compare"
  {:description
   "Comparator.\n\nReturns a negative number, zero, or a positive number when `x` is logically\n\"less than\", \"equal to\", or \"greater than\" `y`.\n\nUses `IComparable` if available and `google.array.defaultCompare` for objects of\nthe same type. nil is treated as a special case and is always less than any\nother object.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;compare 10 12&#41;\n;;=&gt; -1\n\n&#40;compare 12 10&#41;\n;;=&gt; 1\n\n&#40;compare 10 10&#41;\n;;=&gt; 0\n\n&#40;compare 10 nil&#41;\n;;=&gt;  1\n\n&#40;compare 10 &#40;list 1 2 3&#41;&#41;\n;; Error: compare on non-nil objects of different types\n</code></pre>"],
   :ns "cljs.core",
   :name "compare",
   :signature ["[x y]"],
   :type "function",
   :related
   ["cljs.core/sort-by"
    "cljs.core/sorted-set-by"
    "cljs.core/sorted-map-by"],
   :examples-strings
   [[["(compare 10 12) ;;=> -1"
      "(compare 12 10) ;;=> 1"
      "(compare 10 10) ;;=> 0"
      "(compare 10 nil) ;;=>  1"
      "(compare 10 (list 1 2 3)) ;; Error: compare on non-nil objects of different types"]]],
   :description-html
   "<p>Comparator.</p><p>Returns a negative number, zero, or a positive number when <code>x</code> is logically \"less than\", \"equal to\", or \"greater than\" <code>y</code>.</p><p>Uses <code>IComparable</code> if available and <code>google.array.defaultCompare</code> for objects of the same type. nil is treated as a special case and is always less than any other object.</p>",
   :examples
   [{:id "e13fa0",
     :content
     "```clj\n(compare 10 12)\n;;=> -1\n\n(compare 12 10)\n;;=> 1\n\n(compare 10 10)\n;;=> 0\n\n(compare 10 nil)\n;;=>  1\n\n(compare 10 (list 1 2 3))\n;; Error: compare on non-nil objects of different types\n```"}],
   :full-name "cljs.core/compare",
   :docstring
   "Comparator. Returns a negative number, zero, or a positive number\n when x is logically 'less than', 'equal to', or 'greater than'\n y. Uses IComparable if available and google.array.defaultCompare for objects\nof the same type and special-cases nil to be less than any other object."},
  "IDerefWithTimeout"
  {:ns "cljs.core",
   :name "IDerefWithTimeout",
   :type "protocol",
   :full-name "cljs.core/IDerefWithTimeout",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "split-with"
  {:description
   "Returns a vector of `[(take-while pred coll) (drop-while pred coll)]`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "split-with",
   :signature ["[pred coll]"],
   :type "function",
   :related
   ["cljs.core/split-at"
    "clojure.string/split"
    "cljs.core/take-while"
    "cljs.core/drop-while"],
   :examples-strings [],
   :description-html
   "<p>Returns a vector of <code>&#91;&#40;take-while pred coll&#41; &#40;drop-while pred coll&#41;&#93;</code></p>",
   :full-name "cljs.core/split-with",
   :docstring
   "Returns a vector of [(take-while pred coll) (drop-while pred coll)]"},
  "Symbol"
  {:ns "cljs.core",
   :name "Symbol",
   :signature ["[ns name str _hash _meta]"],
   :type "type",
   :full-name "cljs.core/Symbol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "binding"
  {:description
   "binding => var-symbol init-expr\n\nCreates new bindings for the (already-existing) vars, with the\nsupplied initial values, executes the exprs in an implicit `do`, then\nre-establishes the bindings that existed before.\n\nThe new bindings are made in parallel (unlike `let`); all init-exprs are\nevaluated before the vars are bound to their new values.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def &#94;:dynamic &#42;foo&#42; 1&#41;\n\n&#40;defn do-something &#91;&#93;\n  &#40;println &#42;foo&#42;&#41;&#41;\n\n&#40;binding &#91;&#42;foo&#42; 2&#93;\n  &#40;do-something&#41;&#41;\n;;=&gt; prints 2\n\n&#42;foo&#42;\n;;=&gt; 1\n</code></pre>"],
   :ns "cljs.core",
   :name "binding",
   :signature ["[bindings & body]"],
   :type "macro",
   :related ["cljs.core/let"],
   :examples-strings
   [[["(def ^:dynamic *foo* 1)"
      "(defn do-something []"
      "  (println *foo*))"
      "(binding [*foo* 2]"
      "  (do-something)) ;;=> prints 2"
      "*foo* ;;=> 1"]]],
   :description-html
   "<p>binding => var-symbol init-expr</p><p>Creates new bindings for the (already-existing) vars, with the supplied initial values, executes the exprs in an implicit <code>do</code>, then re-establishes the bindings that existed before.</p><p>The new bindings are made in parallel (unlike <code>let</code>); all init-exprs are evaluated before the vars are bound to their new values.</p>",
   :examples
   [{:id "7dd17f",
     :content
     "```clj\n(def ^:dynamic *foo* 1)\n\n(defn do-something []\n  (println *foo*))\n\n(binding [*foo* 2]\n  (do-something))\n;;=> prints 2\n\n*foo*\n;;=> 1\n```"}],
   :full-name "cljs.core/binding",
   :docstring
   "binding => var-symbol init-expr\n\nCreates new bindings for the (already-existing) vars, with the\nsupplied initial values, executes the exprs in an implicit do, then\nre-establishes the bindings that existed before.  The new bindings\nare made in parallel (unlike let); all init-exprs are evaluated\nbefore the vars are bound to their new values."},
  "int"
  {:description
   "Coerces `x` to an integer by stripping decimal places.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "int",
   :signature ["[x]"],
   :type "function/macro",
   :related ["cljs.core/char" "cljs.core/integer?"],
   :examples-strings [],
   :description-html
   "<p>Coerces <code>x</code> to an integer by stripping decimal places.</p>",
   :full-name "cljs.core/int",
   :docstring "Coerce to int by stripping decimal places."},
  "seq"
  {:description
   "Returns a sequence on the collection. If the collection is empty, returns nil.\n\n`(seq nil)` returns nil.\n\n`seq` also works on strings.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "seq",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/seq?" "cljs.core/empty?"],
   :examples-strings [],
   :description-html
   "<p>Returns a sequence on the collection. If the collection is empty, returns nil.</p><p><code>&#40;seq nil&#41;</code> returns nil.</p><p><code>seq</code> also works on strings.</p>",
   :full-name "cljs.core/seq",
   :docstring
   "Returns a seq on the collection. If the collection is\nempty, returns nil.  (seq nil) returns nil. seq also works on\nStrings."},
  "amap"
  {:description
   "For quickly creating a new JavaScript array by mapping an expression `expr`\nacross a JavaScript array `a`.  The expression can use `ret` as the current\nresult, which is initialized to `a`.  It can also use `idx` to get the current\nindex.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n&#40;amap a i ret &#40;&#42; 10 &#40;aget a i&#41;&#41;&#41;\n;;=&gt; #js &#91;10 20 30&#93;\n</code></pre>"
    "<p>You can also use <code>ret</code> inside the mapped expression if you want to use the current result:</p><pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n&#40;amap a i ret &#40;+ &#40;if &#40;pos? i&#41;\n                   &#40;aget ret &#40;dec i&#41;&#41;\n                   0&#41;\n                 &#40;&#42; 10 &#40;aget a i&#41;&#41;&#41;&#41;\n;;=&gt; #js &#91;10 30 60&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "amap",
   :signature ["[a idx ret expr]"],
   :type "macro",
   :related ["cljs.core/map"],
   :examples-strings
   [[["(def a #js [1 2 3])"
      "(amap a i ret (* 10 (aget a i))) ;;=> #js [10 20 30]"]]
    [["(def a #js [1 2 3])"
      "(amap a i ret (+ (if (pos? i)"
      "                   (aget ret (dec i))"
      "                   0)"
      "                 (* 10 (aget a i)))) ;;=> #js [10 30 60]"]]],
   :description-html
   "<p>For quickly creating a new JavaScript array by mapping an expression <code>expr</code> across a JavaScript array <code>a</code>.  The expression can use <code>ret</code> as the current result, which is initialized to <code>a</code>.  It can also use <code>idx</code> to get the current index.</p>",
   :examples
   [{:id "3a7471",
     :content
     "```clj\n(def a #js [1 2 3])\n(amap a i ret (* 10 (aget a i)))\n;;=> #js [10 20 30]\n```"}
    {:id "0f57af",
     :content
     "You can also use `ret` inside the mapped expression if you want to use the\ncurrent result:\n\n```clj\n(def a #js [1 2 3])\n(amap a i ret (+ (if (pos? i)\n                   (aget ret (dec i))\n                   0)\n                 (* 10 (aget a i))))\n;;=> #js [10 30 60]\n```"}],
   :full-name "cljs.core/amap",
   :docstring
   "Maps an expression across an array a, using an index named idx, and\nreturn value named ret, initialized to a clone of a, then setting\neach element of ret to the evaluation of expr, returning the new\narray ret."},
  "*print-right-margin*"
  {:ns "cljs.pprint",
   :name "*print-right-margin*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-right-margin*",
   :docstring
   "Pretty printing will try to avoid anything going beyond this column.\nSet it to nil to have pprint let the line be arbitrarily long. This will ignore all\nnon-mandatory newlines.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "insert-right"
  {:ns "clojure.zip",
   :name "insert-right",
   :signature ["[loc item]"],
   :type "function",
   :full-name "clojure.zip/insert-right",
   :docstring
   "Inserts the item as the right sibling of the node at this loc,\nwithout moving",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IChunkedNext"
  {:ns "cljs.core",
   :name "IChunkedNext",
   :type "protocol",
   :full-name "cljs.core/IChunkedNext",
   :docstring "Protocol for accessing the chunks of a collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ancestors"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "ancestors",
   :signature ["[tag]" "[h tag]"],
   :type "function",
   :related
   ["cljs.core/descendants"
    "cljs.core/isa?"
    "cljs.core/make-hierarchy"
    "cljs.core/derive"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/ancestors",
   :docstring
   "Returns the immediate and indirect parents of tag, either via a JavaScript type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy"},
  "object-array"
  {:ns "cljs.core",
   :name "object-array",
   :signature ["[size-or-seq]" "[size init-val-or-seq]"],
   :type "function",
   :full-name "cljs.core/object-array",
   :docstring
   "Creates an array of objects. Does not coerce array, provided for compatibility\nwith Clojure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "shorts"
  {:ns "cljs.core",
   :name "shorts",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/shorts",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cond->"
  {:description
   "Takes an expression and a set of test/form pairs. Threads `expr` (via `->`)\nthrough each form for which the corresponding test expression is true.\n\nNote that, unlike `cond` branching, `cond->` threading does not short circuit\nafter the first true test expression.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a 12&#41;\n&#40;cond-&gt; a\n  &#40;&gt; a 10&#41; &#40;str &quot; is greater than 10&quot;&#41;\n  &#40;&lt; a 20&#41; &#40;str &quot; and less than 20&quot;&#41;&#41;\n;;=&gt; &quot;12 is greater than 10 and less than 20&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "cond->",
   :signature ["[expr & clauses]"],
   :type "macro",
   :related
   ["cljs.core/->"
    "cljs.core/->>"
    "cljs.core/cond->>"
    "cljs.core/cond"],
   :examples-strings
   [[["(def a 12)"
      "(cond-> a"
      "  (> a 10) (str \" is greater than 10\")"
      "  (< a 20) (str \" and less than 20\")) ;;=> \"12 is greater than 10 and less than 20\""]]],
   :description-html
   "<p>Takes an expression and a set of test/form pairs. Threads <code>expr</code> (via <code>-&gt;</code>) through each form for which the corresponding test expression is true.</p><p>Note that, unlike <code>cond</code> branching, <code>cond-&gt;</code> threading does not short circuit after the first true test expression.</p>",
   :examples
   [{:id "f08338",
     :content
     "```clj\n(def a 12)\n(cond-> a\n  (> a 10) (str \" is greater than 10\")\n  (< a 20) (str \" and less than 20\"))\n;;=> \"12 is greater than 10 and less than 20\"\n```"}],
   :full-name "cljs.core/cond->",
   :docstring
   "Takes an expression and a set of test/form pairs. Threads expr (via ->)\nthrough each form for which the corresponding test\nexpression is true. Note that, unlike cond branching, cond-> threading does\nnot short circuit after the first true test expression."},
  "rename-keys"
  {:ns "clojure.set",
   :name "rename-keys",
   :signature ["[map kmap]"],
   :type "function",
   :full-name "clojure.set/rename-keys",
   :docstring
   "Returns the map with the keys in kmap renamed to the vals in kmap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "valid-opts?"
  {:ns "cljs.js",
   :name "valid-opts?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.js/valid-opts?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IFn"
  {:ns "cljs.core",
   :name "IFn",
   :type "protocol",
   :full-name "cljs.core/IFn",
   :docstring
   "Protocol for adding the ability to invoke an object as a function.\n  For example, a vector can also be used to look up a value:\n  ([1 2 3 4] 1) => 2",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "range"
  {:description
   "Returns a lazy sequence of nums from `start` (inclusive) to `end` (exclusive),\nby `step`, where `start` defaults to 0, `step` to 1, and `end` to infinity.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "range",
   :signature ["[]" "[end]" "[start end]" "[start end step]"],
   :type "function",
   :related ["cljs.core/repeat"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of nums from <code>start</code> (inclusive) to <code>end</code> (exclusive), by <code>step</code>, where <code>start</code> defaults to 0, <code>step</code> to 1, and <code>end</code> to infinity.</p>",
   :full-name "cljs.core/range",
   :docstring
   "Returns a lazy seq of nums from start (inclusive) to end\n(exclusive), by step, where start defaults to 0, step to 1,\nand end to infinity."},
  "unchecked-short"
  {:ns "cljs.core",
   :name "unchecked-short",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-short",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "update-require-spec"
  {:ns "cljs.repl",
   :name "update-require-spec",
   :signature ["[specs & additions]"],
   :type "function",
   :full-name "cljs.repl/update-require-spec",
   :docstring
   "Given the specification portion of a ns form and require spec additions\nreturn an updated specification.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-debugger"
  {:description
   "Creates breakpoint that will stop the debugger if the browser's devtools are\nopen.  Equivalent to `debugger;` in JavaScript.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;defn foo &#91;&#93;\n  &#40;println &quot;HI&quot;&#41;\n  &#40;js-debugger&#41;\n  &#40;println &quot;WORLD&quot;&#41;&#41;\n\n&#40;foo&#41;\n;; will print &quot;HI&quot; then pause JS inside this function\n;; if browser devtools are open.\n</code></pre>"],
   :ns "cljs.core",
   :name "js-debugger",
   :signature ["[]"],
   :type "macro",
   :examples-strings
   [[["(defn foo []"
      "  (println \"HI\")"
      "  (js-debugger)"
      "  (println \"WORLD\"))"
      "(foo) ;; will print \"HI\" then pause JS inside this function ;; if browser devtools are open."]]],
   :description-html
   "<p>Creates breakpoint that will stop the debugger if the browser's devtools are open.  Equivalent to <code>debugger;</code> in JavaScript.</p>",
   :examples
   [{:id "87f2fa",
     :content
     "```clj\n(defn foo []\n  (println \"HI\")\n  (js-debugger)\n  (println \"WORLD\"))\n\n(foo)\n;; will print \"HI\" then pause JS inside this function\n;; if browser devtools are open.\n```"}],
   :full-name "cljs.core/js-debugger",
   :docstring "Emit JavaScript \"debugger;\" statement."},
  "compile-file"
  {:ns "cljs.compiler.api",
   :name "compile-file",
   :signature
   ["[src]" "[src dest]" "[src dest opts]" "[state src dest opts]"],
   :type "function",
   :full-name "cljs.compiler.api/compile-file",
   :docstring
   "Compiles src to a file of the same name, but with a .js extension,\nin the src file's directory.\n\nWith dest argument, write file to provided location. If the dest\nargument is a file outside the source tree, missing parent\ndirectories will be created. The src file will only be compiled if\nthe dest file has an older modification time.\n\nBoth src and dest may be either a String or a File.\n\nReturns a map containing {:ns .. :provides .. :requires .. :file ..}.\nIf the file was not compiled returns only {:file ...}",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "es6-iterable"
  {:ns "cljs.core",
   :name "es6-iterable",
   :signature ["[ty]"],
   :type "macro",
   :full-name "cljs.core/es6-iterable",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "not-every?"
  {:description
   "Returns false if `(pred x)` is logical true for every `x` in `coll`, else true.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "not-every?",
   :signature ["[pred coll]"],
   :type "function",
   :related ["cljs.core/every?" "cljs.core/not-any?" "cljs.core/some"],
   :examples-strings [],
   :description-html
   "<p>Returns false if <code>&#40;pred x&#41;</code> is logical true for every <code>x</code> in <code>coll</code>, else true.</p>",
   :full-name "cljs.core/not-every?",
   :docstring
   "Returns false if (pred x) is logical true for every x in\ncoll, else true."},
  "ns-info"
  {:ns "cljs.repl",
   :name "ns-info",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.repl/ns-info",
   :docstring
   "Given a path to a js source file return the ns info for the corresponding\nClojureScript file if it exists.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "drop-while"
  {:description
   "Returns a lazy sequence of the items in `coll` starting from the first item for\nwhich `(pred item)` returns logical false.\n\nReturns a stateful transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "drop-while",
   :signature ["[pred]" "[pred coll]"],
   :type "function",
   :related ["cljs.core/take-while" "cljs.core/split-with"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of the items in <code>coll</code> starting from the first item for which <code>&#40;pred item&#41;</code> returns logical false.</p><p>Returns a stateful transducer when no collection is provided.</p>",
   :full-name "cljs.core/drop-while",
   :docstring
   "Returns a lazy sequence of the items in coll starting from the\nfirst item for which (pred item) returns logical false.  Returns a\nstateful transducer when no collection is provided."},
  "peek"
  {:description
   "Returns the first element of a list; same as `first`.\n\nReturns the last element of a vector, and much more efficient than using `last`.\n\nReturns nil if `coll` is empty.",
   :examples-htmls
   ["<p>With vectors:</p><pre><code class=\"clj\">&#40;peek &#91;1 2 3&#93;&#41;\n;;=&gt; 3\n\n&#40;peek &#91;1 2&#93;&#41;\n;;=&gt; 2\n\n&#40;peek &#91;1&#93;&#41;\n;;=&gt; 1\n\n&#40;peek &#91;&#93;&#41;\n;;=&gt; nil\n</code></pre>"
    "<p>With lists:</p><pre><code class=\"clj\">&#40;peek '&#40;1 2 3&#41;&#41;\n;;=&gt; 1\n\n&#40;peek '&#40;1 2&#41;&#41;\n;;=&gt; 1\n\n&#40;peek '&#40;1&#41;&#41;\n;;=&gt; 1\n\n&#40;peek '&#40;&#41;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "peek",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/first" "cljs.core/pop" "cljs.core/conj"],
   :examples-strings
   [[["(peek [1 2 3]) ;;=> 3"
      "(peek [1 2]) ;;=> 2"
      "(peek [1]) ;;=> 1"
      "(peek []) ;;=> nil"]]
    [["(peek '(1 2 3)) ;;=> 1"
      "(peek '(1 2)) ;;=> 1"
      "(peek '(1)) ;;=> 1"
      "(peek '()) ;;=> nil"]]],
   :description-html
   "<p>Returns the first element of a list; same as <code>first</code>.</p><p>Returns the last element of a vector, and much more efficient than using <code>last</code>.</p><p>Returns nil if <code>coll</code> is empty.</p>",
   :examples
   [{:id "4abc4c",
     :content
     "With vectors:\n\n```clj\n(peek [1 2 3])\n;;=> 3\n\n(peek [1 2])\n;;=> 2\n\n(peek [1])\n;;=> 1\n\n(peek [])\n;;=> nil\n```"}
    {:id "d50bd0",
     :content
     "With lists:\n\n```clj\n(peek '(1 2 3))\n;;=> 1\n\n(peek '(1 2))\n;;=> 1\n\n(peek '(1))\n;;=> 1\n\n(peek '())\n;;=> nil\n```"}],
   :full-name "cljs.core/peek",
   :docstring
   "For a list or queue, same as first, for a vector, same as, but much\nmore efficient than, last. If the collection is empty, returns nil."},
  "subs"
  {:description
   "Returns the substring of `s` beginning at `start` inclusive, and ending at `end`\nexclusive.\n\n`end` defaults to the length of the string.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "subs",
   :signature ["[s start]" "[s start end]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns the substring of <code>s</code> beginning at <code>start</code> inclusive, and ending at <code>end</code> exclusive.</p><p><code>end</code> defaults to the length of the string.</p>",
   :full-name "cljs.core/subs",
   :docstring
   "Returns the substring of s beginning at start inclusive, and ending\nat end (defaults to length of string), exclusive."},
  "take-nth"
  {:description
   "Returns a lazy seq of every `n`th item in `coll`.\n\nReturns a stateful transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "take-nth",
   :signature ["[n]" "[n coll]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns a lazy seq of every <code>n</code>th item in <code>coll</code>.</p><p>Returns a stateful transducer when no collection is provided.</p>",
   :full-name "cljs.core/take-nth",
   :docstring
   "Returns a lazy seq of every nth item in coll.  Returns a stateful\ntransducer when no collection is provided."},
  "enable-console-print!"
  {:ns "cljs.core",
   :name "enable-console-print!",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.core/enable-console-print!",
   :docstring "Set *print-fn* to console.log",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "expose"
  {:ns "clojure.browser.event",
   :name "expose",
   :signature ["[e]"],
   :type "function",
   :full-name "clojure.browser.event/expose",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns-name"
  {:ns "cljs.core",
   :name "ns-name",
   :signature ["[ns-obj]"],
   :type "function",
   :full-name "cljs.core/ns-name",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*e"
  {:description
   "Only usable from a REPL.\n\nHolds the result of the last exception.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;defn cause-error &#91;&#93;\n  &#40;throw &quot;Error: something went wrong&quot;&#41;&#41;\n\n&#40;cause-error&#41;\n;; Error: something went wrong\n\n&#42;e\n;;=&gt; &quot;Error: something went wrong&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "*e",
   :type "var",
   :related ["cljs.core/*1" "cljs.core/*2" "cljs.core/*3"],
   :examples-strings
   [[["(defn cause-error []"
      "  (throw \"Error: something went wrong\"))"
      "(cause-error) ;; Error: something went wrong"
      "*e ;;=> \"Error: something went wrong\""]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>Holds the result of the last exception.</p>",
   :examples
   [{:id "bea858",
     :content
     "```clj\n(defn cause-error []\n  (throw \"Error: something went wrong\"))\n\n(cause-error)\n;; Error: something went wrong\n\n*e\n;;=> \"Error: something went wrong\"\n```"}],
   :full-name "cljs.core/*e",
   :docstring
   "bound in a repl thread to the most recent exception caught by the repl"},
  "prn-str"
  {:ns "cljs.core",
   :name "prn-str",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/prn-str",
   :docstring "Same as pr-str followed by (newline)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "nthrest"
  {:description
   "Returns the `nth` rest of `coll`.\n\nReturns `coll` when `n` is 0.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "nthrest",
   :signature ["[coll n]"],
   :type "function",
   :related ["cljs.core/drop" "cljs.core/nthnext" "cljs.core/nth"],
   :examples-strings [],
   :description-html
   "<p>Returns the <code>nth</code> rest of <code>coll</code>.</p><p>Returns <code>coll</code> when <code>n</code> is 0.</p>",
   :full-name "cljs.core/nthrest",
   :docstring "Returns the nth rest of coll, coll when n is 0."},
  "VectorNode"
  {:ns "cljs.core",
   :name "VectorNode",
   :signature ["[edit arr]"],
   :type "type",
   :full-name "cljs.core/VectorNode",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "satisfies?"
  {:ns "cljs.core",
   :name "satisfies?",
   :signature ["[psym x]"],
   :type "macro",
   :full-name "cljs.core/satisfies?",
   :docstring "Returns true if x satisfies the protocol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ISeqable"
  {:ns "cljs.core",
   :name "ISeqable",
   :type "protocol",
   :full-name "cljs.core/ISeqable",
   :docstring
   "Protocol for adding the ability to a type to be transformed into a sequence.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "vec"
  {:description
   "Creates a new vector containing the contents of `coll`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "vec",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/vector" "cljs.core/vector?"],
   :examples-strings [],
   :description-html
   "<p>Creates a new vector containing the contents of <code>coll</code></p>",
   :full-name "cljs.core/vec",
   :docstring
   "Creates a new vector containing the contents of coll. JavaScript arrays\nwill be aliased and should not be modified."},
  "throwing-reader"
  {:ns "cljs.reader",
   :name "throwing-reader",
   :signature ["[msg]"],
   :type "function",
   :full-name "cljs.reader/throwing-reader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "as->"
  {:description
   "Binds `name` to `expr`, evaluates the first form in the lexical context of that\nbinding, then binds `name` to that result, repeating for each successive form,\nreturning the result of the last form.\n\nUseful for when you want a threading macro to use different \"places\" at each\nform.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;as-&gt; &#91;1 2 3 4&#93; x\n  &#40;reduce + x&#41;\n  &#40;/ x 2&#41;&#41;\n;;=&gt; 5\n</code></pre>"],
   :ns "cljs.core",
   :name "as->",
   :signature ["[expr name & forms]"],
   :type "macro",
   :related
   ["cljs.core/->"
    "cljs.core/->>"
    "cljs.core/cond->"
    "cljs.core/cond->>"
    "cljs.core/some->"
    "cljs.core/some->>"],
   :examples-strings
   [[["(as-> [1 2 3 4] x" "  (reduce + x)" "  (/ x 2)) ;;=> 5"]]],
   :description-html
   "<p>Binds <code>name</code> to <code>expr</code>, evaluates the first form in the lexical context of that binding, then binds <code>name</code> to that result, repeating for each successive form, returning the result of the last form.</p><p>Useful for when you want a threading macro to use different \"places\" at each form.</p>",
   :examples
   [{:id "5e7eef",
     :content
     "```clj\n(as-> [1 2 3 4] x\n  (reduce + x)\n  (/ x 2))\n;;=> 5\n```"}],
   :full-name "cljs.core/as->",
   :docstring
   "Binds name to expr, evaluates the first form in the lexical context\nof that binding, then binds name to that result, repeating for each\nsuccessive form, returning the result of the last form."},
  "folder"
  {:ns "clojure.core.reducers",
   :name "folder",
   :signature ["[coll xf]"],
   :type "function",
   :full-name "clojure.core.reducers/folder",
   :docstring
   "Given a foldable collection, and a transformation function xf,\nreturns a foldable collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-fmix"
  {:ns "cljs.core",
   :name "m3-fmix",
   :signature ["[h1 len]"],
   :type "function",
   :full-name "cljs.core/m3-fmix",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "integer?"
  {:description "Returns true if `n` is an integer, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "integer?",
   :signature ["[n]"],
   :type "function",
   :related ["cljs.core/int"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is an integer, false otherwise.</p>",
   :full-name "cljs.core/integer?",
   :docstring "Returns true if n is an integer."},
  "dispatch-macros"
  {:ns "cljs.reader",
   :name "dispatch-macros",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.reader/dispatch-macros",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js->clj"
  {:description
   "Recursively transforms JavaScript arrays into ClojureScript vectors, and\nJavaScript objects into ClojureScript maps.\n\nWith option `{:keywordize-keys true}` will convert object fields from strings to\nkeywords.\n\nNote that `js->clj` is not optimized for speed and the [transit.cljs] library is\nrecommended for parsing large amounts of JSON data.\n\n[transit.cljs]:http://swannodette.github.io/2014/07/26/transit--clojurescript/",
   :examples-htmls
   ["<p>Parse a JSON string:</p><pre><code class=\"clj\">&#40;def json &quot;{\\&quot;foo\\&quot;: 1, \\&quot;bar\\&quot;: 2, \\&quot;baz\\&quot;: &#91;1,2,3&#93;}&quot;&#41;\n&#40;def a &#40;.parse js/JSON json&#41;&#41;\n;;=&gt; #js {:foo 1, :bar 2, :baz #js &#91;1 2 3&#93;}\n</code></pre><p>Convert JSON data <code>a</code> to ClojureScript data:</p><pre><code class=\"clj\">&#40;js-&gt;clj a&#41;\n;;=&gt; {&quot;foo&quot; 1, &quot;bar&quot; 2, &quot;baz&quot; &#91;1 2 3&#93;}\n\n&#40;js-&gt;clj a :keywordize-keys true&#41;\n;;=&gt; {:foo 1, :bar 2, :baz &#91;1 2 3&#93;}\n</code></pre>"],
   :ns "cljs.core",
   :name "js->clj",
   :signature ["[x]" "[x & opts]"],
   :type "function",
   :related ["cljs.core/clj->js"],
   :examples-strings
   [[["(def json \"{\\\"foo\\\": 1, \\\"bar\\\": 2, \\\"baz\\\": [1,2,3]}\")"
      "(def a (.parse js/JSON json)) ;;=> #js {:foo 1, :bar 2, :baz #js [1 2 3]}"]
     ["(js->clj a) ;;=> {\"foo\" 1, \"bar\" 2, \"baz\" [1 2 3]}"
      "(js->clj a :keywordize-keys true) ;;=> {:foo 1, :bar 2, :baz [1 2 3]}"]]],
   :description-html
   "<p>Recursively transforms JavaScript arrays into ClojureScript vectors, and JavaScript objects into ClojureScript maps.</p><p>With option <code>{:keywordize-keys true}</code> will convert object fields from strings to keywords.</p><p>Note that <code>js-&gt;clj</code> is not optimized for speed and the [transit.cljs] library is recommended for parsing large amounts of JSON data.</p><p>[transit.cljs]:http://swannodette.github.io/2014/07/26/transit--clojurescript/</p>",
   :examples
   [{:id "61d263",
     :content
     "Parse a JSON string:\n\n```clj\n(def json \"{\\\"foo\\\": 1, \\\"bar\\\": 2, \\\"baz\\\": [1,2,3]}\")\n(def a (.parse js/JSON json))\n;;=> #js {:foo 1, :bar 2, :baz #js [1 2 3]}\n```\n\nConvert JSON data `a` to ClojureScript data:\n\n```clj\n(js->clj a)\n;;=> {\"foo\" 1, \"bar\" 2, \"baz\" [1 2 3]}\n\n(js->clj a :keywordize-keys true)\n;;=> {:foo 1, :bar 2, :baz [1 2 3]}\n```"}],
   :full-name "cljs.core/js->clj",
   :docstring
   "Recursively transforms JavaScript arrays into ClojureScript\nvectors, and JavaScript objects into ClojureScript maps.  With\noption ':keywordize-keys true' will convert object fields from\nstrings to keywords."},
  "browser-state"
  {:ns "cljs.repl.browser",
   :name "browser-state",
   :type "dynamic var",
   :full-name "cljs.repl.browser/browser-state",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-dup*"
  {:ns "cljs.core",
   :name "*print-dup*",
   :type "dynamic var",
   :full-name "cljs.core/*print-dup*",
   :docstring
   "When set to logical true, objects will be printed in a way that preserves\ntheir type when read in later.\n\nDefaults to false.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "loop"
  {:description
   "Evaluates the `body-exprs` in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs, just like a `let` form.\nActs as a `recur` target, which will allow tail-call optimization.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;loop &#91;x 0&#93;\n  &#40;when &#40;&lt; x 10&#41;\n    &#40;println x&#41;\n    &#40;recur &#40;+ x 2&#41;&#41;&#41;&#41;\n;; Prints:\n;; 0\n;; 2\n;; 4\n;; 6\n;; 8\n;;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "loop",
   :signature ["[[& bindings] & body-exprs]"],
   :type "macro",
   :related ["special/recur"],
   :examples-strings
   [[["(loop [x 0]"
      "  (when (< x 10)"
      "    (println x)"
      "    (recur (+ x 2)))) ;; Prints: ;; 0 ;; 2 ;; 4 ;; 6 ;; 8 ;; ;;=> nil"]]],
   :description-html
   "<p>Evaluates the <code>body-exprs</code> in a lexical context in which the symbols in the binding-forms are bound to their respective init-exprs, just like a <code>let</code> form. Acts as a <code>recur</code> target, which will allow tail-call optimization.</p>",
   :examples
   [{:id "60291e",
     :content
     "```clj\n(loop [x 0]\n  (when (< x 10)\n    (println x)\n    (recur (+ x 2))))\n;; Prints:\n;; 0\n;; 2\n;; 4\n;; 6\n;; 8\n;;\n;;=> nil\n```"}],
   :full-name "cljs.core/loop",
   :docstring
   "Evaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein. Acts as a recur target."},
  "zipper"
  {:ns "clojure.zip",
   :name "zipper",
   :signature ["[branch? children make-node root]"],
   :type "function",
   :full-name "clojure.zip/zipper",
   :docstring
   "Creates a new zipper structure. \n\nbranch? is a fn that, given a node, returns true if can have\nchildren, even if it currently doesn't.\n\nchildren is a fn that, given a branch node, returns a seq of its\nchildren.\n\nmake-node is a fn that, given an existing node and a seq of\nchildren, returns a new branch node with the supplied children.\nroot is the root node.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IWatchable"
  {:ns "cljs.core",
   :name "IWatchable",
   :type "protocol",
   :full-name "cljs.core/IWatchable",
   :docstring
   "Protocol for types that can be watched. Currently only implemented by Atom.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "min"
  {:description "Returns the least number argument.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;min 1 2 3 4&#41;\n;; =&gt; 1\n</code></pre><p>Apply it to a collection:</p><pre><code class=\"clj\">&#40;apply min &#91;1 2 3 4&#93;&#41;\n;; =&gt; 1\n</code></pre>"],
   :ns "cljs.core",
   :name "min",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/max" "cljs.core/min-key"],
   :examples-strings
   [[["(min 1 2 3 4) ;; => 1"] ["(apply min [1 2 3 4]) ;; => 1"]]],
   :description-html "<p>Returns the least number argument.</p>",
   :examples
   [{:id "ab2de5",
     :content
     "```clj\n(min 1 2 3 4)\n;; => 1\n```\n\nApply it to a collection:\n\n```clj\n(apply min [1 2 3 4])\n;; => 1\n```"}],
   :full-name "cljs.core/min",
   :docstring "Returns the least of the nums."},
  "leftmost"
  {:ns "clojure.zip",
   :name "leftmost",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/leftmost",
   :docstring
   "Returns the loc of the leftmost sibling of the node at this loc, or self",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IMap"
  {:ns "cljs.core",
   :name "IMap",
   :type "protocol",
   :full-name "cljs.core/IMap",
   :docstring
   "Protocol for adding mapping functionality to collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "trim"
  {:description "Removes whitespace from both ends of string.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "trim",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Removes whitespace from both ends of string.</p>",
   :full-name "clojure.string/trim",
   :docstring "Removes whitespace from both ends of string."},
  "bit-flip"
  {:description
   "Flip bit at index `n`.  Same as `x ^ (1 << y)` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-flip 2r1111 2&#41;\n;;=&gt; 11\n;; 11 = 2r1011\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-flip 15 2&#41;\n;;=&gt; 11\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-flip",
   :signature ["[x n]"],
   :type "function/macro",
   :related ["cljs.core/bit-set" "cljs.core/bit-clear"],
   :examples-strings
   [[["(bit-flip 2r1111 2) ;;=> 11 ;; 11 = 2r1011"]
     ["(bit-flip 15 2) ;;=> 11"]]],
   :description-html
   "<p>Flip bit at index <code>n</code>.  Same as <code>x &#94; &#40;1 &lt;&lt; y&#41;</code> in JavaScript.</p>",
   :examples
   [{:id "5d7ee0",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-flip 2r1111 2)\n;;=> 11\n;; 11 = 2r1011\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-flip 15 2)\n;;=> 11\n```"}],
   :full-name "cljs.core/bit-flip",
   :docstring "Flip bit at index n"},
  "load-namespace"
  {:description
   "Only usable from a REPL.\n\nLoad a namespace and all of its dependencies into the evaluation environment.\nThe environment is responsible for ensuring that each namespace is loaded once\nand only once.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;load-namespace 'clojure.set&#41;\n</code></pre>"],
   :ns "specialrepl",
   :name "load-namespace",
   :signature ["[name]"],
   :type "special form (repl)",
   :examples-strings [[["(load-namespace 'clojure.set)"]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>Load a namespace and all of its dependencies into the evaluation environment. The environment is responsible for ensuring that each namespace is loaded once and only once.</p>",
   :examples
   [{:id "0b1a1d",
     :content "```clj\n(load-namespace 'clojure.set)\n```"}],
   :full-name "specialrepl/load-namespace"},
  "defn"
  {:description
   "Defines a function.\n\n`doc-string?` is an optional documentation string.\n\n`attr-map?` is an optional map of [metadata](http://clojure.org/metadata) to\nattach to the global variable name.\n\n`prepost-map?` is an optional map with optional keys `:pre` and `:post` that\ncontain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)\nfor the function.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(defn foo [a b c]\n  (\\* a b c))</pre></td>\n      <td><pre>\n(def foo\n  (fn [a b c]\n    (\\* a b c)))</pre></td></tr></tbody></table>",
   :examples-htmls [],
   :ns "cljs.core",
   :name "defn",
   :signature
   ["[name doc-string? attr-map? [params*] prepost-map? body]"
    "[name doc-string? attr-map? ([params*] prepost-map? body) + attr-map?]"],
   :type "macro",
   :related
   ["special/def"
    "cljs.core/defn-"
    "cljs.core/defmacro"
    "cljs.core/fn"],
   :examples-strings [],
   :description-html
   "<p>Defines a function.</p><p><code>doc-string?</code> is an optional documentation string.</p><p><code>attr-map?</code> is an optional map of <a href='http://clojure.org/metadata'>metadata</a> to attach to the global variable name.</p><p><code>prepost-map?</code> is an optional map with optional keys <code>:pre</code> and <code>:post</code> that contain collections of <a href='http://blog.fogus.me/2009/12/21/clojures-pre-and-post/'>pre or post conditions</a> for the function.</p><p><table class=\"code-tbl-9bef6\">   <thead><pre><code>&lt;tr&gt;\n  &lt;th&gt;Code&lt;/th&gt;\n  &lt;th&gt;Expands To&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; \n</code></pre>  <tbody><pre><code>&lt;tr&gt;\n  &lt;td&gt;&lt;pre&gt; \n</code></pre>(defn foo [a b c]   (&#42; a b c))</pre></td><pre><code>  &lt;td&gt;&lt;pre&gt; \n</code></pre>(def foo   (fn [a b c]<pre><code>&#40;\\&#42; a b c&#41;&#41;&#41;&lt;/pre&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt; \n</code></pre></p>",
   :full-name "cljs.core/defn",
   :docstring
   "Same as (def name (core/fn [params* ] exprs*)) or (def\n name (core/fn ([params* ] exprs*)+)) with any doc-string or attrs added\n to the var metadata. prepost-map defines a map with optional keys\n :pre and :post that contain collections of pre or post conditions."},
  "isa?"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "isa?",
   :signature ["[child parent]" "[h child parent]"],
   :type "function",
   :related
   ["cljs.core/ancestors"
    "cljs.core/descendants"
    "cljs.core/make-hierarchy"
    "cljs.core/derive"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/isa?",
   :docstring
   "Returns true if (= child parent), or child is directly or indirectly derived from\nparent, either via a JavaScript type inheritance relationship or a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy"},
  "*flush-on-newline*"
  {:ns "cljs.core",
   :name "*flush-on-newline*",
   :type "dynamic var",
   :full-name "cljs.core/*flush-on-newline*",
   :docstring
   "When set to true, output will be flushed whenever a newline is printed.\n\nDefaults to true.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rename"
  {:ns "clojure.set",
   :name "rename",
   :signature ["[xrel kmap]"],
   :type "function",
   :full-name "clojure.set/rename",
   :docstring
   "Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "printf"
  {:ns "cljs.core",
   :name "printf",
   :signature ["[fmt & args]"],
   :type "function",
   :full-name "cljs.core/printf",
   :docstring "Prints formatted output, as per format",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ext->mime-type"
  {:ns "cljs.repl.browser",
   :name "ext->mime-type",
   :type "var",
   :full-name "cljs.repl.browser/ext->mime-type",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "max-key"
  {:description
   "Returns the `x` for which `(k x)` is greatest.\n\n`(k x)` should return a number.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "max-key",
   :signature ["[k x]" "[k x y]" "[k x y & more]"],
   :type "function",
   :related ["cljs.core/max" "cljs.core/min-key"],
   :examples-strings [],
   :description-html
   "<p>Returns the <code>x</code> for which <code>&#40;k x&#41;</code> is greatest.</p><p><code>&#40;k x&#41;</code> should return a number.</p>",
   :full-name "cljs.core/max-key",
   :docstring "Returns the x for which (k x), a number, is greatest."},
  "HashMap.fromArrays"
  {:ns "cljs.core",
   :name "HashMap.fromArrays",
   :signature ["[ks vs]"],
   :type "function",
   :full-name "cljs.core/HashMap.fromArrays",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rhino-eval"
  {:ns "cljs.repl.rhino",
   :name "rhino-eval",
   :signature ["[{:keys [scope], :as repl-env} filename line js]"],
   :type "function",
   :full-name "cljs.repl.rhino/rhino-eval",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "es6-iterator"
  {:ns "cljs.core",
   :name "es6-iterator",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/es6-iterator",
   :docstring
   "EXPERIMENTAL: Return a ES2015 compatible iterator for coll.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "="
  {:description
   "Returns true if the value of `x` equals the value of `y`, false otherwise.\n\n`=` is a value comparison, not an identity comparison.\n\nAll collections can be tested for value, regardless of \"depth\".",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;= 1&#41;\n;;=&gt; true\n\n&#40;= 1 1&#41;\n;;=&gt; true\n\n&#40;= 1 2&#41;\n;;=&gt; false\n\n&#40;= 1 1 1&#41;\n;;=&gt; true\n\n&#40;= 1 1 2&#41;\n;;=&gt; false\n</code></pre>"
    "<p>Sequences are considered equal in value if they have the same elements:</p><pre><code class=\"clj\">&#40;= '&#40;1 2&#41; &#91;1 2&#93;&#41;\n;;=&gt; true\n</code></pre><p>But you cannot compare JavaScript arrays until you convert them to sequences:</p><pre><code class=\"clj\">&#40;def a #js &#91;1 2&#93;&#41;\n&#40;def b #js &#91;1 2&#93;&#41;\n&#40;= a b&#41;\n;;=&gt; false\n\n&#40;= &#40;seq a&#41; &#40;seq b&#41;&#41;\n;;=&gt; true\n</code></pre>"
    "<p>It is natural to compare deeply nested collections since value equality checks are cheap in ClojureScript:</p><pre><code class=\"clj\">&#40;def a {:foo {:bar &quot;baz&quot;}}&#41;\n&#40;def b {:foo {:bar &quot;baz&quot;}}&#41;\n&#40;= a b&#41;\n;;=&gt; true\n\n&#40;= &#91;a b&#93; &#91;a b&#93;&#41;\n;=&gt; true\n</code></pre><p>JavaScript objects cannot be compared in this way until they are converted to ClojureScript collections:</p><pre><code class=\"clj\">&#40;def a #js {:foo #js {:bar &quot;baz&quot;}}&#41;\n&#40;def b #js {:foo #js {:bar &quot;baz&quot;}}&#41;\n&#40;= a b&#41;\n;;=&gt; false\n\n&#40;= &#40;js-&gt;clj a&#41;\n   &#40;js-&gt;clj b&#41;&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name "=",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function",
   :related ["cljs.core/==" "cljs.core/not=" "cljs.core/identical?"],
   :examples-strings
   [[["(= 1) ;;=> true"
      "(= 1 1) ;;=> true"
      "(= 1 2) ;;=> false"
      "(= 1 1 1) ;;=> true"
      "(= 1 1 2) ;;=> false"]]
    [["(= '(1 2) [1 2]) ;;=> true"]
     ["(def a #js [1 2])"
      "(def b #js [1 2])"
      "(= a b) ;;=> false"
      "(= (seq a) (seq b)) ;;=> true"]]
    [["(def a {:foo {:bar \"baz\"}})"
      "(def b {:foo {:bar \"baz\"}})"
      "(= a b) ;;=> true"
      "(= [a b] [a b]) ;=> true"]
     ["(def a #js {:foo #js {:bar \"baz\"}})"
      "(def b #js {:foo #js {:bar \"baz\"}})"
      "(= a b) ;;=> false"
      "(= (js->clj a)"
      "   (js->clj b)) ;;=> true"]]],
   :description-html
   "<p>Returns true if the value of <code>x</code> equals the value of <code>y</code>, false otherwise.</p><p><code>=</code> is a value comparison, not an identity comparison.</p><p>All collections can be tested for value, regardless of \"depth\".</p>",
   :examples
   [{:id "edffb6",
     :content
     "```clj\n(= 1)\n;;=> true\n\n(= 1 1)\n;;=> true\n\n(= 1 2)\n;;=> false\n\n(= 1 1 1)\n;;=> true\n\n(= 1 1 2)\n;;=> false\n```"}
    {:id "a2d064",
     :content
     "Sequences are considered equal in value if they have the same elements:\n\n```clj\n(= '(1 2) [1 2])\n;;=> true\n```\n\nBut you cannot compare JavaScript arrays until you convert them to sequences:\n\n```clj\n(def a #js [1 2])\n(def b #js [1 2])\n(= a b)\n;;=> false\n\n(= (seq a) (seq b))\n;;=> true\n```"}
    {:id "6c8424",
     :content
     "It is natural to compare deeply nested collections since value equality checks\nare cheap in ClojureScript:\n\n```clj\n(def a {:foo {:bar \"baz\"}})\n(def b {:foo {:bar \"baz\"}})\n(= a b)\n;;=> true\n\n(= [a b] [a b])\n;=> true\n```\n\nJavaScript objects cannot be compared in this way until they are converted to\nClojureScript collections:\n\n```clj\n(def a #js {:foo #js {:bar \"baz\"}})\n(def b #js {:foo #js {:bar \"baz\"}})\n(= a b)\n;;=> false\n\n(= (js->clj a)\n   (js->clj b))\n;;=> true\n```"}],
   :full-name "cljs.core/=",
   :docstring
   "Equality. Returns true if x equals y, false if not. Compares\nnumbers and collections in a type-independent manner.  Clojure's immutable data\nstructures define -equiv (and thus =) as a value, not an identity,\ncomparison."},
  "source-fn"
  {:ns "cljs.repl",
   :name "source-fn",
   :signature ["[env x]"],
   :type "function",
   :full-name "cljs.repl/source-fn",
   :docstring
   "Returns a string of the source code for the given symbol, if it can\nfind it.  This requires that the symbol resolve to a Var defined in\na namespace for which the .clj is in the classpath.  Returns nil if\nit can't find the source.  For most REPL usage, 'source' is more\nconvenient.\n\nExample: (source-fn 'filter)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "list"
  {:description "Creates a new list containing `items`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "list",
   :signature ["[& items]"],
   :type "function/macro",
   :related ["cljs.core/vector" "cljs.core/list?"],
   :examples-strings [],
   :description-html
   "<p>Creates a new list containing <code>items</code>.</p>",
   :full-name "cljs.core/list",
   :docstring "Creates a new list containing the items."},
  "IMeta"
  {:ns "cljs.core",
   :name "IMeta",
   :type "protocol",
   :full-name "cljs.core/IMeta",
   :docstring "Protocol for accessing the metadata of an object.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "starts-with?"
  {:ns "clojure.string",
   :name "starts-with?",
   :signature ["[s substr]"],
   :type "function",
   :full-name "clojure.string/starts-with?",
   :docstring "True if s starts with substr.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "are"
  {:ns "cljs.test",
   :name "are",
   :signature ["[argv expr & args]"],
   :type "macro",
   :full-name "cljs.test/are",
   :docstring
   "Checks multiple assertions with a template expression.\nSee clojure.template/do-template for an explanation of\ntemplates.\n\nExample: (are [x y] (= x y)  \n              2 (+ 1 1)\n              4 (* 2 2))\nExpands to: \n         (do (is (= 2 (+ 1 1)))\n             (is (= 4 (* 2 2))))\n\nNote: This breaks some reporting features, such as line numbers.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "constantly"
  {:description
   "Returns a function that takes any number of arguments and always returns `x`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def ten &#40;constantly 10&#41;&#41;\n\n&#40;ten &quot;hi&quot;&#41;\n;;=&gt; 10\n\n&#40;ten 123&#41;\n;;=&gt; 10\n\n&#40;ten :whatever&#41;\n;;=&gt; 10\n</code></pre>"],
   :ns "cljs.core",
   :name "constantly",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/repeatedly"],
   :examples-strings
   [[["(def ten (constantly 10))"
      "(ten \"hi\") ;;=> 10"
      "(ten 123) ;;=> 10"
      "(ten :whatever) ;;=> 10"]]],
   :description-html
   "<p>Returns a function that takes any number of arguments and always returns <code>x</code>.</p>",
   :examples
   [{:id "9d5c25",
     :content
     "```clj\n(def ten (constantly 10))\n\n(ten \"hi\")\n;;=> 10\n\n(ten 123)\n;;=> 10\n\n(ten :whatever)\n;;=> 10\n```"}],
   :full-name "cljs.core/constantly",
   :docstring
   "Returns a function that takes any number of arguments and returns x."},
  "escape-char"
  {:ns "cljs.reader",
   :name "escape-char",
   :signature ["[buffer reader]"],
   :type "function",
   :full-name "cljs.reader/escape-char",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "into-array"
  {:description
   "Returns a new JavaScript array from the elements of `aseq`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "into-array",
   :signature ["[aseq]"],
   :type "function",
   :related ["cljs.core/to-array" "cljs.core/make-array"],
   :examples-strings [],
   :description-html
   "<p>Returns a new JavaScript array from the elements of <code>aseq</code>.</p>",
   :full-name "cljs.core/into-array",
   :docstring
   "Returns an array with components set to the values in aseq. Optional type\nargument accepted for compatibility with Clojure."},
  "*print-readably*"
  {:ns "cljs.core",
   :name "*print-readably*",
   :type "dynamic var",
   :full-name "cljs.core/*print-readably*",
   :docstring
   "When set to logical false, strings and characters will be printed with\nnon-alphanumeric characters converted to the appropriate escape sequences.\n\nDefaults to true",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-source-map"
  {:ns "cljs.repl",
   :name "read-source-map",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.repl/read-source-map",
   :docstring "Return the source map for the JavaScript source file.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "start-evaluator"
  {:ns "clojure.browser.repl",
   :name "start-evaluator",
   :signature ["[url]"],
   :type "function",
   :full-name "clojure.browser.repl/start-evaluator",
   :docstring "Start the REPL server connection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-double"
  {:ns "cljs.core",
   :name "unchecked-double",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-double",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-comment"
  {:ns "cljs.reader",
   :name "read-comment",
   :type "var",
   :full-name "cljs.reader/read-comment",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IWithMeta"
  {:ns "cljs.core",
   :name "IWithMeta",
   :type "protocol",
   :full-name "cljs.core/IWithMeta",
   :docstring "Protocol for adding metadata to an object.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr-str-with-opts"
  {:ns "cljs.core",
   :name "pr-str-with-opts",
   :signature ["[objs opts]"],
   :type "function",
   :full-name "cljs.core/pr-str-with-opts",
   :docstring
   "Prints a sequence of objects to a string, observing all the\noptions given in opts",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mark-cljs-ns-for-recompile!"
  {:ns "cljs.build.api",
   :name "mark-cljs-ns-for-recompile!",
   :signature ["[ns-sym]" "[ns-sym output-dir]"],
   :type "function",
   :full-name "cljs.build.api/mark-cljs-ns-for-recompile!",
   :docstring
   "Backdates a cljs target file so that it the cljs compiler will recompile it.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "right"
  {:ns "clojure.zip",
   :name "right",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/right",
   :docstring
   "Returns the loc of the right sibling of the node at this loc, or nil",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "char-code"
  {:ns "cljs.pprint",
   :name "char-code",
   :signature ["[c]"],
   :type "function",
   :full-name "cljs.pprint/char-code",
   :docstring "Convert char to int",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-set"
  {:ns "cljs.reader",
   :name "read-set",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-set",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "fnil"
  {:description
   "Takes a function `f`, and returns a function that calls `f`, replacing a nil\nfirst argument to `f` with the supplied value `x`. Higher arity versions can\nreplace arguments in the second and third positions (`y`, `z`).\n\nNote that the function `f` can take any number of arguments, not just the one(s)\nbeing nil-patched.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "fnil",
   :signature ["[f x]" "[f x y]" "[f x y z]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Takes a function <code>f</code>, and returns a function that calls <code>f</code>, replacing a nil first argument to <code>f</code> with the supplied value <code>x</code>. Higher arity versions can replace arguments in the second and third positions (<code>y</code>, <code>z</code>).</p><p>Note that the function <code>f</code> can take any number of arguments, not just the one(s) being nil-patched.</p>",
   :full-name "cljs.core/fnil",
   :docstring
   "Takes a function f, and returns a function that calls f, replacing\na nil first argument to f with the supplied value x. Higher arity\nversions can replace arguments in the second and third\npositions (y, z). Note that the function f can take any number of\narguments, not just the one(s) being nil-patched."},
  "random-sample"
  {:ns "cljs.core",
   :name "random-sample",
   :signature ["[prob]" "[prob coll]"],
   :type "function",
   :full-name "cljs.core/random-sample",
   :docstring
   "Returns items from coll with random probability of prob (0.0 -\n1.0).  Returns a transducer when no collection is provided.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-count"
  {:description "Counts the number of bits set in `x`.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-count 2r1011&#41;\n;;=&gt; 3\n</code></pre><p>Same number in decimal:</p><pre><code class=\"clj\">&#40;bit-count 11&#41;\n;;=&gt; 3\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-count",
   :signature ["[x]"],
   :type "function",
   :examples-strings
   [[["(bit-count 2r1011) ;;=> 3"] ["(bit-count 11) ;;=> 3"]]],
   :description-html
   "<p>Counts the number of bits set in <code>x</code>.</p>",
   :examples
   [{:id "35c78c",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-count 2r1011)\n;;=> 3\n```\n\nSame number in decimal:\n\n```clj\n(bit-count 11)\n;;=> 3\n```"}],
   :full-name "cljs.core/bit-count",
   :docstring "Counts the number of bits set in n"},
  "debug-prn"
  {:ns "cljs.js",
   :name "debug-prn",
   :signature ["[& args]"],
   :type "function",
   :full-name "cljs.js/debug-prn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*"
  {:description "Returns the product of nums.\n\n`(*)` returns 1.",
   :examples-htmls
   ["<pre><code class=\"clj\">;; there is an implicit 1\n&#40;&#42;&#41;\n;;=&gt; 1\n\n;; the implicit 1 comes into play\n&#40;&#42; 6&#41;\n;;=&gt; 6\n\n&#40;&#42; 2 3&#41;\n;;=&gt; 6\n\n&#40;&#42; 2 3 4&#41;\n;;=&gt; 24\n</code></pre>"],
   :ns "cljs.core",
   :name "*",
   :signature ["[]" "[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/+" "cljs.core//"],
   :examples-strings
   [[[" ;; there is an implicit 1"
      "(*) ;;=> 1 ;; the implicit 1 comes into play"
      "(* 6) ;;=> 6"
      "(* 2 3) ;;=> 6"
      "(* 2 3 4) ;;=> 24"]]],
   :description-html
   "<p>Returns the product of nums.</p><p><code>&#40;&#42;&#41;</code> returns 1.</p>",
   :examples
   [{:id "bc4a1f",
     :content
     "```clj\n;; there is an implicit 1\n(*)\n;;=> 1\n\n;; the implicit 1 comes into play\n(* 6)\n;;=> 6\n\n(* 2 3)\n;;=> 6\n\n(* 2 3 4)\n;;=> 24\n```"}],
   :full-name "cljs.core/*",
   :docstring "Returns the product of nums. (*) returns 1."},
  "next"
  {:ns "clojure.zip",
   :name "next",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/next",
   :docstring
   "Moves to the next loc in the hierarchy, depth-first. When reaching\nthe end, returns a distinguished loc detectable via end?. If already\nat the end, stays there.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentHashMap.fromArray"
  {:ns "cljs.core",
   :name "PersistentHashMap.fromArray",
   :signature ["[arr no-clone]"],
   :type "function",
   :full-name "cljs.core/PersistentHashMap.fromArray",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-test"
  {:description
   "Test bit at index `n`. Returns `true` if 1, and `false` if 0. Same as `(x & (1 << y)) != 0` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-test 2r0100 2&#41;\n;;=&gt; true\n\n&#40;bit-test 2r0100 1&#41;\n;;=&gt; false\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-test 4 2&#41;\n;;=&gt; true\n\n&#40;bit-test 4 1&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-test",
   :signature ["[x n]"],
   :type "function/macro",
   :examples-strings
   [[["(bit-test 2r0100 2) ;;=> true" "(bit-test 2r0100 1) ;;=> false"]
     ["(bit-test 4 2) ;;=> true" "(bit-test 4 1) ;;=> false"]]],
   :description-html
   "<p>Test bit at index <code>n</code>. Returns <code>true</code> if 1, and <code>false</code> if 0. Same as <code>&#40;x &amp; &#40;1 &lt;&lt; y&#41;&#41; != 0</code> in JavaScript.</p>",
   :examples
   [{:id "f64664",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-test 2r0100 2)\n;;=> true\n\n(bit-test 2r0100 1)\n;;=> false\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-test 4 2)\n;;=> true\n\n(bit-test 4 1)\n;;=> false\n```"}],
   :full-name "cljs.core/bit-test",
   :docstring "Test bit at index n"},
  "testing"
  {:ns "cljs.test",
   :name "testing",
   :signature ["[string & body]"],
   :type "macro",
   :full-name "cljs.test/testing",
   :docstring
   "Adds a new string to the list of testing contexts.  May be nested,\nbut must occur inside a test function (deftest).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-env"
  {:ns "cljs.repl.node",
   :name "repl-env",
   :signature ["[& {:as options}]"],
   :type "function",
   :full-name "cljs.repl.node/repl-env",
   :docstring
   "Construct a Node.js evalution environment. Can supply :host and :port.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cljs-files-in"
  {:ns "cljs.compiler.api",
   :name "cljs-files-in",
   :signature ["[dir]"],
   :type "function",
   :full-name "cljs.compiler.api/cljs-files-in",
   :docstring
   "Return a sequence of all .cljs and .cljc files in the given directory.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "transduce"
  {:ns "cljs.core",
   :name "transduce",
   :signature ["[xform f coll]" "[xform f init coll]"],
   :type "function",
   :full-name "cljs.core/transduce",
   :docstring
   "reduce with a transformation of f (xf). If init is not\nsupplied, (f) will be called to produce it. f should be a reducing\nstep function that accepts both 1 and 2 arguments, if it accepts\nonly 2 you can add the arity-1 with 'completing'. Returns the result\nof applying (the transformed) xf to init and the first item in coll,\nthen applying xf to that result and the 2nd item, etc. If coll\ncontains no items, returns init and f is not called. Note that\ncertain transforms may inject or skip items.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "string"
  {:description
   "Create a string.  ClojureScript strings are the same as [JavaScript strings].\n\n[JavaScript strings]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String\n\nStrings may span multiple lines.\n\nStandard escape characters such as `\\\"` are supported, as well as unicode\nescape characters:\n\n| unicode characters  | constraints                                   |\n|---------------------|-----------------------------------------------|\n| `\\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |\n| `\\oXXX`             | XXX is octal between 0 and 0377               |",
   :examples-htmls
   ["<pre><code class=\"clj\">&quot;foo&quot;\n;;=&gt; &quot;foo&quot;\n\n&quot;hello\n     world&quot;\n;;=&gt; &quot;hello\\n     world&quot;\n</code></pre><p>Characters can be escaped:</p><pre><code class=\"clj\">&#40;println &quot;foo\\nbar&quot;&#41;\n;; prints:\n;;   foo\n;;   bar\n</code></pre>"],
   :ns "syntax",
   :name "string",
   :type "syntax",
   :related ["cljs.core/str"],
   :examples-strings
   [[["\"foo\" ;;=> \"foo\""
      "\"hello"
      "     world\" ;;=> \"hello\\n     world\""]
     ["(println \"foo\\nbar\") ;; prints: ;;   foo ;;   bar"]]],
   :description-html
   "<p>Create a string.  ClojureScript strings are the same as [JavaScript strings].</p><p>[JavaScript strings]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String</p><p>Strings may span multiple lines.</p><p>Standard escape characters such as <code>\\&quot;</code> are supported, as well as unicode escape characters:</p><p>| unicode characters  | constraints                                   | |---------------------|-----------------------------------------------| | <code>\\uXXXX</code>            | XXXX must have 4 digits outside 0xD7FF-0xE000 | | <code>\\oXXX</code>             | XXX is octal between 0 and 0377               |</p>",
   :examples
   [{:id "eb97ac",
     :content
     "```clj\n\"foo\"\n;;=> \"foo\"\n\n\"hello\n     world\"\n;;=> \"hello\\n     world\"\n```\n\nCharacters can be escaped:\n\n```clj\n(println \"foo\\nbar\")\n;; prints:\n;;   foo\n;;   bar\n```"}],
   :full-name "syntax/string"},
  "keys"
  {:description "Returns a sequence of the keys in `hash-map`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "keys",
   :signature ["[hash-map]"],
   :type "function",
   :related ["cljs.core/vals"],
   :examples-strings [],
   :description-html
   "<p>Returns a sequence of the keys in <code>hash-map</code>.</p>",
   :full-name "cljs.core/keys",
   :docstring "Returns a sequence of the map's keys."},
  "*print-suppress-namespaces*"
  {:ns "cljs.pprint",
   :name "*print-suppress-namespaces*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-suppress-namespaces*",
   :docstring
   "Don't print namespaces with symbols. This is particularly useful when\npretty printing the results of macro expansions",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "nil-iter"
  {:ns "cljs.core",
   :name "nil-iter",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.core/nil-iter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-analysis-cache!"
  {:ns "cljs.js",
   :name "load-analysis-cache!",
   :signature ["[state ns cache]"],
   :type "function",
   :full-name "cljs.js/load-analysis-cache!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*loaded*"
  {:ns "cljs.js",
   :name "*loaded*",
   :type "var",
   :full-name "cljs.js/*loaded*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "run-tests-block"
  {:ns "cljs.test",
   :name "run-tests-block",
   :signature ["[env-or-ns & namespaces]"],
   :type "macro",
   :full-name "cljs.test/run-tests-block",
   :docstring
   "Like test-vars, but returns a block for further composition and\nlater execution.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IVolatile"
  {:ns "cljs.core",
   :name "IVolatile",
   :type "protocol",
   :full-name "cljs.core/IVolatile",
   :docstring "Protocol for adding volatile functionality.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "MultiStepper"
  {:ns "cljs.core",
   :name "MultiStepper",
   :signature ["[xform iters nexts]"],
   :type "type",
   :full-name "cljs.core/MultiStepper",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "subvec"
  {:description
   "Returns a persistent vector of the items in `v` from `start` inclusive to `end`\nexclusive.\n\nIf `end` is not supplied, defaults to `(count v)`.\n\nThis operation is O(1) and very fast, as the resulting vector shares structure\nwith the original and no trimming is done.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "subvec",
   :signature ["[v start]" "[v start end]"],
   :type "function",
   :related ["cljs.core/vector" "cljs.core/vector?"],
   :examples-strings [],
   :description-html
   "<p>Returns a persistent vector of the items in <code>v</code> from <code>start</code> inclusive to <code>end</code> exclusive.</p><p>If <code>end</code> is not supplied, defaults to <code>&#40;count v&#41;</code>.</p><p>This operation is O(1) and very fast, as the resulting vector shares structure with the original and no trimming is done.</p>",
   :full-name "cljs.core/subvec",
   :docstring
   "Returns a persistent vector of the items in vector from\nstart (inclusive) to end (exclusive).  If end is not supplied,\ndefaults to (count vector). This operation is O(1) and very fast, as\nthe resulting vector shares structure with the original and no\ntrimming is done."},
  "resolve"
  {:ns "cljs.analyzer.api",
   :name "resolve",
   :signature ["[env sym]"],
   :type "function",
   :full-name "cljs.analyzer.api/resolve",
   :docstring
   "Given an analysis environment resolve a var. Analogous to\nclojure.core/resolve",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "contains?"
  {:description
   "Returns true if the `coll` contains the lookup key `k`, otherwise returns false.\n\nNote that for numerically indexed collections like vectors and arrays, this\ntests if the numeric key is within the range of indexes.\n\n`contains?` operates in constant or logarithmic time, using `get` to perform\nthe lookup. It will not perform a linear search for a value.  `some` is\nused for this purpose:\n\n```clj\n(some #{value} coll)\n```",
   :examples-htmls
   ["<p>Sets and Maps provide key lookups, so <code>contains?</code> works as expected:</p><pre><code class=\"clj\">&#40;contains? #{:a :b} :a&#41;\n;;=&gt; true\n\n&#40;contains? {:a 1, :b 2} :a&#41;\n;;=&gt; true\n\n&#40;contains? {:a 1, :b 2} 1&#41;\n;;=&gt; false\n</code></pre><p>Vectors provide integer index lookups, so <code>contains?</code> works appropriately:</p><pre><code class=\"clj\">&#40;contains? &#91;:a :b&#93; :b&#41;\n;;=&gt; false\n\n&#40;contains? &#91;:a :b&#93; 1&#41;\n;;=&gt; true\n</code></pre><p>Lists and Sequences do not provide lookups, so <code>contains?</code> will not work:</p><pre><code class=\"clj\">&#40;contains? '&#40;:a :b&#41; :a&#41;\n;;=&gt; false\n\n&#40;contains? '&#40;:a :b&#41; 1&#41;\n;;=&gt; false\n\n&#40;contains? &#40;range 3&#41; 1&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "contains?",
   :signature ["[coll k]"],
   :type "function",
   :related ["cljs.core/some" "cljs.core/get"],
   :examples-strings
   [[["(contains? #{:a :b} :a) ;;=> true"
      "(contains? {:a 1, :b 2} :a) ;;=> true"
      "(contains? {:a 1, :b 2} 1) ;;=> false"]
     ["(contains? [:a :b] :b) ;;=> false"
      "(contains? [:a :b] 1) ;;=> true"]
     ["(contains? '(:a :b) :a) ;;=> false"
      "(contains? '(:a :b) 1) ;;=> false"
      "(contains? (range 3) 1) ;;=> false"]]],
   :description-html
   "<p>Returns true if the <code>coll</code> contains the lookup key <code>k</code>, otherwise returns false.</p><p>Note that for numerically indexed collections like vectors and arrays, this tests if the numeric key is within the range of indexes.</p><p><code>contains?</code> operates in constant or logarithmic time, using <code>get</code> to perform the lookup. It will not perform a linear search for a value.  <code>some</code> is used for this purpose:</p><pre><code class=\"clj\">&#40;some #{value} coll&#41;\n</code></pre>",
   :examples
   [{:id "2991f0",
     :content
     "Sets and Maps provide key lookups, so `contains?` works as expected:\n\n```clj\n(contains? #{:a :b} :a)\n;;=> true\n\n(contains? {:a 1, :b 2} :a)\n;;=> true\n\n(contains? {:a 1, :b 2} 1)\n;;=> false\n```\n\nVectors provide integer index lookups, so `contains?` works appropriately:\n\n```clj\n(contains? [:a :b] :b)\n;;=> false\n\n(contains? [:a :b] 1)\n;;=> true\n```\n\nLists and Sequences do not provide lookups, so `contains?` will not work:\n\n```clj\n(contains? '(:a :b) :a)\n;;=> false\n\n(contains? '(:a :b) 1)\n;;=> false\n\n(contains? (range 3) 1)\n;;=> false\n```"}],
   :full-name "cljs.core/contains?",
   :docstring
   "Returns true if key is present in the given collection, otherwise\nreturns false.  Note that for numerically indexed collections like\nvectors and arrays, this tests if the numeric key is within the\nrange of indexes. 'contains?' operates constant or logarithmic time;\nit will not perform a linear search for a value.  See also 'some'."},
  "<="
  {:description
   "Returns true if each successive number argument is greater than or equal to the\nprevious one, false otherwise.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;&lt;= 1 2&#41;\n;;=&gt; true\n\n&#40;&lt;= 2 2&#41;\n;;=&gt; true\n\n&#40;&lt;= 3 2&#41;\n;;=&gt; false\n\n&#40;&lt;= 2 3 4 5 6&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name "<=",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/<"],
   :examples-strings
   [[["(<= 1 2) ;;=> true"
      "(<= 2 2) ;;=> true"
      "(<= 3 2) ;;=> false"
      "(<= 2 3 4 5 6) ;;=> true"]]],
   :description-html
   "<p>Returns true if each successive number argument is greater than or equal to the previous one, false otherwise.</p>",
   :examples
   [{:id "adb3fd",
     :content
     "```clj\n(<= 1 2)\n;;=> true\n\n(<= 2 2)\n;;=> true\n\n(<= 3 2)\n;;=> false\n\n(<= 2 3 4 5 6)\n;;=> true\n```"}],
   :full-name "cljs.core/<=",
   :docstring
   "Returns non-nil if nums are in monotonically non-decreasing order,\notherwise false."},
  "some->"
  {:description
   "When `expr` is not nil, threads it into the first form (via `->`), and when that\nresult is not nil, through the next, etc.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "some->",
   :signature ["[expr & forms]"],
   :type "macro",
   :related
   ["cljs.core/->"
    "cljs.core/->>"
    "cljs.core/some->>"
    "cljs.core/some"],
   :examples-strings [],
   :description-html
   "<p>When <code>expr</code> is not nil, threads it into the first form (via <code>-&gt;</code>), and when that result is not nil, through the next, etc.</p>",
   :full-name "cljs.core/some->",
   :docstring
   "When expr is not nil, threads it into the first form (via ->),\nand when that result is not nil, through the next etc"},
  "undefined?"
  {:ns "cljs.core",
   :name "undefined?",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/undefined?",
   :docstring
   "Returns true if x identical to the JavaScript undefined value.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dispatch"
  {:description
   "`#` is a prefix character that is called the dispatch macro, because it allows\nthe behavior of the reader to be dispatched to another table, indexed by the\ncharacter following the `#`.\n\nSyntax forms prefixed with `#` are made to bear some similarity to their\noriginal forms:\n\n| original                           | with `#` prefix                                  | relation               |\n|------------------------------------|--------------------------------------------------|------------------------|\n| [doc:syntax/string]                    | [doc:syntax/regex]                                   | string-related         |\n| [doc:syntax/list]                      | [doc:syntax/function]                                | code-related           |\n| [doc:syntax/map]                       | [doc:syntax/set]                                     | lookup-related         |\n| [doc:syntax/quote]                     | [doc:syntax/var]                                     | quote-related          |\n| [doc:syntax/unused]                    | [doc:syntax/ignore]                                  | ignore-related         |\n| [`foo (symbol)`][doc:syntax/symbol]    | [`#foo (tagged literal)`][doc:syntax/tagged-literal] | name-related           |\n| [doc:syntax/predicate]                 | [doc:syntax/cond]                                    | conditional-related    |",
   :examples-htmls
   ["<p>The dispatch macro is not usable on its own.  Rather, it dispatches to other syntax forms.</p><p>Regular expression:</p><pre><code class=\"clj\">#&quot;&#91;a-zA-Z0-9&#93;+&quot;\n;;=&gt; #&quot;&#91;a-zA-Z0-9&#93;+&quot;\n</code></pre><p>Set:</p><pre><code class=\"clj\">#{:foo 1 2}\n;;=&gt; #{:foo 1 2}\n</code></pre><p>Function:</p><pre><code class=\"clj\">#&#40;foo 1 2&#41;\n;;=&gt; #&lt;function &#40;&#41;{\n;;   return cljs.user.foo.call&#40;null,&#40;1&#41;,&#40;2&#41;&#41;;\n;;   }&gt;\n</code></pre><p>Var reference:</p><pre><code class=\"clj\">&#40;def a&#41;\n#'a\n;;=&gt; #'cljs.user/a\n</code></pre><p>Ignore form:</p><pre><code class=\"clj\">#&#95;foo\n;; waits for next form since #&#95;foo was ignored\n\n#&#95;123 456\n;;=&gt; 456\n</code></pre><p>Tagged Literals:</p><pre><code class=\"clj\">#queue &#91;1 2 3&#93;\n;;=&gt; #queue &#91;1 2 3&#93;\n\n#js {:foo 1}\n;;=&gt; #js {:foo 1}\n\n#inst &quot;2010-11-12T18:14:15.666-00:00&quot;\n;;=&gt; #inst &quot;2010-11-12T18:14:15.666-00:00&quot;\n</code></pre><p>Reader Conditional:</p><pre><code class=\"clj\">#?&#40;:clj &quot;Clojure&quot; :cljs &quot;ClojureScript&quot;&#41;\n;;=&gt; &quot;ClojureScript&quot;\n</code></pre>"],
   :ns "syntax",
   :name "dispatch",
   :type "syntax",
   :related
   ["syntax/regex"
    "syntax/function"
    "syntax/set"
    "syntax/var"
    "syntax/ignore"
    "syntax/tagged-literal"
    "syntax/cond"],
   :examples-strings
   [[["#\"[a-zA-Z0-9]+\" ;;=> #\"[a-zA-Z0-9]+\""]
     ["#{:foo 1 2} ;;=> #{:foo 1 2}"]
     ["#(foo 1 2) ;;=> #<function (){ ;;   return cljs.user.foo.call(null,(1),(2)); ;;   }>"]
     ["(def a)" "#'a ;;=> #'cljs.user/a"]
     ["#_foo ;; waits for next form since #_foo was ignored"
      "#_123 456 ;;=> 456"]
     ["#queue [1 2 3] ;;=> #queue [1 2 3]"
      "#js {:foo 1} ;;=> #js {:foo 1}"
      "#inst \"2010-11-12T18:14:15.666-00:00\" ;;=> #inst \"2010-11-12T18:14:15.666-00:00\""]
     ["#?(:clj \"Clojure\" :cljs \"ClojureScript\") ;;=> \"ClojureScript\""]]],
   :description-html
   "<p><code>#</code> is a prefix character that is called the dispatch macro, because it allows the behavior of the reader to be dispatched to another table, indexed by the character following the <code>#</code>.</p><p>Syntax forms prefixed with <code>#</code> are made to bear some similarity to their original forms:</p><p>| original                           | with <code>#</code> prefix                                  | relation               | |------------------------------------|--------------------------------------------------|------------------------| | [doc:syntax/string]                    | [doc:syntax/regex]                                   | string-related         | | [doc:syntax/list]                      | [doc:syntax/function]                                | code-related           | | [doc:syntax/map]                       | [doc:syntax/set]                                     | lookup-related         | | [doc:syntax/quote]                     | [doc:syntax/var]                                     | quote-related          | | [doc:syntax/unused]                    | [doc:syntax/ignore]                                  | ignore-related         | | [<code>foo &#40;symbol&#41;</code>][doc:syntax/symbol]    | [<code>#foo &#40;tagged literal&#41;</code>][doc:syntax/tagged-literal] | name-related           | | [doc:syntax/predicate]                 | [doc:syntax/cond]                                    | conditional-related    |</p>",
   :examples
   [{:id "0a1f4c",
     :content
     "The dispatch macro is not usable on its own.  Rather, it dispatches to other\nsyntax forms.\n\nRegular expression:\n\n```clj\n#\"[a-zA-Z0-9]+\"\n;;=> #\"[a-zA-Z0-9]+\"\n```\n\nSet:\n\n```clj\n#{:foo 1 2}\n;;=> #{:foo 1 2}\n```\n\nFunction:\n\n```clj\n#(foo 1 2)\n;;=> #<function (){\n;;   return cljs.user.foo.call(null,(1),(2));\n;;   }>\n```\n\nVar reference:\n\n```clj\n(def a)\n#'a\n;;=> #'cljs.user/a\n```\n\nIgnore form:\n\n```clj\n#_foo\n;; waits for next form since #_foo was ignored\n\n#_123 456\n;;=> 456\n```\n\nTagged Literals:\n\n```clj\n#queue [1 2 3]\n;;=> #queue [1 2 3]\n\n#js {:foo 1}\n;;=> #js {:foo 1}\n\n#inst \"2010-11-12T18:14:15.666-00:00\"\n;;=> #inst \"2010-11-12T18:14:15.666-00:00\"\n```\n\nReader Conditional:\n\n```clj\n#?(:clj \"Clojure\" :cljs \"ClojureScript\")\n;;=> \"ClojureScript\"\n```"}],
   :full-name "syntax/dispatch"},
  "PersistentVector.EMPTY-NODE"
  {:ns "cljs.core",
   :name "PersistentVector.EMPTY-NODE",
   :type "var",
   :full-name "cljs.core/PersistentVector.EMPTY-NODE",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-literal"
  {:description
   "Create a literal JavaScript object or array.  Data in the form of a map `{}` or\nvector `[]` must follow the `#js` tag, which will be converted at compile-time\nto a JavaScript object or array, respectively.\n\nThis will not implicitly convert nested data into JavaScript objects or arrays.",
   :examples-htmls
   ["<pre><code class=\"clj\">#js {:foo 1 bar 2}\n;;=&gt; #js {:foo 1, :bar 2}\n\n#js &#91;1 2 3&#93;\n;;=&gt; #js &#91;1 2 3&#93;\n</code></pre><p>For readability, it is sometimes preferable to use <code>clj-&gt;js</code> rather than nested <code>#js</code> tags.</p><pre><code class=\"clj\">#js {:foo #js {:bar 1}}\n;;=&gt; #js {:foo #js {:bar 1}}\n\n&#40;clj-&gt;js {:foo {:bar 1}}&#41;\n;;=&gt; #js {:foo #js {:bar 1}}\n</code></pre>"],
   :ns "syntax",
   :name "js-literal",
   :type "tagged literal",
   :related ["cljs.core/js-obj" "cljs.core/array" "cljs.core/clj->js"],
   :examples-strings
   [[["#js {:foo 1 bar 2} ;;=> #js {:foo 1, :bar 2}"
      "#js [1 2 3] ;;=> #js [1 2 3]"]
     ["#js {:foo #js {:bar 1}} ;;=> #js {:foo #js {:bar 1}}"
      "(clj->js {:foo {:bar 1}}) ;;=> #js {:foo #js {:bar 1}}"]]],
   :description-html
   "<p>Create a literal JavaScript object or array.  Data in the form of a map <code>{}</code> or vector <code>&#91;&#93;</code> must follow the <code>#js</code> tag, which will be converted at compile-time to a JavaScript object or array, respectively.</p><p>This will not implicitly convert nested data into JavaScript objects or arrays.</p>",
   :examples
   [{:id "05e121",
     :content
     "```clj\n#js {:foo 1 bar 2}\n;;=> #js {:foo 1, :bar 2}\n\n#js [1 2 3]\n;;=> #js [1 2 3]\n```\n\nFor readability, it is sometimes preferable to use `clj->js` rather than nested\n`#js` tags.\n\n```clj\n#js {:foo #js {:bar 1}}\n;;=> #js {:foo #js {:bar 1}}\n\n(clj->js {:foo {:bar 1}})\n;;=> #js {:foo #js {:bar 1}}\n```"}],
   :full-name "syntax/js-literal"},
  "PersistentQueue"
  {:ns "cljs.core",
   :name "PersistentQueue",
   :signature ["[meta count front rear __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentQueue",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "seq->js-array"
  {:ns "cljs.repl.node",
   :name "seq->js-array",
   :signature ["[v]"],
   :type "function",
   :full-name "cljs.repl.node/seq->js-array",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "if-not"
  {:description
   "If `test` is false or nil, evaluates and returns `then`. Otherwise, evaluates\nand returns `else`. `else` defaults to nil if not provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "if-not",
   :signature ["[test then]" "[test then else]"],
   :type "macro",
   :related ["special/if" "cljs.core/when-not"],
   :examples-strings [],
   :description-html
   "<p>If <code>test</code> is false or nil, evaluates and returns <code>then</code>. Otherwise, evaluates and returns <code>else</code>. <code>else</code> defaults to nil if not provided.</p>",
   :full-name "cljs.core/if-not",
   :docstring
   "Evaluates test. If logical false, evaluates and returns then expr, \notherwise else expr, if supplied, else nil."},
  "sorted-map-by"
  {:description
   "Returns a new sorted map with supplied mappings, using the supplied comparator\nfunction.\n\n`keyvals` must be an even number of forms.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sorted-map-by",
   :signature ["[comparator & keyvals]"],
   :type "function",
   :related
   ["cljs.core/sorted-map"
    "cljs.core/subseq"
    "cljs.core/rsubseq"
    "cljs.core/sorted-set-by"],
   :examples-strings [],
   :description-html
   "<p>Returns a new sorted map with supplied mappings, using the supplied comparator function.</p><p><code>keyvals</code> must be an even number of forms.</p>",
   :full-name "cljs.core/sorted-map-by",
   :docstring
   "keyval => key val\nReturns a new sorted map with supplied mappings, using the supplied comparator."},
  "src-file->goog-require"
  {:ns "cljs.build.api",
   :name "src-file->goog-require",
   :signature ["[src]" "[src options]" "[state src options]"],
   :type "function",
   :full-name "cljs.build.api/src-file->goog-require",
   :docstring
   "Given a ClojureScript or Google Closure style JavaScript source file return\nthe goog.require statement for it.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "replace-node"
  {:ns "clojure.browser.dom",
   :name "replace-node",
   :signature ["[old-node new-node]"],
   :type "function",
   :full-name "clojure.browser.dom/replace-node",
   :docstring
   "Replace old-node with new-node. old-node can be an element or a\nkeyword which is the id of the node to replace.  new-node can be an\nelement or an html string.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "with-pprint-dispatch"
  {:ns "cljs.pprint",
   :name "with-pprint-dispatch",
   :signature ["[function & body]"],
   :type "macro",
   :full-name "cljs.pprint/with-pprint-dispatch",
   :docstring
   "Execute body with the pretty print dispatch function bound to function.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unique-event-id"
  {:ns "clojure.browser.event",
   :name "unique-event-id",
   :signature ["[event-type]"],
   :type "function",
   :full-name "clojure.browser.event/unique-event-id",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Math-namespace"
  {:description
   "A special namespace for direct access to the native JavaScript [Math library].\n\n`Math/foo` => `js/Math.foo`\n\n[Math library]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math",
   :examples-htmls
   ["<p>Math constants:</p><pre><code class=\"clj\">Math/E\n;;=&gt; 2.718281828459045\n\nMath/PI\n;;=&gt; 3.141592653589793\n\nMath/SQRT2\n;;=&gt; 1.4142135623730951\n</code></pre><p>Math functions:</p><pre><code class=\"clj\">&#40;Math/cos 0&#41;\n;;=&gt; 1\n\n&#40;Math/atan2 1 0&#41;\n;;=&gt; 1.5707963267948966\n\n&#40;Math/log Math/E&#41;\n;;=&gt; 1\n\n&#40;Math/pow 2 5&#41;\n;;=&gt; 32\n\n&#40;Math/pow Math/E &#40;Math/log 1&#41;&#41;\n;;=&gt; 1\n</code></pre>"],
   :ns "syntax",
   :name "Math-namespace",
   :type "special namespace",
   :related ["syntax/js-namespace"],
   :examples-strings
   [[["Math/E ;;=> 2.718281828459045"
      "Math/PI ;;=> 3.141592653589793"
      "Math/SQRT2 ;;=> 1.4142135623730951"]
     ["(Math/cos 0) ;;=> 1"
      "(Math/atan2 1 0) ;;=> 1.5707963267948966"
      "(Math/log Math/E) ;;=> 1"
      "(Math/pow 2 5) ;;=> 32"
      "(Math/pow Math/E (Math/log 1)) ;;=> 1"]]],
   :description-html
   "<p>A special namespace for direct access to the native JavaScript [Math library].</p><p><code>Math/foo</code> => <code>js/Math.foo</code></p><p>[Math library]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math</p>",
   :examples
   [{:id "9cfeb0",
     :content
     "Math constants:\n\n```clj\nMath/E\n;;=> 2.718281828459045\n\nMath/PI\n;;=> 3.141592653589793\n\nMath/SQRT2\n;;=> 1.4142135623730951\n```\n\nMath functions:\n\n```clj\n(Math/cos 0)\n;;=> 1\n\n(Math/atan2 1 0)\n;;=> 1.5707963267948966\n\n(Math/log Math/E)\n;;=> 1\n\n(Math/pow 2 5)\n;;=> 32\n\n(Math/pow Math/E (Math/log 1))\n;;=> 1\n```"}],
   :full-name "syntax/Math-namespace"},
  "keep"
  {:description
   "Returns a lazy sequence of the non-nil results of `(f item)`. Note, this means\nfalse return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "keep",
   :signature ["[f]" "[f coll]"],
   :type "function",
   :related
   ["cljs.core/keep-indexed" "cljs.core/map" "cljs.core/filter"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of the non-nil results of <code>&#40;f item&#41;</code>. Note, this means false return values will be included.</p><p><code>f</code> must be free of side-effects.</p><p>Returns a transducer when no collection is provided.</p>",
   :full-name "cljs.core/keep",
   :docstring
   "Returns a lazy sequence of the non-nil results of (f item). Note,\nthis means false return values will be included.  f must be free of\nside-effects.  Returns a transducer when no collection is provided."},
  "js-keys"
  {:description "Returns the keys for the JavaScript object `obj`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;js-keys #js {:foo 1 :bar 2}&#41;\n;;=&gt; #js &#91;&quot;foo&quot; &quot;bar&quot;&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "js-keys",
   :signature ["[obj]"],
   :type "function",
   :related ["cljs.core/keys"],
   :examples-strings
   [[["(js-keys #js {:foo 1 :bar 2}) ;;=> #js [\"foo\" \"bar\"]"]]],
   :description-html
   "<p>Returns the keys for the JavaScript object <code>obj</code>.</p>",
   :examples
   [{:id "5dd933",
     :content
     "```clj\n(js-keys #js {:foo 1 :bar 2})\n;;=> #js [\"foo\" \"bar\"]\n```"}],
   :full-name "cljs.core/js-keys",
   :docstring "Return the JavaScript keys for an object."},
  "unchecked-subtract"
  {:ns "cljs.core",
   :name "unchecked-subtract",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-subtract",
   :docstring
   "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "declare"
  {:description
   "Uses `def` to establish symbols of `names` with no bindings.\n\nUseful for making forward declarations.",
   :examples-htmls
   ["<pre><code class=\"clj\">a\n;; WARNING: Use of undeclared Var\n\n&#40;declare a&#41;\na\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "declare",
   :signature ["[& names]"],
   :type "macro",
   :related ["special/def"],
   :examples-strings
   [[["a ;; WARNING: Use of undeclared Var"
      "(declare a)"
      "a ;;=> nil"]]],
   :description-html
   "<p>Uses <code>def</code> to establish symbols of <code>names</code> with no bindings.</p><p>Useful for making forward declarations.</p>",
   :examples
   [{:id "5a2dc2",
     :content
     "```clj\na\n;; WARNING: Use of undeclared Var\n\n(declare a)\na\n;;=> nil\n```"}],
   :full-name "cljs.core/declare",
   :docstring
   "defs the supplied var names with no bindings, useful for making forward declarations."},
  "enable-util-print!"
  {:ns "cljs.nodejs",
   :name "enable-util-print!",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.nodejs/enable-util-print!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "when-first"
  {:description
   "With `bindings` as `x`, `xs`, roughly the same as `(when (seq xs) (let [x (first\nxs)] body))` but `xs` is evaluated only once.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "when-first",
   :signature ["[bindings & body]"],
   :type "macro",
   :examples-strings [],
   :description-html
   "<p>With <code>bindings</code> as <code>x</code>, <code>xs</code>, roughly the same as `(when (seq xs) (let [x (first xs)] body))<code> but </code>xs` is evaluated only once.</p>",
   :full-name "cljs.core/when-first",
   :docstring
   "bindings => x xs\n\nRoughly the same as (when (seq xs) (let [x (first xs)] body)) but xs is evaluated only once"},
  "PersistentHashMap"
  {:ns "cljs.core",
   :name "PersistentHashMap",
   :signature ["[meta cnt root has-nil? nil-val __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentHashMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "index"
  {:ns "clojure.set",
   :name "index",
   :signature ["[xrel ks]"],
   :type "function",
   :full-name "clojure.set/index",
   :docstring
   "Returns a map of the distinct values of ks in the xrel mapped to a\nset of the maps in xrel with the corresponding values of ks.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IMultiFn"
  {:ns "cljs.core",
   :name "IMultiFn",
   :type "protocol",
   :full-name "cljs.core/IMultiFn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "handle-post"
  {:ns "cljs.repl.browser",
   :name "handle-post",
   :signature ["[m _ _]"],
   :type "multimethod",
   :full-name "cljs.repl.browser/handle-post",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mapped-stacktrace"
  {:ns "cljs.repl",
   :name "mapped-stacktrace",
   :signature ["[stacktrace]" "[stacktrace opts]"],
   :type "function",
   :full-name "cljs.repl/mapped-stacktrace",
   :docstring
   "Given a vector representing the canonicalized JavaScript stacktrace\nreturn the ClojureScript stacktrace. The canonical stacktrace must be\nin the form:\n\n [{:file <string>\n   :function <string>\n   :line <integer>\n   :column <integer>}*]\n\n:file must be a URL path (without protocol) relative to :output-dir or a\nidentifier delimited by angle brackets. The returned mapped stacktrace will\nalso contain :url entries to the original sources if it can be determined\nfrom the classpath.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "seqable?"
  {:ns "cljs.core",
   :name "seqable?",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.core/seqable?",
   :docstring "Return true if s satisfies ISeqable",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "auto-gensym"
  {:description
   "(Only intended for use in a [doc:syntax/syntax-quote].)\n\n``foo#` => `foo__135__auto__`\n\nAuto-generates a unique symbol with the given prefix, particularly one that\nwill not shadow any existing symbol in its resulting scope.  This is intended\nas a convenience for creating hygienic macros without calling\n[doc:cljs.core/gensym] directly.\n\nEvery symbol matching a unique `foo#` symbol within a syntax quoted form will\nbe replaced with the same generated symbol.\n\n``(foo# foo#)` => `(foo__138__auto__ foo__138__auto__)`\n\nNamespace-qualified symbols `foo/bar#` are not replaced.",
   :examples-htmls
   ["<pre><code class=\"clj\">`foo#\n;;=&gt; foo&#95;&#95;142&#95;&#95;auto&#95;&#95;\n</code></pre><p>Namespace-qualified symbols are left alone.</p><pre><code class=\"clj\">`foo/bar#\n;;=&gt; foo/bar#\n</code></pre>"
    "<p>Create safe local bindings:</p><pre><code class=\"clj\">`&#40;let &#91;x# 1&#93;\n   &#40;+ x# 2&#41;&#41;\n;;=&gt; &#40;cljs.user/let &#91;x&#95;&#95;146&#95;&#95;auto&#95;&#95; 1&#93; &#40;cljs.user/+ x&#95;&#95;146&#95;&#95;auto&#95;&#95; 2&#41;&#41;\n</code></pre>"],
   :ns "syntax",
   :name "auto-gensym",
   :type "special character",
   :related ["cljs.core/gensym" "syntax/syntax-quote"],
   :examples-strings
   [[["`foo# ;;=> foo__142__auto__"] ["`foo/bar# ;;=> foo/bar#"]]
    [["`(let [x# 1]"
      "   (+ x# 2)) ;;=> (cljs.user/let [x__146__auto__ 1] (cljs.user/+ x__146__auto__ 2))"]]],
   :description-html
   "<p>(Only intended for use in a [doc:syntax/syntax-quote].)</p><p>``foo#<code> =&gt; </code>foo<b>135</b>auto__`</p><p>Auto-generates a unique symbol with the given prefix, particularly one that will not shadow any existing symbol in its resulting scope.  This is intended as a convenience for creating hygienic macros without calling [doc:cljs.core/gensym] directly.</p><p>Every symbol matching a unique <code>foo#</code> symbol within a syntax quoted form will be replaced with the same generated symbol.</p><p>``(foo# foo#)<code> =&gt; </code>(foo<b>138</b>auto<b> foo</b>138<b>auto</b>)`</p><p>Namespace-qualified symbols <code>foo/bar#</code> are not replaced.</p>",
   :examples
   [{:id "432cda",
     :content
     "```clj\n`foo#\n;;=> foo__142__auto__\n```\n\nNamespace-qualified symbols are left alone.\n\n```clj\n`foo/bar#\n;;=> foo/bar#\n```"}
    {:id "cd51e7",
     :content
     "Create safe local bindings:\n\n```clj\n`(let [x# 1]\n   (+ x# 2))\n;;=> (cljs.user/let [x__146__auto__ 1] (cljs.user/+ x__146__auto__ 2))\n```"}],
   :full-name "syntax/auto-gensym"},
  "nthnext"
  {:description
   "Returns the `n`th `next` of `coll`.\n\nReturns `(seq coll)` when `n` is 0.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "nthnext",
   :signature ["[coll n]"],
   :type "function",
   :related ["cljs.core/nth" "cljs.core/drop" "cljs.core/nthrest"],
   :examples-strings [],
   :description-html
   "<p>Returns the <code>n</code>th <code>next</code> of <code>coll</code>.</p><p>Returns <code>&#40;seq coll&#41;</code> when <code>n</code> is 0.</p>",
   :full-name "cljs.core/nthnext",
   :docstring "Returns the nth next of coll, (seq coll) when n is 0."},
  "IKVReduce"
  {:ns "cljs.core",
   :name "IKVReduce",
   :type "protocol",
   :full-name "cljs.core/IKVReduce",
   :docstring
   "Protocol for associative types that can reduce themselves\n  via a function of key and val. Called by cljs.core/reduce-kv.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "to-array-2d"
  {:description
   "Returns a (potentially-ragged) 2-dimensional JavaScript array containing the\ncontents of `coll`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "to-array-2d",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/to-array"],
   :examples-strings [],
   :description-html
   "<p>Returns a (potentially-ragged) 2-dimensional JavaScript array containing the contents of <code>coll</code>.</p>",
   :full-name "cljs.core/to-array-2d",
   :docstring
   "Returns a (potentially-ragged) 2-dimensional array\ncontaining the contents of coll."},
  "demunge"
  {:ns "cljs.core",
   :name "demunge",
   :signature ["[name]"],
   :type "function",
   :full-name "cljs.core/demunge",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentTreeSet"
  {:ns "cljs.core",
   :name "PersistentTreeSet",
   :signature ["[meta tree-map __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentTreeSet",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "up"
  {:ns "clojure.zip",
   :name "up",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/up",
   :docstring
   "Returns the loc of the parent of the node at this loc, or nil if at\nthe top",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "comma"
  {:description
   "A comma is treated as whitespace when appearing outside a string.\n\nThis is mainly used to help delineate elements in a collection when necessary.\n\nCommas are used when printing maps in the REPL:\n\n```clj\n{:foo 1, :bar 2, :bar 3}\n```",
   :ns "syntax",
   :name "comma",
   :type "special character",
   :examples
   [{:id "68e4a0",
     :content
     "```clj\n[1, 2, 3, 4]\n;;=> [1 2 3 4]\n\n{:foo :bar :baz :quux}\n;;=> {:foo :bar, :baz :quux}\n```"}],
   :full-name "syntax/comma",
   :description-html
   "<p>A comma is treated as whitespace when appearing outside a string.</p><p>This is mainly used to help delineate elements in a collection when necessary.</p><p>Commas are used when printing maps in the REPL:</p><pre><code class=\"clj\">{:foo 1, :bar 2, :bar 3}\n</code></pre>",
   :examples-strings
   [[["[1, 2, 3, 4] ;;=> [1 2 3 4]"
      "{:foo :bar :baz :quux} ;;=> {:foo :bar, :baz :quux}"]]],
   :examples-htmls
   ["<pre><code class=\"clj\">&#91;1, 2, 3, 4&#93;\n;;=&gt; &#91;1 2 3 4&#93;\n\n{:foo :bar :baz :quux}\n;;=&gt; {:foo :bar, :baz :quux}\n</code></pre>"]},
  "disj!"
  {:ns "cljs.core",
   :name "disj!",
   :signature ["[tcoll val]" "[tcoll val & vals]"],
   :type "function",
   :full-name "cljs.core/disj!",
   :docstring
   "disj[oin]. Returns a transient set of the same (hashed/sorted) type, that\ndoes not contain key(s).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "setf"
  {:ns "cljs.pprint",
   :name "setf",
   :signature ["[sym new-val]"],
   :type "macro",
   :full-name "cljs.pprint/setf",
   :docstring "Set the value of the field SYM to NEW-VAL",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMap.fromArrays"
  {:ns "cljs.core",
   :name "PersistentArrayMap.fromArrays",
   :signature ["[ks vs]"],
   :type "function",
   :full-name "cljs.core/PersistentArrayMap.fromArrays",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-stream"
  {:ns "cljs.repl",
   :name "load-stream",
   :signature ["[repl-env filename res]"],
   :type "function",
   :full-name "cljs.repl/load-stream",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "arg"
  {:description
   "Special vars for accessing implicit function arguments.\n\nOnly usable inside [doc:syntax/function].\n\n- `%` or `%1` for first argument.\n- `%2`, `%3` and so on for subsequent arguments\n- `%&` for the rest of the arguments after the highest individually referenced argument",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;map #&#40;&#42; 2 %&#41; &#91;1 2 3&#93;&#41;\n;;=&gt; &#40;2 4 6&#41;\n\n&#40;def f #&#40;println %1 %2 %&amp;&#41;&#41;\n&#40;f 1 2 3 4 5&#41;\n;; prints: 1 2 &#40;3 4 5&#41;\n</code></pre>"],
   :ns "syntax",
   :name "arg",
   :type "syntax",
   :related ["syntax/function"],
   :examples-strings
   [[["(map #(* 2 %) [1 2 3]) ;;=> (2 4 6)"
      "(def f #(println %1 %2 %&))"
      "(f 1 2 3 4 5) ;; prints: 1 2 (3 4 5)"]]],
   :description-html
   "<p>Special vars for accessing implicit function arguments.</p><p>Only usable inside [doc:syntax/function].</p><ul><li><code>%</code> or <code>%1</code> for first argument.</li><li><code>%2</code>, <code>%3</code> and so on for subsequent arguments</li><li><code>%&amp;</code> for the rest of the arguments after the highest individually referenced argument</li></ul>",
   :examples
   [{:id "d17825",
     :content
     "```clj\n(map #(* 2 %) [1 2 3])\n;;=> (2 4 6)\n\n(def f #(println %1 %2 %&))\n(f 1 2 3 4 5)\n;; prints: 1 2 (3 4 5)\n```"}],
   :full-name "syntax/arg"},
  "*default-data-reader-fn*"
  {:ns "cljs.reader",
   :name "*default-data-reader-fn*",
   :type "dynamic var",
   :full-name "cljs.reader/*default-data-reader-fn*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Reduced"
  {:ns "cljs.core",
   :name "Reduced",
   :signature ["[val]"],
   :type "type",
   :full-name "cljs.core/Reduced",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "aget"
  {:description
   "Returns the value at index `i` of a JavaScript array.\n\n```clj\n(def a #js [1 2 3])\n(aget a 0)\n;;=> 1\n```\n\nRetrieve nested elements with the additional `idxs` arguments.\n\n```clj\n(def a #js [1 2 #js [3 4]])\n(aget a 2 0)\n;;=> 3\n```\n\nFor JavaScript objects, use [`goog.object/get`] or the multi-arity [`goog.object/getValueByKeys`].\n\n```clj\n(require 'goog.object)\n(def obj #js {:foo #js {:bar 2}})\n\n(goog.object/get obj \"foo\")\n;;=> #js {:bar 2} \n\n(goog.object/getValueByKeys obj \"foo\" \"bar\")\n;;=> 2\n```\n\n[`goog.object/get`]:http://google.github.io/closure-library/api/namespace_goog_object.html#get\n[`goog.object/getValueByKeys`]:http://google.github.io/closure-library/api/namespace_goog_object.html#getValueByKeys",
   :examples-htmls [],
   :ns "cljs.core",
   :name "aget",
   :signature ["[array i]" "[array i & idxs]"],
   :type "function/macro",
   :related
   ["cljs.core/.." "cljs.core/aset" "cljs.core/get" "cljs.core/nth"],
   :examples-strings [],
   :description-html
   "<p>Returns the value at index <code>i</code> of a JavaScript array.</p><pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n&#40;aget a 0&#41;\n;;=&gt; 1\n</code></pre><p>Retrieve nested elements with the additional <code>idxs</code> arguments.</p><pre><code class=\"clj\">&#40;def a #js &#91;1 2 #js &#91;3 4&#93;&#93;&#41;\n&#40;aget a 2 0&#41;\n;;=&gt; 3\n</code></pre><p>For JavaScript objects, use [<code>goog.object/get</code>] or the multi-arity [<code>goog.object/getValueByKeys</code>].</p><pre><code class=\"clj\">&#40;require 'goog.object&#41;\n&#40;def obj #js {:foo #js {:bar 2}}&#41;\n\n&#40;goog.object/get obj &quot;foo&quot;&#41;\n;;=&gt; #js {:bar 2} \n\n&#40;goog.object/getValueByKeys obj &quot;foo&quot; &quot;bar&quot;&#41;\n;;=&gt; 2\n</code></pre><p>[<code>goog.object/get</code>]:http://google.github.io/closure-library/api/namespace<i>goog</i>object.html#get [<code>goog.object/getValueByKeys</code>]:http://google.github.io/closure-library/api/namespace<i>goog</i>object.html#getValueByKeys</p>",
   :full-name "cljs.core/aget",
   :docstring "Returns the value at the index."},
  "IParseErrorMessage"
  {:ns "cljs.repl",
   :name "IParseErrorMessage",
   :type "protocol",
   :full-name "cljs.repl/IParseErrorMessage",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "find"
  {:description
   "Returns the map entry for key `k`, or nil if `k` is not found.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "find",
   :signature ["[coll k]"],
   :type "function",
   :related ["cljs.core/get" "cljs.core/get-in"],
   :examples-strings [],
   :description-html
   "<p>Returns the map entry for key <code>k</code>, or nil if <code>k</code> is not found.</p>",
   :full-name "cljs.core/find",
   :docstring
   "Returns the map entry for key, or nil if key not present."},
  "src-file->target-file"
  {:ns "cljs.build.api",
   :name "src-file->target-file",
   :signature ["[src]" "[src opts]" "[state src opts]"],
   :type "function",
   :full-name "cljs.build.api/src-file->target-file",
   :docstring
   "Given a ClojureScript source file return the target file. May optionally\nprovide build options with :output-dir specified.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-C2"
  {:ns "cljs.core",
   :name "m3-C2",
   :type "var",
   :full-name "cljs.core/m3-C2",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "fire-listeners"
  {:ns "clojure.browser.event",
   :name "fire-listeners",
   :signature ["[obj type capture event]"],
   :type "function",
   :full-name "clojure.browser.event/fire-listeners",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "system-time"
  {:ns "cljs.core",
   :name "system-time",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.core/system-time",
   :docstring
   "Returns highest resolution time offered by host in milliseconds.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ITransientCollection"
  {:ns "cljs.core",
   :name "ITransientCollection",
   :type "protocol",
   :full-name "cljs.core/ITransientCollection",
   :docstring
   "Protocol for adding basic functionality to transient collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "create-ns"
  {:ns "cljs.core",
   :name "create-ns",
   :signature ["[sym]" "[sym ns-obj]"],
   :type "function",
   :full-name "cljs.core/create-ns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "number?"
  {:description "Returns true if `n` is a number, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "number?",
   :signature ["[n]"],
   :type "function/macro",
   :related ["cljs.core/integer?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is a number, false otherwise.</p>",
   :full-name "cljs.core/number?",
   :docstring "Returns true if x is a JavaScript number."},
  "IRecord"
  {:ns "cljs.core",
   :name "IRecord",
   :type "protocol",
   :full-name "cljs.core/IRecord",
   :docstring "Marker interface indicating a record object",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-token"
  {:ns "cljs.reader",
   :name "read-token",
   :signature ["[rdr initch]"],
   :type "function",
   :full-name "cljs.reader/read-token",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "StringPushbackReader"
  {:ns "cljs.reader",
   :name "StringPushbackReader",
   :signature ["[s buffer idx]"],
   :type "type",
   :full-name "cljs.reader/StringPushbackReader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-shift-right-zero-fill"
  {:ns "cljs.core",
   :name "bit-shift-right-zero-fill",
   :signature ["[x n]"],
   :type "function/macro",
   :full-name "cljs.core/bit-shift-right-zero-fill",
   :docstring "DEPRECATED: Bitwise shift right with zero fill",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-js-file"
  {:ns "cljs.repl.nashorn",
   :name "load-js-file",
   :signature ["[engine file]"],
   :type "function",
   :full-name "cljs.repl.nashorn/load-js-file",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "booleans"
  {:ns "cljs.core",
   :name "booleans",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/booleans",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dissoc"
  {:description
   "dissoc(iate)\n\nReturns a new map that does not contain a mapping for key(s).\n\nHas no effect on the map type (hashed/sorted).",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;dissoc {:key &quot;value&quot; :key2 &quot;value2&quot;} :key&#41;\n;;=&gt; {:key2 &quot;value2&quot;}\n</code></pre>"],
   :ns "cljs.core",
   :name "dissoc",
   :signature ["[coll]" "[coll k]" "[coll k & ks]"],
   :type "function",
   :related
   ["cljs.core/assoc" "cljs.core/disj" "cljs.core/select-keys"],
   :examples-strings
   [[["(dissoc {:key \"value\" :key2 \"value2\"} :key) ;;=> {:key2 \"value2\"}"]]],
   :description-html
   "<p>dissoc(iate)</p><p>Returns a new map that does not contain a mapping for key(s).</p><p>Has no effect on the map type (hashed/sorted).</p>",
   :examples
   [{:id "fd6ae9",
     :content
     "```clj\n(dissoc {:key \"value\" :key2 \"value2\"} :key)\n;;=> {:key2 \"value2\"}\n```"}],
   :full-name "cljs.core/dissoc",
   :docstring
   "dissoc[iate]. Returns a new map of the same (hashed/sorted) type,\nthat does not contain a mapping for key(s)."},
  "mix-collection-hash"
  {:ns "cljs.core",
   :name "mix-collection-hash",
   :signature ["[hash-basis count]"],
   :type "function",
   :full-name "cljs.core/mix-collection-hash",
   :docstring
   "Mix final collection hash for ordered or unordered collections.\nhash-basis is the combined collection hash, count is the number\nof elements included in the basis. Note this is the hash code\nconsistent with =, different from .hashCode.\nSee http://clojure.org/data_structures#hash for full algorithms.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-pretty-writer"
  {:ns "cljs.pprint",
   :name "get-pretty-writer",
   :signature ["[writer]"],
   :type "function",
   :full-name "cljs.pprint/get-pretty-writer",
   :docstring
   "Returns the IWriter passed in wrapped in a pretty writer proxy, unless it's\nalready a pretty writer. Generally, it is unnecessary to call this function, since pprint,\nwrite, and cl-format all call it if they need to. However if you want the state to be\npreserved across calls, you will want to wrap them with this.\n\nFor example, when you want to generate column-aware output with multiple calls to cl-format,\ndo it like in this example:\n\n    (defn print-table [aseq column-width]\n      (binding [*out* (get-pretty-writer *out*)]\n        (doseq [row aseq]\n          (doseq [col row]\n            (cl-format true \"~4D~7,vT\" col column-width))\n          (prn))))\n\nNow when you run:\n\n    user> (print-table (map #(vector % (* % %) (* % % %)) (range 1 11)) 8)\n\nIt prints a table of squares and cubes for the numbers from 1 to 10:\n\n       1      1       1\n       2      4       8\n       3      9      27\n       4     16      64\n       5     25     125\n       6     36     216\n       7     49     343\n       8     64     512\n       9     81     729\n      10    100    1000",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-divide-int"
  {:ns "cljs.core",
   :name "unchecked-divide-int",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-divide-int",
   :docstring
   "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "gensym"
  {:ns "cljs.core",
   :name "gensym",
   :signature ["[]" "[prefix-string]"],
   :type "function",
   :full-name "cljs.core/gensym",
   :docstring
   "Returns a new symbol with a unique name. If a prefix string is\nsupplied, the name is prefix# where # is some unique number. If\nprefix is not supplied, the prefix is 'G__'.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-obj"
  {:description
   "Returns a new JavaScript object using the supplied mappings.\n\n`keyvals` must be an even number of forms.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;js-obj &quot;foo&quot; 1 &quot;bar&quot; 2&#41;\n;;=&gt; #js {:foo 1, :bar 2}\n</code></pre>"],
   :ns "cljs.core",
   :name "js-obj",
   :signature ["[& keyvals]"],
   :type "function/macro",
   :related
   ["syntax/js-literal" "cljs.core/array" "cljs.core/clj->js"],
   :examples-strings
   [[["(js-obj \"foo\" 1 \"bar\" 2) ;;=> #js {:foo 1, :bar 2}"]]],
   :description-html
   "<p>Returns a new JavaScript object using the supplied mappings.</p><p><code>keyvals</code> must be an even number of forms.</p>",
   :examples
   [{:id "657cd7",
     :content
     "```clj\n(js-obj \"foo\" 1 \"bar\" 2)\n;;=> #js {:foo 1, :bar 2}\n```"}],
   :full-name "cljs.core/js-obj",
   :docstring
   "Create JavaSript object from an even number arguments representing\ninterleaved keys and values."},
  "prefix"
  {:ns "cljs.js",
   :name "prefix",
   :signature ["[s pre]"],
   :type "function",
   :full-name "cljs.js/prefix",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "assoc!"
  {:description
   "assoc(iate) on transient collection\n\nWhen applied to a transient map, adds mapping of key(s) to val(s).\n\nWhen applied to a transient vector, sets the val at index.  Note - index must\nbe <= (count vector).\n\nReturns coll.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def tcoll &#40;transient! {}&#41;&#41;\n&#40;assoc! tcoll :a 1&#41;\n&#40;assoc! tcoll :b 2&#41;\n\ntcoll\n;;=&gt; #&lt;&#91;object Object&#93;&gt; \n\n&#40;:a tcoll&#41;\n;;=&gt; 1\n\n&#40;:b tcoll&#41;\n;;=&gt; 2\n\n&#40;def a &#40;persistent! tcoll&#41;&#41;\n;;=&gt; {:a 1 :b 2}\n</code></pre>"],
   :ns "cljs.core",
   :name "assoc!",
   :signature ["[tcoll key val]" "[tcoll key val & kvs]"],
   :type "function",
   :related ["cljs.core/transient" "cljs.core/persistent!"],
   :examples-strings
   [[["(def tcoll (transient! {}))"
      "(assoc! tcoll :a 1)"
      "(assoc! tcoll :b 2)"
      "tcoll ;;=> #<[object Object]> "
      "(:a tcoll) ;;=> 1"
      "(:b tcoll) ;;=> 2"
      "(def a (persistent! tcoll)) ;;=> {:a 1 :b 2}"]]],
   :description-html
   "<p>assoc(iate) on transient collection</p><p>When applied to a transient map, adds mapping of key(s) to val(s).</p><p>When applied to a transient vector, sets the val at index.  Note - index must be <= (count vector).</p><p>Returns coll.</p>",
   :examples
   [{:id "7d1e6b",
     :content
     "```clj\n(def tcoll (transient! {}))\n(assoc! tcoll :a 1)\n(assoc! tcoll :b 2)\n\ntcoll\n;;=> #<[object Object]> \n\n(:a tcoll)\n;;=> 1\n\n(:b tcoll)\n;;=> 2\n\n(def a (persistent! tcoll))\n;;=> {:a 1 :b 2}\n```"}],
   :full-name "cljs.core/assoc!",
   :docstring
   "When applied to a transient map, adds mapping of key(s) to\nval(s). When applied to a transient vector, sets the val at index.\nNote - index must be <= (count vector). Returns coll."},
  "js-delete"
  {:description
   "Deletes property `key` in JavaScript object `obj`.\n\nEquivalent to `delete obj[key]` in JavaScript.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a #js {:foo 1 :bar 2}&#41;\n&#40;js-delete a &quot;foo&quot;&#41;\n\na\n;;=&gt; #js {:bar 2}\n</code></pre>"],
   :ns "cljs.core",
   :name "js-delete",
   :signature ["[obj key]"],
   :type "function/macro",
   :related ["cljs.core/dissoc"],
   :examples-strings
   [[["(def a #js {:foo 1 :bar 2})"
      "(js-delete a \"foo\")"
      "a ;;=> #js {:bar 2}"]]],
   :description-html
   "<p>Deletes property <code>key</code> in JavaScript object <code>obj</code>.</p><p>Equivalent to <code>delete obj&#91;key&#93;</code> in JavaScript.</p>",
   :examples
   [{:id "5b24ea",
     :content
     "```clj\n(def a #js {:foo 1 :bar 2})\n(js-delete a \"foo\")\n\na\n;;=> #js {:bar 2}\n```"}],
   :full-name "cljs.core/js-delete",
   :docstring "Delete a property from a JavaScript object."},
  "goog-dep-string"
  {:ns "cljs.build.api",
   :name "goog-dep-string",
   :signature ["[opts ijs]"],
   :type "function",
   :full-name "cljs.build.api/goog-dep-string",
   :docstring
   "Given compiler options and a IJavaScript instance return the corresponding\ngoog.addDependency string",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "object?"
  {:description
   "Returns true if `x` is a JavaScript object, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "object?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/array?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a JavaScript object, false otherwise.</p>",
   :full-name "cljs.core/object?",
   :docstring "Returns true if x's constructor is Object"},
  "when-some"
  {:description
   "When `test` is not nil, evaluates `body` with `x` bound to the value of `test`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "when-some",
   :signature ["[[x test] & body]"],
   :type "macro",
   :related ["cljs.core/if-some"],
   :examples-strings [],
   :description-html
   "<p>When <code>test</code> is not nil, evaluates <code>body</code> with <code>x</code> bound to the value of <code>test</code>.</p>",
   :full-name "cljs.core/when-some",
   :docstring
   "bindings => binding-form test\n\nWhen test is not nil, evaluates body with binding-form bound to the\nvalue of test"},
  "RecordIter"
  {:ns "cljs.core",
   :name "RecordIter",
   :signature ["[i record base-count fields ext-map-iter]"],
   :type "type",
   :full-name "cljs.core/RecordIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "vector?"
  {:description "Returns true if `x` is a vector, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "vector?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/vector" "cljs.core/vec"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a vector, false otherwise.</p>",
   :full-name "cljs.core/vector?",
   :docstring "Return true if x satisfies IVector"},
  "PrettyFlush"
  {:ns "cljs.pprint",
   :name "PrettyFlush",
   :type "protocol",
   :full-name "cljs.pprint/PrettyFlush",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "analyze-file"
  {:ns "cljs.analyzer.api",
   :name "analyze-file",
   :signature ["[f]" "[f opts]" "[state f opts]"],
   :type "function",
   :full-name "cljs.analyzer.api/analyze-file",
   :docstring
   "Given a java.io.File, java.net.URL or a string identifying a resource on the\nclasspath attempt to analyze it.\n\nThis function side-effects the ambient compilation environment\n`cljs.env/*compiler*` to aggregate analysis information. opts argument is\ncompiler options, if :cache-analysis true will cache analysis to\n\":output-dir/some/ns/foo.cljs.cache.edn\". This function does not return a\nmeaningful value.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unicode-2-pattern"
  {:ns "cljs.reader",
   :name "unicode-2-pattern",
   :type "var",
   :full-name "cljs.reader/unicode-2-pattern",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "remove-watch"
  {:description
   "Removes a watch function identified by `key` from atom `a`.  The function must\nhave originally been set by `add-watch`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a &#40;atom {}&#41;&#41;\n\n&#40;add-watch a :logger\n  &#40;fn &#91;&#95;key &#95;atom old-state new-state&#93;\n    &#40;println &quot;old:&quot; old-state&#41;\n    &#40;println &quot;new:&quot; new-state&#41;&#41;&#41;\n\n&#40;swap! a assoc :foo &quot;bar&quot;&#41;\n;;=&gt; will print the following:\n;; old: {}\n;; new: {:foo &quot;bar&quot;}\n\n&#40;remove-watch a :logger&#41;\n\n&#40;swap! a assoc :foo 3&#41;\n;;=&gt; nothing will be printed...\n</code></pre>"],
   :ns "cljs.core",
   :name "remove-watch",
   :signature ["[a key]"],
   :type "function",
   :related ["cljs.core/add-watch"],
   :examples-strings
   [[["(def a (atom {}))"
      "(add-watch a :logger"
      "  (fn [_key _atom old-state new-state]"
      "    (println \"old:\" old-state)"
      "    (println \"new:\" new-state)))"
      "(swap! a assoc :foo \"bar\") ;;=> will print the following: ;; old: {} ;; new: {:foo \"bar\"}"
      "(remove-watch a :logger)"
      "(swap! a assoc :foo 3) ;;=> nothing will be printed..."]]],
   :description-html
   "<p>Removes a watch function identified by <code>key</code> from atom <code>a</code>.  The function must have originally been set by <code>add-watch</code>.</p>",
   :examples
   [{:id "70044a",
     :content
     "```clj\n(def a (atom {}))\n\n(add-watch a :logger\n  (fn [_key _atom old-state new-state]\n    (println \"old:\" old-state)\n    (println \"new:\" new-state)))\n\n(swap! a assoc :foo \"bar\")\n;;=> will print the following:\n;; old: {}\n;; new: {:foo \"bar\"}\n\n(remove-watch a :logger)\n\n(swap! a assoc :foo 3)\n;;=> nothing will be printed...\n```"}],
   :full-name "cljs.core/remove-watch",
   :docstring
   "Alpha - subject to change.\n\nRemoves a watch (set by add-watch) from a reference"},
  "js-inline-comment"
  {:ns "cljs.core",
   :name "js-inline-comment",
   :signature ["[comment]"],
   :type "macro",
   :full-name "cljs.core/js-inline-comment",
   :docstring "Emit an inline JavaScript comment.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-or"
  {:description "Bitwise \"or\". Same as `x | y` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-or 2r1100 2r1010&#41;\n;;=&gt; 14\n;; 14 = 2r1110\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-or 12 10&#41;\n;;=&gt; 14\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-or",
   :signature ["[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/bit-and" "cljs.core/bit-xor"],
   :examples-strings
   [[["(bit-or 2r1100 2r1010) ;;=> 14 ;; 14 = 2r1110"]
     ["(bit-or 12 10) ;;=> 14"]]],
   :description-html
   "<p>Bitwise \"or\". Same as <code>x | y</code> in JavaScript.</p>",
   :examples
   [{:id "ecea10",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-or 2r1100 2r1010)\n;;=> 14\n;; 14 = 2r1110\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-or 12 10)\n;;=> 14\n```"}],
   :full-name "cljs.core/bit-or",
   :docstring "Bitwise or"},
  "set-properties"
  {:ns "clojure.browser.dom",
   :name "set-properties",
   :signature ["[e m]"],
   :type "function",
   :full-name "clojure.browser.dom/set-properties",
   :docstring "Set properties on an element",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reduced"
  {:ns "cljs.core",
   :name "reduced",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/reduced",
   :docstring
   "Wraps x in a way such that a reduce will terminate with the value x",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ES6SetEntriesIterator"
  {:ns "cljs.core",
   :name "ES6SetEntriesIterator",
   :signature ["[s]"],
   :type "type",
   :full-name "cljs.core/ES6SetEntriesIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "total-listener-count"
  {:ns "clojure.browser.event",
   :name "total-listener-count",
   :signature ["[]"],
   :type "function",
   :full-name "clojure.browser.event/total-listener-count",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "remove-all"
  {:ns "clojure.browser.event",
   :name "remove-all",
   :signature ["[opt_obj opt_type opt_capt]"],
   :type "function",
   :full-name "clojure.browser.event/remove-all",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-meta*"
  {:ns "cljs.core",
   :name "*print-meta*",
   :type "dynamic var",
   :full-name "cljs.core/*print-meta*",
   :docstring
   "If set to logical true, when printing an object, its metadata will also\nbe printed in a form that can be read back by the reader.\n\nDefaults to false.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "not"
  {:description
   "Returns true if `x` is logical false, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "not",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/complement" "cljs.core/false?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is logical false, false otherwise.</p>",
   :full-name "cljs.core/not",
   :docstring "Returns true if x is logical false, false otherwise."},
  "platform-path"
  {:ns "cljs.repl.node",
   :name "platform-path",
   :signature ["[v]"],
   :type "function",
   :full-name "cljs.repl.node/platform-path",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unreadable"
  {:description
   "A proper definition for something that cannot be read.\n\nWhen certain values cannot be printed to a REPL using some literal syntax form,\nit wraps a description of its value in a form defined as unreadable, `#<>`.  A\nreader error will be thrown if this value is fed back into the REPL.\n\nFor example, `(atom 42)` will print `#<Atom: 42>` when evaluated in a REPL.\nThis communicates a human-readable form that is not intended to be reproduce\nits value.\n\nOftentimes, evaluating JavaScript objects in a REPL will print the result\nof its `.toString` method inside the unreadable form `#<>`.",
   :ns "syntax",
   :name "unreadable",
   :type "syntax",
   :examples
   [{:id "e0a6cd",
     :content
     "Unreadable forms will throw an exception when read:\n\n```clj\n#<foo>\n;; clojure.lang.ExceptionInfo: Unreadable form\n```\n\nYou can create an unreadable form for a custom type:\n\n```clj\n(deftype Foo [])\n(Foo.)\n;;=> #<[object Object]>\n\n(deftype Foo [x]\n  Object\n  (toString [_]\n    (str \"Foo: \" x)))\n(Foo. 1)\n;;=> #<Foo: 1>\n```\n\nSome examples of unreadable JavaScript values:\n\n```clj\nMath/sin\n;;=> #<function sin() { [native code] }>\n\njs/console\n;;=> #<[object Object]>\n```"}],
   :full-name "syntax/unreadable",
   :description-html
   "<p>A proper definition for something that cannot be read.</p><p>When certain values cannot be printed to a REPL using some literal syntax form, it wraps a description of its value in a form defined as unreadable, <code>#&lt;&gt;</code>.  A reader error will be thrown if this value is fed back into the REPL.</p><p>For example, <code>&#40;atom 42&#41;</code> will print <code>#&lt;Atom: 42&gt;</code> when evaluated in a REPL. This communicates a human-readable form that is not intended to be reproduce its value.</p><p>Oftentimes, evaluating JavaScript objects in a REPL will print the result of its <code>.toString</code> method inside the unreadable form <code>#&lt;&gt;</code>.</p>",
   :examples-strings
   [[["#<foo> ;; clojure.lang.ExceptionInfo: Unreadable form"]
     ["(deftype Foo [])"
      "(Foo.) ;;=> #<[object Object]>"
      "(deftype Foo [x]"
      "  Object"
      "  (toString [_]"
      "    (str \"Foo: \" x)))"
      "(Foo. 1) ;;=> #<Foo: 1>"]
     ["Math/sin ;;=> #<function sin() { [native code] }>"
      "js/console ;;=> #<[object Object]>"]]],
   :examples-htmls
   ["<p>Unreadable forms will throw an exception when read:</p><pre><code class=\"clj\">#&lt;foo&gt;\n;; clojure.lang.ExceptionInfo: Unreadable form\n</code></pre><p>You can create an unreadable form for a custom type:</p><pre><code class=\"clj\">&#40;deftype Foo &#91;&#93;&#41;\n&#40;Foo.&#41;\n;;=&gt; #&lt;&#91;object Object&#93;&gt;\n\n&#40;deftype Foo &#91;x&#93;\n  Object\n  &#40;toString &#91;&#95;&#93;\n    &#40;str &quot;Foo: &quot; x&#41;&#41;&#41;\n&#40;Foo. 1&#41;\n;;=&gt; #&lt;Foo: 1&gt;\n</code></pre><p>Some examples of unreadable JavaScript values:</p><pre><code class=\"clj\">Math/sin\n;;=&gt; #&lt;function sin&#40;&#41; { &#91;native code&#93; }&gt;\n\njs/console\n;;=&gt; #&lt;&#91;object Object&#93;&gt;\n</code></pre>"]},
  "longs"
  {:ns "cljs.core",
   :name "longs",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/longs",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "HashMap.EMPTY"
  {:ns "cljs.core",
   :name "HashMap.EMPTY",
   :type "var",
   :full-name "cljs.core/HashMap.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "newline"
  {:ns "cljs.core",
   :name "newline",
   :signature ["[]" "[opts]"],
   :type "function",
   :full-name "cljs.core/newline",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bootstrap"
  {:ns "clojure.browser.repl",
   :name "bootstrap",
   :signature ["[]"],
   :type "function",
   :full-name "clojure.browser.repl/bootstrap",
   :docstring
   "Reusable browser REPL bootstrapping. Patches the essential functions\nin goog.base to support re-loading of namespaces after page load.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reductions"
  {:description
   "Returns a lazy sequence of the intermediate values of the reduction (as per\n`reduce`) of `coll` by `f`, starting with `init`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "reductions",
   :signature ["[f coll]" "[f init coll]"],
   :type "function",
   :related ["cljs.core/reduce"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of the intermediate values of the reduction (as per <code>reduce</code>) of <code>coll</code> by <code>f</code>, starting with <code>init</code>.</p>",
   :full-name "cljs.core/reductions",
   :docstring
   "Returns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init."},
  "append-child"
  {:ns "clojure.zip",
   :name "append-child",
   :signature ["[loc item]"],
   :type "function",
   :full-name "clojure.zip/append-child",
   :docstring
   "Inserts the item as the rightmost child of the node at this loc,\nwithout moving",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "is_proto_"
  {:ns "cljs.core",
   :name "is_proto_",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/is_proto_",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-negate-int"
  {:ns "cljs.core",
   :name "unchecked-negate-int",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-negate-int",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "handlers"
  {:ns "cljs.repl.server",
   :name "handlers",
   :type "var",
   :full-name "cljs.repl.server/handlers",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "doall"
  {:description
   "Forces evaluation of a lazy sequence. Often used to see the effects of a\nsequence produced via functions that have side effects.\n\n`doall` walks through the successive `next`s of the sequence, returning the head\nand causing the entire sequence to reside in memory at one time.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "doall",
   :signature ["[coll]" "[n coll]"],
   :type "function",
   :related ["cljs.core/dorun" "cljs.core/doseq"],
   :examples-strings [],
   :description-html
   "<p>Forces evaluation of a lazy sequence. Often used to see the effects of a sequence produced via functions that have side effects.</p><p><code>doall</code> walks through the successive <code>next</code>s of the sequence, returning the head and causing the entire sequence to reside in memory at one time.</p>",
   :full-name "cljs.core/doall",
   :docstring
   "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. doall can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, retains the head and returns it, thus causing the entire\nseq to reside in memory at one time."},
  "repl-quit-prompt"
  {:ns "cljs.repl",
   :name "repl-quit-prompt",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl/repl-quit-prompt",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "if-let"
  {:description
   "When `test` is logical true, evaluates `then` with the value of `test` bound to\n`x`. Otherwise, evaluates `else` with no bindings.\n\n`else` defaults to nil.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "if-let",
   :signature ["[[x test] then]" "[[x test] then else]"],
   :type "macro",
   :related ["cljs.core/when-let" "special/if"],
   :examples-strings [],
   :description-html
   "<p>When <code>test</code> is logical true, evaluates <code>then</code> with the value of <code>test</code> bound to <code>x</code>. Otherwise, evaluates <code>else</code> with no bindings.</p><p><code>else</code> defaults to nil.</p>",
   :full-name "cljs.core/if-let",
   :docstring
   "bindings => binding-form test\n\nIf test is true, evaluates then with binding-form bound to the value of \ntest, if not, yields else"},
  "pop!"
  {:ns "cljs.core",
   :name "pop!",
   :signature ["[tcoll]"],
   :type "function",
   :full-name "cljs.core/pop!",
   :docstring
   "Removes the last item from a transient vector. If\nthe collection is empty, throws an exception. Returns coll",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "skip-line"
  {:ns "cljs.reader",
   :name "skip-line",
   :signature ["[reader _]"],
   :type "function",
   :full-name "cljs.reader/skip-line",
   :docstring
   "Advances the reader to the end of a line. Returns the reader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-add"
  {:ns "cljs.core",
   :name "unchecked-add",
   :signature ["[]" "[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-add",
   :docstring "Returns the sum of nums. (+) returns 0.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IReversible"
  {:ns "cljs.core",
   :name "IReversible",
   :type "protocol",
   :full-name "cljs.core/IReversible",
   :docstring "Protocol for reversing a seq.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "run!"
  {:ns "cljs.core",
   :name "run!",
   :signature ["[proc coll]"],
   :type "function",
   :full-name "cljs.core/run!",
   :docstring
   "Runs the supplied procedure (via reduce), for purposes of side\neffects, on successive items in the collection. Returns nil",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMapSeq"
  {:ns "cljs.core",
   :name "PersistentArrayMapSeq",
   :signature ["[arr i _meta]"],
   :type "type",
   :full-name "cljs.core/PersistentArrayMapSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-src->cljs-src"
  {:ns "cljs.repl",
   :name "js-src->cljs-src",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.repl/js-src->cljs-src",
   :docstring
   "Map a JavaScript output file back to the original ClojureScript source\nfile (.cljs or .cljc).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "string-hash-cache-count"
  {:ns "cljs.core",
   :name "string-hash-cache-count",
   :type "var",
   :full-name "cljs.core/string-hash-cache-count",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IGetError"
  {:ns "cljs.repl",
   :name "IGetError",
   :type "protocol",
   :full-name "cljs.repl/IGetError",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "find-ns-obj"
  {:ns "cljs.core",
   :name "find-ns-obj",
   :signature ["[ns]"],
   :type "function",
   :full-name "cljs.core/find-ns-obj",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IEditableCollection"
  {:ns "cljs.core",
   :name "IEditableCollection",
   :type "protocol",
   :full-name "cljs.core/IEditableCollection",
   :docstring
   "Protocol for collections which can transformed to transients.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "NS_CACHE"
  {:ns "cljs.core",
   :name "NS_CACHE",
   :type "var",
   :full-name "cljs.core/NS_CACHE",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "DEMUNGE_MAP"
  {:ns "cljs.core",
   :name "DEMUNGE_MAP",
   :type "var",
   :full-name "cljs.core/DEMUNGE_MAP",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "doseq"
  {:description
   "Repeatedly executes `body` (presumably for side-effects) with bindings and\nfiltering as provided by `for`. Does not retain the head of the sequence.\n\nReturns nil.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "doseq",
   :signature ["[seq-exprs & body]"],
   :type "macro",
   :related
   ["cljs.core/doall"
    "cljs.core/dorun"
    "cljs.core/for"
    "cljs.core/dotimes"],
   :examples-strings [],
   :description-html
   "<p>Repeatedly executes <code>body</code> (presumably for side-effects) with bindings and filtering as provided by <code>for</code>. Does not retain the head of the sequence.</p><p>Returns nil.</p>",
   :full-name "cljs.core/doseq",
   :docstring
   "Repeatedly executes body (presumably for side-effects) with\nbindings and filtering as provided by \"for\".  Does not retain\nthe head of the sequence. Returns nil."},
  "sequential?"
  {:description
   "Returns true if `coll` implements the `ISequential` protocol, false otherwise.\n\nLists and vectors are sequential.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sequential?",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/seq?" "cljs.core/coll?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>coll</code> implements the <code>ISequential</code> protocol, false otherwise.</p><p>Lists and vectors are sequential.</p>",
   :full-name "cljs.core/sequential?",
   :docstring "Returns true if coll satisfies ISequential"},
  "superset?"
  {:description
   "Returns true if `a` is a superset of `b`, false otherwise.\n\nIn other words, returns true if `a` contains all the elements of `b`.",
   :examples-htmls [],
   :ns "clojure.set",
   :name "superset?",
   :signature ["[a b]"],
   :type "function",
   :related ["cljs.core/set" "cljs.core/set?" "clojure.set/subset?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>a</code> is a superset of <code>b</code>, false otherwise.</p><p>In other words, returns true if <code>a</code> contains all the elements of <code>b</code>.</p>",
   :full-name "clojure.set/superset?",
   :docstring "Is set1 a superset of set2?"},
  "get-validator"
  {:description "Returns the validator function for atom `a`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "get-validator",
   :signature ["[a]"],
   :type "function",
   :related ["cljs.core/atom" "cljs.core/set-validator!"],
   :examples-strings [],
   :description-html
   "<p>Returns the validator function for atom <code>a</code>.</p>",
   :full-name "cljs.core/get-validator",
   :docstring "Gets the validator-fn for a var/ref/agent/atom."},
  "merge-spec"
  {:ns "cljs.repl",
   :name "merge-spec",
   :signature ["[[lib & {:as aindex}] [_ & {:as bindex}]]"],
   :type "function",
   :full-name "cljs.repl/merge-spec",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr-with-opts"
  {:ns "cljs.core",
   :name "pr-with-opts",
   :signature ["[objs opts]"],
   :type "function",
   :full-name "cljs.core/pr-with-opts",
   :docstring
   "Prints a sequence of objects using string-print, observing all\nthe options given in opts",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-special-doc-map"
  {:ns "cljs.repl",
   :name "repl-special-doc-map",
   :type "var",
   :full-name "cljs.repl/repl-special-doc-map",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "replicate"
  {:ns "cljs.core",
   :name "replicate",
   :signature ["[n x]"],
   :type "function",
   :full-name "cljs.core/replicate",
   :docstring "Returns a lazy seq of n xs.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-current-env"
  {:ns "cljs.test",
   :name "get-current-env",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.test/get-current-env",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-hash-int"
  {:ns "cljs.core",
   :name "m3-hash-int",
   :signature ["[in]"],
   :type "function",
   :full-name "cljs.core/m3-hash-int",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IDeref"
  {:ns "cljs.core",
   :name "IDeref",
   :type "protocol",
   :full-name "cljs.core/IDeref",
   :docstring
   "Protocol for adding dereference functionality to a reference.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "long-array"
  {:ns "cljs.core",
   :name "long-array",
   :signature ["[size-or-seq]" "[size init-val-or-seq]"],
   :type "function",
   :full-name "cljs.core/long-array",
   :docstring
   "Creates an array of longs. Does not coerce array, provided for compatibility\nwith Clojure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Delay"
  {:ns "cljs.core",
   :name "Delay",
   :signature ["[f value]"],
   :type "type",
   :full-name "cljs.core/Delay",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "some-fn"
  {:description
   "Takes a set of predicate functions and returns a function `f` that returns the\nfirst logical true value returned by one of its composing predicates against any\nof its arguments, else it returns logical false.\n\nNote that `f` is short-circuiting in that it will stop execution on the first\nargument that triggers a logical true result against the original predicates.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "some-fn",
   :signature ["[p]" "[p1 p2]" "[p1 p2 p3]" "[p1 p2 p3 & ps]"],
   :type "function",
   :related ["cljs.core/every-pred" "cljs.core/some" "cljs.core/or"],
   :examples-strings [],
   :description-html
   "<p>Takes a set of predicate functions and returns a function <code>f</code> that returns the first logical true value returned by one of its composing predicates against any of its arguments, else it returns logical false.</p><p>Note that <code>f</code> is short-circuiting in that it will stop execution on the first argument that triggers a logical true result against the original predicates.</p>",
   :full-name "cljs.core/some-fn",
   :docstring
   "Takes a set of predicates and returns a function f that returns the first logical true value\nreturned by one of its composing predicates against any of its arguments, else it returns\nlogical false. Note that f is short-circuiting in that it will stop execution on the first\nargument that triggers a logical true result against the original predicates."},
  "update-in"
  {:description
   "\"Updates\" a value in a nested associative structure, where `ks` is a sequence of\nkeys and `f` is a function that will take the old value and any supplied\narguments and return the new value. Returns a new nested structure.\n\nIf any levels do not exist, hash-maps will be created.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "update-in",
   :signature
   ["[m [k & ks] f]"
    "[m [k & ks] f a]"
    "[m [k & ks] f a b]"
    "[m [k & ks] f a b c]"
    "[m [k & ks] f a b c & args]"],
   :type "function",
   :related ["cljs.core/assoc-in" "cljs.core/get-in"],
   :examples-strings [],
   :description-html
   "<p>\"Updates\" a value in a nested associative structure, where <code>ks</code> is a sequence of keys and <code>f</code> is a function that will take the old value and any supplied arguments and return the new value. Returns a new nested structure.</p><p>If any levels do not exist, hash-maps will be created.</p>",
   :full-name "cljs.core/update-in",
   :docstring
   "'Updates' a value in a nested associative structure, where ks is a\nsequence of keys and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nnested structure.  If any levels do not exist, hash-maps will be\ncreated."},
  "var"
  {:description
   "`#'foo` is sugar for [`(var foo)`][doc:special/var].\n\nAccesses the var attached to the given symbol.",
   :examples-htmls
   ["<p>Access the metadata of a var:</p><pre><code class=\"clj\">&#40;def x 123&#41;\n&#40;meta #'x&#41;\n;;=&gt; {:arglists &#40;&#41;, :test nil, :name x, :column 1, :line 1, :file &quot;&lt;cljs repl&gt;&quot;, :doc nil, :ns cljs.user}\n</code></pre>"],
   :ns "syntax",
   :name "var",
   :type "syntax",
   :related ["special/var"],
   :examples-strings
   [[["(def x 123)"
      "(meta #'x) ;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}"]]],
   :description-html
   "<p><code>#'foo</code> is sugar for [<code>&#40;var foo&#41;</code>][doc:special/var].</p><p>Accesses the var attached to the given symbol.</p>",
   :examples
   [{:id "673ef6",
     :content
     "Access the metadata of a var:\n\n```clj\n(def x 123)\n(meta #'x)\n;;=> {:arglists (), :test nil, :name x, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}\n```"}],
   :full-name "syntax/var"},
  "RedNode"
  {:ns "cljs.core",
   :name "RedNode",
   :signature ["[key val left right __hash]"],
   :type "type",
   :full-name "cljs.core/RedNode",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "hash-map"
  {:description
   "Returns a new hash map with supplied mappings.\n\n`keyvals` must be an even number of forms.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "hash-map",
   :signature ["[& keyvals]"],
   :type "function/macro",
   :related ["cljs.core/array-map" "cljs.core/sorted-map"],
   :examples-strings [],
   :description-html
   "<p>Returns a new hash map with supplied mappings.</p><p><code>keyvals</code> must be an even number of forms.</p>",
   :full-name "cljs.core/hash-map",
   :docstring
   "keyval => key val\nReturns a new hash map with supplied mappings."},
  "in-cljs-user"
  {:ns "cljs.analyzer.api",
   :name "in-cljs-user",
   :signature ["[env & body]"],
   :type "macro",
   :full-name "cljs.analyzer.api/in-cljs-user",
   :docstring
   "Binds cljs.analyzer/*cljs-ns* to 'cljs.user and uses the given compilation\nenvironment atom and runs body.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compose-fixtures"
  {:ns "cljs.test",
   :name "compose-fixtures",
   :signature ["[f1 f2]"],
   :type "function",
   :full-name "cljs.test/compose-fixtures",
   :docstring
   "Composes two fixture functions, creating a new fixture function\nthat combines their behavior.\n\nNOTE: Incompatible with map fixtures.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "try"
  {:ns "cljs.core",
   :name "try",
   :signature ["[& forms]"],
   :type "macro",
   :full-name "cljs.core/try",
   :docstring
   "(try expr* catch-clause* finally-clause?)\n\n Special Form\n\n catch-clause => (catch protoname name expr*)\n finally-clause => (finally expr*)\n\nCatches and handles JavaScript exceptions.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "/"
  {:description
   "If no denominators are supplied, returns 1/numerator, else returns numerator\ndivided by all of the denominators.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;/ 6 3&#41;\n;;=&gt; 2\n\n&#40;/ 6 3 2&#41;\n;;=&gt; 1\n\n&#40;/ 10&#41;\n;;=&gt; 0.1\n\n&#40;/ 1 3&#41;\n;;=&gt; 0.3333333333333333\n</code></pre>"],
   :ns "cljs.core",
   :name "/",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/*" "cljs.core/quot"],
   :examples-strings
   [[["(/ 6 3) ;;=> 2"
      "(/ 6 3 2) ;;=> 1"
      "(/ 10) ;;=> 0.1"
      "(/ 1 3) ;;=> 0.3333333333333333"]]],
   :description-html
   "<p>If no denominators are supplied, returns 1/numerator, else returns numerator divided by all of the denominators.</p>",
   :examples
   [{:id "824bb7",
     :content
     "```clj\n(/ 6 3)\n;;=> 2\n\n(/ 6 3 2)\n;;=> 1\n\n(/ 10)\n;;=> 0.1\n\n(/ 1 3)\n;;=> 0.3333333333333333\n```"}],
   :full-name "cljs.core//",
   :docstring
   "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."},
  "str"
  {:description
   "`(str)` and `(str nil)` return the empty string.\n\n`(str x)` returns `x.toString()`.\n\nWith more than one argument, returns the concatenation of the `str` values of\nthe arguments.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "str",
   :signature ["[]" "[x]" "[x & ys]"],
   :type "function/macro",
   :examples-strings [],
   :description-html
   "<p><code>&#40;str&#41;</code> and <code>&#40;str nil&#41;</code> return the empty string.</p><p><code>&#40;str x&#41;</code> returns <code>x.toString&#40;&#41;</code>.</p><p>With more than one argument, returns the concatenation of the <code>str</code> values of the arguments.</p>",
   :full-name "cljs.core/str",
   :docstring
   "With no args, returns the empty string. With one arg x, returns\nx.toString().  (str nil) returns the empty string. With more than\none arg, returns the concatenation of the str values of the args."},
  "import-macros"
  {:ns "cljs.core",
   :name "import-macros",
   :signature ["[ns [& vars]]"],
   :type "macro",
   :full-name "cljs.core/import-macros",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "CollFold"
  {:ns "clojure.core.reducers",
   :name "CollFold",
   :type "protocol",
   :full-name "clojure.core.reducers/CollFold",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pop"
  {:description
   "For a list, returns a new list without the first item.\n\nFor a vector, returns a new vector without the last item.",
   :examples-htmls
   ["<p>With vectors:</p><pre><code class=\"clj\">&#40;pop &#91;1 2 3&#93;&#41;\n;;=&gt; &#91;1 2&#93;\n\n&#40;pop &#91;1 2&#93;&#41;\n;;=&gt; &#91;1&#93;\n\n&#40;pop &#91;1&#93;&#41;\n;;=&gt; &#91;&#93;\n\n&#40;pop &#91;&#93;&#41;\n;; Error: Can't pop empty vector\n</code></pre>"
    "<p>With lists:</p><pre><code class=\"clj\">&#40;pop '&#40;1 2 3&#41;&#41;\n;;=&gt; &#40;2 3&#41;\n\n&#40;pop '&#40;1 2&#41;&#41;\n;;=&gt; &#40;2&#41;\n\n&#40;pop '&#40;1&#41;&#41;\n;;=&gt; &#40;&#41;\n\n&#40;pop '&#40;&#41;&#41;\n;; Error: Can't pop empty list\n</code></pre>"],
   :ns "cljs.core",
   :name "pop",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/peek" "cljs.core/rest" "cljs.core/conj"],
   :examples-strings
   [[["(pop [1 2 3]) ;;=> [1 2]"
      "(pop [1 2]) ;;=> [1]"
      "(pop [1]) ;;=> []"
      "(pop []) ;; Error: Can't pop empty vector"]]
    [["(pop '(1 2 3)) ;;=> (2 3)"
      "(pop '(1 2)) ;;=> (2)"
      "(pop '(1)) ;;=> ()"
      "(pop '()) ;; Error: Can't pop empty list"]]],
   :description-html
   "<p>For a list, returns a new list without the first item.</p><p>For a vector, returns a new vector without the last item.</p>",
   :examples
   [{:id "6bd9f7",
     :content
     "With vectors:\n\n```clj\n(pop [1 2 3])\n;;=> [1 2]\n\n(pop [1 2])\n;;=> [1]\n\n(pop [1])\n;;=> []\n\n(pop [])\n;; Error: Can't pop empty vector\n```"}
    {:id "81221f",
     :content
     "With lists:\n\n```clj\n(pop '(1 2 3))\n;;=> (2 3)\n\n(pop '(1 2))\n;;=> (2)\n\n(pop '(1))\n;;=> ()\n\n(pop '())\n;; Error: Can't pop empty list\n```"}],
   :full-name "cljs.core/pop",
   :docstring
   "For a list or queue, returns a new list/queue without the first\nitem, for a vector, returns a new vector without the last item.\nNote - not the same as next/butlast."},
  "long"
  {:ns "cljs.core",
   :name "long",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/long",
   :docstring
   "Coerce to long by stripping decimal places. Identical to `int'.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reverse"
  {:description
   "Returns a sequence of the items in `coll` in reverse order. Not lazy.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "reverse",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/rseq"],
   :examples-strings [],
   :description-html
   "<p>Returns a sequence of the items in <code>coll</code> in reverse order. Not lazy.</p>",
   :full-name "cljs.core/reverse",
   :docstring
   "Returns a seq of the items in coll in reverse order. Not lazy."},
  "vswap!"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "vswap!",
   :signature ["[vol f & args]"],
   :type "macro",
   :related ["cljs.core/vreset!" "cljs.core/volatile!"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/vswap!",
   :docstring
   "Non-atomically swaps the value of the volatile as if:\n(apply f current-value-of-vol args). Returns the value that\nwas swapped in."},
  "dot"
  {:description
   "Dots can be used inside symbols. Its meaning depends on its position in the symbol:\n\n- `.` (by itself), `.-foo`, `.foo` all refer to the interop [`. (special form)`][doc:special/.].\n- `foo.` is constructor sugar, meaning [`(new foo)`][doc:special/new].\n- `(ns foo.bar)` and `foo.bar/baz` means that `foo.bar` is a nested namespace.\n- `foo/bar.baz` or `bar.baz` means `bar.baz` is nested JS property access (__not allowed in clojure__).",
   :examples-htmls
   ["<p>For interop:</p><pre><code class=\"clj\">&#40;def obj #js {:age 28, :greet #&#40;str &quot;Hi &quot; %&#41;}&#41;\n\n&#40;. obj greet &quot;Bob&quot;&#41;\n;;=&gt; &quot;Hi Bob&quot;\n\n&#40;.greet obj &quot;Bob&quot;&#41;\n;;=&gt; &quot;Hi Bob&quot;\n\n&#40;. obj -age&#41;\n;;=&gt; 28\n\n&#40;.-age obj&#41;\n;;=&gt; 28\n</code></pre><p>For constructor:</p><pre><code class=\"clj\">&#40;deftype Foo &#91;x&#93;\n   Object\n   &#40;toString &#91;&#95;&#93; &#40;str &quot;Foo:&quot; x&#41;&#41;&#41;\n\n&#40;Foo. 1&#41;\n;;=&gt; #&lt;Foo: 1&gt;\n\n&#40;new Foo 1&#41;\n;;=&gt; #&lt;Foo: 1&gt;\n</code></pre><p>For nested namespaces:</p><pre><code class=\"clj\">&#40;ns example.nested.core&#41;\n&#40;def foo 1&#41;\nexample.nested.core/foo\n;;=&gt; 1\n</code></pre><p>For nested JS properties.  The following pairs are equivalent:</p><pre><code class=\"clj\">&#40;js/console.log &quot;HELLO&quot;&#41;\n;; &quot;HELLO&quot;\n\n&#40;.log js/console &quot;HELLO&quot;&#41;\n;; &quot;HELLO&quot;\n</code></pre><pre><code class=\"clj\">cljs.core/PersistentQueue.EMPTY\n;;=&gt; #queue &#91;&#93;\n\n&#40;.-EMPTY cljs.core/PersistentQueue&#41;\n;;=&gt; #queue &#91;&#93;\n</code></pre>"],
   :ns "syntax",
   :name "dot",
   :type "special character",
   :related ["syntax/symbol" "syntax/namespace"],
   :examples-strings
   [[["(def obj #js {:age 28, :greet #(str \"Hi \" %)})"
      "(. obj greet \"Bob\") ;;=> \"Hi Bob\""
      "(.greet obj \"Bob\") ;;=> \"Hi Bob\""
      "(. obj -age) ;;=> 28"
      "(.-age obj) ;;=> 28"]
     ["(deftype Foo [x]"
      "   Object"
      "   (toString [_] (str \"Foo:\" x)))"
      "(Foo. 1) ;;=> #<Foo: 1>"
      "(new Foo 1) ;;=> #<Foo: 1>"]
     ["(ns example.nested.core)"
      "(def foo 1)"
      "example.nested.core/foo ;;=> 1"]
     ["(js/console.log \"HELLO\") ;; \"HELLO\""
      "(.log js/console \"HELLO\") ;; \"HELLO\""]
     ["cljs.core/PersistentQueue.EMPTY ;;=> #queue []"
      "(.-EMPTY cljs.core/PersistentQueue) ;;=> #queue []"]]],
   :description-html
   "<p>Dots can be used inside symbols. Its meaning depends on its position in the symbol:</p><ul><li><code>.</code> (by itself), <code>.-foo</code>, <code>.foo</code> all refer to the interop [<code>. &#40;special form&#41;</code>][doc:special/.].</li><li><code>foo.</code> is constructor sugar, meaning [<code>&#40;new foo&#41;</code>][doc:special/new].</li><li><code>&#40;ns foo.bar&#41;</code> and <code>foo.bar/baz</code> means that <code>foo.bar</code> is a nested namespace.</li><li><code>foo/bar.baz</code> or <code>bar.baz</code> means <code>bar.baz</code> is nested JS property access (<b>not allowed in clojure</b>).</li></ul>",
   :examples
   [{:id "61a0a1",
     :content
     "For interop:\n\n```clj\n(def obj #js {:age 28, :greet #(str \"Hi \" %)})\n\n(. obj greet \"Bob\")\n;;=> \"Hi Bob\"\n\n(.greet obj \"Bob\")\n;;=> \"Hi Bob\"\n\n(. obj -age)\n;;=> 28\n\n(.-age obj)\n;;=> 28\n```\n\nFor constructor:\n\n```clj\n(deftype Foo [x]\n   Object\n   (toString [_] (str \"Foo:\" x)))\n\n(Foo. 1)\n;;=> #<Foo: 1>\n\n(new Foo 1)\n;;=> #<Foo: 1>\n```\n\nFor nested namespaces:\n\n```clj\n(ns example.nested.core)\n(def foo 1)\nexample.nested.core/foo\n;;=> 1\n```\n\nFor nested JS properties.  The following pairs are equivalent:\n\n```clj\n(js/console.log \"HELLO\")\n;; \"HELLO\"\n\n(.log js/console \"HELLO\")\n;; \"HELLO\"\n```\n\n```clj\ncljs.core/PersistentQueue.EMPTY\n;;=> #queue []\n\n(.-EMPTY cljs.core/PersistentQueue)\n;;=> #queue []\n```"}],
   :full-name "syntax/dot"},
  "rand"
  {:description
   "Returns a random floating point number between 0 inclusive and `n` exclusive.\n\n`n` defaults to 1.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "rand",
   :signature ["[]" "[n]"],
   :type "function",
   :related ["cljs.core/rand-int" "cljs.core/rand-nth"],
   :examples-strings [],
   :description-html
   "<p>Returns a random floating point number between 0 inclusive and <code>n</code> exclusive.</p><p><code>n</code> defaults to 1.</p>",
   :full-name "cljs.core/rand",
   :docstring
   "Returns a random floating point number between 0 (inclusive) and\nn (default 1) (exclusive)."},
  "conj!"
  {:ns "cljs.core",
   :name "conj!",
   :signature ["[]" "[coll]" "[tcoll val]" "[tcoll val & vals]"],
   :type "function",
   :full-name "cljs.core/conj!",
   :docstring
   "Adds x to the transient collection, and return coll. The 'addition'\nmay happen at different 'places' depending on the concrete type.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "trampoline"
  {:ns "cljs.core",
   :name "trampoline",
   :signature ["[f]" "[f & args]"],
   :type "function",
   :full-name "cljs.core/trampoline",
   :docstring
   "trampoline can be used to convert algorithms requiring mutual\nrecursion without stack consumption. Calls f with supplied args, if\nany. If f returns a fn, calls that fn with no arguments, and\ncontinues to repeat, until the return value is not a fn, then\nreturns that non-fn value. Note that if you want to return a fn as a\nfinal value, you must wrap it in some data structure and unpack it\nafter trampoline returns.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "hash"
  {:ns "cljs.core",
   :name "hash",
   :signature ["[o]"],
   :type "function",
   :full-name "cljs.core/hash",
   :docstring
   "Returns the hash code of its argument. Note this is the hash code\nconsistent with =.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "simple-benchmark"
  {:ns "cljs.core",
   :name "simple-benchmark",
   :signature
   ["[bindings expr iterations & {:keys [print-fn], :or {print-fn (quote println)}}]"],
   :type "macro",
   :full-name "cljs.core/simple-benchmark",
   :docstring
   "Runs expr iterations times in the context of a let expression with\nthe given bindings, then prints out the bindings and the expr\nfollowed by number of iterations and total time. The optional\nargument print-fn, defaulting to println, sets function used to\nprint the result. expr's string representation will be produced\nusing pr-str in any case.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "has-listener"
  {:ns "clojure.browser.event",
   :name "has-listener",
   :signature ["[obj opt_type opt_capture]"],
   :type "function",
   :full-name "clojure.browser.event/has-listener",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  ".."
  {:description
   "For interop, the `..` macro allows method/property chaining on the given JavaScript object `o`.\n\nIt essentially combines the thread-first `->` macro with the `.` operator.",
   :examples-htmls
   ["<pre><code class=\"js\">// JavaScript\n&quot;a b c d&quot;.toUpperCase&#40;&#41;.replace&#40;&quot;A&quot;, &quot;X&quot;&#41;\n//=&gt; &quot;X B C D&quot;\n</code></pre><pre><code class=\"clj\">;; ClojureScript\n&#40;.. &quot;a b c d&quot;\n    toUpperCase\n    &#40;replace &quot;A&quot; &quot;X&quot;&#41;&#41;\n;;=&gt; &quot;X B C D&quot;\n</code></pre><p>This is expanded to:</p><pre><code class=\"clj\">&#40;. &#40;. &quot;a b c d&quot; toUpperCase&#41; &#40;replace &quot;A&quot; &quot;X&quot;&#41;&#41;\n</code></pre><p>which is equivalent to:</p><pre><code class=\"clj\">&#40;.replace &#40;.toUpperCase &quot;a b c d&quot;&#41; &quot;A&quot; &quot;X&quot;&#41;\n;;=&gt; &quot;X B C D&quot;\n</code></pre><p>Compare to the equivalent form using the thread-first <code>-&gt;</code> macro:</p><pre><code class=\"clj\">&#40;-&gt; &quot;a b c d&quot;\n    .toUpperCase\n    &#40;.replace &quot;A&quot; &quot;X&quot;&#41;&#41;\n;;=&gt; &quot;X B C D&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "..",
   :signature ["[o form]" "[o form & more]"],
   :type "macro",
   :related ["special/." "cljs.core/->" "cljs.core/doto"],
   :examples-strings
   [[["// JavaScript"
      "\"a b c d\".toUpperCase().replace(\"A\", \"X\")"
      "//=> \"X B C D\""]
     [" ;; ClojureScript"
      "(.. \"a b c d\""
      "    toUpperCase"
      "    (replace \"A\" \"X\")) ;;=> \"X B C D\""]
     ["(. (. \"a b c d\" toUpperCase) (replace \"A\" \"X\"))"]
     ["(.replace (.toUpperCase \"a b c d\") \"A\" \"X\") ;;=> \"X B C D\""]
     ["(-> \"a b c d\""
      "    .toUpperCase"
      "    (.replace \"A\" \"X\")) ;;=> \"X B C D\""]]],
   :description-html
   "<p>For interop, the <code>..</code> macro allows method/property chaining on the given JavaScript object <code>o</code>.</p><p>It essentially combines the thread-first <code>-&gt;</code> macro with the <code>.</code> operator.</p>",
   :examples
   [{:id "500658",
     :content
     "```js\n// JavaScript\n\"a b c d\".toUpperCase().replace(\"A\", \"X\")\n//=> \"X B C D\"\n```\n\n```clj\n;; ClojureScript\n(.. \"a b c d\"\n    toUpperCase\n    (replace \"A\" \"X\"))\n;;=> \"X B C D\"\n```\n\nThis is expanded to:\n\n```clj\n(. (. \"a b c d\" toUpperCase) (replace \"A\" \"X\"))\n```\n\n\nwhich is equivalent to:\n\n```clj\n(.replace (.toUpperCase \"a b c d\") \"A\" \"X\")\n;;=> \"X B C D\"\n```\n\nCompare to the equivalent form using the thread-first `->` macro:\n\n```clj\n(-> \"a b c d\"\n    .toUpperCase\n    (.replace \"A\" \"X\"))\n;;=> \"X B C D\"\n```"}],
   :full-name "cljs.core/..",
   :docstring
   "form => fieldName-symbol or (instanceMethodName-symbol args*)\n\nExpands into a member access (.) of the first member on the first\nargument, followed by the next member on the result, etc. For\ninstance:\n\n(.. System (getProperties) (get \"os.name\"))\n\nexpands to:\n\n(. (. System (getProperties)) (get \"os.name\"))\n\nbut is easier to write, read, and understand."},
  "chars"
  {:ns "cljs.core",
   :name "chars",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/chars",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-dec-int"
  {:ns "cljs.core",
   :name "unchecked-dec-int",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-dec-int",
   :docstring "Returns a number one less than x, an int.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-seed"
  {:ns "cljs.core",
   :name "m3-seed",
   :type "var",
   :full-name "cljs.core/m3-seed",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-str"
  {:description
   "Convert `s` to string using JavaScript's coercion behavior.\n\nEquivalent to `''+s` in JavaScript.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;js-str 23&#41;\n;;=&gt; &quot;23&quot;\n\n&#40;js-str #js {:foo 1}&#41;\n;;=&gt; &quot;&#91;Object object&#93;&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "js-str",
   :signature ["[s]"],
   :type "macro",
   :related ["cljs.core/str"],
   :examples-strings
   [[["(js-str 23) ;;=> \"23\""
      "(js-str #js {:foo 1}) ;;=> \"[Object object]\""]]],
   :description-html
   "<p>Convert <code>s</code> to string using JavaScript's coercion behavior.</p><p>Equivalent to <code>''+s</code> in JavaScript.</p>",
   :examples
   [{:id "e92009",
     :content
     "```clj\n(js-str 23)\n;;=> \"23\"\n\n(js-str #js {:foo 1})\n;;=> \"[Object object]\"\n```"}],
   :full-name "cljs.core/js-str"},
  "RangedIterator"
  {:ns "cljs.core",
   :name "RangedIterator",
   :signature ["[i base arr v start end]"],
   :type "type",
   :full-name "cljs.core/RangedIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IStack"
  {:ns "cljs.core",
   :name "IStack",
   :type "protocol",
   :full-name "cljs.core/IStack",
   :docstring
   "Protocol for collections to provide access to their items as stacks. The top\n  of the stack should be accessed in the most efficient way for the different\n  data structures.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "analyze-source"
  {:ns "cljs.repl",
   :name "analyze-source",
   :signature ["[src-dir]" "[src-dir opts]"],
   :type "function",
   :full-name "cljs.repl/analyze-source",
   :docstring
   "Given a source directory, analyzes all .cljs files. Used to populate\n(:cljs.analyzer/namespaces compiler-env) so as to support code reflection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "TransientArrayMap"
  {:ns "cljs.core",
   :name "TransientArrayMap",
   :signature ["[editable? len arr]"],
   :type "type",
   :full-name "cljs.core/TransientArrayMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-namespace"
  {:description
   "A special namespace used for accessing any symbol defined\nin JavaScript's global scope.",
   :examples-htmls
   ["<p>The following examples are run from a browser REPL.</p><p>Get the JavaScript global <code>document</code> object:</p><pre><code class=\"clj\">js/document\n;;=&gt; #&lt;&#91;object HTMLDocument&#93;&gt;\n</code></pre><p>Display an alert:</p><pre><code class=\"clj\">&#40;js/alert &quot;Hello World&quot;&#41;\n;; displays alert popup\n</code></pre><p>Log to console:</p><pre><code class=\"clj\">&#40;js/console.log &quot;Hello World&quot;&#41;\n;; displays in developer console\n</code></pre><p>Create a JavaScript date object:</p><pre><code class=\"clj\">&#40;js/Date.&#41;\n;;=&gt; #inst &quot;2015-07-14T00:25:33.881-00:00&quot;\n</code></pre>"],
   :ns "syntax",
   :name "js-namespace",
   :type "special namespace",
   :related
   ["syntax/Math-namespace"
    "special/."
    "cljs.core/aget"
    "cljs.core/aset"],
   :examples-strings
   [[["js/document ;;=> #<[object HTMLDocument]>"]
     ["(js/alert \"Hello World\") ;; displays alert popup"]
     ["(js/console.log \"Hello World\") ;; displays in developer console"]
     ["(js/Date.) ;;=> #inst \"2015-07-14T00:25:33.881-00:00\""]]],
   :description-html
   "<p>A special namespace used for accessing any symbol defined in JavaScript's global scope.</p>",
   :examples
   [{:id "06f234",
     :content
     "The following examples are run from a browser REPL.\n\nGet the JavaScript global `document` object:\n\n```clj\njs/document\n;;=> #<[object HTMLDocument]>\n```\n\nDisplay an alert:\n\n```clj\n(js/alert \"Hello World\")\n;; displays alert popup\n```\n\nLog to console:\n\n```clj\n(js/console.log \"Hello World\")\n;; displays in developer console\n```\n\nCreate a JavaScript date object:\n\n```clj\n(js/Date.)\n;;=> #inst \"2015-07-14T00:25:33.881-00:00\"\n```"}],
   :full-name "syntax/js-namespace"},
  "every?"
  {:description
   "Returns true if `(pred x)` is logical true for every `x` in `coll`, else false.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "every?",
   :signature ["[pred coll]"],
   :type "function",
   :related ["cljs.core/some" "cljs.core/not-any?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>&#40;pred x&#41;</code> is logical true for every <code>x</code> in <code>coll</code>, else false.</p>",
   :full-name "cljs.core/every?",
   :docstring
   "Returns true if (pred x) is logical true for every x in coll, else\nfalse."},
  "type->str"
  {:ns "cljs.core",
   :name "type->str",
   :signature ["[ty]"],
   :type "function",
   :full-name "cljs.core/type->str",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "is"
  {:ns "cljs.test",
   :name "is",
   :signature ["[form]" "[form msg]"],
   :type "macro",
   :full-name "cljs.test/is",
   :docstring
   "Generic assertion macro.  'form' is any predicate test.\n'msg' is an optional message to attach to the assertion.\n\nExample: (is (= 4 (+ 2 2)) \"Two plus two should be 4\")\n\nSpecial forms:\n\n(is (thrown? c body)) checks that an instance of c is thrown from\nbody, fails if not; then returns the thing thrown.\n\n(is (thrown-with-msg? c re body)) checks that an instance of c is\nthrown AND that the message on the exception matches (with\nre-find) the regular expression re.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-map"
  {:ns "cljs.core",
   :name "print-map",
   :signature ["[m print-one writer opts]"],
   :type "function",
   :full-name "cljs.core/print-map",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-string"
  {:ns "cljs.reader",
   :name "read-string",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.reader/read-string",
   :docstring "Reads one object from the string s",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "close-socket"
  {:ns "cljs.repl.node",
   :name "close-socket",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.repl.node/close-socket",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns-publics"
  {:ns "cljs.analyzer.api",
   :name "ns-publics",
   :signature ["[ns]" "[state ns]"],
   :type "function",
   :full-name "cljs.analyzer.api/ns-publics",
   :docstring
   "Given a namespace return all the public var analysis maps. Analagous to\nclojure.core/ns-publics but returns var analysis maps not vars.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "with-redefs"
  {:ns "cljs.core",
   :name "with-redefs",
   :signature ["[bindings & body]"],
   :type "macro",
   :full-name "cljs.core/with-redefs",
   :docstring
   "binding => var-symbol temp-value-expr\n\nTemporarily redefines vars while executing the body.  The\ntemp-value-exprs will be evaluated and each resulting value will\nreplace in parallel the root value of its var.  After the body is\nexecuted, the root values of all the vars will be set back to their\nold values. Useful for mocking out functions during testing.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "EmptyList"
  {:ns "cljs.core",
   :name "EmptyList",
   :signature ["[meta]"],
   :type "type",
   :full-name "cljs.core/EmptyList",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-eval"
  {:ns "cljs.js",
   :name "js-eval",
   :signature ["[{:keys [source], :as resource}]"],
   :type "function",
   :full-name "cljs.js/js-eval",
   :docstring "A default JavaScript evaluation function.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "-"
  {:description
   "If no `y`s are supplied, returns the negation of `x`, else subtracts the `y`s\nfrom `x` and returns the result.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;- 1&#41;\n;;=&gt; -1\n\n&#40;- 6 3&#41;\n;;=&gt; 3\n\n&#40;- 10 3 2&#41;\n;;=&gt; 5\n</code></pre>"],
   :ns "cljs.core",
   :name "-",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/+"],
   :examples-strings
   [[["(- 1) ;;=> -1" "(- 6 3) ;;=> 3" "(- 10 3 2) ;;=> 5"]]],
   :description-html
   "<p>If no <code>y</code>s are supplied, returns the negation of <code>x</code>, else subtracts the <code>y</code>s from <code>x</code> and returns the result.</p>",
   :examples
   [{:id "0a974e",
     :content
     "```clj\n(- 1)\n;;=> -1\n\n(- 6 3)\n;;=> 3\n\n(- 10 3 2)\n;;=> 5\n```"}],
   :full-name "cljs.core/-",
   :docstring
   "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."},
  "ArrayNode"
  {:ns "cljs.core",
   :name "ArrayNode",
   :signature ["[edit cnt arr]"],
   :type "type",
   :full-name "cljs.core/ArrayNode",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "descendants"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "descendants",
   :signature ["[tag]" "[h tag]"],
   :type "function",
   :related
   ["cljs.core/ancestors"
    "cljs.core/isa?"
    "cljs.core/make-hierarchy"
    "cljs.core/derive"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/descendants",
   :docstring
   "Returns the immediate and indirect children of tag, through a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy. Note: does not work on JavaScript type inheritance\nrelationships."},
  "key"
  {:description "Returns the key of the map entry.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "key",
   :signature ["[map-entry]"],
   :type "function",
   :related ["cljs.core/keys"],
   :examples-strings [],
   :description-html "<p>Returns the key of the map entry.</p>",
   :full-name "cljs.core/key",
   :docstring "Returns the key of the map entry."},
  "hash-unordered-coll"
  {:ns "cljs.core",
   :name "hash-unordered-coll",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/hash-unordered-coll",
   :docstring
   "Returns the hash code, consistent with =, for an external unordered\ncollection implementing Iterable. For maps, the iterator should\nreturn map entries whose hash is computed as\n  (hash-ordered-coll [k v]).\nSee http://clojure.org/data_structures#hash for full algorithms.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repeat"
  {:description
   "Returns a lazy sequence of `x`s.\n\nThe length of the sequence is infinite, or `n` if provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "repeat",
   :signature ["[x]" "[n x]"],
   :type "function",
   :related
   ["cljs.core/repeatedly"
    "cljs.core/cycle"
    "cljs.core/constantly"
    "cljs.core/dotimes"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of <code>x</code>s.</p><p>The length of the sequence is infinite, or <code>n</code> if provided.</p>",
   :full-name "cljs.core/repeat",
   :docstring
   "Returns a lazy (infinite!, or length n if supplied) sequence of xs."},
  "parse-timestamp"
  {:ns "cljs.reader",
   :name "parse-timestamp",
   :signature ["[ts]"],
   :type "function",
   :full-name "cljs.reader/parse-timestamp",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-fn*"
  {:ns "cljs.core",
   :name "*print-fn*",
   :type "dynamic var",
   :full-name "cljs.core/*print-fn*",
   :docstring
   "Each runtime environment provides a different way to print output.\nWhatever function *print-fn* is bound to will be passed any\nStrings which should be printed.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "LazyTransformer"
  {:ns "cljs.core",
   :name "LazyTransformer",
   :signature ["[stepper first rest meta]"],
   :type "type",
   :full-name "cljs.core/LazyTransformer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-print-err-fn!"
  {:ns "cljs.core",
   :name "set-print-err-fn!",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.core/set-print-err-fn!",
   :docstring "Set *print-err-fn* to f.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "process"
  {:ns "cljs.nodejs",
   :name "process",
   :type "var",
   :full-name "cljs.nodejs/process",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "canonicalize-specs"
  {:ns "cljs.repl",
   :name "canonicalize-specs",
   :signature ["[specs]"],
   :type "function",
   :full-name "cljs.repl/canonicalize-specs",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dissoc!"
  {:ns "cljs.core",
   :name "dissoc!",
   :signature ["[tcoll key]" "[tcoll key & ks]"],
   :type "function",
   :full-name "cljs.core/dissoc!",
   :docstring
   "Returns a transient map that doesn't contain a mapping for key(s).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "push-back-reader"
  {:ns "cljs.reader",
   :name "push-back-reader",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.reader/push-back-reader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mapped-line-and-column"
  {:ns "cljs.repl",
   :name "mapped-line-and-column",
   :signature ["[source-map line column]"],
   :type "function",
   :full-name "cljs.repl/mapped-line-and-column",
   :docstring
   "Given a cljs.source-map source map data structure map a generated line\nand column back to the original line and column.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Iterator"
  {:ns "cljs.core",
   :name "Iterator",
   :signature ["[s]"],
   :type "type",
   :full-name "cljs.core/Iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "all-listeners"
  {:ns "clojure.browser.event",
   :name "all-listeners",
   :signature ["[obj type capture]"],
   :type "function",
   :full-name "clojure.browser.event/all-listeners",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "children"
  {:ns "clojure.zip",
   :name "children",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/children",
   :docstring
   "Returns a seq of the children of node at loc, which must be a branch",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "methods"
  {:ns "cljs.core",
   :name "methods",
   :signature ["[multifn]"],
   :type "function",
   :full-name "cljs.core/methods",
   :docstring
   "Given a multimethod, returns a map of dispatch values -> dispatch fns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "project"
  {:ns "clojure.set",
   :name "project",
   :signature ["[xrel ks]"],
   :type "function",
   :full-name "clojure.set/project",
   :docstring
   "Returns a rel of the elements of xrel with only the keys in ks",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dedupe"
  {:ns "cljs.core",
   :name "dedupe",
   :signature ["[]" "[coll]"],
   :type "function",
   :full-name "cljs.core/dedupe",
   :docstring
   "Returns a lazy sequence removing consecutive duplicates in coll.\nReturns a transducer when no collection is provided.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*assert*"
  {:ns "cljs.core",
   :name "*assert*",
   :type "dynamic var",
   :full-name "cljs.core/*assert*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "not-implemented"
  {:ns "cljs.reader",
   :name "not-implemented",
   :signature ["[rdr ch]"],
   :type "function",
   :full-name "cljs.reader/not-implemented",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "vary-meta"
  {:description
   "Returns an object of the same type and value as `obj`, with\n`(apply f (meta obj) args)` as its metadata.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a &#94;:foo &#91;1 2 3&#93;&#41;\n&#40;def b &#40;vary-meta a assoc :bar true&#41;&#41;\n\n&#40;= a b&#41;\n;;=&gt; true\n\n&#40;meta a&#41;\n;;=&gt; {:foo true}\n\n&#40;meta b&#41;\n;;=&gt; {:foo true, :bar true}\n</code></pre>"],
   :ns "cljs.core",
   :name "vary-meta",
   :signature ["[obj f & args]"],
   :type "function",
   :related ["cljs.core/alter-meta!" "cljs.core/with-meta"],
   :examples-strings
   [[["(def a ^:foo [1 2 3])"
      "(def b (vary-meta a assoc :bar true))"
      "(= a b) ;;=> true"
      "(meta a) ;;=> {:foo true}"
      "(meta b) ;;=> {:foo true, :bar true}"]]],
   :description-html
   "<p>Returns an object of the same type and value as <code>obj</code>, with <code>&#40;apply f &#40;meta obj&#41; args&#41;</code> as its metadata.</p>",
   :examples
   [{:id "8cca62",
     :content
     "```clj\n(def a ^:foo [1 2 3])\n(def b (vary-meta a assoc :bar true))\n\n(= a b)\n;;=> true\n\n(meta a)\n;;=> {:foo true}\n\n(meta b)\n;;=> {:foo true, :bar true}\n```"}],
   :full-name "cljs.core/vary-meta",
   :docstring
   "Returns an object of the same type and value as obj, with\n(apply f (meta obj) args) as its metadata."},
  "true?"
  {:description
   "Returns true if `x` is the value true, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "true?",
   :signature ["[x]"],
   :type "function/macro",
   :related ["cljs.core/false?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is the value true, false otherwise.</p>",
   :full-name "cljs.core/true?",
   :docstring "Returns true if x is the value true, false otherwise."},
  "second"
  {:description
   "Returns the second item in `coll`.\n\nSame as `(first (next coll))`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "second",
   :signature ["[coll]"],
   :type "function",
   :related
   ["cljs.core/first"
    "cljs.core/nth"
    "cljs.core/fnext"
    "cljs.core/next"],
   :examples-strings [],
   :description-html
   "<p>Returns the second item in <code>coll</code>.</p><p>Same as <code>&#40;first &#40;next coll&#41;&#41;</code></p>",
   :full-name "cljs.core/second",
   :docstring "Same as (first (next x))"},
  "m3-hash-unencoded-chars"
  {:ns "cljs.core",
   :name "m3-hash-unencoded-chars",
   :signature ["[in]"],
   :type "function",
   :full-name "cljs.core/m3-hash-unencoded-chars",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ISwap"
  {:ns "cljs.core",
   :name "ISwap",
   :type "protocol",
   :full-name "cljs.core/ISwap",
   :docstring "Protocol for adding swapping functionality.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unlisten"
  {:ns "clojure.browser.event",
   :name "unlisten",
   :signature ["[src type fn]" "[src type fn capture?]"],
   :type "function",
   :full-name "clojure.browser.event/unlisten",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-vector"
  {:ns "cljs.reader",
   :name "read-vector",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-vector",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "iterate"
  {:description
   "Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.\n\n`f` must be free of side-effects.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "iterate",
   :signature ["[f x]"],
   :type "function",
   :related
   ["cljs.core/cycle" "cljs.core/repeatedly" "cljs.core/repeat"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of <code>x</code>, <code>&#40;f x&#41;</code>, <code>&#40;f &#40;f x&#41;&#41;</code> etc.</p><p><code>f</code> must be free of side-effects.</p>",
   :full-name "cljs.core/iterate",
   :docstring
   "Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects"},
  "find-doc"
  {:description
   "Prints documentation for any var whose documentation or name\ncontains a match for `re-string-or-pattern`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;find-doc &quot;some&quot;&#41;\n;; Prints: &#40;docs truncated&#41;\n;; - IPrintWriter &#40;docstring match&#41;\n;; - contains? &#40;docstring match&#41;\n;; - gensym &#40;docstring match&#41;\n;; - cljs.core/if-some\n;; - some\n;; - cljs.core/some-&gt;\n;; - cljs.core/some-&gt;&gt;\n;; - some-fn\n;; - some?\n;; - trampoline &#40;docstring match&#41;\n;; - cljs.core/when-some\n;; - cljs.core/while &#40;docstring match&#41;\n;;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.repl",
   :name "find-doc",
   :signature ["[re-string-or-pattern]"],
   :type "macro",
   :related ["cljs.repl/doc"],
   :examples-strings
   [[["(find-doc \"some\") ;; Prints: (docs truncated) ;; - IPrintWriter (docstring match) ;; - contains? (docstring match) ;; - gensym (docstring match) ;; - cljs.core/if-some ;; - some ;; - cljs.core/some-> ;; - cljs.core/some->> ;; - some-fn ;; - some? ;; - trampoline (docstring match) ;; - cljs.core/when-some ;; - cljs.core/while (docstring match) ;; ;;=> nil"]]],
   :description-html
   "<p>Prints documentation for any var whose documentation or name contains a match for <code>re-string-or-pattern</code>.</p>",
   :examples
   [{:id "50ec43",
     :content
     "```clj\n(find-doc \"some\")\n;; Prints: (docs truncated)\n;; - IPrintWriter (docstring match)\n;; - contains? (docstring match)\n;; - gensym (docstring match)\n;; - cljs.core/if-some\n;; - some\n;; - cljs.core/some->\n;; - cljs.core/some->>\n;; - some-fn\n;; - some?\n;; - trampoline (docstring match)\n;; - cljs.core/when-some\n;; - cljs.core/while (docstring match)\n;;\n;;=> nil\n```"}],
   :full-name "cljs.repl/find-doc",
   :docstring
   "Prints documentation for any var whose documentation or name\ncontains a match for re-string-or-pattern"},
  "test-vars"
  {:ns "cljs.test",
   :name "test-vars",
   :signature ["[vars]"],
   :type "function",
   :full-name "cljs.test/test-vars",
   :docstring
   "Groups vars by their namespace and runs test-vars on them with\nappropriate fixtures assuming they are present in the current\ntesting environment.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "node-eval"
  {:ns "cljs.repl.node",
   :name "node-eval",
   :signature ["[repl-env js]"],
   :type "function",
   :full-name "cljs.repl.node/node-eval",
   :docstring "Evaluate a JavaScript string in the Node REPL process.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "force"
  {:ns "cljs.core",
   :name "force",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/force",
   :docstring
   "If x is a Delay, returns the (possibly cached) value of its expression, else returns x",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "lower-case"
  {:description "Converts string to all lower-case.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "lower-case",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html "<p>Converts string to all lower-case.</p>",
   :full-name "clojure.string/lower-case",
   :docstring "Converts string to all lower-case."},
  "PersistentHashMap.EMPTY"
  {:ns "cljs.core",
   :name "PersistentHashMap.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentHashMap.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "chunk-append"
  {:ns "cljs.core",
   :name "chunk-append",
   :signature ["[b x]"],
   :type "function",
   :full-name "cljs.core/chunk-append",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "replace-first"
  {:description
   "Replaces the first instance of `match` with `replacement` in `s`.\n\nThe options for match / replacement are:\n\n| match  | replacement |\n|--------|-------------|\n| string | string      |\n| regex  | string      |\n| regex  | function    |",
   :examples-htmls [],
   :ns "clojure.string",
   :name "replace-first",
   :signature ["[s match replacement]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Replaces the first instance of <code>match</code> with <code>replacement</code> in <code>s</code>.</p><p>The options for match / replacement are:</p><p>| match  | replacement | |--------|-------------| | string | string      | | regex  | string      | | regex  | function    |</p>",
   :full-name "clojure.string/replace-first",
   :docstring
   "Replaces the first instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."},
  "copy-arguments"
  {:ns "cljs.core",
   :name "copy-arguments",
   :signature ["[dest]"],
   :type "macro",
   :full-name "cljs.core/copy-arguments",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "hash-combine"
  {:ns "cljs.core",
   :name "hash-combine",
   :signature ["[seed hash]"],
   :type "function",
   :full-name "cljs.core/hash-combine",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "union"
  {:description "Return a set that is the union of the input sets.",
   :examples-htmls [],
   :ns "clojure.set",
   :name "union",
   :signature ["[]" "[s1]" "[s1 s2]" "[s1 s2 & sets]"],
   :type "function",
   :related
   ["clojure.set/intersection"
    "clojure.set/difference"
    "clojure.set/superset?"],
   :examples-strings [],
   :description-html
   "<p>Return a set that is the union of the input sets.</p>",
   :full-name "clojure.set/union",
   :docstring "Return a set that is the union of the input sets"},
  "persistent!"
  {:ns "cljs.core",
   :name "persistent!",
   :signature ["[tcoll]"],
   :type "function",
   :full-name "cljs.core/persistent!",
   :docstring
   "Returns a new, persistent version of the transient collection, in\nconstant time. The transient collection cannot be used after this\ncall, any such use will throw an exception.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ObjMap"
  {:ns "cljs.core",
   :name "ObjMap",
   :signature ["[meta keys strobj update-count __hash]"],
   :type "type",
   :full-name "cljs.core/ObjMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ObjMap.EMPTY"
  {:ns "cljs.core",
   :name "ObjMap.EMPTY",
   :type "var",
   :full-name "cljs.core/ObjMap.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "chunk-cons"
  {:ns "cljs.core",
   :name "chunk-cons",
   :signature ["[chunk rest]"],
   :type "function",
   :full-name "cljs.core/chunk-cons",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "false?"
  {:description
   "Returns true if `x` is the value false, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "false?",
   :signature ["[x]"],
   :type "function/macro",
   :related ["cljs.core/true?" "cljs.core/not"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is the value false, false otherwise.</p>",
   :full-name "cljs.core/false?",
   :docstring
   "Returns true if x is the value false, false otherwise."},
  "IEmptyableCollection"
  {:ns "cljs.core",
   :name "IEmptyableCollection",
   :type "protocol",
   :full-name "cljs.core/IEmptyableCollection",
   :docstring "Protocol for creating an empty collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "max"
  {:description "Returns the greatest number argument.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "max",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/min" "cljs.core/max-key"],
   :examples-strings [],
   :description-html "<p>Returns the greatest number argument.</p>",
   :full-name "cljs.core/max",
   :docstring "Returns the greatest of the nums."},
  "try*"
  {:ns "special",
   :name "try*",
   :type "special form",
   :full-name "special/try*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "MetaFn"
  {:ns "cljs.core",
   :name "MetaFn",
   :signature ["[afn meta]"],
   :type "type",
   :full-name "cljs.core/MetaFn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-mix-K1"
  {:ns "cljs.core",
   :name "m3-mix-K1",
   :signature ["[k1]"],
   :type "function",
   :full-name "cljs.core/m3-mix-K1",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "path"
  {:ns "clojure.zip",
   :name "path",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/path",
   :docstring "Returns a seq of nodes leading to this loc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "write-out"
  {:ns "cljs.pprint",
   :name "write-out",
   :signature ["[object]"],
   :type "function",
   :full-name "cljs.pprint/write-out",
   :docstring
   "Write an object to *out* subject to the current bindings of the printer control\nvariables. Use the kw-args argument to override individual variables for this call (and\nany recursive calls).\n\n*out* must be a PrettyWriter if pretty printing is enabled. This is the responsibility\nof the caller.\n\nThis method is primarily intended for use by pretty print dispatch functions that\nalready know that the pretty printer will have set up their environment appropriately.\nNormal library clients should use the standard \"write\" interface. ",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "run-tests"
  {:ns "cljs.test",
   :name "run-tests",
   :signature ["[]" "[env-or-ns]" "[env-or-ns & namespaces]"],
   :type "macro",
   :full-name "cljs.test/run-tests",
   :docstring
   "Runs all tests in the given namespaces; prints results.\nDefaults to current namespace if none given. Does not return a meaningful\nvalue due to the possiblity of asynchronous execution. To detect test\ncompletion add a :end-run-tests method case to the cljs.test/report\nmultimethod.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ISet"
  {:ns "cljs.core",
   :name "ISet",
   :type "protocol",
   :full-name "cljs.core/ISet",
   :docstring "Protocol for adding set functionality to a collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cycle"
  {:description
   "Returns an infinite lazy sequence of repetitions of the items in `coll`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "cycle",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/lazy-seq" "cljs.core/repeatedly"],
   :examples-strings [],
   :description-html
   "<p>Returns an infinite lazy sequence of repetitions of the items in <code>coll</code>.</p>",
   :full-name "cljs.core/cycle",
   :docstring
   "Returns a lazy (infinite!) sequence of repetitions of the items in coll."},
  "lazy-cat"
  {:description
   "Expands to code which yields a lazy sequence of the concatenation of the\nsupplied collections. Each collections expression is not evaluated until it is\nneeded.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><code>(lazy-cat x y z)</code>\n      <td><pre>\n(concat (lazy-seq x)\n        (lazy-seq y)\n        (lazy-seq z))</pre></td></tr></tbody></table>",
   :examples-htmls [],
   :ns "cljs.core",
   :name "lazy-cat",
   :signature ["[& colls]"],
   :type "macro",
   :related ["cljs.core/lazy-seq" "cljs.core/concat"],
   :examples-strings [],
   :description-html
   "<p>Expands to code which yields a lazy sequence of the concatenation of the supplied collections. Each collections expression is not evaluated until it is needed.</p><p><table class=\"code-tbl-9bef6\">   <thead><pre><code>&lt;tr&gt;\n  &lt;th&gt;Code&lt;/th&gt;\n  &lt;th&gt;Expands To&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; \n</code></pre>  <tbody><pre><code>&lt;tr&gt;\n  &lt;td&gt;&lt;code&gt;&#40;lazy-cat x y z&#41;&lt;/code&gt;\n  &lt;td&gt;&lt;pre&gt; \n</code></pre>(concat (lazy-seq x)<pre><code>    &#40;lazy-seq y&#41;\n    &#40;lazy-seq z&#41;&#41;&lt;/pre&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt; \n</code></pre></p>",
   :full-name "cljs.core/lazy-cat",
   :docstring
   "Expands to code which yields a lazy sequence of the concatenation\nof the supplied colls.  Each coll expr is not evaluated until it is\nneeded. \n\n(lazy-cat xs ys zs) === (concat (lazy-seq xs) (lazy-seq ys) (lazy-seq zs))"},
  "destructure-map"
  {:description
   "A helpful shorthand for binding names to values inside a map.\n\nThe destructure map can be a map from a symbol to a lookup value:\n\n```clj\n(let [ {a :foo}   ;; <-- destructure map\n       {:foo 1} ]\n  a)\n;;=> 1\n```\n\nThe destructure map can bind multiple names:\n\n```clj\n(let [ {a :foo, b :bar}   ;; <-- destructure map\n       {:foo 1, :bar 2} ]\n  (println a b))\n;; 1 2\n```\n\nUse this convenient alternative if names match the keys:\n\n```clj\n(let [ {:keys [foo bar]}   ;; <-- destructure map\n       {:foo 1, :bar 2} ]\n  (println foo bar))\n;; 1 2\n```\n\nDifferent key types are supported using `:keys`, `:strs`, or `:syms`, which\nmap to the manual destructuring forms below:\n\n- `{:keys [foo]}` -> `{foo :foo }`\n- `{:strs [foo]}` -> `{foo \"foo\"}`\n- `{:syms [foo]}` -> `{foo 'foo }`\n\nUse `:as foo` to name the original value:\n\n```clj\n(let [ {:keys [foo bar] :as whole}\n       {:foo 1, :bar 2} ]\n  whole)\n;;=> {:foo 1, :bar 2}\n```\n\nUse `:or {}` to provide default values if missing:\n\n```clj\n(let [ {:keys [foo bar] :or {bar 0} }\n       {:foo 1} ]\n  (println foo bar))\n;; 1 0\n```\n\nUse the special destructuring map in place of any local name binding in the\nfollowing forms:\n\n- `(let [...])`\n- `(fn [...])`\n- `(loop [...])`\n\nDestructure maps can be nested, even in place of names in [destructure\nvectors][doc:syntax/destructure-vector].",
   :examples-htmls
   ["<p>Use in place of function arguments:</p><pre><code class=\"clj\">&#40;defn print-point\n  &#91;{:keys &#91;x y z&#93;}&#93;\n  &#40;println x y z&#41;&#41;\n\n&#40;print-point {:x 1, :y 2, :z 3}&#41;\n;; 1 2 3\n</code></pre>"
    "<p>A non-vector sequence can be destructured as a map:</p><pre><code class=\"clj\">&#40;let &#91;{:keys &#91;a b&#93;} '&#40;:a 1 :b 2&#41;&#93;\n  &#40;println a b&#41;&#41;\n;; 1 2\n</code></pre>"],
   :ns "syntax",
   :name "destructure-map",
   :type "binding",
   :related ["syntax/destructure-vector"],
   :examples-strings
   [[["(defn print-point"
      "  [{:keys [x y z]}]"
      "  (println x y z))"
      "(print-point {:x 1, :y 2, :z 3}) ;; 1 2 3"]]
    [["(let [{:keys [a b]} '(:a 1 :b 2)]" "  (println a b)) ;; 1 2"]]],
   :description-html
   "<p>A helpful shorthand for binding names to values inside a map.</p><p>The destructure map can be a map from a symbol to a lookup value:</p><pre><code class=\"clj\">&#40;let &#91; {a :foo}   ;; &lt;-- destructure map\n       {:foo 1} &#93;\n  a&#41;\n;;=&gt; 1\n</code></pre><p>The destructure map can bind multiple names:</p><pre><code class=\"clj\">&#40;let &#91; {a :foo, b :bar}   ;; &lt;-- destructure map\n       {:foo 1, :bar 2} &#93;\n  &#40;println a b&#41;&#41;\n;; 1 2\n</code></pre><p>Use this convenient alternative if names match the keys:</p><pre><code class=\"clj\">&#40;let &#91; {:keys &#91;foo bar&#93;}   ;; &lt;-- destructure map\n       {:foo 1, :bar 2} &#93;\n  &#40;println foo bar&#41;&#41;\n;; 1 2\n</code></pre><p>Different key types are supported using <code>:keys</code>, <code>:strs</code>, or <code>:syms</code>, which map to the manual destructuring forms below:</p><ul><li><code>{:keys &#91;foo&#93;}</code> -> <code>{foo :foo }</code></li><li><code>{:strs &#91;foo&#93;}</code> -> <code>{foo &quot;foo&quot;}</code></li><li><code>{:syms &#91;foo&#93;}</code> -> <code>{foo 'foo }</code></li></ul><p>Use <code>:as foo</code> to name the original value:</p><pre><code class=\"clj\">&#40;let &#91; {:keys &#91;foo bar&#93; :as whole}\n       {:foo 1, :bar 2} &#93;\n  whole&#41;\n;;=&gt; {:foo 1, :bar 2}\n</code></pre><p>Use <code>:or {}</code> to provide default values if missing:</p><pre><code class=\"clj\">&#40;let &#91; {:keys &#91;foo bar&#93; :or {bar 0} }\n       {:foo 1} &#93;\n  &#40;println foo bar&#41;&#41;\n;; 1 0\n</code></pre><p>Use the special destructuring map in place of any local name binding in the following forms:</p><ul><li><code>&#40;let &#91;...&#93;&#41;</code></li><li><code>&#40;fn &#91;...&#93;&#41;</code></li><li><code>&#40;loop &#91;...&#93;&#41;</code></li></ul><p>Destructure maps can be nested, even in place of names in [destructure vectors][doc:syntax/destructure-vector].</p>",
   :examples
   [{:id "0d56ee",
     :content
     "Use in place of function arguments:\n\n```clj\n(defn print-point\n  [{:keys [x y z]}]\n  (println x y z))\n\n(print-point {:x 1, :y 2, :z 3})\n;; 1 2 3\n```"}
    {:id "7a51df",
     :content
     "A non-vector sequence can be destructured as a map:\n\n```clj\n(let [{:keys [a b]} '(:a 1 :b 2)]\n  (println a b))\n;; 1 2\n```"}],
   :full-name "syntax/destructure-map"},
  "clear-env!"
  {:ns "cljs.test",
   :name "clear-env!",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.test/clear-env!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-meta?"
  {:ns "cljs.core",
   :name "print-meta?",
   :signature ["[opts obj]"],
   :type "function",
   :full-name "cljs.core/print-meta?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-request"
  {:ns "cljs.repl.server",
   :name "read-request",
   :signature ["[rdr]"],
   :type "function",
   :full-name "cljs.repl.server/read-request",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-queue"
  {:ns "clojure.browser.repl",
   :name "print-queue",
   :type "var",
   :full-name "clojure.browser.repl/print-queue",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-in"
  {:description
   "Returns the value in a nested associative structure, where `ks` is a sequence of\nkeys.\n\nReturns nil if the key is not found, or `not-found` if supplied.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "get-in",
   :signature ["[m ks]" "[m ks not-found]"],
   :type "function",
   :related
   ["cljs.core/assoc-in"
    "cljs.core/update-in"
    "cljs.core/find"
    "cljs.core/get"],
   :examples-strings [],
   :description-html
   "<p>Returns the value in a nested associative structure, where <code>ks</code> is a sequence of keys.</p><p>Returns nil if the key is not found, or <code>not-found</code> if supplied.</p>",
   :full-name "cljs.core/get-in",
   :docstring
   "Returns the value in a nested associative structure,\nwhere ks is a sequence of keys. Returns nil if the key is not present,\nor the not-found value if supplied."},
  "new"
  {:ns "special",
   :name "new",
   :signature ["[Constructor. args*]" "[Constructor args*]"],
   :type "special form",
   :full-name "special/new",
   :docstring
   "The args, if any, are evaluated from left to right, and\npassed to the JavaScript constructor. The constructed object is\nreturned.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "seq-zip"
  {:ns "clojure.zip",
   :name "seq-zip",
   :signature ["[root]"],
   :type "function",
   :full-name "clojure.zip/seq-zip",
   :docstring
   "Returns a zipper for nested sequences, given a root sequence",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dispatch-fn"
  {:ns "cljs.core",
   :name "dispatch-fn",
   :signature ["[multifn]"],
   :type "function",
   :full-name "cljs.core/dispatch-fn",
   :docstring "Given a multimethod, return it's dispatch-fn.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "LazyTransformer.create"
  {:ns "cljs.core",
   :name "LazyTransformer.create",
   :signature ["[xform coll]"],
   :type "function",
   :full-name "cljs.core/LazyTransformer.create",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr-sequential"
  {:ns "cljs.core",
   :name "pr-sequential",
   :signature ["[print-one begin sep end opts coll]"],
   :type "function",
   :full-name "cljs.core/pr-sequential",
   :docstring
   "Do not use this.  It is kept for backwards compatibility with the\nold IPrintable protocol.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "nth"
  {:description
   "Returns the value at index `n` or `not-found` if the index is out of bounds.\n\n`nth` will throw an exception if `n` is out of bounds and `not-found` is not\nsupplied.\n\n`nth` works for Strings, Arrays, Regex Matchers, Lists, and Sequences. For\nSequences, `nth` takes O(n) time.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "nth",
   :signature ["[coll n]" "[coll n not-found]"],
   :type "function",
   :related
   ["cljs.core/first"
    "cljs.core/second"
    "cljs.core/nthnext"
    "cljs.core/get"],
   :examples-strings [],
   :description-html
   "<p>Returns the value at index <code>n</code> or <code>not-found</code> if the index is out of bounds.</p><p><code>nth</code> will throw an exception if <code>n</code> is out of bounds and <code>not-found</code> is not supplied.</p><p><code>nth</code> works for Strings, Arrays, Regex Matchers, Lists, and Sequences. For Sequences, <code>nth</code> takes O(n) time.</p>",
   :full-name "cljs.core/nth",
   :docstring
   "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences."},
  "ArrayChunk"
  {:ns "cljs.core",
   :name "ArrayChunk",
   :signature ["[arr off end]"],
   :type "type",
   :full-name "cljs.core/ArrayChunk",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "evaluate-javascript"
  {:ns "clojure.browser.repl",
   :name "evaluate-javascript",
   :signature ["[conn block]"],
   :type "function",
   :full-name "clojure.browser.repl/evaluate-javascript",
   :docstring
   "Process a single block of JavaScript received from the server",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "regex"
  {:description
   "Signifies a regular expression. Represented as native [JavaScript regular expressions].\n\n[JavaScript regular expressions]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions\n\nAn inline modifier can be included at the beginning of the regex:\n\n|  modifier          | ClojureScript | JavaScript |\n|--------------------|---------------|------------|\n|  global match      | N/A           | `/foo/g`   |\n|  case-insensitive  | `#\"(?i)foo\"`  | `/foo/i`   |\n|  multi-line        | `#\"(?m)f.*o\"` | `/f.*o/m`  |\n\nGlobal matches (i.e. multiple matches per line) can be achieved using `re-seq`.",
   :examples-htmls
   ["<pre><code class=\"clj\">#&quot;foo&quot;\n;;=&gt; #&quot;foo&quot;\n\n&#40;re-seq #&quot;foo&quot; &quot;FOO BAR foo bar&quot;&#41;\n;;=&gt; &#40;&quot;foo&quot;&#41;\n</code></pre><p>Case-insensitive matching:</p><pre><code class=\"clj\">#&quot;&#40;?i&#41;foo&quot;\n;;=&gt; #&quot;foo&quot;\n\n&#40;re-seq #&quot;&#40;?i&#41;foo&quot; &quot;FOO BAR foo bar&quot;&#41;\n;;=&gt; &#40;&quot;FOO&quot; &quot;foo&quot;&#41;\n</code></pre>"],
   :ns "syntax",
   :name "regex",
   :type "syntax",
   :related
   ["cljs.core/re-pattern"
    "cljs.core/re-find"
    "cljs.core/re-seq"
    "cljs.core/re-matches"],
   :examples-strings
   [[["#\"foo\" ;;=> #\"foo\""
      "(re-seq #\"foo\" \"FOO BAR foo bar\") ;;=> (\"foo\")"]
     ["#\"(?i)foo\" ;;=> #\"foo\""
      "(re-seq #\"(?i)foo\" \"FOO BAR foo bar\") ;;=> (\"FOO\" \"foo\")"]]],
   :description-html
   "<p>Signifies a regular expression. Represented as native [JavaScript regular expressions].</p><p>[JavaScript regular expressions]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions</p><p>An inline modifier can be included at the beginning of the regex:</p><p>|  modifier          | ClojureScript | JavaScript | |--------------------|---------------|------------| |  global match      | N/A           | <code>/foo/g</code>   | |  case-insensitive  | <code>#&quot;&#40;?i&#41;foo&quot;</code>  | <code>/foo/i</code>   | |  multi-line        | <code>#&quot;&#40;?m&#41;f.&#42;o&quot;</code> | <code>/f.&#42;o/m</code>  |</p><p>Global matches (i.e. multiple matches per line) can be achieved using <code>re-seq</code>.</p>",
   :examples
   [{:id "dacf80",
     :content
     "```clj\n#\"foo\"\n;;=> #\"foo\"\n\n(re-seq #\"foo\" \"FOO BAR foo bar\")\n;;=> (\"foo\")\n```\n\nCase-insensitive matching:\n\n```clj\n#\"(?i)foo\"\n;;=> #\"foo\"\n\n(re-seq #\"(?i)foo\" \"FOO BAR foo bar\")\n;;=> (\"FOO\" \"foo\")\n```"}],
   :full-name "syntax/regex"},
  "BlackNode"
  {:ns "cljs.core",
   :name "BlackNode",
   :signature ["[key val left right __hash]"],
   :type "type",
   :full-name "cljs.core/BlackNode",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "listen-once"
  {:ns "clojure.browser.event",
   :name "listen-once",
   :signature ["[src type fn]" "[src type fn capture?]"],
   :type "function",
   :full-name "clojure.browser.event/listen-once",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "regexp?"
  {:ns "cljs.core",
   :name "regexp?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/regexp?",
   :docstring "Returns true if x is a JavaScript RegExp instance.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "add-to-string-hash-cache"
  {:ns "cljs.core",
   :name "add-to-string-hash-cache",
   :signature ["[k]"],
   :type "function",
   :full-name "cljs.core/add-to-string-hash-cache",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "run-all-tests"
  {:ns "cljs.test",
   :name "run-all-tests",
   :signature ["[]" "[re]" "[re env]"],
   :type "macro",
   :full-name "cljs.test/run-all-tests",
   :docstring
   "Runs all tests in all namespaces; prints results.\nOptional argument is a regular expression; only namespaces with\nnames matching the regular expression (with re-matches) will be\ntested.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ICounted"
  {:ns "cljs.core",
   :name "ICounted",
   :type "protocol",
   :full-name "cljs.core/ICounted",
   :docstring
   "Protocol for adding the ability to count a collection in constant time.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "map-invert"
  {:ns "clojure.set",
   :name "map-invert",
   :signature ["[m]"],
   :type "function",
   :full-name "clojure.set/map-invert",
   :docstring "Returns the map with the vals mapped to the keys.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "require"
  {:ns "cljs.nodejs",
   :name "require",
   :type "var",
   :full-name "cljs.nodejs/require",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*loaded-libs*"
  {:ns "cljs.core",
   :name "*loaded-libs*",
   :type "dynamic var",
   :full-name "cljs.core/*loaded-libs*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "remove-ns"
  {:ns "cljs.analyzer.api",
   :name "remove-ns",
   :signature ["[ns]" "[state ns]"],
   :type "function",
   :full-name "cljs.analyzer.api/remove-ns",
   :docstring "Removes the namespace named by the symbol.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compare-and-set!"
  {:description
   "Atomically sets the value of atom `a` to `newval` if and only if the current\nvalue of the atom is identical to `oldval`.\n\nReturns true if set happened, false otherwise.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a &#40;atom &quot;abc&quot;&#41;&#41;\n\n&#40;compare-and-set! a &quot;abc&quot; &quot;def&quot;&#41;\n;;=&gt; true\n\n@a\n;;=&gt; &quot;def&quot;\n\n&#40;compare-and-set! a &quot;abc&quot; &quot;def&quot;&#41;\n;;=&gt; false\n\n@a\n;;=&gt; &quot;def&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "compare-and-set!",
   :signature ["[a oldval newval]"],
   :type "function",
   :related ["cljs.core/atom" "cljs.core/reset!" "cljs.core/swap!"],
   :examples-strings
   [[["(def a (atom \"abc\"))"
      "(compare-and-set! a \"abc\" \"def\") ;;=> true"
      "@a ;;=> \"def\""
      "(compare-and-set! a \"abc\" \"def\") ;;=> false"
      "@a ;;=> \"def\""]]],
   :description-html
   "<p>Atomically sets the value of atom <code>a</code> to <code>newval</code> if and only if the current value of the atom is identical to <code>oldval</code>.</p><p>Returns true if set happened, false otherwise.</p>",
   :examples
   [{:id "1fa306",
     :content
     "```clj\n(def a (atom \"abc\"))\n\n(compare-and-set! a \"abc\" \"def\")\n;;=> true\n\n@a\n;;=> \"def\"\n\n(compare-and-set! a \"abc\" \"def\")\n;;=> false\n\n@a\n;;=> \"def\"\n```"}],
   :full-name "cljs.core/compare-and-set!",
   :docstring
   "Atomically sets the value of atom to newval if and only if the\ncurrent value of the atom is equal to oldval. Returns true if\nset happened, else false."},
  "inst-literal"
  {:description
   "An instant in time, using a [RFC-3339] formatted string. Creates a JavaScript [Date] object.\n\nThe format is `#inst \"yyyy-mm-ddThh:mm:ss\"`, where:\n\n- `yyyy-mm-dd` = date\n- `hh:mm:ss` = time (optional)\n\nAppend `Z` to denote UTC, or `-hh:mm` to denote exact UTC offset.\n\n[Date]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date\n[RFC-3339]:http://www.ietf.org/rfc/rfc3339.txt",
   :examples-htmls
   ["<pre><code class=\"clj\">#inst &quot;1985-04-12&quot;\n;;=&gt; #inst &quot;1985-04-12T00:00:00.000-00:00&quot;\n\n#inst &quot;1985-04-12T23:20:50.52Z&quot;\n;;=&gt; #inst &quot;1985-04-12T23:20:50.520-00:00&quot;\n</code></pre><p>Dates can be tested for order, as native JavaScript Dates can:</p><pre><code class=\"clj\">&#40;def a #inst &quot;2005-01-20&quot;&#41;\n&#40;def b #inst &quot;2005-01-21&quot;&#41;\n\n&#40;&lt; a b&#41;\n;;=&gt; true\n</code></pre><p>Dates can be tested for equality, unlike JavaScript Dates.  (ClojureScript extends <code>js/Date</code> type with <code>IEquiv</code> protocol to allow this.)</p><pre><code class=\"clj\">&#40;def a #inst &quot;2012-06-13&quot;&#41;\n&#40;def b #inst &quot;2012-06-13&quot;&#41;\n\n&#40;= a b&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "syntax",
   :name "inst-literal",
   :type "tagged literal",
   :related ["cljs.core/time" "syntax/tagged-literal"],
   :examples-strings
   [[["#inst \"1985-04-12\" ;;=> #inst \"1985-04-12T00:00:00.000-00:00\""
      "#inst \"1985-04-12T23:20:50.52Z\" ;;=> #inst \"1985-04-12T23:20:50.520-00:00\""]
     ["(def a #inst \"2005-01-20\")"
      "(def b #inst \"2005-01-21\")"
      "(< a b) ;;=> true"]
     ["(def a #inst \"2012-06-13\")"
      "(def b #inst \"2012-06-13\")"
      "(= a b) ;;=> true"]]],
   :description-html
   "<p>An instant in time, using a [RFC-3339] formatted string. Creates a JavaScript [Date] object.</p><p>The format is <code>#inst &quot;yyyy-mm-ddThh:mm:ss&quot;</code>, where:</p><ul><li><code>yyyy-mm-dd</code> = date</li><li><code>hh:mm:ss</code> = time (optional)</li></ul><p>Append <code>Z</code> to denote UTC, or <code>-hh:mm</code> to denote exact UTC offset.</p><p>[Date]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date [RFC-3339]:http://www.ietf.org/rfc/rfc3339.txt</p>",
   :examples
   [{:id "47d8ee",
     :content
     "```clj\n#inst \"1985-04-12\"\n;;=> #inst \"1985-04-12T00:00:00.000-00:00\"\n\n#inst \"1985-04-12T23:20:50.52Z\"\n;;=> #inst \"1985-04-12T23:20:50.520-00:00\"\n```\n\nDates can be tested for order, as native JavaScript Dates can:\n\n```clj\n(def a #inst \"2005-01-20\")\n(def b #inst \"2005-01-21\")\n\n(< a b)\n;;=> true\n```\n\nDates can be tested for equality, unlike JavaScript Dates.  (ClojureScript\nextends `js/Date` type with `IEquiv` protocol to allow this.)\n\n```clj\n(def a #inst \"2012-06-13\")\n(def b #inst \"2012-06-13\")\n\n(= a b)\n;;=> true\n```"}],
   :full-name "syntax/inst-literal"},
  "set!"
  {:description
   "Sets `js-var` to `val` using the JavaScript `=` operator.",
   :examples-htmls [],
   :ns "special",
   :name "set!",
   :signature ["[js-var val]"],
   :type "special form",
   :related ["cljs.core/aset" "cljs.core/reset!"],
   :examples-strings [],
   :description-html
   "<p>Sets <code>js-var</code> to <code>val</code> using the JavaScript <code>=</code> operator.</p>",
   :full-name "special/set!",
   :docstring "Used to set vars and JavaScript object fields"},
  "comp"
  {:description
   "Takes a set of functions and returns a function that is the composition\nof those functions.\n\nThe returned function takes a variable number of arguments, applies the\nrightmost of `fns` to the arguments, whose result is subsequently applied to\nthe next left function, and so on.\n\n`((comp a b c) x y)` = `(a (b (c x y)))`",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def f &#40;comp str inc +&#41;&#41;\n&#40;f 1 2 3&#41;\n;;=&gt; &quot;7&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "comp",
   :signature ["[& fns]"],
   :type "function",
   :related ["cljs.core/partial" "cljs.core/juxt"],
   :examples-strings
   [[["(def f (comp str inc +))" "(f 1 2 3) ;;=> \"7\""]]],
   :description-html
   "<p>Takes a set of functions and returns a function that is the composition of those functions.</p><p>The returned function takes a variable number of arguments, applies the rightmost of <code>fns</code> to the arguments, whose result is subsequently applied to the next left function, and so on.</p><p><code>&#40;&#40;comp a b c&#41; x y&#41;</code> = <code>&#40;a &#40;b &#40;c x y&#41;&#41;&#41;</code></p>",
   :examples
   [{:id "5d3250",
     :content
     "```clj\n(def f (comp str inc +))\n(f 1 2 3)\n;;=> \"7\"\n```"}],
   :full-name "cljs.core/comp",
   :docstring
   "Takes a set of functions and returns a fn that is the composition\nof those fns.  The returned fn takes a variable number of args,\napplies the rightmost of fns to the args, the next\nfn (right-to-left) to the result, etc."},
  "repl-prompt"
  {:ns "cljs.repl",
   :name "repl-prompt",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl/repl-prompt",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "partition"
  {:description
   "Returns a lazy sequence of lists of `n` items each, at offsets `step` apart.\n\nIf `step` is not supplied, defaults to `n`, i.e. the partitions do not overlap.\n\nIf a `pad` collection is supplied, its elements will be used as necessary to\ncomplete the last partition up to `n` items.\n\nReturns a partition with less than `n` items if there are not enough padding\nelements.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "partition",
   :signature ["[n coll]" "[n step coll]" "[n step pad coll]"],
   :type "function",
   :related
   ["cljs.core/partition-all"
    "cljs.core/split-at"
    "cljs.core/partition-by"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of lists of <code>n</code> items each, at offsets <code>step</code> apart.</p><p>If <code>step</code> is not supplied, defaults to <code>n</code>, i.e. the partitions do not overlap.</p><p>If a <code>pad</code> collection is supplied, its elements will be used as necessary to complete the last partition up to <code>n</code> items.</p><p>Returns a partition with less than <code>n</code> items if there are not enough padding elements.</p>",
   :full-name "cljs.core/partition",
   :docstring
   "Returns a lazy sequence of lists of n items each, at offsets step\napart. If step is not supplied, defaults to n, i.e. the partitions\ndo not overlap. If a pad collection is supplied, use its elements as\nnecessary to complete last partition up to n items. In case there are\nnot enough padding elements, return a partition with less than n items."},
  "fn"
  {:description
   "Defines a function.\n\n`name?` is an optional name of the function to be used inside `body`. This is\nuseful for recursive calls. Note that `name?` in `fn` is not the same as the\n`name` argument to `defn`, which defines a global symbol for the function.\n\n`params*` are the arguments to the function and a binding form for the symbols\nthat the arguments will take inside the body of the function. Functions can have\narity of 0-20 and there is no runtime enforcement of arity when calling a\nfunction (just like in JavaScript).\n\n`prepost-map?` is an optional map with optional keys `:pre` and `:post` that\ncontain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)\nfor the function.\n\n`body` is a series of expressions that execute when the function is called. The\narguments to the function are mapped to symbols in `params*` and are available\nin `body`. The value of the last expression in `body` is the return value of\ncalling the function.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "fn",
   :signature
   ["[name? [params*] prepost-map? body]"
    "[name? ([params*] prepost-map? body)+]"],
   :type "macro",
   :related ["cljs.core/defn" "cljs.core/defn-"],
   :examples-strings [],
   :description-html
   "<p>Defines a function.</p><p><code>name?</code> is an optional name of the function to be used inside <code>body</code>. This is useful for recursive calls. Note that <code>name?</code> in <code>fn</code> is not the same as the <code>name</code> argument to <code>defn</code>, which defines a global symbol for the function.</p><p><code>params&#42;</code> are the arguments to the function and a binding form for the symbols that the arguments will take inside the body of the function. Functions can have arity of 0-20 and there is no runtime enforcement of arity when calling a function (just like in JavaScript).</p><p><code>prepost-map?</code> is an optional map with optional keys <code>:pre</code> and <code>:post</code> that contain collections of <a href='http://blog.fogus.me/2009/12/21/clojures-pre-and-post/'>pre or post conditions</a> for the function.</p><p><code>body</code> is a series of expressions that execute when the function is called. The arguments to the function are mapped to symbols in <code>params&#42;</code> and are available in <code>body</code>. The value of the last expression in <code>body</code> is the return value of calling the function.</p>",
   :full-name "cljs.core/fn",
   :docstring
   "params => positional-params* , or positional-params* & next-param\npositional-param => binding-form\nnext-param => binding-form\nname => symbol\n\nDefines a function"},
  "self-require?"
  {:ns "cljs.repl",
   :name "self-require?",
   :signature ["[specs]"],
   :type "function",
   :full-name "cljs.repl/self-require?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "flush"
  {:ns "cljs.core",
   :name "flush",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.core/flush",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "tagged-literal?"
  {:ns "cljs.core",
   :name "tagged-literal?",
   :signature ["[value]"],
   :type "function",
   :full-name "cljs.core/tagged-literal?",
   :docstring
   "Return true if the value is the data representation of a tagged literal",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compile-client-js"
  {:ns "cljs.repl.browser",
   :name "compile-client-js",
   :signature ["[opts]"],
   :type "function",
   :full-name "cljs.repl.browser/compile-client-js",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "send-static"
  {:ns "cljs.repl.browser",
   :name "send-static",
   :signature ["[{path :path, :as request} conn opts]"],
   :type "function",
   :full-name "cljs.repl.browser/send-static",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "println-str"
  {:ns "cljs.core",
   :name "println-str",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/println-str",
   :docstring "println to a string, returning it",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "munge"
  {:ns "cljs.core",
   :name "munge",
   :signature ["[name]"],
   :type "function",
   :full-name "cljs.core/munge",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentTreeMap.EMPTY"
  {:ns "cljs.core",
   :name "PersistentTreeMap.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentTreeMap.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentVector"
  {:ns "cljs.core",
   :name "PersistentVector",
   :signature ["[meta cnt shift root tail __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentVector",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reducer"
  {:ns "clojure.core.reducers",
   :name "reducer",
   :signature ["[coll xf]"],
   :type "function",
   :full-name "clojure.core.reducers/reducer",
   :docstring
   "Given a reducible collection, and a transformation function xf,\nreturns a reducible collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "impure"
  {:description
   "A naming convention for impure functions (unenforced).\n\nImpure functions are those that have side-effects on some state.\n\nSome impure functions which use this convention:\n\n- [doc:special/set!]\n- [doc:cljs.core/swap!]\n- [doc:cljs.core/conj!]\n- [doc:cljs.core/specify!]",
   :examples-htmls
   ["<p>The following causes a side-effect in the state of <code>a</code>:</p><pre><code class=\"clj\">&#40;def a &#40;atom 1&#41;&#41;\n@a\n;;=&gt; 1\n\n&#40;reset! a 2&#41;\n@a\n;;=&gt; 2\n</code></pre>"],
   :ns "syntax",
   :name "impure",
   :type "convention",
   :related ["syntax/predicate"],
   :examples-strings
   [[["(def a (atom 1))" "@a ;;=> 1" "(reset! a 2)" "@a ;;=> 2"]]],
   :description-html
   "<p>A naming convention for impure functions (unenforced).</p><p>Impure functions are those that have side-effects on some state.</p><p>Some impure functions which use this convention:</p><ul><li>[doc:special/set!]</li><li>[doc:cljs.core/swap!]</li><li>[doc:cljs.core/conj!]</li><li>[doc:cljs.core/specify!]</li></ul>",
   :examples
   [{:id "c1dbc0",
     :content
     "The following causes a side-effect in the state of `a`:\n\n```clj\n(def a (atom 1))\n@a\n;;=> 1\n\n(reset! a 2)\n@a\n;;=> 2\n```"}],
   :full-name "syntax/impure"},
  "cloneable?"
  {:ns "cljs.core",
   :name "cloneable?",
   :signature ["[value]"],
   :type "function",
   :full-name "cljs.core/cloneable?",
   :docstring "Return true if x implements ICloneable protocol.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "for"
  {:description
   "List comprehension.\n\nTakes a vector of one or more binding-form/collection-expr pairs, each followed\nby zero or more modifiers, and yields a lazy sequence of evaluations of expr.\n\nCollections are iterated in a nested fashion, rightmost fastest, and nested\ncoll-exprs can refer to bindings created in prior binding-forms. Supported\nmodifiers are: `:let [binding-form expr ...]`, `:while test`, `:when test`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "for",
   :signature ["[seq-exprs body-expr]"],
   :type "macro",
   :related ["cljs.core/doseq" "cljs.core/doall" "special/recur"],
   :examples-strings [],
   :description-html
   "<p>List comprehension.</p><p>Takes a vector of one or more binding-form/collection-expr pairs, each followed by zero or more modifiers, and yields a lazy sequence of evaluations of expr.</p><p>Collections are iterated in a nested fashion, rightmost fastest, and nested coll-exprs can refer to bindings created in prior binding-forms. Supported modifiers are: <code>:let &#91;binding-form expr ...&#93;</code>, <code>:while test</code>, <code>:when test</code>.</p>",
   :full-name "cljs.core/for",
   :docstring
   "List comprehension. Takes a vector of one or more\n binding-form/collection-expr pairs, each followed by zero or more\n modifiers, and yields a lazy sequence of evaluations of expr.\n Collections are iterated in a nested fashion, rightmost fastest,\n and nested coll-exprs can refer to bindings created in prior\n binding-forms.  Supported modifiers are: :let [binding-form expr ...],\n :while test, :when test.\n\n(take 100 (for [x (range 100000000) y (range 1000000) :while (< y x)]  [x y]))"},
  "shuffle"
  {:description "Returns a random permutation of `coll`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "shuffle",
   :signature ["[coll]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns a random permutation of <code>coll</code>.</p>",
   :full-name "cljs.core/shuffle",
   :docstring "Return a random permutation of coll"},
  "send-print"
  {:ns "clojure.browser.repl",
   :name "send-print",
   :signature ["[url data]" "[url data n]"],
   :type "function",
   :full-name "clojure.browser.repl/send-print",
   :docstring
   "Send data to be printed in the REPL. If there is an error, try again\nup to 10 times.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IPrettyFlush"
  {:ns "cljs.pprint",
   :name "IPrettyFlush",
   :type "protocol",
   :full-name "cljs.pprint/IPrettyFlush",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "handle-reflect-query"
  {:ns "cljs.repl.reflect",
   :name "handle-reflect-query",
   :signature ["[[param _] & _]"],
   :type "multimethod",
   :full-name "cljs.repl.reflect/handle-reflect-query",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "deftype*"
  {:ns "special",
   :name "deftype*",
   :type "special form",
   :full-name "special/deftype*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "defrecord*"
  {:ns "special",
   :name "defrecord*",
   :type "special form",
   :full-name "special/defrecord*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-xor"
  {:description
   "Bitwise \"exclusive or\". Same as `x ^ y` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-xor 2r1100 2r1010&#41;\n;;=&gt; 6\n;; 6 = 2r0110\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-xor 12 10&#41;\n;;=&gt; 6\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-xor",
   :signature ["[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/bit-and" "cljs.core/bit-or"],
   :examples-strings
   [[["(bit-xor 2r1100 2r1010) ;;=> 6 ;; 6 = 2r0110"]
     ["(bit-xor 12 10) ;;=> 6"]]],
   :description-html
   "<p>Bitwise \"exclusive or\". Same as <code>x &#94; y</code> in JavaScript.</p>",
   :examples
   [{:id "3ccd99",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-xor 2r1100 2r1010)\n;;=> 6\n;; 6 = 2r0110\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-xor 12 10)\n;;=> 6\n```"}],
   :full-name "cljs.core/bit-xor",
   :docstring "Bitwise exclusive or"},
  "parse-ns"
  {:ns "cljs.analyzer.api",
   :name "parse-ns",
   :signature
   ["[src]" "[src opts]" "[src dest opts]" "[state src dest opts]"],
   :type "function",
   :full-name "cljs.analyzer.api/parse-ns",
   :docstring
   "Helper for parsing only the essential namespace information from a\nClojureScript source file and returning a cljs.closure/IJavaScript compatible\nmap _not_ a namespace AST node.\n\nBy default does not load macros or perform any analysis of dependencies. If\nopts parameter provided :analyze-deps and :load-macros keys their values will\nbe used for *analyze-deps* and *load-macros* bindings respectively. This\nfunction does _not_ side-effect the ambient compilation environment unless\nrequested via opts where :restore is false.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "defrecord"
  {:ns "cljs.core",
   :name "defrecord",
   :signature ["[rsym fields & impls]"],
   :type "macro",
   :full-name "cljs.core/defrecord",
   :docstring
   "(defrecord name [fields*]  options* specs*)\n\nCurrently there are no options.\n\nEach spec consists of a protocol or interface name followed by zero\nor more method bodies:\n\nprotocol-or-Object\n(methodName [args*] body)*\n\nThe record will have the (immutable) fields named by\nfields, which can have type hints. Protocols and methods\nare optional. The only methods that can be supplied are those\ndeclared in the protocols.  Note that method bodies are\nnot closures, the local environment includes only the named fields,\nand those fields can be accessed directly.\n\nMethod definitions take the form:\n\n(methodname [args*] body)\n\nThe argument and return types can be hinted on the arg and\nmethodname symbols. If not supplied, they will be inferred, so type\nhints should be reserved for disambiguation.\n\nMethods should be supplied for all methods of the desired\nprotocol(s). You can also define overrides for\nmethods of Object. Note that a parameter must be supplied to\ncorrespond to the target object ('this' in JavaScript parlance). Note also\nthat recur calls to the method head should *not* pass the target object, it\nwill be supplied automatically and can not be substituted.\n\nIn the method bodies, the (unqualified) name can be used to name the\nclass (for calls to new, instance? etc).\n\nThe type will have implementations of several ClojureScript\nprotocol generated automatically: IMeta/IWithMeta (metadata support) and\nIMap, etc.\n\nIn addition, defrecord will define type-and-value-based =,\nand will define ClojureScript IHash and IEquiv.\n\nTwo constructors will be defined, one taking the designated fields\nfollowed by a metadata map (nil for none) and an extension field\nmap (nil for none), and one taking only the fields (using nil for\nmeta and extension fields). Note that the field names __meta\nand __extmap are currently reserved and should not be used when\ndefining your own records.\n\nGiven (defrecord TypeName ...), two factory functions will be\ndefined: ->TypeName, taking positional parameters for the fields,\nand map->TypeName, taking a map of keywords to field values.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "diff"
  {:ns "clojure.data",
   :name "diff",
   :signature ["[a b]"],
   :type "function",
   :full-name "clojure.data/diff",
   :docstring
   "Recursively compares a and b, returning a tuple of\n[things-only-in-a things-only-in-b things-in-both].\nComparison rules:\n\n* For equal a and b, return [nil nil a].\n* Maps are subdiffed where keys match and values differ.\n* Sets are never subdiffed.\n* All sequential things are treated as associative collections\n  by their indexes, with results returned as vectors.\n* Everything else (including strings!) is treated as\n  an atom and compared for equality.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read"
  {:ns "cljs.reader",
   :name "read",
   :signature ["[reader eof-is-error sentinel is-recursive]"],
   :type "function",
   :full-name "cljs.reader/read",
   :docstring
   "Reads the first object from a PushbackReader. Returns the object read.\nIf EOF, throws if eof-is-error is true. Otherwise returns sentinel.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*out*"
  {:ns "cljs.pprint",
   :name "*out*",
   :type "dynamic var",
   :full-name "cljs.pprint/*out*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "eduction"
  {:ns "cljs.core",
   :name "eduction",
   :signature ["[xform* coll]"],
   :type "function",
   :full-name "cljs.core/eduction",
   :docstring
   "Returns a reducible/iterable application of the transducers\nto the items in coll. Transducers are applied in order as if\ncombined with comp. Note that these applications will be\nperformed every time reduce/iterator is called.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-miser-width*"
  {:ns "cljs.pprint",
   :name "*print-miser-width*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-miser-width*",
   :docstring
   "The column at which to enter miser style. Depending on the dispatch table,\nmiser style add newlines in more places to try to keep lines short allowing for further\nlevels of nesting.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rhino-setup"
  {:ns "cljs.repl.rhino",
   :name "rhino-setup",
   :signature ["[repl-env opts]"],
   :type "function",
   :full-name "cljs.repl.rhino/rhino-setup",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pprint-tab"
  {:ns "cljs.pprint",
   :name "pprint-tab",
   :signature ["[kind colnum colinc]"],
   :type "function",
   :full-name "cljs.pprint/pprint-tab",
   :docstring
   "Tab at this point in the pretty printing stream. kind specifies whether the tab\nis :line, :section, :line-relative, or :section-relative.\n\nColnum and colinc specify the target column and the increment to move the target\nforward if the output is already past the original target.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.\n\nTHIS FUNCTION IS NOT YET IMPLEMENTED.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "last-index-of"
  {:ns "clojure.string",
   :name "last-index-of",
   :signature ["[s value]" "[s value from-index]"],
   :type "function",
   :full-name "clojure.string/last-index-of",
   :docstring
   "Return last index of value (string or char) in s, optionally\nsearching backward from from-index or nil if not found.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "root"
  {:ns "clojure.zip",
   :name "root",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/root",
   :docstring
   "zips all the way up and returns the root node, reflecting any\nchanges.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ChunkBuffer"
  {:ns "cljs.core",
   :name "ChunkBuffer",
   :signature ["[buf end]"],
   :type "type",
   :full-name "cljs.core/ChunkBuffer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "with-meta"
  {:description
   "Returns an object of the same type and value as `obj`, with map `m` as its\nmetadata.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a &#94;:foo &#91;1 2 3&#93;&#41;\n&#40;def b &#40;with-meta a {:bar true}&#41;&#41;\n\n&#40;= a b&#41;\n;;=&gt; true\n\n&#40;meta a&#41;\n;;=&gt; {:foo true}\n\n&#40;meta b&#41;\n;;=&gt; {:bar true}\n</code></pre>"],
   :ns "cljs.core",
   :name "with-meta",
   :signature ["[obj m]"],
   :type "function",
   :related ["cljs.core/alter-meta!" "cljs.core/vary-meta"],
   :examples-strings
   [[["(def a ^:foo [1 2 3])"
      "(def b (with-meta a {:bar true}))"
      "(= a b) ;;=> true"
      "(meta a) ;;=> {:foo true}"
      "(meta b) ;;=> {:bar true}"]]],
   :description-html
   "<p>Returns an object of the same type and value as <code>obj</code>, with map <code>m</code> as its metadata.</p>",
   :examples
   [{:id "f189d4",
     :content
     "```clj\n(def a ^:foo [1 2 3])\n(def b (with-meta a {:bar true}))\n\n(= a b)\n;;=> true\n\n(meta a)\n;;=> {:foo true}\n\n(meta b)\n;;=> {:bar true}\n```"}],
   :full-name "cljs.core/with-meta",
   :docstring
   "Returns an object of the same type and value as obj, with\nmap m as its metadata."},
  "insert-at"
  {:ns "clojure.browser.dom",
   :name "insert-at",
   :signature ["[parent child index]"],
   :type "function",
   :full-name "clojure.browser.dom/insert-at",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "catch"
  {:description
   "`catch` should be used inside of a `try` expression.\n\n`exception-type` should be the type of exception thrown (usually `js/Error` or\n`js/Object`). When there is a match, the thrown exception will be bound to\n`name` inside of `expr*` and `expr*` will be evaluated and returned as the value\nof the `try` expression.\n\nSince JavaScript allows you to throw anything, `exception-type` can be set to\n`:default` to catch all types of exceptions.",
   :examples-htmls [],
   :ns "special",
   :name "catch",
   :signature ["[exception-type name expr*]"],
   :type "special form",
   :related ["special/try" "special/finally" "special/throw"],
   :examples-strings [],
   :description-html
   "<p><code>catch</code> should be used inside of a <code>try</code> expression.</p><p><code>exception-type</code> should be the type of exception thrown (usually <code>js/Error</code> or <code>js/Object</code>). When there is a match, the thrown exception will be bound to <code>name</code> inside of <code>expr&#42;</code> and <code>expr&#42;</code> will be evaluated and returned as the value of the <code>try</code> expression.</p><p>Since JavaScript allows you to throw anything, <code>exception-type</code> can be set to <code>:default</code> to catch all types of exceptions.</p>",
   :full-name "special/catch",
   :docstring
   "catch-clause => (catch classname name expr*)\nfinally-clause => (finally expr*)\nCatches and handles JavaScript exceptions."},
  "prn-str-with-opts"
  {:ns "cljs.core",
   :name "prn-str-with-opts",
   :signature ["[objs opts]"],
   :type "function",
   :full-name "cljs.core/prn-str-with-opts",
   :docstring "Same as pr-str-with-opts followed by (newline)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "send-repl-client-page"
  {:ns "cljs.repl.browser",
   :name "send-repl-client-page",
   :signature ["[request conn opts]"],
   :type "function",
   :full-name "cljs.repl.browser/send-repl-client-page",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "aclone"
  {:description
   "Creates a clone of the given JavaScript array `arr`.  The result is a new\nJavaScript array, which is a shallow copy, not a deep copy.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n&#40;def b &#40;aclone a&#41;&#41;\n&#40;aset b 0 4&#41;\n\na\n;;=&gt; #js &#91;1 2 3&#93;\n\nb\n;;=&gt; #js &#91;4 2 3&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "aclone",
   :signature ["[arr]"],
   :type "function",
   :related ["cljs.core/array" "cljs.core/make-array"],
   :examples-strings
   [[["(def a #js [1 2 3])"
      "(def b (aclone a))"
      "(aset b 0 4)"
      "a ;;=> #js [1 2 3]"
      "b ;;=> #js [4 2 3]"]]],
   :description-html
   "<p>Creates a clone of the given JavaScript array <code>arr</code>.  The result is a new JavaScript array, which is a shallow copy, not a deep copy.</p>",
   :examples
   [{:id "422c4e",
     :content
     "```clj\n(def a #js [1 2 3])\n(def b (aclone a))\n(aset b 0 4)\n\na\n;;=> #js [1 2 3]\n\nb\n;;=> #js [4 2 3]\n```"}],
   :full-name "cljs.core/aclone",
   :docstring
   "Returns a javascript array, cloned from the passed in array"},
  "async?"
  {:ns "cljs.test",
   :name "async?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.test/async?",
   :docstring "Returns whether x implements IAsyncTest.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unquote-splicing"
  {:description
   "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nIntended for use inside a [doc:syntax/syntax-quote].\n\nForces evaluation of the following form and expands its children into the\nparent form.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def foo '&#91;a b c&#93;&#41;\n`&#40;&#126;@foo&#41;\n;;=&gt; &#40;a b c&#41;\n</code></pre>"],
   :ns "syntax",
   :name "unquote-splicing",
   :type "syntax",
   :related ["syntax/syntax-quote" "syntax/unquote"],
   :examples-strings
   [[["(def foo '[a b c])" "`(~@foo) ;;=> (a b c)"]]],
   :description-html
   "<p>(Only intended for use in Clojure macros, which can be used from but not written in ClojureScript.)</p><p>Intended for use inside a [doc:syntax/syntax-quote].</p><p>Forces evaluation of the following form and expands its children into the parent form.</p>",
   :examples
   [{:id "e6f73d",
     :content
     "```clj\n(def foo '[a b c])\n`(~@foo)\n;;=> (a b c)\n```"}],
   :full-name "syntax/unquote-splicing"},
  "empty-env"
  {:ns "cljs.test",
   :name "empty-env",
   :signature ["[]" "[reporter]"],
   :type "function",
   :full-name "cljs.test/empty-env",
   :docstring
   "Generates a testing environment with a reporter.\n(empty-env) - uses the :cljs.test/default reporter.\n(empty-env :cljs.test/pprint) - pretty prints all data structures. \n(empty-env reporter) - uses a reporter of your choosing.\n\nTo create your own reporter see cljs.test/report",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "block"
  {:ns "cljs.test",
   :name "block",
   :signature ["[fns]"],
   :type "function",
   :full-name "cljs.test/block",
   :docstring
   "Tag a seq of fns to be picked up by run-block as injected\ncontinuation.  See run-block.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "take"
  {:ns "clojure.core.reducers",
   :name "take",
   :signature ["[n]" "[n coll]"],
   :type "function",
   :full-name "clojure.core.reducers/take",
   :docstring "Ends the reduction of coll after consuming n values.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "start-server"
  {:ns "cljs.repl.browser",
   :name "start-server",
   :signature ["[opts]"],
   :type "function",
   :full-name "cljs.repl.browser/start-server",
   :docstring "Start the server on the specified port.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ValSeq"
  {:ns "cljs.core",
   :name "ValSeq",
   :signature ["[mseq _meta]"],
   :type "type",
   :full-name "cljs.core/ValSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "EventType"
  {:ns "clojure.browser.event",
   :name "EventType",
   :type "protocol",
   :full-name "clojure.browser.event/EventType",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-length-loop"
  {:ns "cljs.pprint",
   :name "print-length-loop",
   :signature ["[bindings & body]"],
   :type "macro",
   :full-name "cljs.pprint/print-length-loop",
   :docstring
   "A version of loop that iterates at most *print-length* times. This is designed\nfor use in pretty-printer dispatch functions.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ITransientSet"
  {:ns "cljs.core",
   :name "ITransientSet",
   :type "protocol",
   :full-name "cljs.core/ITransientSet",
   :docstring
   "Protocol for adding set functionality to a transient collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rest"
  {:description
   "A concept for binding the rest of the values of some sequence to a name.  See\n[doc:syntax/destructure-vector] or [doc:cljs.core/fn] for exact usage details in their\nrespective contexts.",
   :ns "syntax",
   :name "rest",
   :type "special character",
   :examples
   [{:id "ebd356",
     :content
     "Binding `c` to the rest of the function arguments:\n\n```clj\n(defn foo\n  [a b & c]\n  c)\n(foo 1 2 3 4)\n;;=> (3 4)\n```\n\nBinding `c` to the rest of the destructured values:\n\n```clj\n(let [[a b & c]\n      [1 2 3 4]]\n  c)\n;;=> (3 4)\n```"}],
   :full-name "syntax/rest",
   :description-html
   "<p>A concept for binding the rest of the values of some sequence to a name.  See [doc:syntax/destructure-vector] or [doc:cljs.core/fn] for exact usage details in their respective contexts.</p>",
   :examples-strings
   [[["(defn foo" "  [a b & c]" "  c)" "(foo 1 2 3 4) ;;=> (3 4)"]
     ["(let [[a b & c]" "      [1 2 3 4]]" "  c) ;;=> (3 4)"]]],
   :examples-htmls
   ["<p>Binding <code>c</code> to the rest of the function arguments:</p><pre><code class=\"clj\">&#40;defn foo\n  &#91;a b &amp; c&#93;\n  c&#41;\n&#40;foo 1 2 3 4&#41;\n;;=&gt; &#40;3 4&#41;\n</code></pre><p>Binding <code>c</code> to the rest of the destructured values:</p><pre><code class=\"clj\">&#40;let &#91;&#91;a b &amp; c&#93;\n      &#91;1 2 3 4&#93;&#93;\n  c&#41;\n;;=&gt; &#40;3 4&#41;\n</code></pre>"]},
  "unsafe-cast"
  {:ns "cljs.core",
   :name "unsafe-cast",
   :signature ["[t x]"],
   :type "macro",
   :full-name "cljs.core/unsafe-cast",
   :docstring
   "EXPERIMENTAL: Subject to change. Unsafely cast a value to a different type.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pprint-newline"
  {:ns "cljs.pprint",
   :name "pprint-newline",
   :signature ["[kind]"],
   :type "function",
   :full-name "cljs.pprint/pprint-newline",
   :docstring
   "Print a conditional newline to a pretty printing stream. kind specifies if the\nnewline is :linear, :miser, :fill, or :mandatory.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-base*"
  {:ns "cljs.pprint",
   :name "*print-base*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-base*",
   :docstring "The base to use for printing integers and rationals.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "identical?"
  {:description
   "Returns true if `x` and `y` are the same object, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "identical?",
   :signature ["[x y]"],
   :type "function/macro",
   :related ["cljs.core/=" "cljs.core/=="],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> and <code>y</code> are the same object, false otherwise.</p>",
   :full-name "cljs.core/identical?",
   :docstring "Tests if 2 arguments are the same object"},
  "PushbackReader"
  {:ns "cljs.reader",
   :name "PushbackReader",
   :type "protocol",
   :full-name "cljs.reader/PushbackReader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns->relpath"
  {:ns "cljs.js",
   :name "ns->relpath",
   :signature ["[ns-sym]"],
   :type "function",
   :full-name "cljs.js/ns->relpath",
   :docstring
   "Given a namespace as a symbol return the relative path sans extension",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "volatile?"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "volatile?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/volatile!"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/volatile?",
   :docstring "Returns true if x is a volatile."},
  "reduce-kv"
  {:description
   "Reduces an associative collection.\n\n`f` should be a function of 3 arguments. Returns the result of applying `f` to\n`init`, the first key and the first value in `coll`, then applying `f` to that\nresult and the 2nd key and value, etc.\n\nIf `coll` contains no entries, returns `init` and `f` is not called.\n\nNote that `reduce-kv` is supported on vectors, where the keys will be the\nordinals.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "reduce-kv",
   :signature ["[f init coll]"],
   :type "function",
   :related ["cljs.core/reduce"],
   :examples-strings [],
   :description-html
   "<p>Reduces an associative collection.</p><p><code>f</code> should be a function of 3 arguments. Returns the result of applying <code>f</code> to <code>init</code>, the first key and the first value in <code>coll</code>, then applying <code>f</code> to that result and the 2nd key and value, etc.</p><p>If <code>coll</code> contains no entries, returns <code>init</code> and <code>f</code> is not called.</p><p>Note that <code>reduce-kv</code> is supported on vectors, where the keys will be the ordinals.</p>",
   :full-name "cljs.core/reduce-kv",
   :docstring
   "Reduces an associative collection. f should be a function of 3\narguments. Returns the result of applying f to init, the first key\nand the first value in coll, then applying f to that result and the\n2nd key and value, etc. If coll contains no entries, returns init\nand f is not called. Note that reduce-kv is supported on vectors,\nwhere the keys will be the ordinals."},
  "key->js"
  {:ns "cljs.core",
   :name "key->js",
   :signature ["[k]"],
   :type "function",
   :full-name "cljs.core/key->js",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "merge-with"
  {:description
   "Returns a map that consists of the rest of the maps `conj`-ed onto the first.\n\nIf a key occurs in more than one map, the mapping(s) from the latter (left-to-\nright) will be combined with the mapping in the result by calling `(f val-in-\nresult val-in-latter)`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "merge-with",
   :signature ["[f & maps]"],
   :type "function",
   :related ["cljs.core/merge"],
   :examples-strings [],
   :description-html
   "<p>Returns a map that consists of the rest of the maps <code>conj</code>-ed onto the first.</p><p>If a key occurs in more than one map, the mapping(s) from the latter (left-to- right) will be combined with the mapping in the result by calling `(f val-in- result val-in-latter)`.</p>",
   :full-name "cljs.core/merge-with",
   :docstring
   "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping(s)\nfrom the latter (left-to-right) will be combined with the mapping in\nthe result by calling (f val-in-result val-in-latter)."},
  "count"
  {:description
   "Returns the number of items in `x`.\n\n`count` works on arrays, lists, maps, sets, strings, and vectors.\n\n`(count nil)` returns 0.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;count &#91;1 2 3&#93;&#41;\n;;=&gt; 3\n\n&#40;count &#91;&#93;&#41;\n;;=&gt; 0\n\n&#40;count nil&#41;\n;;=&gt; 0\n\n&#40;count #{:a :b}&#41;\n;;=&gt; 2\n\n&#40;count {:key &quot;value&quot; :key2 &quot;value2&quot;}&#41;\n;;=&gt; 2\n</code></pre>"],
   :ns "cljs.core",
   :name "count",
   :signature ["[x]"],
   :type "function",
   :examples-strings
   [[["(count [1 2 3]) ;;=> 3"
      "(count []) ;;=> 0"
      "(count nil) ;;=> 0"
      "(count #{:a :b}) ;;=> 2"
      "(count {:key \"value\" :key2 \"value2\"}) ;;=> 2"]]],
   :description-html
   "<p>Returns the number of items in <code>x</code>.</p><p><code>count</code> works on arrays, lists, maps, sets, strings, and vectors.</p><p><code>&#40;count nil&#41;</code> returns 0.</p>",
   :examples
   [{:id "96e470",
     :content
     "```clj\n(count [1 2 3])\n;;=> 3\n\n(count [])\n;;=> 0\n\n(count nil)\n;;=> 0\n\n(count #{:a :b})\n;;=> 2\n\n(count {:key \"value\" :key2 \"value2\"})\n;;=> 2\n```"}],
   :full-name "cljs.core/count",
   :docstring
   "Returns the number of items in the collection. (count nil) returns\n0.  Also works on strings, arrays, and Maps"},
  "find-macros-ns"
  {:ns "cljs.core",
   :name "find-macros-ns",
   :signature ["[ns]"],
   :type "function",
   :full-name "cljs.core/find-macros-ns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "persistent-array-map-seq"
  {:ns "cljs.core",
   :name "persistent-array-map-seq",
   :signature ["[arr i _meta]"],
   :type "function",
   :full-name "cljs.core/persistent-array-map-seq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "update"
  {:ns "cljs.core",
   :name "update",
   :signature
   ["[m k f]"
    "[m k f x]"
    "[m k f x y]"
    "[m k f x y z]"
    "[m k f x y z & more]"],
   :type "function",
   :full-name "cljs.core/update",
   :docstring
   "'Updates' a value in an associative structure, where k is a\nkey and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nstructure.  If the key does not exist, nil is passed as the old value.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-float"
  {:ns "cljs.core",
   :name "unchecked-float",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-float",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "derive"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "derive",
   :signature ["[tag parent]" "[h tag parent]"],
   :type "function",
   :related
   ["cljs.core/ancestors"
    "cljs.core/descendants"
    "cljs.core/isa?"
    "cljs.core/make-hierarchy"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/derive",
   :docstring
   "Establishes a parent/child relationship between parent and\ntag. Parent must be a namespace-qualified symbol or keyword and\nchild can be either a namespace-qualified symbol or keyword or a\nclass. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy."},
  "dorun"
  {:description
   "Forces evaluation of a lazy sequence. Often used to see the effects of a\nsequence produced via functions that have side effects.\n\n`dorun` walks through the successive `next`s of the sequence and returns nil.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "dorun",
   :signature ["[coll]" "[n coll]"],
   :type "function",
   :related ["cljs.core/doall"],
   :examples-strings [],
   :description-html
   "<p>Forces evaluation of a lazy sequence. Often used to see the effects of a sequence produced via functions that have side effects.</p><p><code>dorun</code> walks through the successive <code>next</code>s of the sequence and returns nil.</p>",
   :full-name "cljs.core/dorun",
   :docstring
   "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. dorun can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, does not retain the head and returns nil."},
  "ns-resolve"
  {:ns "cljs.analyzer.api",
   :name "ns-resolve",
   :signature ["[ns sym]" "[state ns sym]"],
   :type "function",
   :full-name "cljs.analyzer.api/ns-resolve",
   :docstring
   "Given a namespace and a symbol return the corresponding var analysis map.\nAnalagous to clojure.core/ns-resolve but returns var analysis map not Var.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parse-file"
  {:ns "cljs.repl.browser",
   :name "parse-file",
   :signature
   ["[{:keys [host host-port port], :as repl-env} file {:keys [asset-path], :as opts}]"],
   :type "function",
   :full-name "cljs.repl.browser/parse-file",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "empty?"
  {:description
   "Returns true if `coll` has no items - same as `(not (seq coll))`.\n\nPlease use the idiom `(seq x)` rather than `(not (empty? x))`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "empty?",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/seq"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>coll</code> has no items - same as <code>&#40;not &#40;seq coll&#41;&#41;</code>.</p><p>Please use the idiom <code>&#40;seq x&#41;</code> rather than <code>&#40;not &#40;empty? x&#41;&#41;</code>.</p>",
   :full-name "cljs.core/empty?",
   :docstring
   "Returns true if coll has no items - same as (not (seq coll)).\nPlease use the idiom (seq x) rather than (not (empty? x))"},
  "file-and-line"
  {:ns "cljs.test",
   :name "file-and-line",
   :signature ["[exception depth]"],
   :type "function",
   :full-name "cljs.test/file-and-line",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "short"
  {:ns "cljs.core",
   :name "short",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/short",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "to-array"
  {:ns "cljs.core",
   :name "to-array",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.core/to-array",
   :docstring "Naive impl of to-array as a start.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "getf"
  {:ns "cljs.pprint",
   :name "getf",
   :signature ["[sym]"],
   :type "macro",
   :full-name "cljs.pprint/getf",
   :docstring
   "Get the value of the field a named by the argument (which should be a keyword).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "merge-require"
  {:ns "cljs.repl",
   :name "merge-require",
   :signature ["[requires [lib :as spec]]"],
   :type "function",
   :full-name "cljs.repl/merge-require",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "letfn*"
  {:ns "special",
   :name "letfn*",
   :type "special form",
   :full-name "special/letfn*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array?"
  {:description
   "Returns true if `x` is a JavaScript array, false otherwise.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;array? #js &#91;1 2 3&#93;&#41;\n;;=&gt; true\n\n&#40;array? &#91;1 2 3&#93;&#41;\n;;=&gt; false\n\n&#40;array? &quot;hi&quot;&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "array?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/object?"],
   :examples-strings
   [[["(array? #js [1 2 3]) ;;=> true"
      "(array? [1 2 3]) ;;=> false"
      "(array? \"hi\") ;;=> false"]]],
   :description-html
   "<p>Returns true if <code>x</code> is a JavaScript array, false otherwise.</p>",
   :examples
   [{:id "39913c",
     :content
     "```clj\n(array? #js [1 2 3])\n;;=> true\n\n(array? [1 2 3])\n;;=> false\n\n(array? \"hi\")\n;;=> false\n```"}],
   :full-name "cljs.core/array?",
   :docstring "Returns true if x is a JavaScript array."},
  "ordering"
  {:ns "cljs.repl.browser",
   :name "ordering",
   :type "dynamic var",
   :full-name "cljs.repl.browser/ordering",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "shebang"
  {:description
   "Equivalent to [doc:syntax/comment].\n\nThis is intended to allow executable ClojureScript files under Unix by allowing\nthe first line of the file to have a [shebang line](https://en.wikipedia.org/wiki/Shebang_(Unix)).",
   :ns "syntax",
   :name "shebang",
   :type "syntax",
   :examples
   [{:id "de569a",
     :content
     "```clj\n#!/bin/cljs\n;; waits for another form since #!/bin/cljs was ignored.\n\n123 #! this is ignored\n;;=> 123\n```"}],
   :full-name "syntax/shebang",
   :description-html
   "<p>Equivalent to [doc:syntax/comment].</p><p>This is intended to allow executable ClojureScript files under Unix by allowing the first line of the file to have a <a href='https://en.wikipedia.org/wiki/Shebang_(Unix'>shebang line</a>).</p>",
   :examples-strings
   [[["#!/bin/cljs ;; waits for another form since #!/bin/cljs was ignored."
      "123 #! this is ignored ;;=> 123"]]],
   :examples-htmls
   ["<pre><code class=\"clj\">#!/bin/cljs\n;; waits for another form since #!/bin/cljs was ignored.\n\n123 #! this is ignored\n;;=&gt; 123\n</code></pre>"]},
  "xhr-connection"
  {:ns "clojure.browser.net",
   :name "xhr-connection",
   :signature ["[]"],
   :type "function",
   :full-name "clojure.browser.net/xhr-connection",
   :docstring "Returns an XhrIo connection",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cons"
  {:description
   "Returns a new sequence where `x` is the first element and `coll` is the rest.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;cons 1 &#40;list 1 2 3&#41;&#41;\n;;=&gt; &#40;1 1 2 3&#41;\n\n&#40;cons 1 &#91;1 2 3&#93;&#41;\n;;=&gt; &#40;1 1 2 3&#41;\n\n&#40;cons 1 nil&#41;\n;;=&gt; &#40;1&#41;\n\n&#40;cons nil nil&#41;\n;;=&gt; &#40;nil&#41;\n</code></pre>"],
   :ns "cljs.core",
   :name "cons",
   :signature ["[x coll]"],
   :type "function",
   :related ["cljs.core/conj"],
   :examples-strings
   [[["(cons 1 (list 1 2 3)) ;;=> (1 1 2 3)"
      "(cons 1 [1 2 3]) ;;=> (1 1 2 3)"
      "(cons 1 nil) ;;=> (1)"
      "(cons nil nil) ;;=> (nil)"]]],
   :description-html
   "<p>Returns a new sequence where <code>x</code> is the first element and <code>coll</code> is the rest.</p>",
   :examples
   [{:id "68c769",
     :content
     "```clj\n(cons 1 (list 1 2 3))\n;;=> (1 1 2 3)\n\n(cons 1 [1 2 3])\n;;=> (1 1 2 3)\n\n(cons 1 nil)\n;;=> (1)\n\n(cons nil nil)\n;;=> (nil)\n```"}],
   :full-name "cljs.core/cons",
   :docstring
   "Returns a new seq where x is the first element and seq is the rest."},
  "EqualityPartition"
  {:ns "clojure.data",
   :name "EqualityPartition",
   :type "protocol",
   :full-name "clojure.data/EqualityPartition",
   :docstring "Implementation detail. Subject to change.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "swap!"
  {:description
   "Atomically swaps the value of atom to be: `(apply f current-value-of-atom\nargs)`\n\nNote that `f` may be called multiple times, and thus should be free of side\neffects.\n\nReturns the value that was swapped in.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "swap!",
   :signature ["[a f]" "[a f x]" "[a f x y]" "[a f x y & more]"],
   :type "function",
   :related ["cljs.core/atom" "cljs.core/reset!"],
   :examples-strings [],
   :description-html
   "<p>Atomically swaps the value of atom to be: `(apply f current-value-of-atom args)`</p><p>Note that <code>f</code> may be called multiple times, and thus should be free of side effects.</p><p>Returns the value that was swapped in.</p>",
   :full-name "cljs.core/swap!",
   :docstring
   "Atomically swaps the value of atom to be:\n(apply f current-value-of-atom args). Note that f may be called\nmultiple times, and thus should be free of side effects.  Returns\nthe value that was swapped in."},
  "rand-int"
  {:description
   "Returns a random integer between 0 inclusive and `n` exclusive.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "rand-int",
   :signature ["[n]"],
   :type "function",
   :related ["cljs.core/rand"],
   :examples-strings [],
   :description-html
   "<p>Returns a random integer between 0 inclusive and <code>n</code> exclusive.</p>",
   :full-name "cljs.core/rand-int",
   :docstring
   "Returns a random integer between 0 (inclusive) and n (exclusive)."},
  "read-4-chars"
  {:ns "cljs.reader",
   :name "read-4-chars",
   :signature ["[reader]"],
   :type "function",
   :full-name "cljs.reader/read-4-chars",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "hash-keyword"
  {:ns "cljs.core",
   :name "hash-keyword",
   :signature ["[k]"],
   :type "function",
   :full-name "cljs.core/hash-keyword",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "watch"
  {:ns "cljs.build.api",
   :name "watch",
   :signature
   ["[source opts]"
    "[source opts compiler-env]"
    "[source opts compiler-env stop]"],
   :type "function",
   :full-name "cljs.build.api/watch",
   :docstring
   "Given a source which can be compiled, watch it for changes to produce.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IParseStacktrace"
  {:ns "cljs.repl",
   :name "IParseStacktrace",
   :type "protocol",
   :full-name "cljs.repl/IParseStacktrace",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "sort"
  {:description
   "Returns a sorted sequence of the items in `coll`.\n\n`comp` can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.\n\n`comp` defaults to `compare`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sort",
   :signature ["[coll]" "[comp coll]"],
   :type "function",
   :related ["cljs.core/sort-by"],
   :examples-strings [],
   :description-html
   "<p>Returns a sorted sequence of the items in <code>coll</code>.</p><p><code>comp</code> can be a boolean-valued comparison funcion, or a -/0/+ valued comparator.</p><p><code>comp</code> defaults to <code>compare</code>.</p>",
   :full-name "cljs.core/sort",
   :docstring
   "Returns a sorted sequence of the items in coll. Comp can be\nboolean-valued comparison function, or a -/0/+ valued comparator.\nComp defaults to compare."},
  "IPending"
  {:ns "cljs.core",
   :name "IPending",
   :type "protocol",
   :full-name "cljs.core/IPending",
   :docstring
   "Protocol for types which can have a deferred realization. Currently only\n  implemented by Delay.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IReduce"
  {:ns "cljs.core",
   :name "IReduce",
   :type "protocol",
   :full-name "cljs.core/IReduce",
   :docstring
   "Protocol for seq types that can reduce themselves.\n  Called by cljs.core/reduce.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "re-seq"
  {:description
   "Returns a lazy sequence of successive matches of regex `re` in string `s`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "re-seq",
   :signature ["[re s]"],
   :type "function",
   :related
   ["cljs.core/re-find"
    "cljs.core/re-pattern"
    "cljs.core/re-matches"
    "cljs.core/subs"
    "clojure.string/split"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of successive matches of regex <code>re</code> in string <code>s</code>.</p>",
   :full-name "cljs.core/re-seq",
   :docstring
   "Returns a lazy sequence of successive matches of re in s."},
  "iterator"
  {:ns "cljs.core",
   :name "iterator",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "re-find"
  {:description
   "Returns the first regex match, if any, of `s` to `re`, using `re.exec(s)`.\n\nReturns a vector, containing first the matching substring, then any capturing\ngroups if the regular expression contains capturing groups.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "re-find",
   :signature ["[re s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns the first regex match, if any, of <code>s</code> to <code>re</code>, using <code>re.exec&#40;s&#41;</code>.</p><p>Returns a vector, containing first the matching substring, then any capturing groups if the regular expression contains capturing groups.</p>",
   :full-name "cljs.core/re-find",
   :docstring
   "Returns the first regex match, if any, of s to re, using\nre.exec(s). Returns a vector, containing first the matching\nsubstring, then any capturing groups if the regular expression contains\ncapturing groups."},
  "log"
  {:ns "clojure.browser.dom",
   :name "log",
   :signature ["[& args]"],
   :type "function",
   :full-name "clojure.browser.dom/log",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "not-any?"
  {:description
   "Returns false if `(pred x)` is logical true for any `x` in `coll`, else true.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "not-any?",
   :signature ["[pred coll]"],
   :type "function",
   :related ["cljs.core/every?" "cljs.core/some"],
   :examples-strings [],
   :description-html
   "<p>Returns false if <code>&#40;pred x&#41;</code> is logical true for any <code>x</code> in <code>coll</code>, else true.</p>",
   :full-name "cljs.core/not-any?",
   :docstring
   "Returns false if (pred x) is logical true for any x in coll,\nelse true."},
  "async"
  {:ns "cljs.test",
   :name "async",
   :signature ["[done & body]"],
   :type "macro",
   :full-name "cljs.test/async",
   :docstring
   "Wraps body as a CPS function that can be returned from a test to\ncontinue asynchronously.  Binds done to a function that must be\ninvoked once and from an async context after any assertions.\n\n(deftest example-with-timeout\n  (async done\n    (js/setTimeout (fn []\n                     ;; make assertions in async context...\n                     (done) ;; ...then call done\n                     )\n                   0)))",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "escape-char-map"
  {:ns "cljs.reader",
   :name "escape-char-map",
   :signature ["[c]"],
   :type "function",
   :full-name "cljs.reader/escape-char-map",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "SetEntriesIterator"
  {:ns "cljs.core",
   :name "SetEntriesIterator",
   :signature ["[s]"],
   :type "type",
   :full-name "cljs.core/SetEntriesIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentTreeSet.EMPTY"
  {:ns "cljs.core",
   :name "PersistentTreeSet.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentTreeSet.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ES6EntriesIterator"
  {:ns "cljs.core",
   :name "ES6EntriesIterator",
   :signature ["[s]"],
   :type "type",
   :full-name "cljs.core/ES6EntriesIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "apply"
  {:description
   "Applies function `f` to the argument list formed by prepending intervening\narguments to `args`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;max 1 2 3&#41;\n;;=&gt; 3\n\n&#40;apply max &#91;1 2 3&#93;&#41;\n;;=&gt; 3\n\n&#40;apply max 1 &#91;2 3&#93;&#41;\n;;=&gt; 3\n</code></pre>"],
   :ns "cljs.core",
   :name "apply",
   :signature
   ["[f args]"
    "[f x args]"
    "[f x y args]"
    "[f x y z args]"
    "[f a b c d & args]"],
   :type "function",
   :related ["cljs.core/map"],
   :examples-strings
   [[["(max 1 2 3) ;;=> 3"
      "(apply max [1 2 3]) ;;=> 3"
      "(apply max 1 [2 3]) ;;=> 3"]]],
   :description-html
   "<p>Applies function <code>f</code> to the argument list formed by prepending intervening arguments to <code>args</code>.</p>",
   :examples
   [{:id "174052",
     :content
     "```clj\n(max 1 2 3)\n;;=> 3\n\n(apply max [1 2 3])\n;;=> 3\n\n(apply max 1 [2 3])\n;;=> 3\n```"}],
   :full-name "cljs.core/apply",
   :docstring
   "Applies fn f to the argument list formed by prepending intervening arguments to args."},
  "frequencies"
  {:description
   "Returns a map from distinct items in `coll` to the number of times they appear.\n\n`(frequencies [:a :a :b])` => `{:a 2, :b 1}`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "frequencies",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/group-by" "cljs.core/distinct"],
   :examples-strings [],
   :description-html
   "<p>Returns a map from distinct items in <code>coll</code> to the number of times they appear.</p><p><code>&#40;frequencies &#91;:a :a :b&#93;&#41;</code> => <code>{:a 2, :b 1}</code></p>",
   :full-name "cljs.core/frequencies",
   :docstring
   "Returns a map from distinct items in coll to the number of times\nthey appear."},
  "memfn"
  {:ns "cljs.core",
   :name "memfn",
   :signature ["[name & args]"],
   :type "macro",
   :full-name "cljs.core/memfn",
   :docstring
   "Expands into code that creates a fn that expects to be passed an\nobject and any args and calls the named instance method on the\nobject passing the args. Use when you want to treat a Java method as\na first-class fn. name may be type-hinted with the method receiver's\ntype in order to avoid reflective calls.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array-index-of"
  {:ns "cljs.core",
   :name "array-index-of",
   :signature ["[arr k]"],
   :type "function",
   :full-name "cljs.core/array-index-of",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ifn?"
  {:description
   "Returns true if `f` implements the `IFn` protocol, false otherwise.\n\nFunctions, keywords, map, sets, and vectors can be called as functions.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "ifn?",
   :signature ["[f]"],
   :type "function",
   :related ["cljs.core/fn?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>f</code> implements the <code>IFn</code> protocol, false otherwise.</p><p>Functions, keywords, map, sets, and vectors can be called as functions.</p>",
   :full-name "cljs.core/ifn?",
   :docstring
   "Returns true if f returns true for fn? or satisfies IFn."},
  "ILookup"
  {:ns "cljs.core",
   :name "ILookup",
   :type "protocol",
   :full-name "cljs.core/ILookup",
   :docstring "Protocol for looking up a value in a data structure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*load-fn*"
  {:ns "cljs.js",
   :name "*load-fn*",
   :type "dynamic var",
   :full-name "cljs.js/*load-fn*",
   :docstring
   "Each runtime environment provides a different way to load a library.\nWhatever function *load-fn* is bound to will be passed two arguments - a\nmap and a callback function: The map will have the following keys:\n\n:name   - the name of the library (a symbol)\n:macros - modifier signaling a macros namespace load\n:path   - munged relative library path (a string)\n\nIt is up to the implementor to correctly resolve the corresponding .cljs,\n.cljc, or .js resource (the order must be respected). If :macros is true\nresolution should only consider .clj or .cljc resources (the order must be\nrespected). Upon resolution the callback should be invoked with a map\ncontaining the following keys:\n\n:lang       - the language, :clj or :js\n:source     - the source of the library (a string)\n:cache      - optional, if a :clj namespace has been precompiled to :js, can\n              give an analysis cache for faster loads.\n:source-map - optional, if a :clj namespace has been precompiled to :js, can\n              give a V3 source map JSON\n\nIf the resource could not be resolved, the callback should be invoked with\nnil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ArrayIter"
  {:ns "cljs.core",
   :name "ArrayIter",
   :signature ["[arr i]"],
   :type "type",
   :full-name "cljs.core/ArrayIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "partition-by"
  {:description
   "Applies `f` to each value in `coll`, splitting it each time `f` returns a new\nvalue. Returns a lazy sequence of partitions.\n\nReturns a stateful transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "partition-by",
   :signature ["[f]" "[f coll]"],
   :type "function",
   :related
   ["cljs.core/partition"
    "cljs.core/partition-all"
    "cljs.core/group-by"],
   :examples-strings [],
   :description-html
   "<p>Applies <code>f</code> to each value in <code>coll</code>, splitting it each time <code>f</code> returns a new value. Returns a lazy sequence of partitions.</p><p>Returns a stateful transducer when no collection is provided.</p>",
   :full-name "cljs.core/partition-by",
   :docstring
   "Applies f to each value in coll, splitting it each time f returns a\nnew value.  Returns a lazy seq of partitions.  Returns a stateful\ntransducer when no collection is provided."},
  "join-fixtures"
  {:ns "cljs.test",
   :name "join-fixtures",
   :signature ["[fixtures]"],
   :type "function",
   :full-name "cljs.test/join-fixtures",
   :docstring
   "Composes a collection of fixtures, in order.  Always returns a valid\nfixture function, even if the collection is empty.\n\nNOTE: Incompatible with map fixtures.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ChunkedCons"
  {:ns "cljs.core",
   :name "ChunkedCons",
   :signature ["[chunk more meta __hash]"],
   :type "type",
   :full-name "cljs.core/ChunkedCons",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "some?"
  {:description "Returns true if `x` is not nil, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "some?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/true?" "cljs.core/nil?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is not nil, false otherwise.</p>",
   :full-name "cljs.core/some?",
   :docstring "Returns true if x is not nil, false otherwise."},
  "rem"
  {:description
   "Returns the remainder of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).",
   :examples-htmls [],
   :ns "cljs.core",
   :name "rem",
   :signature ["[n d]"],
   :type "function",
   :related ["cljs.core/quot" "cljs.core/mod"],
   :examples-strings [],
   :description-html
   "<p>Returns the remainder of dividing numerator <code>n</code> by denominator <code>d</code>.</p><p>Returns <code>NaN</code> when <code>d</code> is 0 (divide by 0 error).</p>",
   :full-name "cljs.core/rem",
   :docstring "remainder of dividing numerator by denominator."},
  "*print-err-fn*"
  {:ns "cljs.core",
   :name "*print-err-fn*",
   :type "dynamic var",
   :full-name "cljs.core/*print-err-fn*",
   :docstring
   "Each runtime environment provides a different way to print error output.\nWhatever function *print-fn* is bound to will be passed any\nStrings which should be printed.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "areduce"
  {:description
   "For quickly reducing an expression `expr` across a JavaScript array `a`.  The\nexpression can use `ret` as the current result, which is initialized to `init`.\nIt can also use `idx` to get the current index.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n&#40;areduce a i ret 0 &#40;+ ret &#40;aget a i&#41;&#41;&#41;\n;;=&gt; 6\n</code></pre>"],
   :ns "cljs.core",
   :name "areduce",
   :signature ["[a idx ret init expr]"],
   :type "macro",
   :related ["cljs.core/reduce"],
   :examples-strings
   [[["(def a #js [1 2 3])"
      "(areduce a i ret 0 (+ ret (aget a i))) ;;=> 6"]]],
   :description-html
   "<p>For quickly reducing an expression <code>expr</code> across a JavaScript array <code>a</code>.  The expression can use <code>ret</code> as the current result, which is initialized to <code>init</code>. It can also use <code>idx</code> to get the current index.</p>",
   :examples
   [{:id "20a389",
     :content
     "```clj\n(def a #js [1 2 3])\n(areduce a i ret 0 (+ ret (aget a i)))\n;;=> 6\n```"}],
   :full-name "cljs.core/areduce",
   :docstring
   "Reduces an expression across an array a, using an index named idx,\nand return value named ret, initialized to init, setting ret to the\nevaluation of expr at each step, returning ret."},
  "stop-server"
  {:ns "cljs.repl.browser",
   :name "stop-server",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl.browser/stop-server",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "transient"
  {:ns "cljs.core",
   :name "transient",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/transient",
   :docstring
   "Returns a new, transient version of the collection, in constant time.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*1"
  {:description
   "Only usable from a REPL.\n\nHolds the result of the last expression.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;+ 1 2 3 4&#41;\n;;=&gt; 10\n\n&#42;1\n;;=&gt; 10\n\n&#40;inc &#42;1&#41;\n;;=&gt; 11\n</code></pre><p>Note that a standalone evaluation of <code>&#42;1</code>, <code>&#42;2</code>, <code>&#42;3</code>, or <code>&#42;e</code> is not a part of remembered history:</p><pre><code class=\"clj\">:first\n;;=&gt; :first\n\n:second\n;;=&gt; :second\n\n:third\n;;=&gt; :third\n\n&#42;3\n;;=&gt; :first\n\n&#42;2\n;;=&gt; :second\n\n&#42;1\n;;=&gt; :third\n</code></pre>"],
   :ns "cljs.core",
   :name "*1",
   :type "var",
   :related ["cljs.core/*2" "cljs.core/*3" "cljs.core/*e"],
   :examples-strings
   [[["(+ 1 2 3 4) ;;=> 10" "*1 ;;=> 10" "(inc *1) ;;=> 11"]
     [":first ;;=> :first"
      ":second ;;=> :second"
      ":third ;;=> :third"
      "*3 ;;=> :first"
      "*2 ;;=> :second"
      "*1 ;;=> :third"]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>Holds the result of the last expression.</p>",
   :examples
   [{:id "30a861",
     :content
     "```clj\n(+ 1 2 3 4)\n;;=> 10\n\n*1\n;;=> 10\n\n(inc *1)\n;;=> 11\n```\n\nNote that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of\nremembered history:\n\n```clj\n:first\n;;=> :first\n\n:second\n;;=> :second\n\n:third\n;;=> :third\n\n*3\n;;=> :first\n\n*2\n;;=> :second\n\n*1\n;;=> :third\n```"}],
   :full-name "cljs.core/*1",
   :docstring
   "bound in a repl thread to the most recent value printed"},
  "sorted-map"
  {:description
   "Returns a new sorted map with supplied mappings.\n\n`keyvals` must be an even number of forms.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sorted-map",
   :signature ["[& keyvals]"],
   :type "function",
   :related
   ["cljs.core/sorted-map-by"
    "cljs.core/subseq"
    "cljs.core/rsubseq"
    "cljs.core/sorted-set"
    "cljs.core/array-map"
    "cljs.core/hash-map"],
   :examples-strings [],
   :description-html
   "<p>Returns a new sorted map with supplied mappings.</p><p><code>keyvals</code> must be an even number of forms.</p>",
   :full-name "cljs.core/sorted-map",
   :docstring
   "keyval => key val\nReturns a new sorted map with supplied mappings."},
  "analyze"
  {:ns "cljs.analyzer.api",
   :name "analyze",
   :signature
   ["[env form]"
    "[env form name]"
    "[env form name opts]"
    "[state env form name opts]"],
   :type "function",
   :full-name "cljs.analyzer.api/analyze",
   :docstring
   "Given an environment, a map containing {:locals (mapping of names to bindings), :context\n(one of :statement, :expr, :return), :ns (a symbol naming the\ncompilation ns)}, and form, returns an expression object (a map\ncontaining at least :form, :op and :env keys). If expr has any (immediately)\nnested exprs, must have :children [exprs...] entry. This will\nfacilitate code walking without knowing the details of the op set.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ES6Iterator"
  {:ns "cljs.core",
   :name "ES6Iterator",
   :signature ["[s]"],
   :type "type",
   :full-name "cljs.core/ES6Iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Range"
  {:ns "cljs.core",
   :name "Range",
   :signature ["[meta start end step __hash]"],
   :type "type",
   :full-name "cljs.core/Range",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-mapped-stacktrace"
  {:ns "cljs.repl",
   :name "print-mapped-stacktrace",
   :signature ["[stacktrace]" "[stacktrace opts]"],
   :type "function",
   :full-name "cljs.repl/print-mapped-stacktrace",
   :docstring
   "Given a vector representing the canonicalized JavaScript stacktrace\nprint the ClojureScript stacktrace. See mapped-stacktrace.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "eval-resource"
  {:ns "cljs.repl.nashorn",
   :name "eval-resource",
   :signature ["[engine path debug]"],
   :type "function",
   :full-name "cljs.repl.nashorn/eval-resource",
   :docstring "Evaluate a file on the classpath in the engine.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "subset?"
  {:description
   "Returns true if `a` is a subset of `b`, false otherwise.\n\nIn other words, returns true if all the elements of `a` can be found in `b`.",
   :examples-htmls [],
   :ns "clojure.set",
   :name "subset?",
   :signature ["[a b]"],
   :type "function",
   :related ["cljs.core/set" "cljs.core/set?" "clojure.set/superset?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>a</code> is a subset of <code>b</code>, false otherwise.</p><p>In other words, returns true if all the elements of <code>a</code> can be found in <code>b</code>.</p>",
   :full-name "clojure.set/subset?",
   :docstring "Is set1 a subset of set2?"},
  "escape"
  {:description
   "Return a new string, using `cmap` to escape each character `ch` from `s` as follows:\n\nIf `(cmap ch)` is nil, append ch to the new string.\n\nIf `(cmap ch)` is non-nil, append `(str (cmap ch))` instead.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "escape",
   :signature ["[s cmap]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Return a new string, using <code>cmap</code> to escape each character <code>ch</code> from <code>s</code> as follows:</p><p>If <code>&#40;cmap ch&#41;</code> is nil, append ch to the new string.</p><p>If <code>&#40;cmap ch&#41;</code> is non-nil, append <code>&#40;str &#40;cmap ch&#41;&#41;</code> instead.</p>",
   :full-name "clojure.string/escape",
   :docstring
   "Return a new string, using cmap to escape each character ch\nfrom s as follows:\n\nIf (cmap ch) is nil, append ch to the new string.\nIf (cmap ch) is non-nil, append (str (cmap ch)) instead."},
  "skip-whitespace"
  {:ns "cljs.repl",
   :name "skip-whitespace",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.repl/skip-whitespace",
   :docstring
   "Skips whitespace characters on stream s. Returns :line-start, :stream-end,\nor :body to indicate the relative location of the next character on s.\nInterprets comma as whitespace and semicolon as comment to end of line.\nDoes not interpret #! as comment to end of line because only one\ncharacter of lookahead is available. The stream must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF to a single\n\\newline.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentQueueSeq"
  {:ns "cljs.core",
   :name "PersistentQueueSeq",
   :signature ["[meta front rear __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentQueueSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "completing"
  {:ns "cljs.core",
   :name "completing",
   :signature ["[f]" "[f cf]"],
   :type "function",
   :full-name "cljs.core/completing",
   :docstring
   "Takes a reducing function f of 2 args and returns a fn suitable for\ntransduce by adding an arity-1 signature that calls cf (default -\nidentity) on the result argument.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Box"
  {:ns "cljs.core",
   :name "Box",
   :signature ["[val]"],
   :type "type",
   :full-name "cljs.core/Box",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "element"
  {:ns "clojure.browser.dom",
   :name "element",
   :signature ["[tag-or-text]" "[tag & children]"],
   :type "function",
   :full-name "clojure.browser.dom/element",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "distinct"
  {:description
   "Returns a lazy sequence of the elements of `coll` with duplicates removed.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "distinct",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/distinct?"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of the elements of <code>coll</code> with duplicates removed.</p>",
   :full-name "cljs.core/distinct",
   :docstring
   "Returns a lazy sequence of the elements of coll with duplicates removed.\nReturns a stateful transducer when no collection is provided."},
  "chunk"
  {:ns "cljs.core",
   :name "chunk",
   :signature ["[b]"],
   :type "function",
   :full-name "cljs.core/chunk",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-js-index"
  {:ns "cljs.analyzer.api",
   :name "get-js-index",
   :signature ["[]" "[state]"],
   :type "function",
   :full-name "cljs.analyzer.api/get-js-index",
   :docstring
   "Return the currently computed Google Closure js dependency index from the\ncompiler state.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "symbol-identical?"
  {:ns "cljs.core",
   :name "symbol-identical?",
   :signature ["[x y]"],
   :type "function",
   :full-name "cljs.core/symbol-identical?",
   :docstring
   "Efficient test to determine that two symbol are identical.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ends-with?"
  {:ns "clojure.string",
   :name "ends-with?",
   :signature ["[s substr]"],
   :type "function",
   :full-name "clojure.string/ends-with?",
   :docstring "True if s ends with substr.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "in-ns"
  {:description
   "Only usable from a REPL.\n\nChanges to the namespace `name`, creating it if needed.\n\nSets `*cljs-ns*` to the namespace `name`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;in-ns 'foo.core&#41;\n</code></pre>"],
   :ns "specialrepl",
   :name "in-ns",
   :signature ["[name]"],
   :type "special form (repl)",
   :examples-strings [[["(in-ns 'foo.core)"]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>Changes to the namespace <code>name</code>, creating it if needed.</p><p>Sets <code>&#42;cljs-ns&#42;</code> to the namespace <code>name</code>.</p>",
   :examples
   [{:id "e81eb3", :content "```clj\n(in-ns 'foo.core)\n```"}],
   :full-name "specialrepl/in-ns",
   :docstring
   "Sets *cljs-ns* to the namespace named by the symbol, creating it if needed."},
  "ISequential"
  {:ns "cljs.core",
   :name "ISequential",
   :type "protocol",
   :full-name "cljs.core/ISequential",
   :docstring
   "Marker interface indicating a persistent collection of sequential items",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "es6-iterator-seq"
  {:ns "cljs.core",
   :name "es6-iterator-seq",
   :signature ["[iter]"],
   :type "function",
   :full-name "cljs.core/es6-iterator-seq",
   :docstring
   "EXPERIMENTAL: Given an ES2015 compatible iterator return a seq.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentQueue.EMPTY"
  {:ns "cljs.core",
   :name "PersistentQueue.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentQueue.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IWebSocket"
  {:ns "clojure.browser.net",
   :name "IWebSocket",
   :type "protocol",
   :full-name "clojure.browser.net/IWebSocket",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parents"
  {:ns "cljs.core",
   :name "parents",
   :signature ["[tag]" "[h tag]"],
   :type "function",
   :full-name "cljs.core/parents",
   :docstring
   "Returns the immediate parents of tag, either via a JavaScript type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMap.fromArray"
  {:ns "cljs.core",
   :name "PersistentArrayMap.fromArray",
   :signature ["[arr no-clone no-check]"],
   :type "function",
   :full-name "cljs.core/PersistentArrayMap.fromArray",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Infinity"
  {:description
   "The IEEE 754 Floating Point representations of infinity.\n\n`Infinity` = `+Infinity` = positive infinity\n\n`-Infinity` = negative infinity",
   :examples-htmls
   ["<pre><code class=\"clj\">Infinity\n;;=&gt; Infinity\n\n+Infinity\n;;=&gt; Infinity\n\n-Infinity\n;;=&gt; -Infinity\n</code></pre><p>Math with infinities:</p><pre><code class=\"clj\">&#40;/ 1 0&#41;\n;;=&gt; Infinity\n\n&#40;Math/log 0&#41;\n;;=&gt; -Infinity\n\n&#40;&#42; 0 Infinity&#41;\n;;=&gt; NaN\n</code></pre><p>They are equivalent to the JavaScript symbols:</p><pre><code class=\"clj\">js/Infinity\n;;=&gt; Infinity\n\njs/-Infinity\n;;=&gt; -Infinity\n</code></pre>"],
   :ns "syntax",
   :name "Infinity",
   :type "special symbol",
   :related ["syntax/number" "syntax/NaN"],
   :examples-strings
   [[["Infinity ;;=> Infinity"
      "+Infinity ;;=> Infinity"
      "-Infinity ;;=> -Infinity"]
     ["(/ 1 0) ;;=> Infinity"
      "(Math/log 0) ;;=> -Infinity"
      "(* 0 Infinity) ;;=> NaN"]
     ["js/Infinity ;;=> Infinity" "js/-Infinity ;;=> -Infinity"]]],
   :description-html
   "<p>The IEEE 754 Floating Point representations of infinity.</p><p><code>Infinity</code> = <code>+Infinity</code> = positive infinity</p><p><code>-Infinity</code> = negative infinity</p>",
   :examples
   [{:id "463fd4",
     :content
     "```clj\nInfinity\n;;=> Infinity\n\n+Infinity\n;;=> Infinity\n\n-Infinity\n;;=> -Infinity\n```\n\nMath with infinities:\n\n```clj\n(/ 1 0)\n;;=> Infinity\n\n(Math/log 0)\n;;=> -Infinity\n\n(* 0 Infinity)\n;;=> NaN\n```\n\nThey are equivalent to the JavaScript symbols:\n\n```clj\njs/Infinity\n;;=> Infinity\n\njs/-Infinity\n;;=> -Infinity\n```"}],
   :full-name "syntax/Infinity"},
  "chrome-st-el->frame"
  {:ns "cljs.repl.browser",
   :name "chrome-st-el->frame",
   :signature ["[repl-env st-el opts]"],
   :type "function",
   :full-name "cljs.repl.browser/chrome-st-el->frame",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-and"
  {:description "Bitwise \"and\".  Same as `x & y` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-and 2r1100 2r1010&#41;\n;;=&gt; 8\n;; 8 = 2r1000\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-and 12 10&#41;\n;;=&gt; 8\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-and",
   :signature ["[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/bit-or"],
   :examples-strings
   [[["(bit-and 2r1100 2r1010) ;;=> 8 ;; 8 = 2r1000"]
     ["(bit-and 12 10) ;;=> 8"]]],
   :description-html
   "<p>Bitwise \"and\".  Same as <code>x &amp; y</code> in JavaScript.</p>",
   :examples
   [{:id "3c0470",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-and 2r1100 2r1010)\n;;=> 8\n;; 8 = 2r1000\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and 12 10)\n;;=> 8\n```"}],
   :full-name "cljs.core/bit-and",
   :docstring "Bitwise and"},
  "name"
  {:description
   "Returns the name string of a possibly namespace-qualified keyword or symbol.\n\nEquivalent to [doc:cljs.core/identity] for strings.",
   :examples-htmls
   ["<p>With namespaces:</p><pre><code class=\"clj\">&#40;name :foo/bar&#41;\n;;=&gt; &quot;bar&quot;\n\n&#40;name 'foo/bar&#41;\n;;=&gt; &quot;bar&quot;\n</code></pre><p>Without namespaces:</p><pre><code class=\"clj\">&#40;name :foo&#41;\n;;=&gt; &quot;foo&quot;\n\n&#40;name 'foo&#41;\n;;=&gt; &quot;foo&quot;\n</code></pre><p>Strings have no concept of a namespace:</p><pre><code class=\"clj\">&#40;name &quot;foo/bar&quot;&#41;\n;;=&gt; &quot;foo/bar&quot;\n\n&#40;name &quot;foo&quot;&#41;\n;;=&gt; &quot;foo&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "name",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/namespace"],
   :examples-strings
   [[["(name :foo/bar) ;;=> \"bar\"" "(name 'foo/bar) ;;=> \"bar\""]
     ["(name :foo) ;;=> \"foo\"" "(name 'foo) ;;=> \"foo\""]
     ["(name \"foo/bar\") ;;=> \"foo/bar\""
      "(name \"foo\") ;;=> \"foo\""]]],
   :description-html
   "<p>Returns the name string of a possibly namespace-qualified keyword or symbol.</p><p>Equivalent to [doc:cljs.core/identity] for strings.</p>",
   :examples
   [{:id "363fb7",
     :content
     "With namespaces:\n\n```clj\n(name :foo/bar)\n;;=> \"bar\"\n\n(name 'foo/bar)\n;;=> \"bar\"\n```\n\nWithout namespaces:\n\n```clj\n(name :foo)\n;;=> \"foo\"\n\n(name 'foo)\n;;=> \"foo\"\n```\n\nStrings have no concept of a namespace:\n\n```clj\n(name \"foo/bar\")\n;;=> \"foo/bar\"\n\n(name \"foo\")\n;;=> \"foo\"\n```"}],
   :full-name "cljs.core/name",
   :docstring
   "Returns the name String of a string, symbol or keyword."},
  "nil?"
  {:description "Returns true if `x` is nil, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "nil?",
   :signature ["[x]"],
   :type "function/macro",
   :related
   ["cljs.core/true?" "cljs.core/false?" "cljs.core/identity"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is nil, false otherwise.</p>",
   :full-name "cljs.core/nil?",
   :docstring "Returns true if x is nil, false otherwise."},
  "unchecked-add-int"
  {:ns "cljs.core",
   :name "unchecked-add-int",
   :signature ["[]" "[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-add-int",
   :docstring "Returns the sum of nums. (+) returns 0.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "connection"
  {:ns "cljs.repl.server",
   :name "connection",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl.server/connection",
   :docstring
   "Promise to return a connection when one is available. If a\nconnection is not available, store the promise in server/state.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "chunk-buffer"
  {:ns "cljs.core",
   :name "chunk-buffer",
   :signature ["[capacity]"],
   :type "function",
   :full-name "cljs.core/chunk-buffer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "record?"
  {:ns "cljs.core",
   :name "record?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/record?",
   :docstring "Return true if x satisfies IRecord",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "spec-sort"
  {:ns "cljs.repl",
   :name "spec-sort",
   :type "var",
   :full-name "cljs.repl/spec-sort",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "-main"
  {:ns "cljs.repl.node",
   :name "-main",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl.node/-main",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "underive"
  {:ns "cljs.core",
   :name "underive",
   :signature ["[tag parent]" "[h tag parent]"],
   :type "function",
   :full-name "cljs.core/underive",
   :docstring
   "Removes a parent/child relationship between parent and\ntag. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns->source"
  {:ns "cljs.build.api",
   :name "ns->source",
   :signature ["[ns]"],
   :type "function",
   :full-name "cljs.build.api/ns->source",
   :docstring
   "Given a namespace as a symbol return the corresponding resource if it exists.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-dec"
  {:ns "cljs.core",
   :name "unchecked-dec",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-dec",
   :docstring "Returns a number one less than x, an int.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-and-not"
  {:description
   "Bitwise \"and\" `x` with bitwise \"not\" `y`.  Same as `x & ~y` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-and-not 2r1100 2r1010&#41;\n;;=&gt; 4\n;; 4 = 2r0100\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-and-not 12 10&#41;\n;;=&gt; 4\n</code></pre><p>Same result using <code>bit-and</code> and <code>bit-not</code>:</p><pre><code class=\"clj\">&#40;bit-and 12 &#40;bit-not 10&#41;&#41;\n;;=&gt; 4\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-and-not",
   :signature ["[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/bit-and" "cljs.core/bit-not"],
   :examples-strings
   [[["(bit-and-not 2r1100 2r1010) ;;=> 4 ;; 4 = 2r0100"]
     ["(bit-and-not 12 10) ;;=> 4"]
     ["(bit-and 12 (bit-not 10)) ;;=> 4"]]],
   :description-html
   "<p>Bitwise \"and\" <code>x</code> with bitwise \"not\" <code>y</code>.  Same as <code>x &amp; &#126;y</code> in JavaScript.</p>",
   :examples
   [{:id "16f35d",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-and-not 2r1100 2r1010)\n;;=> 4\n;; 4 = 2r0100\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-and-not 12 10)\n;;=> 4\n```\n\nSame result using `bit-and` and `bit-not`:\n\n```clj\n(bit-and 12 (bit-not 10))\n;;=> 4\n```"}],
   :full-name "cljs.core/bit-and-not",
   :docstring "Bitwise and"},
  "pst"
  {:description
   "Print Stack Trace for a given exception `e` or the most recent\nexception, stored implicitly by [doc:cljs.core/*e].",
   :ns "cljs.repl",
   :name "pst",
   :signature ["[e]"],
   :type "macro",
   :full-name "cljs.repl/pst",
   :description-html
   "<p>Print Stack Trace for a given exception <code>e</code> or the most recent exception, stored implicitly by [doc:cljs.core/*e].</p>",
   :examples-strings [],
   :examples-htmls []},
  "index-of"
  {:ns "clojure.string",
   :name "index-of",
   :signature ["[s value]" "[s value from-index]"],
   :type "function",
   :full-name "clojure.string/index-of",
   :docstring
   "Return index of value (string or char) in s, optionally searching\nforward from from-index or nil if not found.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "map-indexed"
  {:description
   "Returns a lazy sequence consisting of the result of applying `f` to 0 and the\nfirst item of `coll`, followed by applying `f` to 1 and the second item in\n`coll`, etc, until `coll` is exhausted.\n\nFunction `f` should accept 2 arguments, index and item.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "map-indexed",
   :signature ["[f coll]"],
   :type "function",
   :related ["cljs.core/map" "cljs.core/keep-indexed"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence consisting of the result of applying <code>f</code> to 0 and the first item of <code>coll</code>, followed by applying <code>f</code> to 1 and the second item in <code>coll</code>, etc, until <code>coll</code> is exhausted.</p><p>Function <code>f</code> should accept 2 arguments, index and item.</p>",
   :full-name "cljs.core/map-indexed",
   :docstring
   "Returns a lazy sequence consisting of the result of applying f to 0\nand the first item of coll, followed by applying f to 1 and the second\nitem in coll, etc, until coll is exhausted. Thus function f should\naccept 2 arguments, index and item. Returns a stateful transducer when\nno collection is provided."},
  "macroexpand-1"
  {:description
   "(only intended as a REPL utility)\n\nIf the given quoted form is a macro call, expand it once. NOTE: subforms are\n_not_ expanded.\n\nSee [doc:cljs.core/macroexpand] if you wish to repeatedly expand a form.",
   :examples-htmls
   ["<p>See how <code>&#40;-&gt; 2 inc&#41;</code> is progressively expanded:</p><pre><code class=\"clj\">&#40;macroexpand-1 '&#40;-&gt; 2 inc&#41;&#41;\n;;=&gt; &#40;inc 2&#41;\n\n&#40;macroexpand-1 '&#40;inc 2&#41;&#41;\n;;=&gt; &#40;cljs.core/+ 2 1&#41;\n\n&#40;macroexpand-1 '&#40;cljs.core/+ 2 1&#41;&#41;\n;;=&gt; &#40;js&#42; &quot;&#40;&#126;{} + &#126;{}&#41;&quot; 2 1&#41;\n</code></pre><p>Notice how the nested <code>inc</code> form is not expanded:</p><pre><code class=\"clj\">&#40;macroexpand-1 '&#40;inc &#40;inc 2&#41;&#41;&#41;\n;;=&gt; &#40;cljs.core/+ &#40;inc 2&#41; 1&#41;\n</code></pre>"],
   :ns "cljs.core",
   :name "macroexpand-1",
   :signature ["[quoted]"],
   :type "macro",
   :related ["cljs.core/macroexpand" "cljs.core/defmacro"],
   :examples-strings
   [[["(macroexpand-1 '(-> 2 inc)) ;;=> (inc 2)"
      "(macroexpand-1 '(inc 2)) ;;=> (cljs.core/+ 2 1)"
      "(macroexpand-1 '(cljs.core/+ 2 1)) ;;=> (js* \"(~{} + ~{})\" 2 1)"]
     ["(macroexpand-1 '(inc (inc 2))) ;;=> (cljs.core/+ (inc 2) 1)"]]],
   :description-html
   "<p>(only intended as a REPL utility)</p><p>If the given quoted form is a macro call, expand it once. NOTE: subforms are <i>not</i> expanded.</p><p>See [doc:cljs.core/macroexpand] if you wish to repeatedly expand a form.</p>",
   :examples
   [{:id "1bc6af",
     :content
     "See how `(-> 2 inc)` is progressively expanded:\n\n```clj\n(macroexpand-1 '(-> 2 inc))\n;;=> (inc 2)\n\n(macroexpand-1 '(inc 2))\n;;=> (cljs.core/+ 2 1)\n\n(macroexpand-1 '(cljs.core/+ 2 1))\n;;=> (js* \"(~{} + ~{})\" 2 1)\n```\n\nNotice how the nested `inc` form is not expanded:\n\n```clj\n(macroexpand-1 '(inc (inc 2)))\n;;=> (cljs.core/+ (inc 2) 1)\n```"}],
   :full-name "cljs.core/macroexpand-1",
   :docstring
   "If form represents a macro form, returns its expansion,\nelse returns form."},
  "syntax-quote"
  {:description
   "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nPrevent evaluation of the following form.\n\nAdds namespace-qualification to any symbols inside the following form by\nresolving them in the current context.\n\nAny non-namespaced symbols ending with `#` are replaced with unique symbols.\nSee [doc:syntax/auto-gensym].",
   :examples-htmls
   ["<pre><code class=\"clj\">`foo\n;;=&gt; cljs.user/foo\n\n`foo#\n;;=&gt; foo&#95;&#95;20418&#95;&#95;auto&#95;&#95;\n\n`&#40;def foo 1&#41;\n;;=&gt; &#40;def cljs.user/foo 1&#41;\n</code></pre>"],
   :ns "syntax",
   :name "syntax-quote",
   :type "syntax",
   :related
   ["syntax/auto-gensym"
    "syntax/quote"
    "syntax/unquote"
    "syntax/unquote-splicing"],
   :examples-strings
   [[["`foo ;;=> cljs.user/foo"
      "`foo# ;;=> foo__20418__auto__"
      "`(def foo 1) ;;=> (def cljs.user/foo 1)"]]],
   :description-html
   "<p>(Only intended for use in Clojure macros, which can be used from but not written in ClojureScript.)</p><p>Prevent evaluation of the following form.</p><p>Adds namespace-qualification to any symbols inside the following form by resolving them in the current context.</p><p>Any non-namespaced symbols ending with <code>#</code> are replaced with unique symbols. See [doc:syntax/auto-gensym].</p>",
   :examples
   [{:id "bffbdf",
     :content
     "```clj\n`foo\n;;=> cljs.user/foo\n\n`foo#\n;;=> foo__20418__auto__\n\n`(def foo 1)\n;;=> (def cljs.user/foo 1)\n```"}],
   :full-name "syntax/syntax-quote"},
  "ChunkedSeq"
  {:ns "cljs.core",
   :name "ChunkedSeq",
   :signature ["[vec node i off meta __hash]"],
   :type "type",
   :full-name "cljs.core/ChunkedSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "triml"
  {:description "Removes whitespace from the left side of string.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "triml",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Removes whitespace from the left side of string.</p>",
   :full-name "clojure.string/triml",
   :docstring "Removes whitespace from the left side of string."},
  "unreduced"
  {:ns "cljs.core",
   :name "unreduced",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/unreduced",
   :docstring "If x is reduced?, returns (deref x), else returns x",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "split-at"
  {:description "Returns a vector of `[(take n coll) (drop n coll)]`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "split-at",
   :signature ["[n coll]"],
   :type "function",
   :related ["cljs.core/split-with" "clojure.string/split"],
   :examples-strings [],
   :description-html
   "<p>Returns a vector of <code>&#91;&#40;take n coll&#41; &#40;drop n coll&#41;&#93;</code>.</p>",
   :full-name "cljs.core/split-at",
   :docstring "Returns a vector of [(take n coll) (drop n coll)]"},
  "IReplEnvOptions"
  {:ns "cljs.repl",
   :name "IReplEnvOptions",
   :type "protocol",
   :full-name "cljs.repl/IReplEnvOptions",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "counted?"
  {:description
   "Returns true if `x` executes `count` in constant time, false otherwise.\n\nLists, maps, sets, strings, and vectors can be counted in constant time.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "counted?",
   :signature ["[x]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> executes <code>count</code> in constant time, false otherwise.</p><p>Lists, maps, sets, strings, and vectors can be counted in constant time.</p>",
   :full-name "cljs.core/counted?",
   :docstring
   "Returns true if coll implements count in constant time"},
  "replace"
  {:description
   "Replaces all instance of `match` with `replacement` in `s`.\n\nThe options for match / replacement are:\n\n| match  | replacement |\n|--------|-------------|\n| string | string      |\n| regex  | string      |\n| regex  | function    |",
   :examples-htmls [],
   :ns "clojure.string",
   :name "replace",
   :signature ["[s match replacement]"],
   :type "function",
   :related
   ["cljs.core/subs"
    "clojure.string/split"
    "clojure.string/replace-first"],
   :examples-strings [],
   :description-html
   "<p>Replaces all instance of <code>match</code> with <code>replacement</code> in <code>s</code>.</p><p>The options for match / replacement are:</p><p>| match  | replacement | |--------|-------------| | string | string      | | regex  | string      | | regex  | function    |</p>",
   :full-name "clojure.string/replace",
   :docstring
   "Replaces all instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."},
  "float?"
  {:ns "cljs.pprint",
   :name "float?",
   :signature ["[n]"],
   :type "function",
   :full-name "cljs.pprint/float?",
   :docstring "Returns true if n is an float.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-get"
  {:ns "cljs.repl.server",
   :name "read-get",
   :signature ["[line rdr]"],
   :type "function",
   :full-name "cljs.repl.server/read-get",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "associative?"
  {:description
   "Returns true if `coll` implements the `IAssociative` protocol, false otherwise.\n\nMaps and vectors are associative.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;associative? &#91;1 2 3&#93;&#41;\n;;=&gt; true\n\n&#40;associative? {:a 1 :b 2}&#41;\n;;=&gt; true\n\n&#40;associative? #{1 2 3}&#41;\n;;=&gt; false\n\n&#40;associative? '&#40;1 2 3&#41;&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "associative?",
   :signature ["[coll]"],
   :type "function",
   :examples-strings
   [[["(associative? [1 2 3]) ;;=> true"
      "(associative? {:a 1 :b 2}) ;;=> true"
      "(associative? #{1 2 3}) ;;=> false"
      "(associative? '(1 2 3)) ;;=> false"]]],
   :description-html
   "<p>Returns true if <code>coll</code> implements the <code>IAssociative</code> protocol, false otherwise.</p><p>Maps and vectors are associative.</p>",
   :examples
   [{:id "29a37f",
     :content
     "```clj\n(associative? [1 2 3])\n;;=> true\n\n(associative? {:a 1 :b 2})\n;;=> true\n\n(associative? #{1 2 3})\n;;=> false\n\n(associative? '(1 2 3))\n;;=> false\n```"}],
   :full-name "cljs.core/associative?",
   :docstring "Returns true if coll implements Associative"},
  "doubles"
  {:ns "cljs.core",
   :name "doubles",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/doubles",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test-ns-block"
  {:ns "cljs.test",
   :name "test-ns-block",
   :signature ["[env [quote ns :as form]]"],
   :type "macro",
   :full-name "cljs.test/test-ns-block",
   :docstring
   "Like test-ns, but returns a block for further composition and\nlater execution.  Does not clear the current env.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rightmost"
  {:ns "clojure.zip",
   :name "rightmost",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/rightmost",
   :docstring
   "Returns the loc of the rightmost sibling of the node at this loc, or self",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "uuid"
  {:description
   "Creates a universally unique identifier (UUID) from the given string, using the\n[doc:cljs.core/UUID] type.\n\nThe string has an expected format `8-4-4-12` where the numbers represent the\nnumber of hex digits.  No validation is performed.\n\nTo create a UUID literal (parsed and validated at compile time), use [doc:syntax/uuid-literal].",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;uuid &quot;00000000-0000-0000-0000-000000000000&quot;&#41;\n;;=&gt; #uuid &quot;00000000-0000-0000-0000-000000000000&quot;\n\n&#40;uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;&#41;\n;;=&gt; #uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;\n</code></pre><p>No validation is performed:</p><pre><code class=\"clj\">&#40;uuid &quot;&quot;&#41;\n;;=&gt; #uuid &quot;&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "uuid",
   :signature ["[s]"],
   :type "function",
   :related ["cljs.core/random-uuid" "syntax/uuid-literal"],
   :examples-strings
   [[["(uuid \"00000000-0000-0000-0000-000000000000\") ;;=> #uuid \"00000000-0000-0000-0000-000000000000\""
      "(uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\") ;;=> #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\""]
     ["(uuid \"\") ;;=> #uuid \"\""]]],
   :description-html
   "<p>Creates a universally unique identifier (UUID) from the given string, using the [doc:cljs.core/UUID] type.</p><p>The string has an expected format <code>8-4-4-12</code> where the numbers represent the number of hex digits.  No validation is performed.</p><p>To create a UUID literal (parsed and validated at compile time), use [doc:syntax/uuid-literal].</p>",
   :examples
   [{:id "d6491d",
     :content
     "```clj\n(uuid \"00000000-0000-0000-0000-000000000000\")\n;;=> #uuid \"00000000-0000-0000-0000-000000000000\"\n\n(uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\")\n;;=> #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\"\n```\n\nNo validation is performed:\n\n```clj\n(uuid \"\")\n;;=> #uuid \"\"\n```"}],
   :full-name "cljs.core/uuid"},
  "postwalk"
  {:ns "clojure.walk",
   :name "postwalk",
   :signature ["[f form]"],
   :type "function",
   :full-name "clojure.walk/postwalk",
   :docstring
   "Performs a depth-first, post-order traversal of form.  Calls f on\neach sub-form, uses f's return value in place of the original.\nRecognizes all Clojure data structures. Consumes seqs as with doall.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cond"
  {:description
   "`clauses` must be an even number of forms, ie: `(cond t1 e1, t2 e2, t3 e3)`.\nEach test `t` is evaluated one at a time. If a test returns logical true, `cond`\nevaluates and returns the corresponding expression `e` and does not evaluate any\nof the other tests or expressions.\n\nIt is idiomatic to provide a default case as the last test pair using the\nkeyword `:else` (a keyword always evaluates to logical true).\n\n`(cond)` returns nil.",
   :examples-htmls
   ["<pre><code>&#40;def a 42&#41;\n&#40;cond\n  &#40;&lt; a 10&#41; &quot;a is less than 10&quot;\n  &#40;= a 10&#41; &quot;a is 10&quot;\n  &#40;&gt; a 10&#41; &quot;a is bigger than 10&quot;\n  :else &quot;a is not a number!&quot;&#41;\n;;=&gt; &quot;a is bigger than 10&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "cond",
   :signature ["[& clauses]"],
   :type "macro",
   :related ["cljs.core/condp" "cljs.core/case" "special/if"],
   :examples-strings
   [[["(def a 42)"
      "(cond"
      "  (< a 10) \"a is less than 10\""
      "  (= a 10) \"a is 10\""
      "  (> a 10) \"a is bigger than 10\""
      "  :else \"a is not a number!\") ;;=> \"a is bigger than 10\""]]],
   :description-html
   "<p><code>clauses</code> must be an even number of forms, ie: <code>&#40;cond t1 e1, t2 e2, t3 e3&#41;</code>. Each test <code>t</code> is evaluated one at a time. If a test returns logical true, <code>cond</code> evaluates and returns the corresponding expression <code>e</code> and does not evaluate any of the other tests or expressions.</p><p>It is idiomatic to provide a default case as the last test pair using the keyword <code>:else</code> (a keyword always evaluates to logical true).</p><p><code>&#40;cond&#41;</code> returns nil.</p>",
   :examples
   [{:id "0cc9ac",
     :content
     "```\n(def a 42)\n(cond\n  (< a 10) \"a is less than 10\"\n  (= a 10) \"a is 10\"\n  (> a 10) \"a is bigger than 10\"\n  :else \"a is not a number!\")\n;;=> \"a is bigger than 10\"\n```"}],
   :full-name "cljs.core/cond",
   :docstring
   "Takes a set of test/expr pairs. It evaluates each test one at a\ntime.  If a test returns logical true, cond evaluates and returns\nthe value of the corresponding expr and doesn't evaluate any of the\nother tests or exprs. (cond) returns nil."},
  "realized?"
  {:description
   "Returns true if a value has been produced for a lazy sequence.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "realized?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/lazy-seq"],
   :examples-strings [],
   :description-html
   "<p>Returns true if a value has been produced for a lazy sequence.</p>",
   :full-name "cljs.core/realized?",
   :docstring
   "Returns true if a value has been produced for a delay or lazy sequence."},
  "*tag-table*"
  {:ns "cljs.reader",
   :name "*tag-table*",
   :type "dynamic var",
   :full-name "cljs.reader/*tag-table*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Fn"
  {:ns "cljs.core",
   :name "Fn",
   :type "protocol",
   :full-name "cljs.core/Fn",
   :docstring "Marker protocol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentVector.EMPTY"
  {:ns "cljs.core",
   :name "PersistentVector.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentVector.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "es6-entries-iterator"
  {:ns "cljs.core",
   :name "es6-entries-iterator",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/es6-entries-iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Diff"
  {:ns "clojure.data",
   :name "Diff",
   :type "protocol",
   :full-name "clojure.data/Diff",
   :docstring "Implementation detail. Subject to change.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ISorted"
  {:ns "cljs.core",
   :name "ISorted",
   :type "protocol",
   :full-name "cljs.core/ISorted",
   :docstring
   "Protocol for a collection which can represent their items\n  in a sorted manner. ",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "sequence"
  {:ns "cljs.core",
   :name "sequence",
   :signature ["[coll]" "[xform coll]" "[xform coll & colls]"],
   :type "function",
   :full-name "cljs.core/sequence",
   :docstring
   "Coerces coll to a (possibly empty) sequence, if it is not already\none. Will not force a lazy seq. (sequence nil) yields (), When a\ntransducer is supplied, returns a lazy sequence of applications of\nthe transform to the items in coll(s), i.e. to the set of first\nitems of each coll, followed by the set of second\nitems in each coll, until any one of the colls is exhausted.  Any\nremaining items in other colls are ignored. The transform should accept\nnumber-of-colls arguments",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "preloaded-libs"
  {:ns "cljs.repl.browser",
   :name "preloaded-libs",
   :type "var",
   :full-name "cljs.repl.browser/preloaded-libs",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-post"
  {:ns "cljs.repl.browser",
   :name "read-post",
   :signature ["[line rdr]"],
   :type "function",
   :full-name "cljs.repl.browser/read-post",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-value"
  {:ns "clojure.browser.dom",
   :name "set-value",
   :signature ["[e v]"],
   :type "function",
   :full-name "clojure.browser.dom/set-value",
   :docstring "Set the value property for an element.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "insert-child"
  {:ns "clojure.zip",
   :name "insert-child",
   :signature ["[loc item]"],
   :type "function",
   :full-name "clojure.zip/insert-child",
   :docstring
   "Inserts the item as the leftmost child of the node at this loc,\nwithout moving",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "blank?"
  {:description
   "True if `s` is nil, empty, or contains only whitespace.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "blank?",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>True if <code>s</code> is nil, empty, or contains only whitespace.</p>",
   :full-name "clojure.string/blank?",
   :docstring "True is s is nil, empty, or contains only whitespace."},
  "ISeq"
  {:ns "cljs.core",
   :name "ISeq",
   :type "protocol",
   :full-name "cljs.core/ISeq",
   :docstring
   "Protocol for collections to provide access to their items as sequences.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "stringify-keys"
  {:ns "clojure.walk",
   :name "stringify-keys",
   :signature ["[m]"],
   :type "function",
   :full-name "clojure.walk/stringify-keys",
   :docstring
   "Recursively transforms all map keys from keywords to strings.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "obj-map"
  {:ns "cljs.core",
   :name "obj-map",
   :signature ["[& keyvals]"],
   :type "function",
   :full-name "cljs.core/obj-map",
   :docstring
   "keyval => key val\nReturns a new object map with supplied mappings.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "listen"
  {:ns "clojure.browser.event",
   :name "listen",
   :signature ["[src type fn]" "[src type fn capture?]"],
   :type "function",
   :full-name "clojure.browser.event/listen",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "if"
  {:description
   "If `test` is not false or nil, `then` is evaluated and returned. Otherwise,\n`else?` is evaluated and returned. `else?` defaults to nil if not provided.\n\n`if` is one of ClojureScript's [special forms](http://clojure.org/special_forms)\nand is a fundamental building block of the language. All other conditionals in\nClojureScript are based on `if`s notion of truthiness (ie: anything other than\nfalse or nil).",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def v &#91;1 2&#93;&#41;\n\n&#40;if &#40;empty? v&#41; &quot;empty!&quot; &quot;filled!&quot;&#41;\n;;=&gt; &quot;filled!&quot;\n\n&#40;str &quot;This vector is &quot;\n  &#40;if &#40;empty? v&#41; &quot;empty!&quot; &quot;filled!&quot;&#41;&#41;\n;;=&gt; &quot;This vector is filled!&quot;\n</code></pre>"],
   :ns "special",
   :name "if",
   :signature ["[test then else?]"],
   :type "special form",
   :related
   ["cljs.core/cond"
    "cljs.core/when"
    "cljs.core/if-let"
    "cljs.core/if-not"],
   :examples-strings
   [[["(def v [1 2])"
      "(if (empty? v) \"empty!\" \"filled!\") ;;=> \"filled!\""
      "(str \"This vector is \""
      "  (if (empty? v) \"empty!\" \"filled!\")) ;;=> \"This vector is filled!\""]]],
   :description-html
   "<p>If <code>test</code> is not false or nil, <code>then</code> is evaluated and returned. Otherwise, <code>else?</code> is evaluated and returned. <code>else?</code> defaults to nil if not provided.</p><p><code>if</code> is one of ClojureScript's <a href='http://clojure.org/special_forms'>special forms</a> and is a fundamental building block of the language. All other conditionals in ClojureScript are based on <code>if</code>s notion of truthiness (ie: anything other than false or nil).</p>",
   :examples
   [{:id "e591ff",
     :content
     "```clj\n(def v [1 2])\n\n(if (empty? v) \"empty!\" \"filled!\")\n;;=> \"filled!\"\n\n(str \"This vector is \"\n  (if (empty? v) \"empty!\" \"filled!\"))\n;;=> \"This vector is filled!\"\n```"}],
   :full-name "special/if",
   :docstring
   "Evaluates test. If not the singular values nil or false,\nevaluates and yields then, otherwise, evaluates and yields else. If\nelse is not supplied it defaults to nil."},
  "read-number"
  {:ns "cljs.reader",
   :name "read-number",
   :signature ["[reader initch]"],
   :type "function",
   :full-name "cljs.reader/read-number",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "let"
  {:description
   "Binds expressions to symbols and makes those symbols available only within\n`body`.\n\n`bindings` should be a vector with an even number of forms, ie: `[a1 b1, a2 b2,\na3 b3]`. The first item in a pair (the `a`s) should be a symbol that is assigned\nthe evaluation of the second item (the `b`s). These symbols (the `a`s) are then\navailable within `body` (and not outside of `body`).\n\nAnother way to think about this is that the binding symbols in `let` are like\nlocal `def`s that are only available within `let`'s scope.\n\nIn addition to direct symbol binding, `let` supports a destructuring syntax to\n\"break apart\" collections into multiple symbols. This destructuring syntax is\nlike it's own [mini-language] and allows for succinct code.\n\n`let` is a wrapper over one of ClojureScript's [special forms] and is a\nfundamental building block of the language. Many macros rely on `let`s binding\nsyntax and scope rules.\n\n[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html\n[special forms]:http://clojure.org/special_forms",
   :examples-htmls [],
   :ns "cljs.core",
   :name "let",
   :signature ["[bindings & body]"],
   :type "macro",
   :related ["cljs.core/letfn" "cljs.core/if-let"],
   :examples-strings [],
   :description-html
   "<p>Binds expressions to symbols and makes those symbols available only within <code>body</code>.</p><p><code>bindings</code> should be a vector with an even number of forms, ie: `[a1 b1, a2 b2, a3 b3]<code>. The first item in a pair &#40;the </code>a`s) should be a symbol that is assigned the evaluation of the second item (the <code>b</code>s). These symbols (the <code>a</code>s) are then available within <code>body</code> (and not outside of <code>body</code>).</p><p>Another way to think about this is that the binding symbols in <code>let</code> are like local <code>def</code>s that are only available within <code>let</code>'s scope.</p><p>In addition to direct symbol binding, <code>let</code> supports a destructuring syntax to \"break apart\" collections into multiple symbols. This destructuring syntax is like it's own [mini-language] and allows for succinct code.</p><p><code>let</code> is a wrapper over one of ClojureScript's [special forms] and is a fundamental building block of the language. Many macros rely on <code>let</code>s binding syntax and scope rules.</p><p>[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html [special forms]:http://clojure.org/special_forms</p>",
   :full-name "cljs.core/let",
   :docstring
   "binding => binding-form init-expr\n\nEvaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein."},
  "ArrayNodeSeq"
  {:ns "cljs.core",
   :name "ArrayNodeSeq",
   :signature ["[meta nodes i s __hash]"],
   :type "type",
   :full-name "cljs.core/ArrayNodeSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "chunked-seq?"
  {:ns "cljs.core",
   :name "chunked-seq?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/chunked-seq?",
   :docstring "Return true if x is satisfies IChunkedSeq.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-radix*"
  {:ns "cljs.pprint",
   :name "*print-radix*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-radix*",
   :docstring
   "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,\nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the\nradix specifier is in the form #XXr where XX is the decimal value of *print-base* ",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "keyword-identical?"
  {:ns "cljs.core",
   :name "keyword-identical?",
   :signature ["[x y]"],
   :type "function",
   :full-name "cljs.core/keyword-identical?",
   :docstring
   "Efficient test to determine that two keywords are identical.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "drop"
  {:description
   "Returns a lazy sequence of all but the first `n` items in `coll`.\n\nReturns a stateful transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "drop",
   :signature ["[n]" "[n coll]"],
   :type "function",
   :related
   ["cljs.core/take"
    "cljs.core/drop-last"
    "cljs.core/drop-while"
    "cljs.core/nthnext"
    "cljs.core/nthrest"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of all but the first <code>n</code> items in <code>coll</code>.</p><p>Returns a stateful transducer when no collection is provided.</p>",
   :full-name "cljs.core/drop",
   :docstring
   "Returns a lazy sequence of all but the first n items in coll.\nReturns a stateful transducer when no collection is provided."},
  "js-invoke"
  {:description
   "Invoke JavaScript object `obj` method via string `s`. Needed when the string is\nnot a valid unquoted property name.",
   :examples-htmls
   ["<p>If we have a JavaScript object with an unusual property name:</p><pre><code class=\"js\">// JavaScript\nvar obj = {\n  &quot;my sum&quot;: function&#40;a,b&#41; { return a+b; }\n};\n</code></pre><p>We can invoke it from ClojureScript:</p><pre><code class=\"clj\">&#40;js-invoke js/obj &quot;my sum&quot; 1 2&#41;\n;=&gt; 3\n</code></pre>"],
   :ns "cljs.core",
   :name "js-invoke",
   :signature ["[obj s & args]"],
   :type "function",
   :examples-strings
   [[["// JavaScript"
      "var obj = {"
      "  \"my sum\": function(a,b) { return a+b; }"
      "};"]
     ["(js-invoke js/obj \"my sum\" 1 2) ;=> 3"]]],
   :description-html
   "<p>Invoke JavaScript object <code>obj</code> method via string <code>s</code>. Needed when the string is not a valid unquoted property name.</p>",
   :examples
   [{:id "373cce",
     :content
     "If we have a JavaScript object with an unusual property name:\n\n```js\n// JavaScript\nvar obj = {\n  \"my sum\": function(a,b) { return a+b; }\n};\n```\n\nWe can invoke it from ClojureScript:\n\n```clj\n(js-invoke js/obj \"my sum\" 1 2)\n;=> 3\n```"}],
   :full-name "cljs.core/js-invoke",
   :docstring
   "Invoke JavaScript object method via string. Needed when the\nstring is not a valid unquoted property name."},
  "KeySeq"
  {:ns "cljs.core",
   :name "KeySeq",
   :signature ["[mseq _meta]"],
   :type "type",
   :full-name "cljs.core/KeySeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "character"
  {:description
   "A single character string.  Carried over from Clojure for\ncompatibility.  They are represented as single character JavaScript strings.\n\n`\\c` = `\"c\"`\n\n| unicode characters  | constraints                                   |\n|---------------------|-----------------------------------------------|\n| `\\uXXXX`            | XXXX must have 4 digits outside 0xD7FF-0xE000 |\n| `\\oXXX`             | XXX is octal between 0 and 0377               |\n\n| special characters  | result   |\n|---------------------|----------|\n| `\\newline`          | `\"\\n\"`   |\n| `\\space`            | `\" \"`    |\n| `\\tab`              | `\"\\t\"`   |\n| `\\formfeed`         | `\"\\f\"`   |\n| `\\backspace`        | `\"\\b\"`   |\n| `\\return`           | `\"\\r\"`   |",
   :examples-htmls
   ["<pre><code class=\"clj\">\\c\n;;=&gt; &quot;c&quot;\n\n\\A\n;;=&gt; &quot;A&quot;\n\n\\newline\n;;=&gt; &quot;\\n&quot;\n\n\\u00a1\n;;=&gt; &quot;¡&quot;\n\n\\o256\n;;=&gt; &quot;®&quot;\n</code></pre>"],
   :ns "syntax",
   :name "character",
   :type "syntax",
   :related ["syntax/string" "cljs.core/str"],
   :examples-strings
   [[["\\c ;;=> \"c\""
      "\\A ;;=> \"A\""
      "\\newline ;;=> \"\\n\""
      "\\u00a1 ;;=> \"¡\""
      "\\o256 ;;=> \"®\""]]],
   :description-html
   "<p>A single character string.  Carried over from Clojure for compatibility.  They are represented as single character JavaScript strings.</p><p><code>\\c</code> = <code>&quot;c&quot;</code></p><p>| unicode characters  | constraints                                   | |---------------------|-----------------------------------------------| | <code>\\uXXXX</code>            | XXXX must have 4 digits outside 0xD7FF-0xE000 | | <code>\\oXXX</code>             | XXX is octal between 0 and 0377               |</p><p>| special characters  | result   | |---------------------|----------| | <code>\\newline</code>          | <code>&quot;\\n&quot;</code>   | | <code>\\space</code>            | <code>&quot; &quot;</code>    | | <code>\\tab</code>              | <code>&quot;\\t&quot;</code>   | | <code>\\formfeed</code>         | <code>&quot;\\f&quot;</code>   | | <code>\\backspace</code>        | <code>&quot;\\b&quot;</code>   | | <code>\\return</code>           | <code>&quot;\\r&quot;</code>   |</p>",
   :examples
   [{:id "495a47",
     :content
     "```clj\n\\c\n;;=> \"c\"\n\n\\A\n;;=> \"A\"\n\n\\newline\n;;=> \"\\n\"\n\n\\u00a1\n;;=> \"¡\"\n\n\\o256\n;;=> \"®\"\n```"}],
   :full-name "syntax/character"},
  "pprint-indent"
  {:ns "cljs.pprint",
   :name "pprint-indent",
   :signature ["[relative-to n]"],
   :type "function",
   :full-name "cljs.pprint/pprint-indent",
   :docstring
   "Create an indent at this point in the pretty printing stream. This defines how\nfollowing lines are indented. relative-to can be either :block or :current depending\nwhether the indent should be computed relative to the start of the logical block or\nthe current column position. n is an offset.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-inc"
  {:ns "cljs.core",
   :name "unchecked-inc",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-inc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "earmuffs"
  {:description
   "A naming convention for dynamic vars (unenforced).\n\n`(def ^:dynamic *foo* 1)`\n\nDynamic vars are global vars that you intend to temporarily rebind with\n[doc:cljs.core/binding].\n\nNOTE: Sometimes, the core library uses the earmuffs convention for non-dynamic\nspecial global vars (e.g. [doc:cljs.core/*clojurescript-version*],\n[doc:cljs.core/*main-cli-fn*]).",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def &#94;:dynamic &#42;foo&#42; 1&#41;\n\n&#40;def print-foo &#91;&#93;\n  &#40;println &#42;foo&#42;&#41;&#41;\n\n&#40;print-foo&#41;\n;; 1\n\n&#40;binding &#91;&#42;foo&#42; 2&#93;\n  &#40;print-foo&#41;&#41;\n;; 2\n\n&#40;print-foo&#41;\n;; 1\n</code></pre>"],
   :ns "syntax",
   :name "earmuffs",
   :type "convention",
   :related ["cljs.core/binding"],
   :examples-strings
   [[["(def ^:dynamic *foo* 1)"
      "(def print-foo []"
      "  (println *foo*))"
      "(print-foo) ;; 1"
      "(binding [*foo* 2]"
      "  (print-foo)) ;; 2"
      "(print-foo) ;; 1"]]],
   :description-html
   "<p>A naming convention for dynamic vars (unenforced).</p><p><code>&#40;def &#94;:dynamic &#42;foo&#42; 1&#41;</code></p><p>Dynamic vars are global vars that you intend to temporarily rebind with [doc:cljs.core/binding].</p><p>NOTE: Sometimes, the core library uses the earmuffs convention for non-dynamic special global vars (e.g. [doc:cljs.core/<em>clojurescript-version</em>], [doc:cljs.core/<em>main-cli-fn</em>]).</p>",
   :examples
   [{:id "91cf10",
     :content
     "```clj\n(def ^:dynamic *foo* 1)\n\n(def print-foo []\n  (println *foo*))\n\n(print-foo)\n;; 1\n\n(binding [*foo* 2]\n  (print-foo))\n;; 2\n\n(print-foo)\n;; 1\n```"}],
   :full-name "syntax/earmuffs"},
  "List.EMPTY"
  {:ns "cljs.core",
   :name "List.EMPTY",
   :type "var",
   :full-name "cljs.core/List.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reify"
  {:ns "cljs.core",
   :name "reify",
   :signature ["[& impls]"],
   :type "macro",
   :full-name "cljs.core/reify",
   :docstring
   "reify is a macro with the following structure:\n\n(reify options* specs*)\n\n Currently there are no options.\n\n Each spec consists of the protocol name followed by zero\n or more method bodies:\n\n protocol\n (methodName [args+] body)*\n\n Methods should be supplied for all methods of the desired\n protocol(s). You can also define overrides for Object methods. Note that\n the first parameter must be supplied to correspond to the target object\n ('this' in JavaScript parlance). Note also that recur calls\n to the method head should *not* pass the target object, it will be supplied\n automatically and can not be substituted.\n\n recur works to method heads The method bodies of reify are lexical\n closures, and can refer to the surrounding local scope:\n\n (str (let [f \"foo\"]\n      (reify Object\n        (toString [this] f))))\n == \"foo\"\n\n (seq (let [f \"foo\"]\n      (reify ISeqable\n        (-seq [this] (-seq f)))))\n == (\\f \\o \\o))\n\n reify always implements IMeta and IWithMeta and transfers meta\n data of the form to the created object.\n\n (meta ^{:k :v} (reify Object (toString [this] \"foo\")))\n == {:k :v}",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "vals"
  {:description "Returns a sequence of the values in `hash-map`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "vals",
   :signature ["[hash-map]"],
   :type "function",
   :related ["cljs.core/keys"],
   :examples-strings [],
   :description-html
   "<p>Returns a sequence of the values in <code>hash-map</code>.</p>",
   :full-name "cljs.core/vals",
   :docstring "Returns a sequence of the map's values."},
  "import"
  {:description
   "import-list => (closure-namespace constructor-name-symbols*)\n\nOnly usable from a REPL.\n\nImport Google Closure classes.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;import 'goog.math.Long\n        '&#91;goog.math Vec2 Vec3&#93;\n        '&#91;goog.math Integer&#93;&#41;\n\n&#40;Long. 4 6&#41;\n;;=&gt; #&lt;25769803780&gt;\n\n&#40;Vec2. 1 2&#41;\n;;=&gt; #&lt;&#40;1, 2&#41;&gt;\n\n&#40;Vec3. 1 2 3&#41;\n;;=&gt; #&lt;&#40;1, 2, 3&#41;&gt;\n\n&#40;Integer.fromString &quot;10&quot;&#41;\n;;=&gt; #&lt;10&gt;\n</code></pre>"],
   :ns "specialrepl",
   :name "import",
   :signature ["[& import-symbols-or-lists]"],
   :type "special form (repl)",
   :examples-strings
   [[["(import 'goog.math.Long"
      "        '[goog.math Vec2 Vec3]"
      "        '[goog.math Integer])"
      "(Long. 4 6) ;;=> #<25769803780>"
      "(Vec2. 1 2) ;;=> #<(1, 2)>"
      "(Vec3. 1 2 3) ;;=> #<(1, 2, 3)>"
      "(Integer.fromString \"10\") ;;=> #<10>"]]],
   :description-html
   "<p>import-list => (closure-namespace constructor-name-symbols*)</p><p>Only usable from a REPL.</p><p>Import Google Closure classes.</p>",
   :examples
   [{:id "03acc0",
     :content
     "```clj\n(import 'goog.math.Long\n        '[goog.math Vec2 Vec3]\n        '[goog.math Integer])\n\n(Long. 4 6)\n;;=> #<25769803780>\n\n(Vec2. 1 2)\n;;=> #<(1, 2)>\n\n(Vec3. 1 2 3)\n;;=> #<(1, 2, 3)>\n\n(Integer.fromString \"10\")\n;;=> #<10>\n```"}],
   :full-name "specialrepl/import",
   :docstring
   "import-list => (closure-namespace constructor-name-symbols*)\n\nFor each name in constructor-name-symbols, adds a mapping from name to the\nconstructor named by closure-namespace to the current namespace. Use :import in the ns\nmacro in preference to calling this directly."},
  "edit"
  {:ns "clojure.zip",
   :name "edit",
   :signature ["[loc f & args]"],
   :type "function",
   :full-name "clojure.zip/edit",
   :docstring
   "Replaces the node at this loc with the value of (f node args)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "seq-iter"
  {:ns "cljs.core",
   :name "seq-iter",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/seq-iter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "connect"
  {:ns "clojure.browser.repl",
   :name "connect",
   :signature ["[repl-server-url]"],
   :type "function",
   :full-name "clojure.browser.repl/connect",
   :docstring
   "Connects to a REPL server from an HTML document. After the\nconnection is made, the REPL will evaluate forms in the context of\nthe document that called this function.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "inc"
  {:description "Returns a number one greater than `x`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "inc",
   :signature ["[x]"],
   :type "function/macro",
   :related ["cljs.core/dec"],
   :examples-strings [],
   :description-html
   "<p>Returns a number one greater than <code>x</code>.</p>",
   :full-name "cljs.core/inc",
   :docstring "Returns a number one greater than num."},
  "TransientVector"
  {:ns "cljs.core",
   :name "TransientVector",
   :signature ["[cnt shift root tail]"],
   :type "type",
   :full-name "cljs.core/TransientVector",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Stepper"
  {:ns "cljs.core",
   :name "Stepper",
   :signature ["[xform iter]"],
   :type "type",
   :full-name "cljs.core/Stepper",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "sort-by"
  {:description
   "Returns a sorted sequence of the items in `coll`, where the sort order is\ndetermined by comparing `(keyfn item)`.\n\n`comp` can be boolean-valued comparison function, or a -/0/+ valued comparator.\n\n`comp` defaults to `compare`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sort-by",
   :signature ["[keyfn coll]" "[keyfn comp coll]"],
   :type "function",
   :related ["cljs.core/sort" "cljs.core/compare"],
   :examples-strings [],
   :description-html
   "<p>Returns a sorted sequence of the items in <code>coll</code>, where the sort order is determined by comparing <code>&#40;keyfn item&#41;</code>.</p><p><code>comp</code> can be boolean-valued comparison function, or a -/0/+ valued comparator.</p><p><code>comp</code> defaults to <code>compare</code>.</p>",
   :full-name "cljs.core/sort-by",
   :docstring
   "Returns a sorted sequence of the items in coll, where the sort\norder is determined by comparing (keyfn item).  Comp can be\nboolean-valued comparison funcion, or a -/0/+ valued comparator.\nComp defaults to compare."},
  "defmulti"
  {:ns "cljs.core",
   :name "defmulti",
   :signature ["[mm-name & options]"],
   :type "macro",
   :full-name "cljs.core/defmulti",
   :docstring
   "Creates a new multimethod with the associated dispatch function.\nThe docstring and attribute-map are optional.\n\nOptions are key-value pairs and may be one of:\n  :default    the default dispatch value, defaults to :default\n  :hierarchy  the isa? hierarchy to use for dispatching\n              defaults to the global hierarchy",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "chunk-first"
  {:ns "cljs.core",
   :name "chunk-first",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.core/chunk-first",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-string*"
  {:ns "cljs.reader",
   :name "read-string*",
   :signature ["[reader _]"],
   :type "function",
   :full-name "cljs.reader/read-string*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "when-let"
  {:description
   "When `test` is logical true, evaluates `body` with the value of `test` bound to\n`x`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "when-let",
   :signature ["[[x test] & body]"],
   :type "macro",
   :related
   ["cljs.core/if-let"
    "cljs.core/when"
    "cljs.core/when-not"
    "special/if"
    "cljs.core/when-first"],
   :examples-strings [],
   :description-html
   "<p>When <code>test</code> is logical true, evaluates <code>body</code> with the value of <code>test</code> bound to <code>x</code>.</p>",
   :full-name "cljs.core/when-let",
   :docstring
   "bindings => binding-form test\n\nWhen test is true, evaluates body with binding-form bound to the value of test"},
  "eval"
  {:ns "cljs.js",
   :name "eval",
   :signature ["[state form cb]" "[state form opts cb]"],
   :type "function",
   :full-name "cljs.js/eval",
   :docstring
   "Evaluate a single ClojureScript form. The parameters:\n\nstate (atom)\n  the compiler state\n\nform (s-expr)\n  the ClojureScript source\n\nopts (map)\n  compilation options.\n\n  :eval - the eval function to invoke, see *eval-fn*\n  :load - library resolution function, see *load-fn*\n\ncb (function)\n  callback, will be invoked with a map. If successful the map will contain\n  a key :value with the result of evalution. If unsuccessful the map will\n  contain a key :error with an ex-info instance describing the cause of\n  failure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-C1"
  {:ns "cljs.core",
   :name "m3-C1",
   :type "var",
   :full-name "cljs.core/m3-C1",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "println"
  {:ns "cljs.core",
   :name "println",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/println",
   :docstring "Same as print followed by (newline)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ex-info"
  {:ns "cljs.core",
   :name "ex-info",
   :signature ["[msg data]" "[msg data cause]"],
   :type "function",
   :full-name "cljs.core/ex-info",
   :docstring
   "Alpha - subject to change.\nCreate an instance of ExceptionInfo, an Error type that carries a\nmap of additional data.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns-unmap"
  {:ns "cljs.core",
   :name "ns-unmap",
   :signature ["[[quote0 ns] [quote1 sym]]"],
   :type "macro",
   :full-name "cljs.core/ns-unmap",
   :docstring
   "Removes the mappings for the symbol from the namespace.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "char"
  {:description
   "Converts a number `x` to a character using `String.fromCharCode(x)` from\nJavaScript.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;char 81&#41;\n;;=&gt; &quot;Q&quot;\n\n&#40;char &quot;Q&quot;&#41;\n;;=&gt; &quot;Q&quot;\n\n&#40;char &quot;foo&quot;&#41;\n;; Error: Argument to char must be a character or number\n</code></pre>"],
   :ns "cljs.core",
   :name "char",
   :signature ["[x]"],
   :type "function",
   :examples-strings
   [[["(char 81) ;;=> \"Q\""
      "(char \"Q\") ;;=> \"Q\""
      "(char \"foo\") ;; Error: Argument to char must be a character or number"]]],
   :description-html
   "<p>Converts a number <code>x</code> to a character using <code>String.fromCharCode&#40;x&#41;</code> from JavaScript.</p>",
   :examples
   [{:id "4e1a56",
     :content
     "```clj\n(char 81)\n;;=> \"Q\"\n\n(char \"Q\")\n;;=> \"Q\"\n\n(char \"foo\")\n;; Error: Argument to char must be a character or number\n```"}],
   :full-name "cljs.core/char",
   :docstring "Coerce to char"},
  "not="
  {:description
   "Returns the opposite of `=`.\n\nSame as `(not (= x y))`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "not=",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function",
   :related ["cljs.core/=" "cljs.core/not"],
   :examples-strings [],
   :description-html
   "<p>Returns the opposite of <code>=</code>.</p><p>Same as <code>&#40;not &#40;= x y&#41;&#41;</code></p>",
   :full-name "cljs.core/not=",
   :docstring "Same as (not (= obj1 obj2))"},
  "send-404"
  {:ns "cljs.repl.server",
   :name "send-404",
   :signature ["[conn path]"],
   :type "function",
   :full-name "cljs.repl.server/send-404",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "doto"
  {:ns "cljs.core",
   :name "doto",
   :signature ["[x & forms]"],
   :type "macro",
   :full-name "cljs.core/doto",
   :docstring
   "Evaluates x then calls all of the methods and functions with the\nvalue of x supplied at the front of the given arguments.  The forms\nare evaluated in order.  Returns x.\n\n(doto (new java.util.HashMap) (.put \"a\" 1) (.put \"b\" 2))",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "random-uuid"
  {:ns "cljs.core",
   :name "random-uuid",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.core/random-uuid",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-char"
  {:ns "cljs.core",
   :name "unchecked-char",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-char",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IndexedSeqIterator"
  {:ns "cljs.core",
   :name "IndexedSeqIterator",
   :signature ["[arr i]"],
   :type "type",
   :full-name "cljs.core/IndexedSeqIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "atom?"
  {:ns "cljs.js",
   :name "atom?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.js/atom?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rights"
  {:ns "clojure.zip",
   :name "rights",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/rights",
   :docstring "Returns a seq of the right siblings of this loc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ICollection"
  {:ns "cljs.core",
   :name "ICollection",
   :type "protocol",
   :full-name "cljs.core/ICollection",
   :docstring "Protocol for adding to a collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*target*"
  {:ns "cljs.core",
   :name "*target*",
   :type "dynamic var",
   :full-name "cljs.core/*target*",
   :docstring
   "Var bound to the name value of the compiler build :target option.\nFor example, if the compiler build :target is :nodejs, *target* will be bound\nto \"nodejs\". *target* is a Google Closure define and can be set by compiler\n:closure-defines option.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*ns*"
  {:ns "cljs.core",
   :name "*ns*",
   :type "dynamic var",
   :full-name "cljs.core/*ns*",
   :docstring
   "Var bound to the current namespace. Only used for bootstrapping.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "atom"
  {:description
   "Creates and returns an atom with an initial value of `x`.\n\n`opts` is an optional map with optional keys `:meta` and `:validator`.\n\n`:meta` should be a [metadata-map](http://clojure.org/metadata) for the atom.\n\n`:validator` should be a validator function for the atom. See `set-validator!`\nfor more information.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a &#40;atom 1&#41;&#41;\n\n@a\n;;=&gt; 1\n\n&#40;reset! a 2&#41;\n@a\n;;=&gt; 2\n\n&#40;swap! a inc&#41;\n@a\n;;=&gt; 3\n</code></pre>"],
   :ns "cljs.core",
   :name "atom",
   :signature ["[x]" "[x opts]"],
   :type "function",
   :related
   ["cljs.core/atom"
    "cljs.core/swap!"
    "cljs.core/reset!"
    "cljs.core/set-validator!"
    "cljs.core/get-validator"],
   :examples-strings
   [[["(def a (atom 1))"
      "@a ;;=> 1"
      "(reset! a 2)"
      "@a ;;=> 2"
      "(swap! a inc)"
      "@a ;;=> 3"]]],
   :description-html
   "<p>Creates and returns an atom with an initial value of <code>x</code>.</p><p><code>opts</code> is an optional map with optional keys <code>:meta</code> and <code>:validator</code>.</p><p><code>:meta</code> should be a <a href='http://clojure.org/metadata'>metadata-map</a> for the atom.</p><p><code>:validator</code> should be a validator function for the atom. See <code>set-validator!</code> for more information.</p>",
   :examples
   [{:id "e6a38a",
     :content
     "```clj\n(def a (atom 1))\n\n@a\n;;=> 1\n\n(reset! a 2)\n@a\n;;=> 2\n\n(swap! a inc)\n@a\n;;=> 3\n```"}],
   :full-name "cljs.core/atom",
   :docstring
   "Creates and returns an Atom with an initial value of x and zero or\nmore options (in any order):\n\n:meta metadata-map\n\n:validator validate-fn\n\nIf metadata-map is supplied, it will be come the metadata on the\natom. validate-fn must be nil or a side-effect-free fn of one\nargument, which will be passed the intended new state on any state\nchange. If the new state is unacceptable, the validate-fn should\nreturn false or throw an Error.  If either of these error conditions\noccur, then the value of the atom will not change."},
  "reader-error"
  {:ns "cljs.reader",
   :name "reader-error",
   :signature ["[rdr & msg]"],
   :type "function",
   :full-name "cljs.reader/reader-error",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Set.EMPTY"
  {:ns "cljs.core",
   :name "Set.EMPTY",
   :type "var",
   :full-name "cljs.core/Set.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-and-clear-env!"
  {:ns "cljs.test",
   :name "get-and-clear-env!",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.test/get-and-clear-env!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "loop*"
  {:ns "special",
   :name "loop*",
   :type "special form",
   :full-name "special/loop*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "this-as"
  {:ns "cljs.core",
   :name "this-as",
   :signature ["[name & body]"],
   :type "macro",
   :full-name "cljs.core/this-as",
   :docstring
   "Defines a scope where JavaScript's implicit \"this\" is bound to the name provided.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "run-in-order"
  {:ns "cljs.repl.browser",
   :name "run-in-order",
   :signature ["[{:keys [expecting fns]}]"],
   :type "function",
   :full-name "cljs.repl.browser/run-in-order",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "vector"
  {:description "Creates a new vector containing `args`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "vector",
   :signature ["[& args]"],
   :type "function/macro",
   :related
   ["cljs.core/vec"
    "cljs.core/vector?"
    "cljs.core/pop"
    "cljs.core/into"],
   :examples-strings [],
   :description-html
   "<p>Creates a new vector containing <code>args</code>.</p>",
   :full-name "cljs.core/vector",
   :docstring "Creates a new vector containing the args."},
  "websocket-connection"
  {:ns "clojure.browser.net",
   :name "websocket-connection",
   :signature
   ["[]" "[auto-reconnect?]" "[auto-reconnect? next-reconnect-fn]"],
   :type "function",
   :full-name "clojure.browser.net/websocket-connection",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-ns"
  {:ns "cljs.repl.nashorn",
   :name "load-ns",
   :signature ["[engine ns]"],
   :type "function",
   :full-name "cljs.repl.nashorn/load-ns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "capitalize"
  {:description
   "Converts first character of the string to upper-case, all other characters to\nlower-case.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "capitalize",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Converts first character of the string to upper-case, all other characters to lower-case.</p>",
   :full-name "clojure.string/capitalize",
   :docstring
   "Converts first character of the string to upper-case, all other\ncharacters to lower-case."},
  "no-warn"
  {:ns "cljs.analyzer.api",
   :name "no-warn",
   :signature ["[& body]"],
   :type "macro",
   :full-name "cljs.analyzer.api/no-warn",
   :docstring
   "Disable analyzer warnings for any analysis executed in body.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "specify"
  {:ns "cljs.core",
   :name "specify",
   :signature ["[expr & impls]"],
   :type "macro",
   :full-name "cljs.core/specify",
   :docstring
   "Identical to specify but does not mutate its first argument. The first\nargument must be an ICloneable instance.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "if-some"
  {:description
   "If `test` is not nil, evaluates `then` with `x` bound to the value of `test`. If\nnot, yields `else`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "if-some",
   :signature ["[[x test] then]" "[[x test] then else]"],
   :type "macro",
   :related ["cljs.core/when-some"],
   :examples-strings [],
   :description-html
   "<p>If <code>test</code> is not nil, evaluates <code>then</code> with <code>x</code> bound to the value of <code>test</code>. If not, yields <code>else</code>.</p>",
   :full-name "cljs.core/if-some",
   :docstring
   "bindings => binding-form test\n\nIf test is not nil, evaluates then with binding-form bound to the\nvalue of test, if not, yields else"},
  "update-current-env!"
  {:ns "cljs.test",
   :name "update-current-env!",
   :signature ["[ks f & args]"],
   :type "function",
   :full-name "cljs.test/update-current-env!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "take-while"
  {:ns "clojure.core.reducers",
   :name "take-while",
   :signature ["[pred]" "[pred coll]"],
   :type "function",
   :full-name "clojure.core.reducers/take-while",
   :docstring
   "Ends the reduction of coll when (pred val) returns logical false.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "select"
  {:description
   "Returns a set of the elements for which `pred` is true.",
   :examples-htmls [],
   :ns "clojure.set",
   :name "select",
   :signature ["[pred xset]"],
   :type "function",
   :related ["cljs.core/filter"],
   :examples-strings [],
   :description-html
   "<p>Returns a set of the elements for which <code>pred</code> is true.</p>",
   :full-name "clojure.set/select",
   :docstring "Returns a set of the elements for which pred is true"},
  "js-line-and-column"
  {:ns "cljs.test",
   :name "js-line-and-column",
   :signature ["[stack-element]"],
   :type "function",
   :full-name "cljs.test/js-line-and-column",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "indexed?"
  {:ns "cljs.core",
   :name "indexed?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/indexed?",
   :docstring "Returns true if coll implements nth in constant time",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IHash"
  {:ns "cljs.core",
   :name "IHash",
   :type "protocol",
   :full-name "cljs.core/IHash",
   :docstring "Protocol for adding hashing functionality to a type.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IndexedSeq"
  {:ns "cljs.core",
   :name "IndexedSeq",
   :signature ["[arr i]"],
   :type "type",
   :full-name "cljs.core/IndexedSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IPrintStacktrace"
  {:ns "cljs.repl",
   :name "IPrintStacktrace",
   :type "protocol",
   :full-name "cljs.repl/IPrintStacktrace",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "extend-protocol"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "extend-protocol",
   :signature ["[p & specs]"],
   :type "macro",
   :related ["cljs.core/extend-type"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/extend-protocol",
   :docstring
   "Useful when you want to provide several implementations of the same\nprotocol all at once. Takes a single protocol and the implementation\nof that protocol for one or more types. Expands into calls to\nextend-type:\n\n(extend-protocol Protocol\n  AType\n    (foo [x] ...)\n    (bar [x y] ...)\n  BType\n    (foo [x] ...)\n    (bar [x y] ...)\n  AClass\n    (foo [x] ...)\n    (bar [x y] ...)\n  nil\n    (foo [x] ...)\n    (bar [x y] ...))\n\nexpands into:\n\n(do\n (clojure.core/extend-type AType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type BType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type AClass Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type nil Protocol \n   (foo [x] ...) \n   (bar [x y] ...)))"},
  "chunk-next"
  {:ns "cljs.core",
   :name "chunk-next",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.core/chunk-next",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "or"
  {:description
   "Evaluates arguments one at a time from left to right. If an argument returns\nlogical true, `or` returns that value and doesn't evaluate any of the other\narguments, otherwise it returns the value of the last argument.\n\n`(or)` returns nil.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;or&#41;\n;;=&gt; nil\n\n&#40;or false&#41;\n;;=&gt; false\n\n&#40;or true&#41;\n;;=&gt; true\n\n&#40;or true true&#41;\n;;=&gt; true\n\n&#40;or true false&#41;\n;;=&gt; true\n\n&#40;or false false&#41;\n;;=&gt; false\n</code></pre>"
    "<p><code>nil</code> and <code>false</code> are the only falsy values and everything else is truthy:</p><pre><code class=\"clj\">&#40;or &quot;foo&quot; &quot;bar&quot;&#41;\n;;=&gt; &quot;bar&quot;\n\n&#40;or &quot;foo&quot; nil&#41;\n;;=&gt; &quot;foo&quot;\n\n&#40;or &quot;foo&quot; false&#41;\n;;=&gt; &quot;foo&quot;\n\n&#40;or nil &quot;foo&quot;&#41;\n;;=&gt; &quot;foo&quot;\n\n&#40;or false &quot;foo&quot;&#41;\n;;=&gt; &quot;foo&quot;\n</code></pre>"],
   :ns "cljs.core",
   :name "or",
   :signature ["[]" "[x]" "[x & next]"],
   :type "macro",
   :related ["cljs.core/and" "special/if"],
   :examples-strings
   [[["(or) ;;=> nil"
      "(or false) ;;=> false"
      "(or true) ;;=> true"
      "(or true true) ;;=> true"
      "(or true false) ;;=> true"
      "(or false false) ;;=> false"]]
    [["(or \"foo\" \"bar\") ;;=> \"bar\""
      "(or \"foo\" nil) ;;=> \"foo\""
      "(or \"foo\" false) ;;=> \"foo\""
      "(or nil \"foo\") ;;=> \"foo\""
      "(or false \"foo\") ;;=> \"foo\""]]],
   :description-html
   "<p>Evaluates arguments one at a time from left to right. If an argument returns logical true, <code>or</code> returns that value and doesn't evaluate any of the other arguments, otherwise it returns the value of the last argument.</p><p><code>&#40;or&#41;</code> returns nil.</p>",
   :examples
   [{:id "d50433",
     :content
     "```clj\n(or)\n;;=> nil\n\n(or false)\n;;=> false\n\n(or true)\n;;=> true\n\n(or true true)\n;;=> true\n\n(or true false)\n;;=> true\n\n(or false false)\n;;=> false\n```"}
    {:id "62f291",
     :content
     "`nil` and `false` are the only falsy values and everything else is truthy:\n\n```clj\n(or \"foo\" \"bar\")\n;;=> \"bar\"\n\n(or \"foo\" nil)\n;;=> \"foo\"\n\n(or \"foo\" false)\n;;=> \"foo\"\n\n(or nil \"foo\")\n;;=> \"foo\"\n\n(or false \"foo\")\n;;=> \"foo\"\n```"}],
   :full-name "cljs.core/or",
   :docstring
   "Evaluates exprs one at a time, from left to right. If a form\nreturns a logical true value, or returns that value and doesn't\nevaluate any of the other expressions, otherwise it returns the\nvalue of the last expression. (or) returns nil."},
  "identity"
  {:description "Returns its argument.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "identity",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/nil?"],
   :examples-strings [],
   :description-html "<p>Returns its argument.</p>",
   :full-name "cljs.core/identity",
   :docstring "Returns its argument."},
  "list?"
  {:description "Returns true if `x` is a list, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "list?",
   :signature ["[x]"],
   :type "function",
   :related
   ["cljs.core/seq?" "cljs.core/sequential?" "cljs.core/coll?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a list, false otherwise.</p>",
   :full-name "cljs.core/list?",
   :docstring "Returns true if x implements IList"},
  "emit"
  {:ns "cljs.compiler.api",
   :name "emit",
   :signature ["[ast]" "[state ast]"],
   :type "function",
   :full-name "cljs.compiler.api/emit",
   :docstring
   "Given an AST node generated by the analyzer emit JavaScript as a string.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "start"
  {:ns "cljs.repl.server",
   :name "start",
   :signature ["[opts]"],
   :type "function",
   :full-name "cljs.repl.server/start",
   :docstring "Start the server on the specified port.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "implements?"
  {:ns "cljs.core",
   :name "implements?",
   :signature ["[psym x]"],
   :type "macro",
   :full-name "cljs.core/implements?",
   :docstring "EXPERIMENTAL",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "odd?"
  {:description
   "Returns true if `n` is an odd number.\n\nThrows an exception if `n` is not an integer.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "odd?",
   :signature ["[n]"],
   :type "function",
   :related ["cljs.core/even?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is an odd number.</p><p>Throws an exception if <code>n</code> is not an integer.</p>",
   :full-name "cljs.core/odd?",
   :docstring
   "Returns true if n is odd, throws an exception if n is not an integer"},
  "Vector.EMPTY"
  {:ns "cljs.core",
   :name "Vector.EMPTY",
   :type "var",
   :full-name "cljs.core/Vector.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "prev"
  {:ns "clojure.zip",
   :name "prev",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/prev",
   :docstring
   "Moves to the previous loc in the hierarchy, depth-first. If already\nat the root, returns nil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "case"
  {:description
   "Takes an expression and a set of clauses. Each clause can take the form of\neither:\n\n`test-constant result-expr`\n\n`(test-constant1 ... test-constantN)  result-expr`\n\nThe test-constants are not evaluated. They must be compile-time literals, and\nneed not be quoted. If the expression is equal to a test-constant, the\ncorresponding `result-expr` is returned. A single default expression can follow\nthe clauses, and its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an Error is thrown.\n\nUnlike `cond` and `condp`, `case` does a constant-time dispatch, the clauses are\nnot considered sequentially. All manner of constant expressions are acceptable\nin `case`, including numbers, strings, symbols, keywords, and ClojureScript\ncomposites thereof. Note that since lists are used to group multiple constants\nthat map to the same expression, a vector can be used to match a list if needed.\nThe test-constants need not be all of the same type.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a 1&#41;\n&#40;def b 2&#41;\n\n&#40;case a\n  0 &quot;zero&quot;\n  1 &quot;one&quot;\n  &quot;default&quot;&#41;\n;;=&gt; &quot;one&quot;\n\n&#40;case b\n  0 &quot;zero&quot;\n  1 &quot;one&quot;\n  &quot;default&quot;&#41;\n;;=&gt; &quot;default&quot;\n\n&#40;case b\n  0 &quot;zero&quot;\n  1 &quot;one&quot;&#41;\n;; Error: No matching clause: 2\n</code></pre>"],
   :ns "cljs.core",
   :name "case",
   :signature ["[e & clauses]"],
   :type "macro",
   :related ["cljs.core/cond" "cljs.core/condp"],
   :examples-strings
   [[["(def a 1)"
      "(def b 2)"
      "(case a"
      "  0 \"zero\""
      "  1 \"one\""
      "  \"default\") ;;=> \"one\""
      "(case b"
      "  0 \"zero\""
      "  1 \"one\""
      "  \"default\") ;;=> \"default\""
      "(case b"
      "  0 \"zero\""
      "  1 \"one\") ;; Error: No matching clause: 2"]]],
   :description-html
   "<p>Takes an expression and a set of clauses. Each clause can take the form of either:</p><p><code>test-constant result-expr</code></p><p><code>&#40;test-constant1 ... test-constantN&#41;  result-expr</code></p><p>The test-constants are not evaluated. They must be compile-time literals, and need not be quoted. If the expression is equal to a test-constant, the corresponding <code>result-expr</code> is returned. A single default expression can follow the clauses, and its value will be returned if no clause matches. If no default expression is provided and no clause matches, an Error is thrown.</p><p>Unlike <code>cond</code> and <code>condp</code>, <code>case</code> does a constant-time dispatch, the clauses are not considered sequentially. All manner of constant expressions are acceptable in <code>case</code>, including numbers, strings, symbols, keywords, and ClojureScript composites thereof. Note that since lists are used to group multiple constants that map to the same expression, a vector can be used to match a list if needed. The test-constants need not be all of the same type.</p>",
   :examples
   [{:id "09a90c",
     :content
     "```clj\n(def a 1)\n(def b 2)\n\n(case a\n  0 \"zero\"\n  1 \"one\"\n  \"default\")\n;;=> \"one\"\n\n(case b\n  0 \"zero\"\n  1 \"one\"\n  \"default\")\n;;=> \"default\"\n\n(case b\n  0 \"zero\"\n  1 \"one\")\n;; Error: No matching clause: 2\n```"}],
   :full-name "cljs.core/case",
   :docstring
   "Takes an expression, and a set of clauses.\n\nEach clause can take the form of either:\n\ntest-constant result-expr\n\n(test-constant1 ... test-constantN)  result-expr\n\nThe test-constants are not evaluated. They must be compile-time\nliterals, and need not be quoted.  If the expression is equal to a\ntest-constant, the corresponding result-expr is returned. A single\ndefault expression can follow the clauses, and its value will be\nreturned if no clause matches. If no default expression is provided\nand no clause matches, an Error is thrown.\n\nUnlike cond and condp, case does a constant-time dispatch, the\nclauses are not considered sequentially.  All manner of constant\nexpressions are acceptable in case, including numbers, strings,\nsymbols, keywords, and (ClojureScript) composites thereof. Note that since\nlists are used to group multiple constants that map to the same\nexpression, a vector can be used to match a list if needed. The\ntest-constants need not be all of the same type."},
  "maybe-read-tagged-type"
  {:ns "cljs.reader",
   :name "maybe-read-tagged-type",
   :signature ["[rdr initch]"],
   :type "function",
   :full-name "cljs.reader/maybe-read-tagged-type",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "constrain-order"
  {:ns "cljs.repl.browser",
   :name "constrain-order",
   :signature ["[order f]"],
   :type "function",
   :full-name "cljs.repl.browser/constrain-order",
   :docstring
   "Elements to be printed in the REPL will arrive out of order. Ensure\nthat they are printed in the correct order.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "build"
  {:ns "cljs.build.api",
   :name "build",
   :signature ["[source opts]" "[source opts compiler-env]"],
   :type "function",
   :full-name "cljs.build.api/build",
   :docstring
   "Given a source which can be compiled, produce runnable JavaScript.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "int-array"
  {:ns "cljs.core",
   :name "int-array",
   :signature ["[size-or-seq]" "[size init-val-or-seq]"],
   :type "function",
   :full-name "cljs.core/int-array",
   :docstring
   "Creates an array of ints. Does not coerce array, provided for compatibility\nwith Clojure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-read"
  {:ns "cljs.repl",
   :name "repl-read",
   :signature
   ["[request-prompt request-exit]"
    "[request-prompt request-exit opts]"],
   :type "function",
   :full-name "cljs.repl/repl-read",
   :docstring
   "Default :read hook for repl. Reads from *in* which must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF into a single\n\\newline. repl-read:\n  - skips whitespace, then\n    - returns request-prompt on start of line, or\n    - returns request-exit on end of stream, or\n    - reads an object from the input stream, then\n      - skips the next input character if it's end of line, then\n      - returns the object.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compile-str"
  {:ns "cljs.js",
   :name "compile-str",
   :signature
   ["[state source cb]"
    "[state source name cb]"
    "[state source name opts cb]"],
   :type "function",
   :full-name "cljs.js/compile-str",
   :docstring
   "Compile ClojureScript source into JavaScript. The parameters:\n\nstate (atom)\n  the compiler state\n\nsource (string)\n  the ClojureScript source\n\nname (symbol)\n  optional, the name of the source\n\nopts (map)\n  compilation options.\n\n  :load       - library resolution function, see *load-fn*\n  :source-map - set to true to generate inline source map information\n\ncb (function)\n  callback, will be invoked with a map. If successful the map will contain\n  a key :value with the compilation result (string). If unsuccessful the map\n  will contain a key :error with an ex-info instance describing the cause\n  of failure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "HashSetIter"
  {:ns "cljs.core",
   :name "HashSetIter",
   :signature ["[iter]"],
   :type "type",
   :full-name "cljs.core/HashSetIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pp"
  {:ns "cljs.pprint",
   :name "pp",
   :signature ["[]"],
   :type "macro",
   :full-name "cljs.pprint/pp",
   :docstring
   "A convenience macro that pretty prints the last thing output. This is\nexactly equivalent to (pprint *1).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "keyword?"
  {:ns "cljs.core",
   :name "keyword?",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/keyword?",
   :docstring "Return true if x is a Keyword",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMapIterator"
  {:ns "cljs.core",
   :name "PersistentArrayMapIterator",
   :signature ["[arr i cnt]"],
   :type "type",
   :full-name "cljs.core/PersistentArrayMapIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "split"
  {:description
   "Splits string on a regular expression. Optional argument limit is the maximum\nnumber of splits. Not lazy. Returns vector of the splits.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "split",
   :signature ["[s re]" "[s re limit]"],
   :type "function",
   :related
   ["cljs.core/subs"
    "clojure.string/replace"
    "clojure.string/split-lines"],
   :examples-strings [],
   :description-html
   "<p>Splits string on a regular expression. Optional argument limit is the maximum number of splits. Not lazy. Returns vector of the splits.</p>",
   :full-name "clojure.string/split",
   :docstring
   "Splits string on a regular expression. Optional argument limit is\nthe maximum number of splits. Not lazy. Returns vector of the splits."},
  "event-types"
  {:ns "clojure.browser.net",
   :name "event-types",
   :type "var",
   :full-name "clojure.browser.net/event-types",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cljs-ns-dependents"
  {:ns "cljs.build.api",
   :name "cljs-ns-dependents",
   :signature ["[ns]" "[state ns]"],
   :type "function",
   :full-name "cljs.build.api/cljs-ns-dependents",
   :docstring
   "Given a namespace symbol return a seq of all dependent\nnamespaces sorted in dependency order. Will include\ntransient dependents.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "firefox-st-el->frame"
  {:ns "cljs.repl.browser",
   :name "firefox-st-el->frame",
   :signature ["[repl-env st-el opts]"],
   :type "function",
   :full-name "cljs.repl.browser/firefox-st-el->frame",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ExceptionInfo"
  {:ns "cljs.core",
   :name "ExceptionInfo",
   :signature ["[message data cause]"],
   :type "type",
   :full-name "cljs.core/ExceptionInfo",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "keyword"
  {:description
   "A keyword is a string-like datatype that evaluates to itself.  Keywords are often used\nas enums or keys for maps.  Keywords should not start with a number.\n\nKeywords can have an optional namespace. For example, `:foo/bar`. This is useful\nfor functions in a namespace to prevent key collisions on a globally accessible\nmap.",
   :examples-htmls
   ["<pre><code class=\"clj\">:foo\n;;=&gt; :foo\n\n:a/foo\n;;=&gt; :a/foo\n</code></pre>"
    "<p>A keyword is also callable for retrieving values from a map:</p><pre><code class=\"clj\">&#40;def m {:foo 1}&#41;\n&#40;:foo m&#41;\n;;=&gt; 1\n\n&#40;def things &#91;{:foo 1 :bar 2}\n             {:foo 3 :bar 4}\n             {:foo 5 :bar 6}&#93;&#41;\n&#40;map :foo things&#41;\n;;=&gt; &#40;1 3 5&#41;\n</code></pre>"],
   :ns "syntax",
   :name "keyword",
   :type "syntax",
   :related
   ["syntax/keyword-qualify" "cljs.core/keyword" "cljs.core/keyword?"],
   :examples-strings
   [[[":foo ;;=> :foo" ":a/foo ;;=> :a/foo"]]
    [["(def m {:foo 1})"
      "(:foo m) ;;=> 1"
      "(def things [{:foo 1 :bar 2}"
      "             {:foo 3 :bar 4}"
      "             {:foo 5 :bar 6}])"
      "(map :foo things) ;;=> (1 3 5)"]]],
   :description-html
   "<p>A keyword is a string-like datatype that evaluates to itself.  Keywords are often used as enums or keys for maps.  Keywords should not start with a number.</p><p>Keywords can have an optional namespace. For example, <code>:foo/bar</code>. This is useful for functions in a namespace to prevent key collisions on a globally accessible map.</p>",
   :examples
   [{:id "e5fdbe",
     :content "```clj\n:foo\n;;=> :foo\n\n:a/foo\n;;=> :a/foo\n```"}
    {:id "9765fe",
     :content
     "A keyword is also callable for retrieving values from a map:\n\n```clj\n(def m {:foo 1})\n(:foo m)\n;;=> 1\n\n(def things [{:foo 1 :bar 2}\n             {:foo 3 :bar 4}\n             {:foo 5 :bar 6}])\n(map :foo things)\n;;=> (1 3 5)\n```"}],
   :full-name "syntax/keyword"},
  "pr-str"
  {:ns "cljs.core",
   :name "pr-str",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/pr-str",
   :docstring
   "pr to a string, returning it. Fundamental entrypoint to IPrintWithWriter.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "remove"
  {:ns "clojure.zip",
   :name "remove",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/remove",
   :docstring
   "Removes the node at loc, returning the loc that would have preceded\nit in a depth-first walk.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "fold"
  {:ns "clojure.core.reducers",
   :name "fold",
   :signature
   ["[reducef coll]"
    "[combinef reducef coll]"
    "[n combinef reducef coll]"],
   :type "function",
   :full-name "clojure.core.reducers/fold",
   :docstring
   "Reduces a collection using a (potentially parallel) reduce-combine\nstrategy. The collection is partitioned into groups of approximately\nn (default 512), each of which is reduced with reducef (with a seed\nvalue obtained by calling (combinef) with no arguments). The results\nof these reductions are then reduced with combinef (default\nreducef). combinef must be associative, and, when called with no\narguments, (combinef) must produce its identity element. These\noperations may be performed in parallel, but the results will\npreserve order.\n\nNote: Performing operations in parallel is currently not implemented.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bootjs"
  {:ns "cljs.repl.rhino",
   :name "bootjs",
   :type "var",
   :full-name "cljs.repl.rhino/bootjs",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "delay?"
  {:ns "cljs.core",
   :name "delay?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/delay?",
   :docstring "returns true if x is a Delay created with delay",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "fresh-line"
  {:ns "cljs.pprint",
   :name "fresh-line",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.pprint/fresh-line",
   :docstring
   "Make a newline if *out* is not already at the beginning of the line. If *out* is\nnot a pretty writer (which keeps track of columns), this function always outputs a newline.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "iteration"
  {:ns "cljs.core",
   :name "iteration",
   :signature ["[xform coll]"],
   :type "function",
   :full-name "cljs.core/iteration",
   :docstring
   "Returns an iterable/seqable/reducible sequence of applications of\nthe transducer to the items in coll. Note that these applications\nwill be performed every time iterator/seq/reduce is called.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Namespace"
  {:ns "cljs.core",
   :name "Namespace",
   :signature ["[obj name]"],
   :type "type",
   :full-name "cljs.core/Namespace",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "evaluate-form"
  {:ns "cljs.repl",
   :name "evaluate-form",
   :signature
   ["[repl-env env filename form]"
    "[repl-env env filename form wrap]"
    "[repl-env env filename form wrap opts]"],
   :type "function",
   :full-name "cljs.repl/evaluate-form",
   :docstring
   "Evaluate a ClojureScript form in the JavaScript environment. Returns a\nstring which is the ClojureScript return value. This string may or may\nnot be readable by the Clojure reader.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ranged-iterator"
  {:ns "cljs.core",
   :name "ranged-iterator",
   :signature ["[v start end]"],
   :type "function",
   :full-name "cljs.core/ranged-iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "interleave"
  {:description
   "Returns a lazy seq of the first item in each collection, then the second items,\nthen the third, etc.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "interleave",
   :signature ["[c1 c2]" "[c1 c2 & colls]"],
   :type "function",
   :related ["cljs.core/interpose" "cljs.core/zipmap"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy seq of the first item in each collection, then the second items, then the third, etc.</p>",
   :full-name "cljs.core/interleave",
   :docstring
   "Returns a lazy seq of the first item in each coll, then the second etc."},
  "server-state"
  {:ns "cljs.repl.browser",
   :name "server-state",
   :type "var",
   :full-name "cljs.repl.browser/server-state",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-caught"
  {:ns "cljs.repl",
   :name "repl-caught",
   :signature ["[e repl-env opts]"],
   :type "function",
   :full-name "cljs.repl/repl-caught",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "html->dom"
  {:ns "clojure.browser.dom",
   :name "html->dom",
   :signature ["[s]"],
   :type "function",
   :full-name "clojure.browser.dom/html->dom",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "prewalk-replace"
  {:ns "clojure.walk",
   :name "prewalk-replace",
   :signature ["[smap form]"],
   :type "function",
   :full-name "clojure.walk/prewalk-replace",
   :docstring
   "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the root of the tree first.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "map?"
  {:description "Returns true if `x` is a map, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "map?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/hash-map" "cljs.core/sorted-map"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a map, false otherwise.</p>",
   :full-name "cljs.core/map?",
   :docstring "Return true if x satisfies IMap"},
  "setup"
  {:ns "cljs.repl.node",
   :name "setup",
   :signature ["[repl-env]" "[repl-env opts]"],
   :type "function",
   :full-name "cljs.repl.node/setup",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-not"
  {:description "Bitwise complement.  Same as `~x` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-not 2r1100&#41;\n;;=&gt; -13\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-not 12&#41;\n;;=&gt; -13\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-not",
   :signature ["[x]"],
   :type "function/macro",
   :examples-strings
   [[["(bit-not 2r1100) ;;=> -13"] ["(bit-not 12) ;;=> -13"]]],
   :description-html
   "<p>Bitwise complement.  Same as <code>&#126;x</code> in JavaScript.</p>",
   :examples
   [{:id "d4c5e3",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-not 2r1100)\n;;=> -13\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-not 12)\n;;=> -13\n```"}],
   :full-name "cljs.core/bit-not",
   :docstring "Bitwise complement"},
  "firefox-clean-function"
  {:ns "cljs.repl.browser",
   :name "firefox-clean-function",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.repl.browser/firefox-clean-function",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "rand-nth"
  {:description
   "Returns a random element from a sequential collection `coll`.\n\nHas the same performance characteristics as `nth`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "rand-nth",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/rand"],
   :examples-strings [],
   :description-html
   "<p>Returns a random element from a sequential collection <code>coll</code>.</p><p>Has the same performance characteristics as <code>nth</code>.</p>",
   :full-name "cljs.core/rand-nth",
   :docstring
   "Return a random element of the (sequential) collection. Will have\nthe same performance characteristics as nth for the given\ncollection."},
  "dump-core"
  {:ns "cljs.js",
   :name "dump-core",
   :signature ["[]"],
   :type "macro",
   :full-name "cljs.js/dump-core",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "number"
  {:description
   "ClojureScript numbers are the same as [JavaScript numbers],\ndouble-precision 64-bit format IEEE 754.\n\n[JavaScript numbers]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Numbers_and_dates#Numbers\n\nAvailable formats listed below. Decimal points are not allowed when specifying\na custom base.\n\n- decimal `123` `1.23`\n- exponent `12e3` `1.2e3` `1.2e-3`\n- hexadecimal `0x123`\n- octal `0123`\n- binary `2r0110`\n- arbitrary `NrXXX` where `(<= 2 N 36)` and `X` is in `[0-9,A-Z]`",
   :examples-htmls
   ["<pre><code class=\"clj\">123\n;;=&gt; 123\n\n123.45\n;;=&gt; 123.45\n</code></pre><p>Scientific notation;</p><pre><code class=\"clj\">12e3\n;;=&gt; 12000\n\n1.2e-3\n;;=&gt; 0.0012\n</code></pre><p>Standard hex and octal notations:</p><pre><code class=\"clj\">0x1f\n;;=&gt; 31\n\n010\n;;=&gt; 8\n</code></pre><p>Radix notation for using up to base 36.</p><pre><code class=\"clj\">2r10111\n;;=&gt; 23\n\n8r32\n;;=&gt; 26\n\n16rFF\n;;=&gt; 255\n\n36rZ\n;;=&gt; 35\n</code></pre>"],
   :ns "syntax",
   :name "number",
   :type "syntax",
   :related
   ["syntax/Infinity"
    "syntax/NaN"
    "cljs.core/number?"
    "cljs.core/integer?"
    "cljs.core/int"],
   :examples-strings
   [[["123 ;;=> 123" "123.45 ;;=> 123.45"]
     ["12e3 ;;=> 12000" "1.2e-3 ;;=> 0.0012"]
     ["0x1f ;;=> 31" "010 ;;=> 8"]
     ["2r10111 ;;=> 23"
      "8r32 ;;=> 26"
      "16rFF ;;=> 255"
      "36rZ ;;=> 35"]]],
   :description-html
   "<p>ClojureScript numbers are the same as [JavaScript numbers], double-precision 64-bit format IEEE 754.</p><p>[JavaScript numbers]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Numbers<i>and</i>dates#Numbers</p><p>Available formats listed below. Decimal points are not allowed when specifying a custom base.</p><ul><li>decimal <code>123</code> <code>1.23</code></li><li>exponent <code>12e3</code> <code>1.2e3</code> <code>1.2e-3</code></li><li>hexadecimal <code>0x123</code></li><li>octal <code>0123</code></li><li>binary <code>2r0110</code></li><li>arbitrary <code>NrXXX</code> where <code>&#40;&lt;= 2 N 36&#41;</code> and <code>X</code> is in <code>&#91;0-9,A-Z&#93;</code></li></ul>",
   :examples
   [{:id "f96060",
     :content
     "```clj\n123\n;;=> 123\n\n123.45\n;;=> 123.45\n```\n\nScientific notation;\n\n```clj\n12e3\n;;=> 12000\n\n1.2e-3\n;;=> 0.0012\n```\n\nStandard hex and octal notations:\n\n```clj\n0x1f\n;;=> 31\n\n010\n;;=> 8\n```\n\nRadix notation for using up to base 36.\n\n```clj\n2r10111\n;;=> 23\n\n8r32\n;;=> 26\n\n16rFF\n;;=> 255\n\n36rZ\n;;=> 35\n```"}],
   :full-name "syntax/number"},
  "PersistentTreeMap"
  {:ns "cljs.core",
   :name "PersistentTreeMap",
   :signature ["[comp tree cnt meta __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentTreeMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentTreeMapSeq"
  {:ns "cljs.core",
   :name "PersistentTreeMapSeq",
   :signature ["[meta stack ascending? cnt __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentTreeMapSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ints"
  {:ns "cljs.core",
   :name "ints",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/ints",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "BitmapIndexedNode.EMPTY"
  {:ns "cljs.core",
   :name "BitmapIndexedNode.EMPTY",
   :type "var",
   :full-name "cljs.core/BitmapIndexedNode.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ES6IteratorSeq"
  {:ns "cljs.core",
   :name "ES6IteratorSeq",
   :signature ["[value iter _rest]"],
   :type "type",
   :full-name "cljs.core/ES6IteratorSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentHashSet.EMPTY"
  {:ns "cljs.core",
   :name "PersistentHashSet.EMPTY",
   :type "var",
   :full-name "cljs.core/PersistentHashSet.EMPTY",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "append!"
  {:ns "clojure.core.reducers",
   :name "append!",
   :signature ["[acc x]"],
   :type "function",
   :full-name "clojure.core.reducers/append!",
   :docstring ".adds x to acc and returns acc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "walk"
  {:ns "clojure.walk",
   :name "walk",
   :signature ["[inner outer form]"],
   :type "function",
   :full-name "clojure.walk/walk",
   :docstring
   "Traverses form, an arbitrary data structure.  inner and outer are\nfunctions.  Applies inner to each element of form, building up a\ndata structure of the same type, then applies outer to the result.\nRecognizes all Clojure data structures. Consumes seqs as with doall.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-filename"
  {:ns "cljs.test",
   :name "js-filename",
   :signature ["[stack-element]"],
   :type "function",
   :full-name "cljs.test/js-filename",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "entries-iterator"
  {:ns "cljs.core",
   :name "entries-iterator",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/entries-iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "lazy-seq"
  {:description "Returns a new lazy sequence.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "lazy-seq",
   :signature ["[& body]"],
   :type "macro",
   :related
   ["cljs.core/lazy-cat"
    "cljs.core/realized?"
    "cljs.core/doall"
    "cljs.core/iterate"],
   :examples-strings [],
   :description-html "<p>Returns a new lazy sequence.</p>",
   :full-name "cljs.core/lazy-seq",
   :docstring
   "Takes a body of expressions that returns an ISeq or nil, and yields\na ISeqable object that will invoke the body only the first time seq\nis called, and will cache the result and return it on all subsequent\nseq calls."},
  "partition-all"
  {:description
   "Returns a lazy sequence of lists like `partition`, but may include partitions\nwith fewer than `n` items at the end.\n\nReturns a stateful transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "partition-all",
   :signature ["[n]" "[n coll]" "[n step coll]"],
   :type "function",
   :related ["cljs.core/partition" "cljs.core/partition-by"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of lists like <code>partition</code>, but may include partitions with fewer than <code>n</code> items at the end.</p><p>Returns a stateful transducer when no collection is provided.</p>",
   :full-name "cljs.core/partition-all",
   :docstring
   "Returns a lazy sequence of lists like partition, but may include\npartitions with fewer than n items at the end.  Returns a stateful\ntransducer when no collection is provided."},
  "mapcat"
  {:ns "clojure.core.reducers",
   :name "mapcat",
   :signature ["[f]" "[f coll]"],
   :type "function",
   :full-name "clojure.core.reducers/mapcat",
   :docstring
   "Applies f to every value in the reduction of coll, concatenating the result\n  colls of (f val). Foldable.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*unchecked-if*"
  {:ns "cljs.core",
   :name "*unchecked-if*",
   :type "var",
   :full-name "cljs.core/*unchecked-if*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-method"
  {:ns "cljs.core",
   :name "get-method",
   :signature ["[multifn dispatch-val]"],
   :type "function",
   :full-name "cljs.core/get-method",
   :docstring
   "Given a multimethod and a dispatch value, returns the dispatch fn\nthat would apply to that value, or nil if none apply and no default",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  ">="
  {:description
   "Returns true if each successive number argument is less than or equal to the\nprevious one, false otherwise.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;&gt;= 2 1&#41;\n;;=&gt; true\n\n&#40;&gt;= 2 2&#41;\n;;=&gt; true\n\n&#40;&gt;= 1 2&#41;\n;;=&gt; false\n\n&#40;&gt;= 6 5 4 3 2&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name ">=",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/>"],
   :examples-strings
   [[["(>= 2 1) ;;=> true"
      "(>= 2 2) ;;=> true"
      "(>= 1 2) ;;=> false"
      "(>= 6 5 4 3 2) ;;=> true"]]],
   :description-html
   "<p>Returns true if each successive number argument is less than or equal to the previous one, false otherwise.</p>",
   :examples
   [{:id "de73d7",
     :content
     "```clj\n(>= 2 1)\n;;=> true\n\n(>= 2 2)\n;;=> true\n\n(>= 1 2)\n;;=> false\n\n(>= 6 5 4 3 2)\n;;=> true\n```"}],
   :full-name "cljs.core/>=",
   :docstring
   "Returns non-nil if nums are in monotonically non-increasing order,\notherwise false."},
  "int-rotate-left"
  {:ns "cljs.core",
   :name "int-rotate-left",
   :signature ["[x n]"],
   :type "function",
   :full-name "cljs.core/int-rotate-left",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "exists?"
  {:ns "cljs.core",
   :name "exists?",
   :signature ["[x]"],
   :type "macro",
   :full-name "cljs.core/exists?",
   :docstring
   "Return true if argument exists, analogous to usage of typeof operator\nin JavaScript.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "testing-contexts-str"
  {:ns "cljs.test",
   :name "testing-contexts-str",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.test/testing-contexts-str",
   :docstring
   "Returns a string representation of the current test context. Joins\nstrings in *testing-contexts* with spaces.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*cljs-verbose*"
  {:ns "cljs.repl",
   :name "*cljs-verbose*",
   :type "dynamic var",
   :full-name "cljs.repl/*cljs-verbose*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-listener"
  {:ns "clojure.browser.event",
   :name "get-listener",
   :signature ["[src type listener opt_capt opt_handler]"],
   :type "function",
   :full-name "clojure.browser.event/get-listener",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "goog-define"
  {:ns "cljs.core",
   :name "goog-define",
   :signature ["[sym default]"],
   :type "macro",
   :full-name "cljs.core/goog-define",
   :docstring
   "Defines a var using `goog.define`. Passed default value must be\nstring, number or boolean.\n\nDefault value can be overridden at compile time using the\ncompiler option `:closure-defines`.\n\nExample:\n  (ns your-app.core)\n  (goog-define DEBUG! false)\n  ;; can be overridden with\n  :closure-defines {\"your_app.core.DEBUG_BANG_\" true}\n  or\n  :closure-defines {'your-app.core/DEBUG! true}",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bytes"
  {:ns "cljs.core",
   :name "bytes",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/bytes",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "missing-protocol"
  {:ns "cljs.core",
   :name "missing-protocol",
   :signature ["[proto obj]"],
   :type "function",
   :full-name "cljs.core/missing-protocol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "eval*"
  {:ns "cljs.js",
   :name "eval*",
   :signature ["[bound-vars form opts cb]"],
   :type "function",
   :full-name "cljs.js/eval*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IChunk"
  {:ns "cljs.core",
   :name "IChunk",
   :type "protocol",
   :full-name "cljs.core/IChunk",
   :docstring "Protocol for accessing the items of a chunk.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "prn"
  {:ns "cljs.core",
   :name "prn",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/prn",
   :docstring "Same as pr followed by (newline).",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dir"
  {:description
   "Prints a sorted directory of public vars in a namespace `ns`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;require 'clojure.set&#41;\n\n&#40;dir clojure.set&#41;\n;; Prints:\n;;  difference\n;;  index\n;;  intersection\n;;  join\n;;  map-invert\n;;  project\n;;  rename\n;;  rename-keys\n;;  select\n;;  subset?\n;;  superset?\n;;  union\n;;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.repl",
   :name "dir",
   :signature ["[ns]"],
   :type "macro",
   :related ["cljs.repl/find-doc" "cljs.repl/apropos"],
   :examples-strings
   [[["(require 'clojure.set)"
      "(dir clojure.set) ;; Prints: ;;  difference ;;  index ;;  intersection ;;  join ;;  map-invert ;;  project ;;  rename ;;  rename-keys ;;  select ;;  subset? ;;  superset? ;;  union ;; ;;=> nil"]]],
   :description-html
   "<p>Prints a sorted directory of public vars in a namespace <code>ns</code>.</p>",
   :examples
   [{:id "9bf2b0",
     :content
     "```clj\n(require 'clojure.set)\n\n(dir clojure.set)\n;; Prints:\n;;  difference\n;;  index\n;;  intersection\n;;  join\n;;  map-invert\n;;  project\n;;  rename\n;;  rename-keys\n;;  select\n;;  subset?\n;;  superset?\n;;  union\n;;\n;;=> nil\n```"}],
   :full-name "cljs.repl/dir",
   :docstring
   "Prints a sorted directory of public vars in a namespace"},
  "analyze-deps"
  {:ns "cljs.js",
   :name "analyze-deps",
   :signature
   ["[bound-vars ana-env lib deps cb]"
    "[bound-vars ana-env lib deps opts cb]"],
   :type "function",
   :full-name "cljs.js/analyze-deps",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns->location"
  {:ns "cljs.build.api",
   :name "ns->location",
   :signature ["[ns]" "[ns compiler-env]"],
   :type "function",
   :full-name "cljs.build.api/ns->location",
   :docstring
   "Given a namespace and compilation environment return the relative path and\nuri of the corresponding source regardless of the source language extension:\n.cljs, .cljc, .js. Returns a map containing :relative-path a string, and\n:uri a URL.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "concat"
  {:description
   "Returns a lazy sequence representing the concatenation of the elements in the\nsupplied collections.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;concat &#40;list 1 2 3&#41; &#40;list 4 5 6&#41;&#41;\n;;=&gt; &#40;1 2 3 4 5 6&#41;\n\n&#40;concat &#91;1 2 3&#93; &#40;list 4 5 6&#41;&#41;\n;; =&gt; &#40;1 2 3 4 5 6&#41;\n\n&#40;concat &#91;1&#93; &#91;2&#93; &#91;3&#93;&#41;\n;; =&gt; &#40;1 2 3&#41;\n</code></pre>"],
   :ns "cljs.core",
   :name "concat",
   :signature ["[]" "[x]" "[x y]" "[x y & zs]"],
   :type "function",
   :related ["cljs.core/conj" "cljs.core/into"],
   :examples-strings
   [[["(concat (list 1 2 3) (list 4 5 6)) ;;=> (1 2 3 4 5 6)"
      "(concat [1 2 3] (list 4 5 6)) ;; => (1 2 3 4 5 6)"
      "(concat [1] [2] [3]) ;; => (1 2 3)"]]],
   :description-html
   "<p>Returns a lazy sequence representing the concatenation of the elements in the supplied collections.</p>",
   :examples
   [{:id "dcc019",
     :content
     "```clj\n(concat (list 1 2 3) (list 4 5 6))\n;;=> (1 2 3 4 5 6)\n\n(concat [1 2 3] (list 4 5 6))\n;; => (1 2 3 4 5 6)\n\n(concat [1] [2] [3])\n;; => (1 2 3)\n```"}],
   :full-name "cljs.core/concat",
   :docstring
   "Returns a lazy seq representing the concatenation of the elements in the supplied colls."},
  "chunk-rest"
  {:ns "cljs.core",
   :name "chunk-rest",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.core/chunk-rest",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr-sequential-writer"
  {:ns "cljs.core",
   :name "pr-sequential-writer",
   :signature ["[writer print-one begin sep end opts coll]"],
   :type "function",
   :full-name "cljs.core/pr-sequential-writer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "filter"
  {:ns "clojure.core.reducers",
   :name "filter",
   :signature ["[pred]" "[pred coll]"],
   :type "function",
   :full-name "clojure.core.reducers/filter",
   :docstring
   "Retains values in the reduction of coll for which (pred val)\n  returns logical true. Foldable.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "take-last"
  {:description
   "Returns a sequence of the last `n` items in `coll`.\n\nDepending on the type of collection, `take-last` may be no faster than linear\ntime. For vectors, please use `subvec`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "take-last",
   :signature ["[n coll]"],
   :type "function",
   :related
   ["cljs.core/last" "cljs.core/butlast" "cljs.core/drop-last"],
   :examples-strings [],
   :description-html
   "<p>Returns a sequence of the last <code>n</code> items in <code>coll</code>.</p><p>Depending on the type of collection, <code>take-last</code> may be no faster than linear time. For vectors, please use <code>subvec</code>.</p>",
   :full-name "cljs.core/take-last",
   :docstring
   "Returns a seq of the last n items in coll.  Depending on the type\nof coll may be no better than linear time.  For vectors, see also subvec."},
  "sorted-set-by"
  {:description
   "Returns a new sorted set with supplied `keys`, using the supplied `comparator`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sorted-set-by",
   :signature ["[comparator & keys]"],
   :type "function",
   :related
   ["cljs.core/sorted-set"
    "cljs.core/sorted-map-by"
    "cljs.core/compare"],
   :examples-strings [],
   :description-html
   "<p>Returns a new sorted set with supplied <code>keys</code>, using the supplied <code>comparator</code>.</p>",
   :full-name "cljs.core/sorted-set-by",
   :docstring
   "Returns a new sorted set with supplied keys, using the supplied comparator."},
  "ns-interns*"
  {:ns "cljs.core",
   :name "ns-interns*",
   :signature ["[sym]"],
   :type "function",
   :full-name "cljs.core/ns-interns*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-remainder-int"
  {:ns "cljs.core",
   :name "unchecked-remainder-int",
   :signature ["[x n]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-remainder-int",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-literal"
  {:ns "cljs.reader",
   :name "read-literal",
   :signature ["[rdr ch]"],
   :type "function",
   :full-name "cljs.reader/read-literal",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-regex"
  {:ns "cljs.reader",
   :name "read-regex",
   :signature ["[rdr ch]"],
   :type "function",
   :full-name "cljs.reader/read-regex",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "symbol"
  {:ns "cljs.core",
   :name "symbol",
   :signature ["[name]" "[ns name]"],
   :type "function",
   :full-name "cljs.core/symbol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "time"
  {:ns "cljs.core",
   :name "time",
   :signature ["[expr]"],
   :type "macro",
   :full-name "cljs.core/time",
   :docstring
   "Evaluates expr and prints the time it took. Returns the value of expr.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "add-dependencies"
  {:ns "cljs.build.api",
   :name "add-dependencies",
   :signature ["[opts & ijss]"],
   :type "function",
   :full-name "cljs.build.api/add-dependencies",
   :docstring
   "Given one or more IJavaScript objects in dependency order, produce\na new sequence of IJavaScript objects which includes the input list\nplus all dependencies in dependency order.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-in"
  {:description
   "Determines if property `key` is in JavaScript object `obj`.\n\nEquivalent to `key in obj` in JavaScript.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a #js {:foo 1 :bar 2}&#41;\n\n&#40;js-in &quot;foo&quot; a&#41;\n;;=&gt; true\n\n&#40;js-in &quot;hello&quot; a&#41;\n;;=&gt; false\n</code></pre><p>Properties inherited from prototype chain are also detected:</p><pre><code class=\"clj\">&#40;js-in &quot;toString&quot; a&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name "js-in",
   :signature ["[key obj]"],
   :type "macro",
   :related ["cljs.core/contains?"],
   :examples-strings
   [[["(def a #js {:foo 1 :bar 2})"
      "(js-in \"foo\" a) ;;=> true"
      "(js-in \"hello\" a) ;;=> false"]
     ["(js-in \"toString\" a) ;;=> true"]]],
   :description-html
   "<p>Determines if property <code>key</code> is in JavaScript object <code>obj</code>.</p><p>Equivalent to <code>key in obj</code> in JavaScript.</p>",
   :examples
   [{:id "a45b18",
     :content
     "```clj\n(def a #js {:foo 1 :bar 2})\n\n(js-in \"foo\" a)\n;;=> true\n\n(js-in \"hello\" a)\n;;=> false\n```\n\nProperties inherited from prototype chain are also detected:\n\n```clj\n(js-in \"toString\" a)\n;;=> true\n```"}],
   :full-name "cljs.core/js-in"},
  "empty"
  {:description
   "Returns an empty collection of the same category as `coll`.\n\nReturns nil if `coll` is nil.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "empty",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/not-empty"],
   :examples-strings [],
   :description-html
   "<p>Returns an empty collection of the same category as <code>coll</code>.</p><p>Returns nil if <code>coll</code> is nil.</p>",
   :full-name "cljs.core/empty",
   :docstring
   "Returns an empty collection of the same category as coll, or nil"},
  "PersistentQueueIter"
  {:ns "cljs.core",
   :name "PersistentQueueIter",
   :signature ["[fseq riter]"],
   :type "type",
   :full-name "cljs.core/PersistentQueueIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "condp"
  {:description
   "Takes a binary predicate, an expression, and a set of clauses. There are two\nkinds of clauses:\n\nBinary clause: `test-expr` `result-expr`\n\nTernary clause: `test-expr` `:>>` `result-fn`<br />\n(Note: `:>>` is an ordinary keyword)\n\nFor each clause, `(pred test-expr expr)` is evaluated. If it returns logical\ntrue, the clause is a match.\n\nIf a binary clause matches, its `result-expr` is returned.\n\nIf a ternary clause matches, its `result-fn` is called with the result of the\npredicate and returned by `condp`. `result-fn` should take one argument.\n\nA single default expression can follow the clauses, and its value will be\nreturned if no clause matches.\n\nIf no default expression is provided and no clause matches, an Error is thrown.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "condp",
   :signature ["[pred expr & clauses]"],
   :type "macro",
   :related ["cljs.core/cond" "special/if"],
   :examples-strings [],
   :description-html
   "<p>Takes a binary predicate, an expression, and a set of clauses. There are two kinds of clauses:</p><p>Binary clause: <code>test-expr</code> <code>result-expr</code></p><p>Ternary clause: <code>test-expr</code> <code>:&gt;&gt;</code> <code>result-fn</code><br /> (Note: <code>:&gt;&gt;</code> is an ordinary keyword)</p><p>For each clause, <code>&#40;pred test-expr expr&#41;</code> is evaluated. If it returns logical true, the clause is a match.</p><p>If a binary clause matches, its <code>result-expr</code> is returned.</p><p>If a ternary clause matches, its <code>result-fn</code> is called with the result of the predicate and returned by <code>condp</code>. <code>result-fn</code> should take one argument.</p><p>A single default expression can follow the clauses, and its value will be returned if no clause matches.</p><p>If no default expression is provided and no clause matches, an Error is thrown.</p>",
   :full-name "cljs.core/condp",
   :docstring
   "Takes a binary predicate, an expression, and a set of clauses.\nEach clause can take the form of either:\n\ntest-expr result-expr\n\ntest-expr :>> result-fn\n\nNote :>> is an ordinary keyword.\n\nFor each clause, (pred test-expr expr) is evaluated. If it returns\nlogical true, the clause is a match. If a binary clause matches, the\nresult-expr is returned, if a ternary clause matches, its result-fn,\nwhich must be a unary function, is called with the result of the\npredicate as its argument, the result of that call being the return\nvalue of condp. A single default expression can follow the clauses,\nand its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an\nIllegalArgumentException is thrown."},
  "hash-ordered-coll"
  {:ns "cljs.core",
   :name "hash-ordered-coll",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/hash-ordered-coll",
   :docstring
   "Returns the hash code, consistent with =, for an external ordered\ncollection implementing Iterable.\nSee http://clojure.org/data_structures#hash for full algorithms.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unsigned-bit-shift-right"
  {:description "Bitwise shift right with zero fill",
   :examples-htmls [],
   :ns "cljs.core",
   :name "unsigned-bit-shift-right",
   :signature ["[x n]"],
   :type "function/macro",
   :related ["cljs.core/bit-shift-right"],
   :examples-strings [],
   :description-html "<p>Bitwise shift right with zero fill</p>",
   :full-name "cljs.core/unsigned-bit-shift-right",
   :docstring "Bitwise shift right with zero fill"},
  "read-past"
  {:ns "cljs.reader",
   :name "read-past",
   :signature ["[pred rdr]"],
   :type "function",
   :full-name "cljs.reader/read-past",
   :docstring
   "Read until first character that doesn't match pred, returning\nchar.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "intersection"
  {:description
   "Return a set that is the intersection of the input sets.",
   :examples-htmls [],
   :ns "clojure.set",
   :name "intersection",
   :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
   :type "function",
   :related
   ["clojure.set/union"
    "clojure.set/difference"
    "clojure.set/superset?"
    "clojure.set/project"],
   :examples-strings [],
   :description-html
   "<p>Return a set that is the intersection of the input sets.</p>",
   :full-name "clojure.set/intersection",
   :docstring
   "Return a set that is the intersection of the input sets"},
  "load-javascript"
  {:ns "cljs.repl.rhino",
   :name "load-javascript",
   :signature ["[repl-env ns url]"],
   :type "function",
   :full-name "cljs.repl.rhino/load-javascript",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "RSeq"
  {:ns "cljs.core",
   :name "RSeq",
   :signature ["[ci i meta]"],
   :type "type",
   :full-name "cljs.core/RSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "comparator"
  {:ns "cljs.core",
   :name "comparator",
   :signature ["[pred]"],
   :type "function",
   :full-name "cljs.core/comparator",
   :docstring
   "Returns an JavaScript compatible comparator based upon pred.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "send-result"
  {:ns "clojure.browser.repl",
   :name "send-result",
   :signature ["[connection url data]"],
   :type "function",
   :full-name "clojure.browser.repl/send-result",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "INamed"
  {:ns "cljs.core",
   :name "INamed",
   :type "protocol",
   :full-name "cljs.core/INamed",
   :docstring "Protocol for adding a name.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "monoid"
  {:ns "clojure.core.reducers",
   :name "monoid",
   :signature ["[op ctor]"],
   :type "function",
   :full-name "clojure.core.reducers/monoid",
   :docstring
   "Builds a combining fn out of the supplied operator and identity\nconstructor. op must be associative and ctor called with no args\nmust return an identity value for it.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "complement"
  {:description
   "Takes a function `f` and returns a function that takes the same arguments as\n`f`, has the same effects, if any, and returns the opposite truth value.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a 10&#41;\n&#40;&#40;complement #&#40;= a %&#41;&#41; 12&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name "complement",
   :signature ["[f]"],
   :type "function",
   :related ["cljs.core/not"],
   :examples-strings
   [[["(def a 10)" "((complement #(= a %)) 12) ;;=> true"]]],
   :description-html
   "<p>Takes a function <code>f</code> and returns a function that takes the same arguments as <code>f</code>, has the same effects, if any, and returns the opposite truth value.</p>",
   :examples
   [{:id "69e359",
     :content
     "```clj\n(def a 10)\n((complement #(= a %)) 12)\n;;=> true\n```"}],
   :full-name "cljs.core/complement",
   :docstring
   "Takes a fn f and returns a fn that takes the same arguments as f,\nhas the same effects, if any, and returns the opposite truth value."},
  "Vector"
  {:ns "cljs.core",
   :name "Vector",
   :signature ["[meta array __hash]"],
   :type "type",
   :full-name "cljs.core/Vector",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "when"
  {:description
   "Evaluates `test`. If logical true, evaluates `body` in an implicit `do`.\n\n`when` is often used instead of `if` for conditions that do not have an \"else\".",
   :examples-htmls [],
   :ns "cljs.core",
   :name "when",
   :signature ["[test & body]"],
   :type "macro",
   :related ["cljs.core/when-not" "cljs.core/when-let" "special/if"],
   :examples-strings [],
   :description-html
   "<p>Evaluates <code>test</code>. If logical true, evaluates <code>body</code> in an implicit <code>do</code>.</p><p><code>when</code> is often used instead of <code>if</code> for conditions that do not have an \"else\".</p>",
   :full-name "cljs.core/when",
   :docstring
   "Evaluates test. If logical true, evaluates body in an implicit do."},
  "keyword-qualify"
  {:description
   "Keywords starting with `::` will evaluate to regular keywords with a namespace qualification.\nThe namespace will resolve to either of the following:\n\n- current namespace if none is specified\n- given namespace if it exists\n- full namespace if the given one is an alias\n- reader error if given namespace doesn't exist",
   :examples-htmls
   ["<p>If we are in the <code>user</code> namespace:</p><pre><code class=\"clj\">::foo\n;;=&gt; :user/foo\n</code></pre><p>We can use namespace aliases:</p><pre><code class=\"clj\">&#40;require '&#91;example.util :as util&#93;&#41;\n\n::util/foo\n;;=&gt; :example.util/foo\n</code></pre><p>Existing namespaces will resolve normally:</p><pre><code class=\"clj\">::cljs.core/foo\n;;=&gt; :cljs.core/foo\n</code></pre><p>Non-existing namespaces will throw a reader exception:</p><pre><code class=\"clj\">::foo/bar\n;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ...\n</code></pre>"],
   :ns "syntax",
   :name "keyword-qualify",
   :type "syntax",
   :related
   ["syntax/keyword" "cljs.core/keyword" "cljs.core/keyword?"],
   :examples-strings
   [[["::foo ;;=> :user/foo"]
     ["(require '[example.util :as util])"
      "::util/foo ;;=> :example.util/foo"]
     ["::cljs.core/foo ;;=> :cljs.core/foo"]
     ["::foo/bar ;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ..."]]],
   :description-html
   "<p>Keywords starting with <code>::</code> will evaluate to regular keywords with a namespace qualification. The namespace will resolve to either of the following:</p><ul><li>current namespace if none is specified</li><li>given namespace if it exists</li><li>full namespace if the given one is an alias</li><li>reader error if given namespace doesn't exist</li></ul>",
   :examples
   [{:id "b0a135",
     :content
     "If we are in the `user` namespace:\n\n```clj\n::foo\n;;=> :user/foo\n```\n\nWe can use namespace aliases:\n\n```clj\n(require '[example.util :as util])\n\n::util/foo\n;;=> :example.util/foo\n```\n\nExisting namespaces will resolve normally:\n\n```clj\n::cljs.core/foo\n;;=> :cljs.core/foo\n```\n\nNon-existing namespaces will throw a reader exception:\n\n```clj\n::foo/bar\n;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ...\n```"}],
   :full-name "syntax/keyword-qualify"},
  "let*"
  {:ns "special",
   :name "let*",
   :type "special form",
   :full-name "special/let*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "vector-zip"
  {:ns "clojure.zip",
   :name "vector-zip",
   :signature ["[root]"],
   :type "function",
   :full-name "clojure.zip/vector-zip",
   :docstring
   "Returns a zipper for nested vectors, given a root vector",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-discard"
  {:ns "cljs.reader",
   :name "read-discard",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-discard",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "register-tag-parser!"
  {:ns "cljs.reader",
   :name "register-tag-parser!",
   :signature ["[tag f]"],
   :type "function",
   :full-name "cljs.reader/register-tag-parser!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "insert-left"
  {:ns "clojure.zip",
   :name "insert-left",
   :signature ["[loc item]"],
   :type "function",
   :full-name "clojure.zip/insert-left",
   :docstring
   "Inserts the item as the left sibling of the node at this loc,\nwithout moving",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*repl-opts*"
  {:ns "cljs.repl",
   :name "*repl-opts*",
   :type "dynamic var",
   :full-name "cljs.repl/*repl-opts*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "lazy-transformer"
  {:ns "cljs.core",
   :name "lazy-transformer",
   :signature ["[stepper]"],
   :type "function",
   :full-name "cljs.core/lazy-transformer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "desugar-meta"
  {:ns "cljs.reader",
   :name "desugar-meta",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.reader/desugar-meta",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "make-unicode-char"
  {:ns "cljs.reader",
   :name "make-unicode-char",
   :signature ["[code-str]"],
   :type "function",
   :full-name "cljs.reader/make-unicode-char",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-element"
  {:ns "clojure.browser.dom",
   :name "get-element",
   :signature ["[id]"],
   :type "function",
   :full-name "clojure.browser.dom/get-element",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "chunked-seq"
  {:ns "cljs.core",
   :name "chunked-seq",
   :signature
   ["[vec i off]" "[vec node i off]" "[vec node i off meta]"],
   :type "function",
   :full-name "cljs.core/chunked-seq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "xml-zip"
  {:ns "clojure.zip",
   :name "xml-zip",
   :signature ["[root]"],
   :type "function",
   :full-name "clojure.zip/xml-zip",
   :docstring
   "Returns a zipper for xml elements (as from xml/parse),\ngiven a root element",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "symbol?"
  {:ns "cljs.core",
   :name "symbol?",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/symbol?",
   :docstring "Return true if x is a Symbol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compile"
  {:ns "cljs.js",
   :name "compile",
   :signature
   ["[state source cb]"
    "[state source name cb]"
    "[state source name opts cb]"],
   :type "function",
   :full-name "cljs.js/compile",
   :docstring
   "Compile ClojureScript source into JavaScript. The parameters:\n\nstate (atom)\n  the compiler state\n\nsource (string)\n  the ClojureScript source\n\nname (symbol)\n  optional, the name of the source\n\nopts (map)\n  compilation options.\n\n  :load       - library resolution function, see *load-fn*\n  :source-map - set to true to generate inline source map information\n\ncb (function)\n  callback, will be invoked with a map. If successful the map will contain\n  a key :value with the compilation result (string). If unsuccessful the map\n  will contain a key :error with an ex-info instance describing the cause\n  of failure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-client-js"
  {:ns "cljs.repl.browser",
   :name "repl-client-js",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.repl.browser/repl-client-js",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-file"
  {:ns "cljs.repl.rhino",
   :name "load-file",
   :signature ["[repl-env opts src]"],
   :type "function",
   :full-name "cljs.repl.rhino/load-file",
   :docstring
   "Load a JavaScript. This is needed to load JavaScript files before the Rhino\nenvironment is bootstrapped. After bootstrapping load-javascript will be\nused.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl"
  {:ns "cljs.repl",
   :name "repl",
   :signature ["[repl-env & opts]"],
   :type "function",
   :full-name "cljs.repl/repl",
   :docstring
   "Generic, reusable, read-eval-print loop. By default, reads from *in* using\na c.t.r.reader-types/source-logging-push-back-reader,\nwrites to *out*, and prints exception summaries to *err*. If you use the\ndefault :read hook, *in* must either be an instance of\nc.t.r.reader-types/PushbackReader or duplicate its behavior of both supporting\nunread and collapsing CR, LF, and CRLF into a single \\newline. Options\nare sequential keyword-value pairs. The first argument is the JavaScript\nevaluation environment, the second argument is an extended version of the\nstandard ClojureScript compiler options. In addition to ClojureScript compiler\nbuild options it also take a set of options similar to clojure.main/repl with\nadjustments for ClojureScript evalution and compilation model:\n\nAvailable clojure.main/repl style options and their defaults:\n\n   - :init, function of no arguments, initialization hook called with\n     bindings for set!-able vars in place.\n     default: #()\n\n   - :need-prompt, function of no arguments, called before each\n     read-eval-print except the first, the user will be prompted if it\n     returns true.\n     default: #(if (c.t.r.readers-types/indexing-reader? *in*)\n                 (== (c.t.r.reader-types/get-column-number *in*) 1)\n                 (identity true))\n\n   - :prompt, function of no arguments, prompts for more input.\n     default: repl-prompt\n\n   - :flush, function of no arguments, flushes output\n     default: flush\n\n   - :read, function of two arguments, reads from *in*:\n       - returns its first argument to request a fresh prompt\n         - depending on need-prompt, this may cause the repl to prompt\n           before reading again\n       - returns its second argument to request an exit from the repl\n       - else returns the next object read from the input stream\n     default: repl-read\n\n   - :eval, function of one argument, returns the evaluation of its\n     argument. The eval function must take repl-env, the JavaScript evaluation\n     environment, env, the ClojureScript analysis environment, the form\n     and opts, the standard ClojureScript REPL/compiler options.\n     default: eval\n\n   - :print, function of one argument, prints its argument to the output\n     default: println\n\n   - :caught, function of three arguments, a throwable, called when\n     read, eval, or print throws an exception or error default. The second\n     argument is the JavaScript evaluation environment this permits context\n     sensitive handling if necessary. The third argument is opts, the standard\n     ClojureScript REPL/compiler options. In the case of errors or exception\n     in the JavaScript target, these will be thrown as\n     clojure.lang.IExceptionInfo instances.\n     default: repl-caught\n\n   - :reader, the c.t.r reader to use.\n     default: c.t.r.reader-types/source-logging-push-back-reader\n\n   - :print-no-newline, print without a newline.\n     default: print\n\n   - :source-map-inline, whether inline source maps should be enabled. Most\n     useful in browser context. Implies using a fresh reader for each form.\n     default: true",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "every-pred"
  {:description
   "Takes a set of predicate functions and returns a function `f` that returns true\nif all of its composing predicates return a logical true value against all of\nits arguments, else it returns false.\n\nNote that `f` is short-circuiting in that it will stop execution on the first\nargument that triggers a logical false result against the original predicates.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "every-pred",
   :signature ["[p]" "[p1 p2]" "[p1 p2 p3]" "[p1 p2 p3 & ps]"],
   :type "function",
   :related ["cljs.core/some-fn" "cljs.core/and"],
   :examples-strings [],
   :description-html
   "<p>Takes a set of predicate functions and returns a function <code>f</code> that returns true if all of its composing predicates return a logical true value against all of its arguments, else it returns false.</p><p>Note that <code>f</code> is short-circuiting in that it will stop execution on the first argument that triggers a logical false result against the original predicates.</p>",
   :full-name "cljs.core/every-pred",
   :docstring
   "Takes a set of predicates and returns a function f that returns true if all of its\ncomposing predicates return a logical true value against all of its arguments, else it returns\nfalse. Note that f is short-circuiting in that it will stop execution on the first\nargument that triggers a logical false result against the original predicates."},
  "subseq"
  {:description
   "`sc` must be a sorted collection.\n\n`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.\n\nReturns a sequence of those entries with keys `ek` for which\n`(test (.. sc comparator (compare ek key)) 0)` is true.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "subseq",
   :signature
   ["[sc test key]" "[sc start-test start-key end-test end-key]"],
   :type "function",
   :related
   ["cljs.core/rsubseq"
    "cljs.core/sorted-map"
    "cljs.core/sorted-set"
    "cljs.core/sorted-map-by"
    "cljs.core/sorted-set-by"],
   :examples-strings [],
   :description-html
   "<p><code>sc</code> must be a sorted collection.</p><p><code>test</code>, <code>start-test</code>, <code>end-test</code> must be <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code> or <code>&gt;=</code>.</p><p>Returns a sequence of those entries with keys <code>ek</code> for which <code>&#40;test &#40;.. sc comparator &#40;compare ek key&#41;&#41; 0&#41;</code> is true.</p>",
   :full-name "cljs.core/subseq",
   :docstring
   "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true"},
  "send-and-close"
  {:ns "cljs.repl.server",
   :name "send-and-close",
   :signature
   ["[conn status form]"
    "[conn status form content-type]"
    "[conn status form content-type encoding]"],
   :type "function",
   :full-name "cljs.repl.server/send-and-close",
   :docstring
   "Use the passed connection to send a form to the browser. Send a\nproper HTTP response.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "function"
  {:description
   "Shorthand for creating an anonymous function:\n\n`#(...)` = `(fn [args] (...))`\n\nUse the following to access the implicit function arguments:\n\n- `%` or `%1` for first argument.\n- `%2`, `%3` and so on for subsequent arguments\n- `%&` for the rest of the arguments after the highest individually referenced argument\n\nNote that `#(1)` does not create a function that returns `1`, for the same\nreason that `(1)` does evaluate to `1`.\n\n`#()` forms cannot be nested, since this would create an ambiguity between the\nautomatically assigned `%` argument names.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;map #&#40;&#42; 2 %&#41; &#91;1 2 3&#93;&#41;\n;;=&gt; &#40;2 4 6&#41;\n\n&#40;def f #&#40;println %1 %2 %&amp;&#41;&#41;\n&#40;f 1 2 3 4 5&#41;\n;; prints: 1 2 &#40;3 4 5&#41;\n</code></pre>"],
   :ns "syntax",
   :name "function",
   :type "syntax",
   :related
   ["syntax/arg" "cljs.core/fn" "cljs.core/defn" "cljs.core/partial"],
   :examples-strings
   [[["(map #(* 2 %) [1 2 3]) ;;=> (2 4 6)"
      "(def f #(println %1 %2 %&))"
      "(f 1 2 3 4 5) ;; prints: 1 2 (3 4 5)"]]],
   :description-html
   "<p>Shorthand for creating an anonymous function:</p><p><code>#&#40;...&#41;</code> = <code>&#40;fn &#91;args&#93; &#40;...&#41;&#41;</code></p><p>Use the following to access the implicit function arguments:</p><ul><li><code>%</code> or <code>%1</code> for first argument.</li><li><code>%2</code>, <code>%3</code> and so on for subsequent arguments</li><li><code>%&amp;</code> for the rest of the arguments after the highest individually referenced argument</li></ul><p>Note that <code>#&#40;1&#41;</code> does not create a function that returns <code>1</code>, for the same reason that <code>&#40;1&#41;</code> does evaluate to <code>1</code>.</p><p><code>#&#40;&#41;</code> forms cannot be nested, since this would create an ambiguity between the automatically assigned <code>%</code> argument names.</p>",
   :examples
   [{:id "6a87de",
     :content
     "```clj\n(map #(* 2 %) [1 2 3])\n;;=> (2 4 6)\n\n(def f #(println %1 %2 %&))\n(f 1 2 3 4 5)\n;; prints: 1 2 (3 4 5)\n```"}],
   :full-name "syntax/function"},
  "*print-pretty*"
  {:ns "cljs.pprint",
   :name "*print-pretty*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-pretty*",
   :docstring "Bind to true if you want write to use pretty printing",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reset!"
  {:description
   "Sets the value of atom `a` to `new-value` without regard for the current value.\n\nReturns `new-value`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "reset!",
   :signature ["[a new-value]"],
   :type "function",
   :related
   ["cljs.core/swap!" "cljs.core/compare-and-set!" "cljs.core/atom"],
   :examples-strings [],
   :description-html
   "<p>Sets the value of atom <code>a</code> to <code>new-value</code> without regard for the current value.</p><p>Returns <code>new-value</code>.</p>",
   :full-name "cljs.core/reset!",
   :docstring
   "Sets the value of atom to newval without regard for the\ncurrent value. Returns newval."},
  "add-implicit-options"
  {:ns "cljs.build.api",
   :name "add-implicit-options",
   :signature ["[opts]"],
   :type "function",
   :full-name "cljs.build.api/add-implicit-options",
   :docstring
   "Given a valid map of build options add any standard implicit options. For\nexample :optimizations :none implies :cache-analysis true and :source-map\ntrue.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "empty-state"
  {:ns "cljs.analyzer.api",
   :name "empty-state",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.analyzer.api/empty-state",
   :docstring "Creates an empty compilation state Atom<Map>.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "default-special-fns"
  {:ns "cljs.repl",
   :name "default-special-fns",
   :type "var",
   :full-name "cljs.repl/default-special-fns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "es"
  {:ns "cljs.repl.browser",
   :name "es",
   :type "dynamic var",
   :full-name "cljs.repl.browser/es",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-dispatch"
  {:ns "cljs.reader",
   :name "read-dispatch",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-dispatch",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "all-ns"
  {:ns "cljs.analyzer.api",
   :name "all-ns",
   :signature ["[]" "[state]"],
   :type "function",
   :full-name "cljs.analyzer.api/all-ns",
   :docstring
   "Return all namespaces. Analagous to clojure.core/all-ns but\nreturns symbols identifying namespaces not Namespace instances.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr-seq-writer"
  {:ns "cljs.core",
   :name "pr-seq-writer",
   :signature ["[objs writer opts]"],
   :type "function",
   :full-name "cljs.core/pr-seq-writer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMap"
  {:ns "cljs.core",
   :name "PersistentArrayMap",
   :signature ["[meta cnt arr __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentArrayMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "warning-enabled?"
  {:ns "cljs.analyzer.api",
   :name "warning-enabled?",
   :signature ["[warning-type]"],
   :type "function",
   :full-name "cljs.analyzer.api/warning-enabled?",
   :docstring "Test if the given warning-type is enabled.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "StringIter"
  {:ns "cljs.core",
   :name "StringIter",
   :signature ["[s i]"],
   :type "type",
   :full-name "cljs.core/StringIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-substract"
  {:ns "cljs.core",
   :name "unchecked-substract",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function",
   :full-name "cljs.core/unchecked-substract",
   :docstring
   "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Keyword"
  {:ns "cljs.core",
   :name "Keyword",
   :signature ["[ns name fqn _hash]"],
   :type "type",
   :full-name "cljs.core/Keyword",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-list"
  {:ns "cljs.reader",
   :name "read-list",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-list",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "neg?"
  {:description "Returns true if `n` is less than 0, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "neg?",
   :signature ["[n]"],
   :type "function/macro",
   :related ["cljs.core/pos?" "cljs.core/zero?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is less than 0, false otherwise.</p>",
   :full-name "cljs.core/neg?",
   :docstring "Returns true if num is less than zero, else false"},
  "PersistentArrayMap.HASHMAP_THRESHOLD"
  {:ns "cljs.core",
   :name "PersistentArrayMap.HASHMAP_THRESHOLD",
   :type "var",
   :full-name "cljs.core/PersistentArrayMap.HASHMAP_THRESHOLD",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parse-js-ns"
  {:ns "cljs.build.api",
   :name "parse-js-ns",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.build.api/parse-js-ns",
   :docstring
   "Given a Google Closure style JavaScript file or resource return the namespace\ninformation for the given file. Only returns the value extracted from the\nfirst provide statement.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentHashSet"
  {:ns "cljs.core",
   :name "PersistentHashSet",
   :signature ["[meta hash-map __hash]"],
   :type "type",
   :full-name "cljs.core/PersistentHashSet",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "compile-root"
  {:ns "cljs.compiler.api",
   :name "compile-root",
   :signature
   ["[src-dir]"
    "[src-dir target-dir]"
    "[src-dir target-dir opts]"
    "[state src-dir target-dir opts]"],
   :type "function",
   :full-name "cljs.compiler.api/compile-root",
   :docstring
   "Looks recursively in src-dir for .cljs files and compiles them to\n.js files. If target-dir is provided, output will go into this\ndirectory mirroring the source directory structure. Returns a list\nof maps containing information about each file which was compiled\nin dependency order.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "postwalk-replace"
  {:ns "clojure.walk",
   :name "postwalk-replace",
   :signature ["[smap form]"],
   :type "function",
   :full-name "clojure.walk/postwalk-replace",
   :docstring
   "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the leaves of the tree first.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-raw-string*"
  {:ns "cljs.reader",
   :name "read-raw-string*",
   :signature ["[reader _]"],
   :type "function",
   :full-name "cljs.reader/read-raw-string*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "string?"
  {:description "Returns true if `x` is a string, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "string?",
   :signature ["[x]"],
   :type "function/macro",
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a string, false otherwise.</p>",
   :full-name "cljs.core/string?",
   :docstring "Returns true if x is a JavaScript string."},
  "dispatch-on"
  {:ns "cljs.repl.server",
   :name "dispatch-on",
   :signature ["[method pred handler]" "[method {:as m}]"],
   :type "function",
   :full-name "cljs.repl.server/dispatch-on",
   :docstring
   "Registers a handler to be dispatched based on a request method and a\npredicate.\n\npred should be a function that accepts an options map, a connection,\nand a request map and returns a boolean value based on whether or not\nthat request should be dispatched to the related handler.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "m3-mix-H1"
  {:ns "cljs.core",
   :name "m3-mix-H1",
   :signature ["[h1 k1]"],
   :type "function",
   :full-name "cljs.core/m3-mix-H1",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "default-warning-handler"
  {:ns "cljs.analyzer.api",
   :name "default-warning-handler",
   :signature ["[warning-type env extra]"],
   :type "function",
   :full-name "cljs.analyzer.api/default-warning-handler",
   :docstring
   "The default warning handler.\n\nOutputs the warning messages to *err*.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "sorted?"
  {:description
   "Returns true if `coll` implements the `ISorted` protocol, false otherwise.\n\nSorted maps and sorted sets implement `ISorted`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "sorted?",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/sorted-map" "cljs.core/sorted-set"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>coll</code> implements the <code>ISorted</code> protocol, false otherwise.</p><p>Sorted maps and sorted sets implement <code>ISorted</code>.</p>",
   :full-name "cljs.core/sorted?",
   :docstring "Returns true if coll satisfies ISorted"},
  "successful?"
  {:ns "cljs.test",
   :name "successful?",
   :signature ["[summary]"],
   :type "function",
   :full-name "cljs.test/successful?",
   :docstring
   "Returns true if the given test summary indicates all tests\nwere successful, false otherwise.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "->"
  {:description
   "The thread-first macro \"threads\" an expression through several forms as the\nsecond item in a list.\n\nInserts `x` as the second item in the first form, making a list of it if it is\nnot a list already. If there are more forms, inserts the first form as the\nsecond item in second form, etc.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(-> x\n  (a b c)\n  d\n  (x y z))</pre></td>\n      <td><pre>\n(x (d (a x b c)) y z)</pre></td></tr></tbody></table>",
   :examples-htmls
   ["<p>The first is arguably a bit more cumbersome to read than the second:</p><pre><code class=\"clj\">&#40;first &#40;.split &#40;.replace &#40;.toUpperCase &quot;a b c d&quot;&#41; &quot;A&quot; &quot;X&quot;&#41; &quot; &quot;&#41;&#41;\n;;=&gt; &quot;X&quot;\n\n&#40;-&gt; &quot;a b c d&quot;\n    .toUpperCase\n    &#40;.replace &quot;A&quot; &quot;X&quot;&#41;\n    &#40;.split &quot; &quot;&#41;\n    first&#41;\n;;=&gt; &quot;X&quot;\n</code></pre>"
    "<p>It can also be useful for pulling values out of deeply-nested data structures:</p><pre><code class=\"clj\">&#40;def person\n  {:name &quot;Mark Volkmann&quot;\n   :address {:street &quot;644 Glen Summit&quot;\n             :city &quot;St. Charles&quot;\n             :state &quot;Missouri&quot;\n             :zip 63304}\n   :employer {:name &quot;Object Computing, Inc.&quot;\n              :address {:street &quot;12140 Woodcrest Dr.&quot;\n                        :city &quot;Creve Coeur&quot;\n                        :state &quot;Missouri&quot;\n                        :zip 63141}}}&#41;\n\n&#40;-&gt; person :employer :address :city&#41;\n;;=&gt; &quot;Creve Coeur&quot;\n</code></pre><p>Same as above, but with more nesting:</p><pre><code class=\"clj\">&#40;:city &#40;:address &#40;:employer person&#41;&#41;&#41;\n;;=&gt; &quot;Creve Coeur&quot;\n</code></pre>"
    "<p>It can also help with arithmetic:</p><pre><code class=\"clj\">&#40;def c 5&#41;\n&#40;-&gt; c &#40;+ 3&#41; &#40;/ 2&#41; &#40;- 1&#41;&#41;\n;;=&gt; 3\n</code></pre><p>Same as above, but with more nesting:</p><pre><code class=\"clj\">&#40;- &#40;/ &#40;+ c 3&#41; 2&#41; 1&#41;\n;;=&gt; 3\n</code></pre>"],
   :ns "cljs.core",
   :name "->",
   :signature ["[x & forms]"],
   :type "macro",
   :related ["cljs.core/->>"],
   :examples-strings
   [[["(first (.split (.replace (.toUpperCase \"a b c d\") \"A\" \"X\") \" \")) ;;=> \"X\""
      "(-> \"a b c d\""
      "    .toUpperCase"
      "    (.replace \"A\" \"X\")"
      "    (.split \" \")"
      "    first) ;;=> \"X\""]]
    [["(def person"
      "  {:name \"Mark Volkmann\""
      "   :address {:street \"644 Glen Summit\""
      "             :city \"St. Charles\""
      "             :state \"Missouri\""
      "             :zip 63304}"
      "   :employer {:name \"Object Computing, Inc.\""
      "              :address {:street \"12140 Woodcrest Dr.\""
      "                        :city \"Creve Coeur\""
      "                        :state \"Missouri\""
      "                        :zip 63141}}})"
      "(-> person :employer :address :city) ;;=> \"Creve Coeur\""]
     ["(:city (:address (:employer person))) ;;=> \"Creve Coeur\""]]
    [["(def c 5)" "(-> c (+ 3) (/ 2) (- 1)) ;;=> 3"]
     ["(- (/ (+ c 3) 2) 1) ;;=> 3"]]],
   :description-html
   "<p>The thread-first macro \"threads\" an expression through several forms as the second item in a list.</p><p>Inserts <code>x</code> as the second item in the first form, making a list of it if it is not a list already. If there are more forms, inserts the first form as the second item in second form, etc.</p><p><table class=\"code-tbl-9bef6\">   <thead><pre><code>&lt;tr&gt;\n  &lt;th&gt;Code&lt;/th&gt;\n  &lt;th&gt;Expands To&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; \n</code></pre>  <tbody><pre><code>&lt;tr&gt;\n  &lt;td&gt;&lt;pre&gt; \n</code></pre>(-> x   (a b c)   d   (x y z))</pre></td><pre><code>  &lt;td&gt;&lt;pre&gt; \n</code></pre>(x (d (a x b c)) y z)</pre></td></tr></tbody></table></p>",
   :examples
   [{:id "19b460",
     :content
     "The first is arguably a bit more cumbersome to read than the second:\n\n```clj\n(first (.split (.replace (.toUpperCase \"a b c d\") \"A\" \"X\") \" \"))\n;;=> \"X\"\n\n(-> \"a b c d\"\n    .toUpperCase\n    (.replace \"A\" \"X\")\n    (.split \" \")\n    first)\n;;=> \"X\"\n```"}
    {:id "78ad8f",
     :content
     "It can also be useful for pulling values out of deeply-nested\ndata structures:\n\n```clj\n(def person\n  {:name \"Mark Volkmann\"\n   :address {:street \"644 Glen Summit\"\n             :city \"St. Charles\"\n             :state \"Missouri\"\n             :zip 63304}\n   :employer {:name \"Object Computing, Inc.\"\n              :address {:street \"12140 Woodcrest Dr.\"\n                        :city \"Creve Coeur\"\n                        :state \"Missouri\"\n                        :zip 63141}}})\n\n(-> person :employer :address :city)\n;;=> \"Creve Coeur\"\n```\n\nSame as above, but with more nesting:\n\n```clj\n(:city (:address (:employer person)))\n;;=> \"Creve Coeur\"\n```"}
    {:id "5fe621",
     :content
     "It can also help with arithmetic:\n\n```clj\n(def c 5)\n(-> c (+ 3) (/ 2) (- 1))\n;;=> 3\n```\n\nSame as above, but with more nesting:\n\n```clj\n(- (/ (+ c 3) 2) 1)\n;;=> 3\n```"}],
   :full-name "cljs.core/->",
   :docstring
   "Threads the expr through the forms. Inserts x as the\nsecond item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nsecond item in second form, etc."},
  "do-report"
  {:ns "cljs.test",
   :name "do-report",
   :signature ["[m]"],
   :type "function",
   :full-name "cljs.test/do-report",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-validator!"
  {:description
   "Sets a validator function for atom `a`.\n\n`fn` must be nil or a side-effect-free function of one argument, which will be\npassed the intended new state on any state change. `fn` should return false or\nthrow an Error if the new state is unacceptable.\n\nIf the current value of `a` is unacceptable to `fn` when `set-validator!` is\ncalled, an Error will be thrown and the validator will not be set.\n\n`(set-validator! my-atom nil)` will remove the validator from `my-atom`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "set-validator!",
   :signature ["[a fn]"],
   :type "function",
   :related ["cljs.core/atom" "cljs.core/get-validator"],
   :examples-strings [],
   :description-html
   "<p>Sets a validator function for atom <code>a</code>.</p><p><code>fn</code> must be nil or a side-effect-free function of one argument, which will be passed the intended new state on any state change. <code>fn</code> should return false or throw an Error if the new state is unacceptable.</p><p>If the current value of <code>a</code> is unacceptable to <code>fn</code> when <code>set-validator!</code> is called, an Error will be thrown and the validator will not be set.</p><p><code>&#40;set-validator! my-atom nil&#41;</code> will remove the validator from <code>my-atom</code>.</p>",
   :full-name "cljs.core/set-validator!",
   :docstring
   "Sets the validator-fn for an atom. validator-fn must be nil or a\nside-effect-free fn of one argument, which will be passed the intended\nnew state on any state change. If the new state is unacceptable, the\nvalidator-fn should return false or throw an Error. If the current state\nis not acceptable to the new validator, an Error will be thrown and the\nvalidator will not be changed."},
  "and"
  {:description
   "Evaluates arguments one at a time from left to right. If an argument returns\nlogical false (nil or false), `and` returns that value and doesn't evaluate any\nof the other arguments, otherwise it returns the value of the last argument.\n\n`(and)` returns true.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;and&#41;\n;;=&gt; true\n\n&#40;and false&#41;\n;;=&gt; false\n\n&#40;and true&#41;\n;;=&gt; true\n\n&#40;and true true&#41;\n;;=&gt; true\n\n&#40;and true false&#41;\n;;=&gt; false\n\n&#40;and false false&#41;\n;;=&gt; false\n</code></pre>"
    "<p><code>nil</code> and <code>false</code> are the only falsy values and everything else is truthy:</p><pre><code class=\"clj\">&#40;and &quot;foo&quot; &quot;bar&quot;&#41;\n;;=&gt; &quot;bar&quot;\n\n&#40;and &quot;foo&quot; nil&#41;\n;;=&gt; nil\n\n&#40;and &quot;foo&quot; false&#41;\n;;=&gt; false\n\n&#40;and nil &quot;foo&quot;&#41;\n;;=&gt; nil\n\n&#40;and false &quot;foo&quot;&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "and",
   :signature ["[]" "[x]" "[x & next]"],
   :type "macro",
   :related ["cljs.core/or" "special/if"],
   :examples-strings
   [[["(and) ;;=> true"
      "(and false) ;;=> false"
      "(and true) ;;=> true"
      "(and true true) ;;=> true"
      "(and true false) ;;=> false"
      "(and false false) ;;=> false"]]
    [["(and \"foo\" \"bar\") ;;=> \"bar\""
      "(and \"foo\" nil) ;;=> nil"
      "(and \"foo\" false) ;;=> false"
      "(and nil \"foo\") ;;=> nil"
      "(and false \"foo\") ;;=> false"]]],
   :description-html
   "<p>Evaluates arguments one at a time from left to right. If an argument returns logical false (nil or false), <code>and</code> returns that value and doesn't evaluate any of the other arguments, otherwise it returns the value of the last argument.</p><p><code>&#40;and&#41;</code> returns true.</p>",
   :examples
   [{:id "a39a73",
     :content
     "```clj\n(and)\n;;=> true\n\n(and false)\n;;=> false\n\n(and true)\n;;=> true\n\n(and true true)\n;;=> true\n\n(and true false)\n;;=> false\n\n(and false false)\n;;=> false\n```"}
    {:id "766638",
     :content
     "`nil` and `false` are the only falsy values and everything else is truthy:\n\n```clj\n(and \"foo\" \"bar\")\n;;=> \"bar\"\n\n(and \"foo\" nil)\n;;=> nil\n\n(and \"foo\" false)\n;;=> false\n\n(and nil \"foo\")\n;;=> nil\n\n(and false \"foo\")\n;;=> false\n```"}],
   :full-name "cljs.core/and",
   :docstring
   "Evaluates exprs one at a time, from left to right. If a form\nreturns logical false (nil or false), and returns that value and\ndoesn't evaluate any of the other expressions, otherwise it returns\nthe value of the last expr. (and) returns true."},
  "hash-set"
  {:description
   "Returns a new hash set with supplied `keys`.\n\nAny equal keys are handled as if by repeated uses of `conj`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "hash-set",
   :signature ["[]" "[& keys]"],
   :type "function/macro",
   :related ["cljs.core/set" "cljs.core/sorted-set"],
   :examples-strings [],
   :description-html
   "<p>Returns a new hash set with supplied <code>keys</code>.</p><p>Any equal keys are handled as if by repeated uses of <code>conj</code>.</p>",
   :full-name "cljs.core/hash-set",
   :docstring
   "Returns a new hash set with supplied keys.  Any equal keys are\nhandled as if by repeated uses of conj."},
  "order"
  {:ns "clojure.browser.repl",
   :name "order",
   :type "var",
   :full-name "clojure.browser.repl/order",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test-all-vars"
  {:ns "cljs.test",
   :name "test-all-vars",
   :signature ["[[quote ns :as form]]"],
   :type "macro",
   :full-name "cljs.test/test-all-vars",
   :docstring
   "Calls test-vars on every var with :test metadata interned in the\nnamespace, with fixtures.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set?"
  {:description "Returns true if `x` is a set, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "set?",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/set"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a set, false otherwise.</p>",
   :full-name "cljs.core/set?",
   :docstring "Returns true if x satisfies ISet"},
  "parse-headers"
  {:ns "cljs.repl.browser",
   :name "parse-headers",
   :signature ["[header-lines]"],
   :type "function",
   :full-name "cljs.repl.browser/parse-headers",
   :docstring "Parse the headers of an HTTP POST request.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "defmethod"
  {:ns "cljs.core",
   :name "defmethod",
   :signature ["[multifn dispatch-val & fn-tail]"],
   :type "macro",
   :full-name "cljs.core/defmethod",
   :docstring
   "Creates and installs a new method of multimethod associated with dispatch-value. ",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "group-by"
  {:description
   "Returns a map of the elements of `coll` keyed by the result of running `f` on\neach element.\n\nThe value at each key will be a vector of the corresponding elements in the\norder they appeared in `coll`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "group-by",
   :signature ["[f coll]"],
   :type "function",
   :related ["cljs.core/partition-by" "cljs.core/frequencies"],
   :examples-strings [],
   :description-html
   "<p>Returns a map of the elements of <code>coll</code> keyed by the result of running <code>f</code> on each element.</p><p>The value at each key will be a vector of the corresponding elements in the order they appeared in <code>coll</code>.</p>",
   :full-name "cljs.core/group-by",
   :docstring
   "Returns a map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll."},
  "get-value"
  {:ns "clojure.browser.dom",
   :name "get-value",
   :signature ["[e]"],
   :type "function",
   :full-name "clojure.browser.dom/get-value",
   :docstring "Get the value of an element.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "deref"
  {:description
   "Returns the current value of atom `x`.\n\nThe `@` reader macro is often used instead of `deref`. `@foo` is the same thing\nas `(deref foo)`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "deref",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/atom"],
   :examples-strings [],
   :description-html
   "<p>Returns the current value of atom <code>x</code>.</p><p>The <code>@</code> reader macro is often used instead of <code>deref</code>. <code>@foo</code> is the same thing as <code>&#40;deref foo&#41;</code>.</p>",
   :full-name "cljs.core/deref",
   :docstring
   "Also reader macro: @var/@atom/@delay. Returns the\nmost-recently-committed value of ref. When applied to a var\nor atom, returns its current state. When applied to a delay, forces\nit if not already forced. See also - realized?."},
  "HashMapIter"
  {:ns "cljs.core",
   :name "HashMapIter",
   :signature ["[nil-val root-iter seen]"],
   :type "type",
   :full-name "cljs.core/HashMapIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*eval-fn*"
  {:ns "cljs.js",
   :name "*eval-fn*",
   :type "dynamic var",
   :full-name "cljs.js/*eval-fn*",
   :docstring
   "Each runtime environment provides various ways to eval JavaScript\nsource. Whatever function *eval-fn* is bound to will be passed a map\ncontaining the following keys:\n\n:source - the source of the library (string)\n:name   - used to unique identify the script (symbol)\n:cache  - if the source was originally ClojureScript, will be given the\n          analysis cache.\n\nThe result of evaluation should be the return value.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mod"
  {:description
   "Returns the modulus of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).\n\nTruncates toward negative infinity.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;mod -5 3&#41;\n;;=&gt; 1\n\n&#40;mod 5 3&#41;\n;;=&gt; 2\n\n&#40;mod 5 0&#41;\n;;=&gt; NaN\n</code></pre>"],
   :ns "cljs.core",
   :name "mod",
   :signature ["[n d]"],
   :type "function",
   :related ["cljs.core/rem"],
   :examples-strings
   [[["(mod -5 3) ;;=> 1" "(mod 5 3) ;;=> 2" "(mod 5 0) ;;=> NaN"]]],
   :description-html
   "<p>Returns the modulus of dividing numerator <code>n</code> by denominator <code>d</code>.</p><p>Returns <code>NaN</code> when <code>d</code> is 0 (divide by 0 error).</p><p>Truncates toward negative infinity.</p>",
   :examples
   [{:id "8165e8",
     :content
     "```clj\n(mod -5 3)\n;;=> 1\n\n(mod 5 3)\n;;=> 2\n\n(mod 5 0)\n;;=> NaN\n```"}],
   :full-name "cljs.core/mod",
   :docstring
   "Modulus of num and div. Truncates toward negative infinity."},
  "do"
  {:ns "special",
   :name "do",
   :signature ["[exprs*]"],
   :type "special form",
   :full-name "special/do",
   :docstring
   "Evaluates the expressions in order and returns the value of\nthe last. If no expressions are supplied, returns nil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "some->>"
  {:description
   "When `expr` is not nil, threads it into the first form (via `->>`), and when\nthat result is not nil, through the next, etc.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "some->>",
   :signature ["[expr & forms]"],
   :type "macro",
   :related
   ["cljs.core/->"
    "cljs.core/->>"
    "cljs.core/some->"
    "cljs.core/some"],
   :examples-strings [],
   :description-html
   "<p>When <code>expr</code> is not nil, threads it into the first form (via <code>-&gt;&gt;</code>), and when that result is not nil, through the next, etc.</p>",
   :full-name "cljs.core/some->>",
   :docstring
   "When expr is not nil, threads it into the first form (via ->>),\nand when that result is not nil, through the next etc"},
  "skip-if-eol"
  {:ns "cljs.repl",
   :name "skip-if-eol",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.repl/skip-if-eol",
   :docstring
   "If the next character on stream s is a newline, skips it, otherwise\nleaves the stream untouched. Returns :line-start, :stream-end, or :body\nto indicate the relative location of the next character on s. The stream\nmust either be an instance of LineNumberingPushbackReader or duplicate\nits behavior of both supporting .unread and collapsing all of CR, LF, and\nCRLF to a single \\newline.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "not-empty"
  {:description "Returns nil if `coll` is empty, else returns `coll`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "not-empty",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/empty"],
   :examples-strings [],
   :description-html
   "<p>Returns nil if <code>coll</code> is empty, else returns <code>coll</code>.</p>",
   :full-name "cljs.core/not-empty",
   :docstring "If coll is empty, returns nil, else coll"},
  "fn*"
  {:ns "special",
   :name "fn*",
   :type "special form",
   :full-name "special/fn*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-ua-product"
  {:ns "clojure.browser.repl",
   :name "get-ua-product",
   :signature ["[]"],
   :type "function",
   :full-name "clojure.browser.repl/get-ua-product",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "last"
  {:description
   "Returns the last item in `coll` in linear time.\n\n`peek` is much faster than `last` for a vector.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;last &#91;1 2 3&#93;&#41;\n;;=&gt; 3\n\n&#40;last &#91;1 2&#93;&#41;\n;;=&gt; 2\n\n&#40;last &#91;1&#93;&#41;\n;;=&gt; 1\n\n&#40;last &#91;&#93;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "last",
   :signature ["[coll]"],
   :type "function",
   :related
   ["cljs.core/first"
    "cljs.core/next"
    "cljs.core/rest"
    "cljs.core/butlast"
    "cljs.core/take-last"],
   :examples-strings
   [[["(last [1 2 3]) ;;=> 3"
      "(last [1 2]) ;;=> 2"
      "(last [1]) ;;=> 1"
      "(last []) ;;=> nil"]]],
   :description-html
   "<p>Returns the last item in <code>coll</code> in linear time.</p><p><code>peek</code> is much faster than <code>last</code> for a vector.</p>",
   :examples
   [{:id "eb0836",
     :content
     "```clj\n(last [1 2 3])\n;;=> 3\n\n(last [1 2])\n;;=> 2\n\n(last [1])\n;;=> 1\n\n(last [])\n;;=> nil\n```"}],
   :full-name "cljs.core/last",
   :docstring "Return the last item in coll, in linear time"},
  "IComparable"
  {:ns "cljs.core",
   :name "IComparable",
   :type "protocol",
   :full-name "cljs.core/IComparable",
   :docstring "Protocol for values that can be compared.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "delay"
  {:ns "cljs.core",
   :name "delay",
   :signature ["[& body]"],
   :type "macro",
   :full-name "cljs.core/delay",
   :docstring
   "Takes a body of expressions and yields a Delay object that will\ninvoke the body only the first time it is forced (with force or deref/@), and\nwill cache the result and return it on all subsequent force\ncalls.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "hash-string*"
  {:ns "cljs.core",
   :name "hash-string*",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.core/hash-string*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "interpose"
  {:description
   "Returns a lazy seq of the elements of `coll` separated by `sep`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "interpose",
   :signature ["[sep coll]"],
   :type "function",
   :related ["cljs.core/interleave" "clojure.string/join"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy seq of the elements of <code>coll</code> separated by <code>sep</code>.</p>",
   :full-name "cljs.core/interpose",
   :docstring
   "Returns a lazy seq of the elements of coll separated by sep.\nReturns a stateful transducer when no collection is provided."},
  "reduceable?"
  {:ns "cljs.core",
   :name "reduceable?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/reduceable?",
   :docstring "Returns true if coll satisfies IReduce",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unused"
  {:description
   "`_` is a valid symbol name that indicates an unused or disregarded value.\nThis is not enforced by the compiler.\n\nFor example, create a function whose first two arguments are ignored:\n\n```clj\n(fn [_ _ a]\n  (println a))\n```\n\nIgnore the first and third value of a [destructured][doc:syntax/destructure-vector] sequence:\n\n```clj\n(let [ [_ a b _ c]\n       [1 2 3 4 5] ]\n  (println a b c))\n;; 2 3 5\n```\n\nIgnore return values of debug statements in a [doc:cljs.core/let] block:\n\n```clj\n(let [a 1\n      _ (println a)\n      b (+ a 2)\n      _ (println b)\n      c (+ b 3)]\n  ...)\n```\n\nMultiple `_`'s can be used in each of the previous examples because duplicate\nnames will shadow those previously occurring.  Thus, `_` actually holds the\nvalue of its last binding, but using it should be strictly avoided to prevent\nconfusion.  This is the only encouraged use-case for duplicating parameter\nnames.",
   :ns "syntax",
   :name "unused",
   :type "convention",
   :examples
   [{:id "705f5e",
     :content
     "It is common to use `_` to ignore all but the latest value of a changing atom\ninside an [doc:cljs.core/add-watch] callback:\n\n```clj\n(def a (atom 1))\n\n(add-watch a :foo\n  (fn [_ _ _ s]\n    (println s)))\n\n(reset! a 2)\n;; 2\n```"}],
   :full-name "syntax/unused",
   :description-html
   "<p><code>&#95;</code> is a valid symbol name that indicates an unused or disregarded value. This is not enforced by the compiler.</p><p>For example, create a function whose first two arguments are ignored:</p><pre><code class=\"clj\">&#40;fn &#91;&#95; &#95; a&#93;\n  &#40;println a&#41;&#41;\n</code></pre><p>Ignore the first and third value of a [destructured][doc:syntax/destructure-vector] sequence:</p><pre><code class=\"clj\">&#40;let &#91; &#91;&#95; a b &#95; c&#93;\n       &#91;1 2 3 4 5&#93; &#93;\n  &#40;println a b c&#41;&#41;\n;; 2 3 5\n</code></pre><p>Ignore return values of debug statements in a [doc:cljs.core/let] block:</p><pre><code class=\"clj\">&#40;let &#91;a 1\n      &#95; &#40;println a&#41;\n      b &#40;+ a 2&#41;\n      &#95; &#40;println b&#41;\n      c &#40;+ b 3&#41;&#93;\n  ...&#41;\n</code></pre><p>Multiple <code>&#95;</code>'s can be used in each of the previous examples because duplicate names will shadow those previously occurring.  Thus, <code>&#95;</code> actually holds the value of its last binding, but using it should be strictly avoided to prevent confusion.  This is the only encouraged use-case for duplicating parameter names.</p>",
   :examples-strings
   [[["(def a (atom 1))"
      "(add-watch a :foo"
      "  (fn [_ _ _ s]"
      "    (println s)))"
      "(reset! a 2) ;; 2"]]],
   :examples-htmls
   ["<p>It is common to use <code>&#95;</code> to ignore all but the latest value of a changing atom inside an [doc:cljs.core/add-watch] callback:</p><pre><code class=\"clj\">&#40;def a &#40;atom 1&#41;&#41;\n\n&#40;add-watch a :foo\n  &#40;fn &#91;&#95; &#95; &#95; s&#93;\n    &#40;println s&#41;&#41;&#41;\n\n&#40;reset! a 2&#41;\n;; 2\n</code></pre>"]},
  "HashMap"
  {:ns "cljs.core",
   :name "HashMap",
   :signature ["[meta count hashobj __hash]"],
   :type "type",
   :full-name "cljs.core/HashMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test-var"
  {:ns "cljs.test",
   :name "test-var",
   :signature ["[v]"],
   :type "function",
   :full-name "cljs.test/test-var",
   :docstring
   "If v has a function in its :test metadata, calls that function,\nadd v to :testing-vars property of env.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IEval"
  {:ns "cljs.repl.rhino",
   :name "IEval",
   :type "protocol",
   :full-name "cljs.repl.rhino/IEval",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-symbol"
  {:ns "cljs.reader",
   :name "read-symbol",
   :signature ["[reader initch]"],
   :type "function",
   :full-name "cljs.reader/read-symbol",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-delimited-list"
  {:ns "cljs.reader",
   :name "read-delimited-list",
   :signature ["[delim rdr recursive?]"],
   :type "function",
   :full-name "cljs.reader/read-delimited-list",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "source"
  {:description
   "Prints the source code for the given symbol `name`, if it can find it.  This\nrequires that the symbol resolve to a Var defined in a namespace for which the\n.cljs is in the classpath.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;source comment&#41;\n;; Prints:\n;; &#40;defmacro comment\n;;   &quot;Ignores body, yields nil&quot;\n;;   {:added &quot;1.0&quot;}\n;;   &#91;&amp; body&#93;&#41;\n;;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.repl",
   :name "source",
   :signature ["[name]"],
   :type "macro",
   :related ["cljs.repl/doc"],
   :examples-strings
   [[["(source comment) ;; Prints: ;; (defmacro comment ;;   \"Ignores body, yields nil\" ;;   {:added \"1.0\"} ;;   [& body]) ;; ;;=> nil"]]],
   :description-html
   "<p>Prints the source code for the given symbol <code>name</code>, if it can find it.  This requires that the symbol resolve to a Var defined in a namespace for which the .cljs is in the classpath.</p>",
   :examples
   [{:id "94c94c",
     :content
     "```clj\n(source comment)\n;; Prints:\n;; (defmacro comment\n;;   \"Ignores body, yields nil\"\n;;   {:added \"1.0\"}\n;;   [& body])\n;;\n;;=> nil\n```"}],
   :full-name "cljs.repl/source",
   :docstring
   "Prints the source code for the given symbol, if it can find it.\nThis requires that the symbol resolve to a Var defined in a\nnamespace for which the .cljs is in the classpath.\n\nExample: (source filter)"},
  "<"
  {:description
   "Returns true if each successive number argument is greater than the previous\none, false otherwise.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;&lt; 1 2&#41;\n;;=&gt; true\n\n&#40;&lt; 2 1&#41;\n;;=&gt; false\n\n&#40;&lt; 1 1&#41;\n;;=&gt; false\n\n&#40;&lt; 2 3 4 5 6&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name "<",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/<="],
   :examples-strings
   [[["(< 1 2) ;;=> true"
      "(< 2 1) ;;=> false"
      "(< 1 1) ;;=> false"
      "(< 2 3 4 5 6) ;;=> true"]]],
   :description-html
   "<p>Returns true if each successive number argument is greater than the previous one, false otherwise.</p>",
   :examples
   [{:id "02e6d3",
     :content
     "```clj\n(< 1 2)\n;;=> true\n\n(< 2 1)\n;;=> false\n\n(< 1 1)\n;;=> false\n\n(< 2 3 4 5 6)\n;;=> true\n```"}],
   :full-name "cljs.core/<",
   :docstring
   "Returns non-nil if nums are in monotonically increasing order,\notherwise false."},
  "wrap-error"
  {:ns "cljs.js",
   :name "wrap-error",
   :signature ["[ex]"],
   :type "function",
   :full-name "cljs.js/wrap-error",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pos?"
  {:description
   "Returns true if `n` is greater than 0, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "pos?",
   :signature ["[n]"],
   :type "function/macro",
   :related ["cljs.core/neg?" "cljs.core/zero?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is greater than 0, false otherwise.</p>",
   :full-name "cljs.core/pos?",
   :docstring "Returns true if num is greater than zero, else false"},
  "down"
  {:ns "clojure.zip",
   :name "down",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/down",
   :docstring
   "Returns the loc of the leftmost child of the node at this loc, or\nnil if no children",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "type"
  {:ns "cljs.core",
   :name "type",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/type",
   :docstring "Return x's constructor.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "require-macros"
  {:description
   "Only usable from a REPL.\n\nThis is a way for ClojureScript to load macros from Clojure files.\nThe usage is similar to the `require` form.\n\nThere is a nicer alternative if the Clojure macros file has the same name as a\nClojureScript file in the same directory, which is a common pattern.  In this\ncase, you can just use the `:include-macros` or `:refer-macros` flag of the\n`require` form.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;require-macros '&#91;cljs.core.async.macros :refer &#91;go&#93;&#93;&#41;\n</code></pre>"],
   :ns "specialrepl",
   :name "require-macros",
   :signature ["[& args]"],
   :type "special form (repl)",
   :related ["specialrepl/require"],
   :examples-strings
   [[["(require-macros '[cljs.core.async.macros :refer [go]])"]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>This is a way for ClojureScript to load macros from Clojure files. The usage is similar to the <code>require</code> form.</p><p>There is a nicer alternative if the Clojure macros file has the same name as a ClojureScript file in the same directory, which is a common pattern.  In this case, you can just use the <code>:include-macros</code> or <code>:refer-macros</code> flag of the <code>require</code> form.</p>",
   :examples
   [{:id "e34cf4",
     :content
     "```clj\n(require-macros '[cljs.core.async.macros :refer [go]])\n```"}],
   :full-name "specialrepl/require-macros",
   :docstring
   "Similar to the require REPL special function but\n only for macros."},
  "HashCollisionNode"
  {:ns "cljs.core",
   :name "HashCollisionNode",
   :signature ["[edit collision-hash cnt arr]"],
   :type "type",
   :full-name "cljs.core/HashCollisionNode",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "NodeSeq"
  {:ns "cljs.core",
   :name "NodeSeq",
   :signature ["[meta nodes i s __hash]"],
   :type "type",
   :full-name "cljs.core/NodeSeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "deftest"
  {:ns "cljs.test",
   :name "deftest",
   :signature ["[name & body]"],
   :type "macro",
   :full-name "cljs.test/deftest",
   :docstring
   "Defines a test function with no arguments.  Test functions may call\nother tests, so tests may be composed.  If you compose tests, you\nshould also define a function named test-ns-hook; run-tests will\ncall test-ns-hook instead of testing all vars.\n\nNote: Actually, the test body goes in the :test metadata on the var,\nand the real function (the value of the var) calls test-var on\nitself.\n\nWhen cljs.analyzer/*load-tests* is false, deftest is ignored.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "requires-compilation?"
  {:ns "cljs.compiler.api",
   :name "requires-compilation?",
   :signature ["[src dest]" "[src dest opts]" "[state src dest opts]"],
   :type "function",
   :full-name "cljs.compiler.api/requires-compilation?",
   :docstring "Return true if the src file requires compilation.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "deregister-default-tag-parser!"
  {:ns "cljs.reader",
   :name "deregister-default-tag-parser!",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.reader/deregister-default-tag-parser!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "keywordize-keys"
  {:ns "clojure.walk",
   :name "keywordize-keys",
   :signature ["[m]"],
   :type "function",
   :full-name "clojure.walk/keywordize-keys",
   :docstring
   "Recursively transforms all map keys from strings to keywords.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-substract-int"
  {:ns "cljs.core",
   :name "unchecked-substract-int",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function",
   :full-name "cljs.core/unchecked-substract-int",
   :docstring
   "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "goog-require"
  {:ns "cljs.repl.rhino",
   :name "goog-require",
   :signature ["[repl-env opts rule]"],
   :type "function",
   :full-name "cljs.repl.rhino/goog-require",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "macro-terminating?"
  {:ns "cljs.reader",
   :name "macro-terminating?",
   :signature ["[ch]"],
   :type "function",
   :full-name "cljs.reader/macro-terminating?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-str"
  {:ns "cljs.core",
   :name "print-str",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/print-str",
   :docstring "print to a string, returning it",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "min-key"
  {:description
   "Returns the `x` for which `(k x)` is least.\n\n`(k x)` should return a number.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "min-key",
   :signature ["[k x]" "[k x y]" "[k x y & more]"],
   :type "function",
   :related ["cljs.core/min" "cljs.core/max-key"],
   :examples-strings [],
   :description-html
   "<p>Returns the <code>x</code> for which <code>&#40;k x&#41;</code> is least.</p><p><code>&#40;k x&#41;</code> should return a number.</p>",
   :full-name "cljs.core/min-key",
   :docstring "Returns the x for which (k x), a number, is least."},
  "alength"
  {:description
   "For interop, it returns the length of a JavaScript array or string.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n\n&#40;alength a&#41;\n;;=&gt; 3\n\n&#40;.-length a&#41;\n;;=&gt; 3\n\n&#40;aget a &quot;length&quot;&#41;\n;;=&gt; 3\n\n&#40;count a&#41;\n;;=&gt; 3\n</code></pre>"],
   :ns "cljs.core",
   :name "alength",
   :signature ["[a]"],
   :type "function/macro",
   :related ["cljs.core/count"],
   :examples-strings
   [[["(def a #js [1 2 3])"
      "(alength a) ;;=> 3"
      "(.-length a) ;;=> 3"
      "(aget a \"length\") ;;=> 3"
      "(count a) ;;=> 3"]]],
   :description-html
   "<p>For interop, it returns the length of a JavaScript array or string.</p>",
   :examples
   [{:id "26f79f",
     :content
     "```clj\n(def a #js [1 2 3])\n\n(alength a)\n;;=> 3\n\n(.-length a)\n;;=> 3\n\n(aget a \"length\")\n;;=> 3\n\n(count a)\n;;=> 3\n```"}],
   :full-name "cljs.core/alength",
   :docstring
   "Returns the length of the array. Works on arrays of all types."},
  "."
  {:description
   "For interop, the `.` special form allows access to member properties of the\ngiven JavaScript object `o`.\n\nIf the second operand is a symbol preceded with a hyphen as in `-p`, the\nexpression will result in the value of the property named `p`.\n\nIf the second operand is a symbol that is not preceded with a hyphen as in `m`,\nthe expression will evaluate to a call of the method named `m`.  Any additional\noperands will be passed as arguments to the method.\n\nThe __preferred, idiomatic__ way to access members of a JavaScript object is to\nuse the following sugar:\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Sugar</th>\n      <th>Expands To</th></tr>\n  </thead>\n  <tbody>\n    <tr>\n      <td><pre>(.-p o)</pre></td>\n      <td><pre>(. o -p)</pre></td>\n    </tr>\n    <tr>\n      <td><pre>(.m o)</pre></td>\n      <td><pre>(. o m)</pre></td>\n    </tr>\n    <tr>\n      <td><pre>(.m o 1 2)</pre></td>\n      <td><pre>(. o m 1 2)</pre></td>\n    </tr>\n  </tbody>\n</table>",
   :examples-htmls
   ["<p>We can access the JavaScript properties of a string:</p><pre><code class=\"js\">// JavaScript\nvar m = &quot;Hello World&quot;;\nm.length;\n//=&gt; 11\n</code></pre><pre><code class=\"clj\">;; ClojureScript\n&#40;def m &quot;Hello World&quot;&#41;\n&#40;.-length m&#41;\n;;=&gt; 11\n</code></pre><p>We can also call member functions on the string:</p><pre><code class=\"js\">// JavaScript\nm.toUpperCase&#40;&#41;;\n//=&gt; &quot;HELLO WORLD&quot;\n\nm.replace&#40;&quot;H&quot;, &quot;&quot;&#41;;\n//=&gt; &quot;ello World&quot;;\n</code></pre><pre><code class=\"clj\">;; ClojureScript\n&#40;.toUpperCase m&#41;\n;;=&gt; &quot;HELLO WORLD&quot;\n\n&#40;.replace m &quot;H&quot; &quot;&quot;&#41;\n;;=&gt; &quot;ello World&quot;\n</code></pre>"
    "<p>Create a JavaScript object <code>o</code>:</p><pre><code class=\"clj\">&#40;def o #js {:foo &quot;bar&quot;}&#41;\n</code></pre><p>You can get the value at property <code>&quot;foo&quot;</code> with any of the following:</p><pre><code class=\"clj\">&#40;. o -foo&#41;\n;;=&gt; &quot;bar&quot;\n\n&#40;.-foo o&#41;\n;;=&gt; &quot;bar&quot;\n\n&#40;aget o &quot;foo&quot;&#41;\n;;=&gt; &quot;bar&quot;\n</code></pre>"],
   :ns "special",
   :name ".",
   :signature ["[o -p]" "[o m]" "[o m 1 2]" "[o (m 1 2)]"],
   :type "special form",
   :related ["cljs.core/.." "cljs.core/aget"],
   :examples-strings
   [[["// JavaScript" "var m = \"Hello World\";" "m.length;" "//=> 11"]
     [" ;; ClojureScript"
      "(def m \"Hello World\")"
      "(.-length m) ;;=> 11"]
     ["// JavaScript"
      "m.toUpperCase();"
      "//=> \"HELLO WORLD\""
      "m.replace(\"H\", \"\");"
      "//=> \"ello World\";"]
     [" ;; ClojureScript"
      "(.toUpperCase m) ;;=> \"HELLO WORLD\""
      "(.replace m \"H\" \"\") ;;=> \"ello World\""]]
    [["(def o #js {:foo \"bar\"})"]
     ["(. o -foo) ;;=> \"bar\""
      "(.-foo o) ;;=> \"bar\""
      "(aget o \"foo\") ;;=> \"bar\""]]],
   :description-html
   "<p>For interop, the <code>.</code> special form allows access to member properties of the given JavaScript object <code>o</code>.</p><p>If the second operand is a symbol preceded with a hyphen as in <code>-p</code>, the expression will result in the value of the property named <code>p</code>.</p><p>If the second operand is a symbol that is not preceded with a hyphen as in <code>m</code>, the expression will evaluate to a call of the method named <code>m</code>.  Any additional operands will be passed as arguments to the method.</p><p>The <b>preferred, idiomatic</b> way to access members of a JavaScript object is to use the following sugar:</p><p><table class=\"code-tbl-9bef6\">   <thead><pre><code>&lt;tr&gt;\n  &lt;th&gt;Sugar&lt;/th&gt;\n  &lt;th&gt;Expands To&lt;/th&gt;&lt;/tr&gt; \n</code></pre>  </thead>   <tbody><pre><code>&lt;tr&gt;\n  &lt;td&gt;&lt;pre&gt;&#40;.-p o&#41;&lt;/pre&gt;&lt;/td&gt;\n  &lt;td&gt;&lt;pre&gt;&#40;. o -p&#41;&lt;/pre&gt;&lt;/td&gt;\n&lt;/tr&gt;\n&lt;tr&gt;\n  &lt;td&gt;&lt;pre&gt;&#40;.m o&#41;&lt;/pre&gt;&lt;/td&gt;\n  &lt;td&gt;&lt;pre&gt;&#40;. o m&#41;&lt;/pre&gt;&lt;/td&gt;\n&lt;/tr&gt;\n&lt;tr&gt;\n  &lt;td&gt;&lt;pre&gt;&#40;.m o 1 2&#41;&lt;/pre&gt;&lt;/td&gt;\n  &lt;td&gt;&lt;pre&gt;&#40;. o m 1 2&#41;&lt;/pre&gt;&lt;/td&gt;\n&lt;/tr&gt; \n</code></pre>  </tbody> </table></p>",
   :examples
   [{:id "22ccbb",
     :content
     "We can access the JavaScript properties of a string:\n\n```js\n// JavaScript\nvar m = \"Hello World\";\nm.length;\n//=> 11\n```\n\n```clj\n;; ClojureScript\n(def m \"Hello World\")\n(.-length m)\n;;=> 11\n```\n\nWe can also call member functions on the string:\n\n```js\n// JavaScript\nm.toUpperCase();\n//=> \"HELLO WORLD\"\n\nm.replace(\"H\", \"\");\n//=> \"ello World\";\n```\n\n```clj\n;; ClojureScript\n(.toUpperCase m)\n;;=> \"HELLO WORLD\"\n\n(.replace m \"H\" \"\")\n;;=> \"ello World\"\n```"}
    {:id "7c5e58",
     :content
     "Create a JavaScript object `o`:\n\n```clj\n(def o #js {:foo \"bar\"})\n```\n\nYou can get the value at property `\"foo\"` with any of the following:\n\n```clj\n(. o -foo)\n;;=> \"bar\"\n\n(.-foo o)\n;;=> \"bar\"\n\n(aget o \"foo\")\n;;=> \"bar\"\n```"}],
   :full-name "special/.",
   :docstring
   "The instance member form works for methods and fields.\nThey all expand into calls to the dot operator at macroexpansion time."},
  "make-array"
  {:description "Creates an empty JavaScript array of size `size`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "make-array",
   :signature ["[size]"],
   :type "function/macro",
   :related ["cljs.core/aclone" "cljs.core/array"],
   :examples-strings [],
   :description-html
   "<p>Creates an empty JavaScript array of size <code>size</code>.</p>",
   :full-name "cljs.core/make-array",
   :docstring
   "Construct a JavaScript array of specified size. Accepts ignored type\nargument for compatibility with Clojure."},
  "eval-str"
  {:ns "cljs.js",
   :name "eval-str",
   :signature
   ["[state source cb]"
    "[state source name cb]"
    "[state source name opts cb]"],
   :type "function",
   :full-name "cljs.js/eval-str",
   :docstring
   "Evalute ClojureScript source given as a string. The parameters:\n\nstate (atom)\n  the compiler state\n\nsource (string)\n  the ClojureScript source\n\nname (symbol)\n  optional, the name of the source\n\nopts (map)\n  compilation options.\n\n  :eval         - eval function to invoke, see *eval-fn*\n  :load         - library resolution function, see *load-fn*\n  :source-map   - set to true to generate inline source map information\n  :cache-source - optional, a function to run side-effects with the\n                  compilation result prior to actual evalution. This function\n                  takes two arguments, the first is the eval map, the source\n                  will be under :source. The second argument is a callback of\n                  one argument. If an error occurs an :error key should be\n                  supplied.\n\ncb (function)\n  callback, will be invoked with a map. If succesful the map will contain\n  a :value key with the result of evaluation and :ns the current namespace.\n  If unsuccessful will contain a :error key with an ex-info instance describing\n  the cause of failure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "try-expr"
  {:ns "cljs.test",
   :name "try-expr",
   :signature ["[msg form]"],
   :type "macro",
   :full-name "cljs.test/try-expr",
   :docstring
   "Used by the 'is' macro to catch unexpected exceptions.\nYou don't call this.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-macros"
  {:ns "cljs.js",
   :name "load-macros",
   :signature ["[bound-vars k macros reload reloads opts cb]"],
   :type "function",
   :full-name "cljs.js/load-macros",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "alter-meta!"
  {:description
   "Alter the metadata of `data` to be `(apply f its-current-meta args)`.\n\nMetadata of vars cannot be altered since they are statically determined at compile-time.",
   :examples-htmls
   ["<p>Metadata of symbols and collections can be altered:</p><pre><code class=\"clj\">&#40;def a &#94;:foo &#91;1 2 3&#93;&#41;\n&#40;meta a&#41;\n;;=&gt; {:foo true}\n\n&#40;alter-meta! a assoc :bar true&#41;\n&#40;meta a&#41;\n;;=&gt; {:foo true, :bar true}\n</code></pre><p>Metadata of vars cannot be altered:</p><pre><code class=\"clj\">&#40;def a &#91;1 2 3&#93;&#41;\n&#40;meta #'a&#41;\n;;=&gt; {:arglists &#40;&#41;, :test nil, :name a, :column 1, :line 1, :file &quot;&lt;cljs repl&gt;&quot;, :doc nil, :ns cljs.user}\n\n&#40;alter-meta! #'a assoc :bar true&#41;\n&#40;:bar &#40;meta #'a&#41;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "alter-meta!",
   :signature ["[data f & args]"],
   :type "function",
   :related ["cljs.core/with-meta" "cljs.core/vary-meta"],
   :examples-strings
   [[["(def a ^:foo [1 2 3])"
      "(meta a) ;;=> {:foo true}"
      "(alter-meta! a assoc :bar true)"
      "(meta a) ;;=> {:foo true, :bar true}"]
     ["(def a [1 2 3])"
      "(meta #'a) ;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}"
      "(alter-meta! #'a assoc :bar true)"
      "(:bar (meta #'a)) ;;=> nil"]]],
   :description-html
   "<p>Alter the metadata of <code>data</code> to be <code>&#40;apply f its-current-meta args&#41;</code>.</p><p>Metadata of vars cannot be altered since they are statically determined at compile-time.</p>",
   :examples
   [{:id "8378a0",
     :content
     "Metadata of symbols and collections can be altered:\n\n```clj\n(def a ^:foo [1 2 3])\n(meta a)\n;;=> {:foo true}\n\n(alter-meta! a assoc :bar true)\n(meta a)\n;;=> {:foo true, :bar true}\n```\n\nMetadata of vars cannot be altered:\n\n```clj\n(def a [1 2 3])\n(meta #'a)\n;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}\n\n(alter-meta! #'a assoc :bar true)\n(:bar (meta #'a))\n;;=> nil\n```"}],
   :full-name "cljs.core/alter-meta!",
   :docstring
   "Atomically sets the metadata for a namespace/var/ref/agent/atom to be:\n\n(apply f its-current-meta args)\n\nf must be free of side-effects"},
  "foldcat"
  {:ns "clojure.core.reducers",
   :name "foldcat",
   :signature ["[coll]"],
   :type "function",
   :full-name "clojure.core.reducers/foldcat",
   :docstring "Equivalent to (fold cat append! coll)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "es6-set-entries-iterator"
  {:ns "cljs.core",
   :name "es6-set-entries-iterator",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/es6-set-entries-iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "conj"
  {:description
   "conj(oin)\n\nReturns a new collection with the `x`s \"added\" to `coll`.\n\nThe \"addition\" may happen at different \"places\" depending on the collection\ntype.\n\n`(conj nil item)` returns `(item)`.",
   :examples-htmls
   ["<p>Append a vector:</p><pre><code class=\"clj\">&#40;conj &#91;1 2 3&#93; 4&#41;\n;;=&gt; &#91;1 2 3 4&#93;\n</code></pre><p>Prepend a list:</p><pre><code class=\"clj\">&#40;conj &#40;list 1 2 3&#41; 0&#41;\n;;=&gt; &#40;0 1 2 3&#41;\n</code></pre><p>Prepend a sequence:</p><pre><code class=\"clj\">&#40;def x &#40;range 1 4&#41;&#41;\n;;=&gt; &#40;1 2 3&#41;\n\n&#40;conj x 0&#41;\n;;=&gt; &#40;0 1 2 3&#41;\n</code></pre><p>Add to set:</p><pre><code class=\"clj\">&#40;conj #{&quot;a&quot; &quot;b&quot; &quot;c&quot;} &quot;d&quot;&#41;\n;;=&gt; #{&quot;a&quot; &quot;b&quot; &quot;c&quot; &quot;d&quot;}\n</code></pre>"],
   :ns "cljs.core",
   :name "conj",
   :signature ["[]" "[coll]" "[coll x]" "[coll x & xs]"],
   :type "function",
   :related
   ["cljs.core/cons"
    "cljs.core/into"
    "cljs.core/peek"
    "cljs.core/pop"],
   :examples-strings
   [[["(conj [1 2 3] 4) ;;=> [1 2 3 4]"]
     ["(conj (list 1 2 3) 0) ;;=> (0 1 2 3)"]
     ["(def x (range 1 4)) ;;=> (1 2 3)" "(conj x 0) ;;=> (0 1 2 3)"]
     ["(conj #{\"a\" \"b\" \"c\"} \"d\") ;;=> #{\"a\" \"b\" \"c\" \"d\"}"]]],
   :description-html
   "<p>conj(oin)</p><p>Returns a new collection with the <code>x</code>s \"added\" to <code>coll</code>.</p><p>The \"addition\" may happen at different \"places\" depending on the collection type.</p><p><code>&#40;conj nil item&#41;</code> returns <code>&#40;item&#41;</code>.</p>",
   :examples
   [{:id "8c2a84",
     :content
     "Append a vector:\n\n```clj\n(conj [1 2 3] 4)\n;;=> [1 2 3 4]\n```\n\nPrepend a list:\n\n```clj\n(conj (list 1 2 3) 0)\n;;=> (0 1 2 3)\n```\n\nPrepend a sequence:\n\n```clj\n(def x (range 1 4))\n;;=> (1 2 3)\n\n(conj x 0)\n;;=> (0 1 2 3)\n```\n\nAdd to set:\n\n```clj\n(conj #{\"a\" \"b\" \"c\"} \"d\")\n;;=> #{\"a\" \"b\" \"c\" \"d\"}\n```"}],
   :full-name "cljs.core/conj",
   :docstring
   "conj[oin]. Returns a new collection with the xs\n'added'. (conj nil item) returns (item).  The 'addition' may\nhappen at different 'places' depending on the concrete type."},
  "ASeq"
  {:ns "cljs.core",
   :name "ASeq",
   :type "protocol",
   :full-name "cljs.core/ASeq",
   :docstring "Marker protocol indicating an array sequence.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "analyze*"
  {:ns "cljs.js",
   :name "analyze*",
   :signature ["[bound-vars source name opts cb]"],
   :type "function",
   :full-name "cljs.js/analyze*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pprint-logical-block"
  {:ns "cljs.pprint",
   :name "pprint-logical-block",
   :signature ["[& args]"],
   :type "macro",
   :full-name "cljs.pprint/pprint-logical-block",
   :docstring
   "Execute the body as a pretty printing logical block with output to *out* which\nmust be a pretty printing writer. When used from pprint or cl-format, this can be\nassumed.\n\nThis function is intended for use when writing custom dispatch functions.\n\nBefore the body, the caller can optionally specify options: :prefix, :per-line-prefix\nand :suffix.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "loaded-libs"
  {:ns "cljs.repl.browser",
   :name "loaded-libs",
   :type "var",
   :full-name "cljs.repl.browser/loaded-libs",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-print"
  {:ns "clojure.browser.repl",
   :name "repl-print",
   :signature ["[data]"],
   :type "function",
   :full-name "clojure.browser.repl/repl-print",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "decorate-specs"
  {:ns "cljs.repl",
   :name "decorate-specs",
   :signature ["[specs]"],
   :type "function",
   :full-name "cljs.repl/decorate-specs",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "List"
  {:ns "cljs.core",
   :name "List",
   :signature ["[meta first rest count __hash]"],
   :type "type",
   :full-name "cljs.core/List",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ObjMap.fromObject"
  {:ns "cljs.core",
   :name "ObjMap.fromObject",
   :signature ["[ks obj]"],
   :type "function",
   :full-name "cljs.core/ObjMap.fromObject",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "check-string-hash-cache"
  {:ns "cljs.core",
   :name "check-string-hash-cache",
   :signature ["[k]"],
   :type "function",
   :full-name "cljs.core/check-string-hash-cache",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "prewalk"
  {:ns "clojure.walk",
   :name "prewalk",
   :signature ["[f form]"],
   :type "function",
   :full-name "clojure.walk/prewalk",
   :docstring "Like postwalk, but does pre-order traversal.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns-side-effects"
  {:ns "cljs.js",
   :name "ns-side-effects",
   :signature
   ["[bound-vars ana-env ast opts cb]"
    "[load bound-vars ana-env {:keys [op], :as ast} opts cb]"],
   :type "function",
   :full-name "cljs.js/ns-side-effects",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-text"
  {:ns "clojure.browser.dom",
   :name "set-text",
   :signature ["[e s]"],
   :type "function",
   :full-name "clojure.browser.dom/set-text",
   :docstring
   "Set the text content for the passed element returning the\nelement. If a keyword is passed in the place of e, the element with\nthat id will be used and returned.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "send-for-eval"
  {:ns "cljs.repl.browser",
   :name "send-for-eval",
   :signature ["[form return-value-fn]" "[conn form return-value-fn]"],
   :type "function",
   :full-name "cljs.repl.browser/send-for-eval",
   :docstring
   "Given a form and a return value function, send the form to the\nbrowser for evaluation. The return value function will be called\nwhen the return value is received.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "clj->js"
  {:description
   "Recursively transforms ClojureScript values to JavaScript.\n\n| ClojureScript |        | JavaScript |         |\n|---------------|--------|------------|---------|\n| Set           | `#{}`  | Array      | `[]`    |\n| Vector        | `[]`   | Array      | `[]`    |\n| List          | `()`   | Array      | `[]`    |\n| Keyword       | `:foo` | String     | `\"foo\"` |\n| Symbol        | `bar`  | String     | `\"bar\"` |\n| Map           | `{}`   | Object     | `{}`    |",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;clj-&gt;js {:foo 1 :bar 2}&#41;\n;;=&gt; #js {:foo 1, :bar 2}\n\n&#40;clj-&gt;js &#91;:foo &quot;bar&quot; 'baz&#93;&#41;\n;;=&gt; #js &#91;&quot;foo&quot; &quot;bar&quot; &quot;baz&quot;&#93;\n\n&#40;clj-&gt;js &#91;1 {:foo &quot;bar&quot;} 4&#93;&#41;\n;;=&gt; #js &#91;1 #js {:foo &quot;bar&quot;} 4&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "clj->js",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/js->clj"],
   :examples-strings
   [[["(clj->js {:foo 1 :bar 2}) ;;=> #js {:foo 1, :bar 2}"
      "(clj->js [:foo \"bar\" 'baz]) ;;=> #js [\"foo\" \"bar\" \"baz\"]"
      "(clj->js [1 {:foo \"bar\"} 4]) ;;=> #js [1 #js {:foo \"bar\"} 4]"]]],
   :description-html
   "<p>Recursively transforms ClojureScript values to JavaScript.</p><p>| ClojureScript |        | JavaScript |         | |---------------|--------|------------|---------| | Set           | <code>#{}</code>  | Array      | <code>&#91;&#93;</code>    | | Vector        | <code>&#91;&#93;</code>   | Array      | <code>&#91;&#93;</code>    | | List          | <code>&#40;&#41;</code>   | Array      | <code>&#91;&#93;</code>    | | Keyword       | <code>:foo</code> | String     | <code>&quot;foo&quot;</code> | | Symbol        | <code>bar</code>  | String     | <code>&quot;bar&quot;</code> | | Map           | <code>{}</code>   | Object     | <code>{}</code>    |</p>",
   :examples
   [{:id "2b1057",
     :content
     "```clj\n(clj->js {:foo 1 :bar 2})\n;;=> #js {:foo 1, :bar 2}\n\n(clj->js [:foo \"bar\" 'baz])\n;;=> #js [\"foo\" \"bar\" \"baz\"]\n\n(clj->js [1 {:foo \"bar\"} 4])\n;;=> #js [1 #js {:foo \"bar\"} 4]\n```"}],
   :full-name "cljs.core/clj->js",
   :docstring
   "Recursively transforms ClojureScript values to JavaScript.\nsets/vectors/lists become Arrays, Keywords and Symbol become Strings,\nMaps become Objects. Arbitrary keys are encoded to by key->js."},
  "state"
  {:ns "cljs.repl.server",
   :name "state",
   :type "dynamic var",
   :full-name "cljs.repl.server/state",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-filename"
  {:ns "cljs.repl.nashorn",
   :name "repl-filename",
   :type "var",
   :full-name "cljs.repl.nashorn/repl-filename",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*current-env*"
  {:ns "cljs.test",
   :name "*current-env*",
   :type "dynamic var",
   :full-name "cljs.test/*current-env*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "double"
  {:ns "cljs.core",
   :name "double",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/double",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IPrintWithWriter"
  {:ns "cljs.core",
   :name "IPrintWithWriter",
   :type "protocol",
   :full-name "cljs.core/IPrintWithWriter",
   :docstring
   "The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cond-splicing"
  {:description
   "(Only allowed in `.cljc` files or the REPL)\n\nLike [doc:syntax/cond], except:\n\n- each conditional value must be a sequence,\n- the selected sequence is spliced into the parent form,\n- and it must have a parent form to be spliced into (not top level).\n\n`(def #?@(:cljs [foo 1])` is read as `(def foo 1)`.",
   :examples-htmls
   ["<pre><code class=\"clj\">'&#40;def #?@&#40;:cljs &#91;a 1&#93;\n          :clj  &#91;b 2&#93;&#41;&#41;\n;;=&gt; &#40;def a 1&#41;\n</code></pre>"],
   :ns "syntax",
   :name "cond-splicing",
   :type "syntax",
   :related ["syntax/cond"],
   :examples-strings
   [[["'(def #?@(:cljs [a 1]"
      "          :clj  [b 2])) ;;=> (def a 1)"]]],
   :description-html
   "<p>(Only allowed in <code>.cljc</code> files or the REPL)</p><p>Like [doc:syntax/cond], except:</p><ul><li>each conditional value must be a sequence,</li><li>the selected sequence is spliced into the parent form,</li><li>and it must have a parent form to be spliced into (not top level).</li></ul><p><code>&#40;def #?@&#40;:cljs &#91;foo 1&#93;&#41;</code> is read as <code>&#40;def foo 1&#41;</code>.</p>",
   :examples
   [{:id "9d0020",
     :content
     "```clj\n'(def #?@(:cljs [a 1]\n          :clj  [b 2]))\n;;=> (def a 1)\n```"}],
   :full-name "syntax/cond-splicing"},
  "unchecked-multiply"
  {:ns "cljs.core",
   :name "unchecked-multiply",
   :signature ["[]" "[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-multiply",
   :docstring "Returns the product of nums. (*) returns 1.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "DEMUNGE_PATTERN"
  {:ns "cljs.core",
   :name "DEMUNGE_PATTERN",
   :type "var",
   :full-name "cljs.core/DEMUNGE_PATTERN",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-table"
  {:ns "cljs.pprint",
   :name "print-table",
   :signature ["[ks rows]" "[rows]"],
   :type "function",
   :full-name "cljs.pprint/print-table",
   :docstring
   "Prints a collection of maps in a textual table. Prints table headings\nks, and then a line of output for each row, corresponding to the keys\nin ks. If ks are not specified, use the keys of the first item in rows.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IChunkedSeq"
  {:ns "cljs.core",
   :name "IChunkedSeq",
   :type "protocol",
   :full-name "cljs.core/IChunkedSeq",
   :docstring
   "Protocol for accessing a collection as sequential chunks.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mime-type->encoding"
  {:ns "cljs.repl.browser",
   :name "mime-type->encoding",
   :type "var",
   :full-name "cljs.repl.browser/mime-type->encoding",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "with-core-cljs"
  {:ns "cljs.compiler.api",
   :name "with-core-cljs",
   :signature ["[]" "[opts]" "[opts body]" "[state opts body]"],
   :type "function",
   :full-name "cljs.compiler.api/with-core-cljs",
   :docstring "Ensure that core.cljs has been loaded.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "tree-seq"
  {:description
   "Returns a lazy sequence of the nodes in a tree, via a depth-first walk.\n\n`branch?` must be a function of one argument that returns true if passed a node\nthat can have children (but may not).\n\n`children` must be a function of one argument that returns a sequence of the\nchildren. `children` will only be called on nodes for which `branch?` returns\ntrue.\n\n`root` is the root node of the tree.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "tree-seq",
   :signature ["[branch? children root]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of the nodes in a tree, via a depth-first walk.</p><p><code>branch?</code> must be a function of one argument that returns true if passed a node that can have children (but may not).</p><p><code>children</code> must be a function of one argument that returns a sequence of the children. <code>children</code> will only be called on nodes for which <code>branch?</code> returns true.</p><p><code>root</code> is the root node of the tree.</p>",
   :full-name "cljs.core/tree-seq",
   :docstring
   "Returns a lazy sequence of the nodes in a tree, via a depth-first walk.\n branch? must be a fn of one arg that returns true if passed a node\n that can have children (but may not).  children must be a fn of one\n arg that returns a sequence of the children. Will only be called on\n nodes for which branch? returns true. Root is the root node of the\ntree."},
  "meta"
  {:description
   "Attaches metadata to the following form.  Metadata can only be attached to a\nsymbol or collection.\n\nMetadata will assume the following transformations depending on its type:\n\n- keyword `^:foo` => `^{:foo true}`\n- string `^\"foo\"` => `^{:tag \"foo\"}`\n- symbol `^foo` => `^{:tag <value of foo>}`",
   :examples-htmls
   ["<p>Attach metadata to a collection:</p><pre><code class=\"clj\">&#94;:foo &#91;1 2 3&#93;\n;;=&gt; &#91;1 2 3&#93;\n</code></pre><p>View the resulting metadata:</p><pre><code class=\"clj\">&#40;meta &#94;:foo &#91;1 2 3&#93;&#41;\n;;=&gt; {:foo true}\n\n&#40;meta &#94;{:foo &quot;bar&quot;} &#91;1 2 3&#93;&#41;\n;;=&gt; {:foo &quot;bar&quot;}\n\n&#40;meta &#94;&quot;foo&quot; &#91;1 2 3&#93;&#41;\n;;=&gt; {:tag &quot;foo&quot;}\n\n&#40;def foo 1&#41;\n&#40;meta &#94;foo &#91;1 2 3&#93;&#41;\n;;=&gt; {:tag 1}\n</code></pre><p>Chain metadata:</p><pre><code class=\"clj\">&#40;meta &#94;:foo &#94;&quot;foo&quot; &#91;1 2 3&#93;&#41;\n;;=&gt; {:foo true, :tag &quot;foo&quot;}\n</code></pre>"],
   :ns "syntax",
   :name "meta",
   :type "syntax",
   :related
   ["cljs.core/meta"
    "cljs.core/with-meta"
    "cljs.core/vary-meta"
    "cljs.core/alter-meta!"],
   :examples-strings
   [[["^:foo [1 2 3] ;;=> [1 2 3]"]
     ["(meta ^:foo [1 2 3]) ;;=> {:foo true}"
      "(meta ^{:foo \"bar\"} [1 2 3]) ;;=> {:foo \"bar\"}"
      "(meta ^\"foo\" [1 2 3]) ;;=> {:tag \"foo\"}"
      "(def foo 1)"
      "(meta ^foo [1 2 3]) ;;=> {:tag 1}"]
     ["(meta ^:foo ^\"foo\" [1 2 3]) ;;=> {:foo true, :tag \"foo\"}"]]],
   :description-html
   "<p>Attaches metadata to the following form.  Metadata can only be attached to a symbol or collection.</p><p>Metadata will assume the following transformations depending on its type:</p><ul><li>keyword <code>&#94;:foo</code> => <code>&#94;{:foo true}</code></li><li>string <code>&#94;&quot;foo&quot;</code> => <code>&#94;{:tag &quot;foo&quot;}</code></li><li>symbol <code>&#94;foo</code> => <code>&#94;{:tag &lt;value of foo&gt;}</code></li></ul>",
   :examples
   [{:id "5b8fec",
     :content
     "Attach metadata to a collection:\n\n```clj\n^:foo [1 2 3]\n;;=> [1 2 3]\n```\n\nView the resulting metadata:\n\n```clj\n(meta ^:foo [1 2 3])\n;;=> {:foo true}\n\n(meta ^{:foo \"bar\"} [1 2 3])\n;;=> {:foo \"bar\"}\n\n(meta ^\"foo\" [1 2 3])\n;;=> {:tag \"foo\"}\n\n(def foo 1)\n(meta ^foo [1 2 3])\n;;=> {:tag 1}\n```\n\nChain metadata:\n\n```clj\n(meta ^:foo ^\"foo\" [1 2 3])\n;;=> {:foo true, :tag \"foo\"}\n```"}],
   :full-name "syntax/meta"},
  "load-source-map!"
  {:ns "cljs.js",
   :name "load-source-map!",
   :signature ["[state ns sm-json]"],
   :type "function",
   :full-name "cljs.js/load-source-map!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "defonce"
  {:ns "cljs.core",
   :name "defonce",
   :signature ["[x init]"],
   :type "macro",
   :full-name "cljs.core/defonce",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-queue"
  {:ns "clojure.browser.repl",
   :name "load-queue",
   :type "var",
   :full-name "clojure.browser.repl/load-queue",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "wrap-message"
  {:ns "clojure.browser.repl",
   :name "wrap-message",
   :signature ["[t data]"],
   :type "function",
   :full-name "clojure.browser.repl/wrap-message",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "float-pattern"
  {:ns "cljs.reader",
   :name "float-pattern",
   :type "var",
   :full-name "cljs.reader/float-pattern",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "append"
  {:ns "clojure.browser.dom",
   :name "append",
   :signature ["[parent & children]"],
   :type "function",
   :full-name "clojure.browser.dom/append",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "join"
  {:ns "clojure.set",
   :name "join",
   :signature ["[xrel yrel]" "[xrel yrel km]"],
   :type "function",
   :full-name "clojure.set/join",
   :docstring
   "When passed 2 rels, returns the rel corresponding to the natural\njoin. When passed an additional keymap, joins on the corresponding\nkeys.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "click-element"
  {:ns "clojure.browser.dom",
   :name "click-element",
   :signature ["[e]"],
   :type "function",
   :full-name "clojure.browser.dom/click-element",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "handle-connection"
  {:ns "cljs.repl.browser",
   :name "handle-connection",
   :signature ["[opts conn]"],
   :type "function",
   :full-name "cljs.repl.browser/handle-connection",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array-list"
  {:ns "cljs.core",
   :name "array-list",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.core/array-list",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-subtract-int"
  {:ns "cljs.core",
   :name "unchecked-subtract-int",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-subtract-int",
   :docstring
   "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "upper-case"
  {:description "Converts string to all upper-case.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "upper-case",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html "<p>Converts string to all upper-case.</p>",
   :full-name "clojure.string/upper-case",
   :docstring "Converts string to all upper-case."},
  "IIndexed"
  {:ns "cljs.core",
   :name "IIndexed",
   :type "protocol",
   :full-name "cljs.core/IIndexed",
   :docstring
   "Protocol for collections to provide idexed-based access to their items.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "RangeIterator"
  {:ns "cljs.core",
   :name "RangeIterator",
   :signature ["[i end step]"],
   :type "type",
   :full-name "cljs.core/RangeIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "TransientHashMap"
  {:ns "cljs.core",
   :name "TransientHashMap",
   :signature ["[edit root count has-nil? nil-val]"],
   :type "type",
   :full-name "cljs.core/TransientHashMap",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "predicate"
  {:description
   "A naming convention for predicate functions (unenforced).\n\nA predicate function is one that returns `true` or `false`, and is presumably\npure (not having any side-effects on state).\n\nSome predicate functions which use this convention:\n\n- [doc:cljs.core/even?]\n- [doc:cljs.core/empty?]\n- [doc:cljs.core/contains?]\n- [doc:cljs.core/nil?]\n\nIt is sometimes used to name boolean values as well, not just predicate functions.",
   :examples-htmls
   ["<p>Create a <code>divisible?</code> predicate:</p><pre><code class=\"clj\">&#40;defn divisible? &#91;n factor&#93;\n  &#40;zero? &#40;mod n factor&#41;&#41;&#41;\n\n&#40;divisible? 15 3&#41;\n;;=&gt; true\n\n&#40;divisible? 15 2&#41;\n;;=&gt; false\n\n&#40;filter #&#40;divisible? 15 %&#41; &#40;range 15&#41;&#41;\n;;=&gt; &#40;1 3 5&#41;\n</code></pre>"],
   :ns "syntax",
   :name "predicate",
   :type "convention",
   :related ["syntax/impure"],
   :examples-strings
   [[["(defn divisible? [n factor]"
      "  (zero? (mod n factor)))"
      "(divisible? 15 3) ;;=> true"
      "(divisible? 15 2) ;;=> false"
      "(filter #(divisible? 15 %) (range 15)) ;;=> (1 3 5)"]]],
   :description-html
   "<p>A naming convention for predicate functions (unenforced).</p><p>A predicate function is one that returns <code>true</code> or <code>false</code>, and is presumably pure (not having any side-effects on state).</p><p>Some predicate functions which use this convention:</p><ul><li>[doc:cljs.core/even?]</li><li>[doc:cljs.core/empty?]</li><li>[doc:cljs.core/contains?]</li><li>[doc:cljs.core/nil?]</li></ul><p>It is sometimes used to name boolean values as well, not just predicate functions.</p>",
   :examples
   [{:id "5a85c7",
     :content
     "Create a `divisible?` predicate:\n\n```clj\n(defn divisible? [n factor]\n  (zero? (mod n factor)))\n\n(divisible? 15 3)\n;;=> true\n\n(divisible? 15 2)\n;;=> false\n\n(filter #(divisible? 15 %) (range 15))\n;;=> (1 3 5)\n```"}],
   :full-name "syntax/predicate"},
  "source-on-disk"
  {:ns "cljs.build.api",
   :name "source-on-disk",
   :signature ["[opts ijs]"],
   :type "function",
   :full-name "cljs.build.api/source-on-disk",
   :docstring
   "Ensure that the given IJavaScript exists on disk in the output directory.\nReturn updated IJavaScript with the new location if necessary.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "divide"
  {:ns "cljs.core",
   :name "divide",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "macro",
   :full-name "cljs.core/divide",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl-env*"
  {:ns "cljs.repl.node",
   :name "repl-env*",
   :signature ["[options]"],
   :type "function",
   :full-name "cljs.repl.node/repl-env*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "print-doc"
  {:ns "clojure.reflect",
   :name "print-doc",
   :signature ["[{:keys [name method-params doc]}]"],
   :type "function",
   :full-name "clojure.reflect/print-doc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "clone"
  {:ns "cljs.core",
   :name "clone",
   :signature ["[value]"],
   :type "function",
   :full-name "cljs.core/clone",
   :docstring
   "Clone the supplied value which must implement ICloneable.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*main-cli-fn*"
  {:ns "cljs.core",
   :name "*main-cli-fn*",
   :type "var",
   :full-name "cljs.core/*main-cli-fn*",
   :docstring
   "When compiled for a command-line target, whatever function\n*main-cli-fn* is set to will be called with the command-line\nargv as arguments",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "err-out"
  {:ns "cljs.repl",
   :name "err-out",
   :signature ["[& body]"],
   :type "macro",
   :full-name "cljs.repl/err-out",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentVector.EMPTY_NODE"
  {:ns "cljs.core",
   :name "PersistentVector.EMPTY_NODE",
   :type "var",
   :full-name "cljs.core/PersistentVector.EMPTY_NODE",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parse-file-line-column"
  {:ns "cljs.repl.browser",
   :name "parse-file-line-column",
   :signature ["[flc]"],
   :type "function",
   :full-name "cljs.repl.browser/parse-file-line-column",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "write-all"
  {:ns "cljs.core",
   :name "write-all",
   :signature ["[writer & ss]"],
   :type "function",
   :full-name "cljs.core/write-all",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "wrap-fn"
  {:ns "cljs.repl.rhino",
   :name "wrap-fn",
   :signature ["[form]"],
   :type "function",
   :full-name "cljs.repl.rhino/wrap-fn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IIterable"
  {:ns "cljs.core",
   :name "IIterable",
   :type "protocol",
   :full-name "cljs.core/IIterable",
   :docstring "Protocol for iterating over a collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "hash-string"
  {:ns "cljs.core",
   :name "hash-string",
   :signature ["[k]"],
   :type "function",
   :full-name "cljs.core/hash-string",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "StringBufferWriter"
  {:ns "cljs.core",
   :name "StringBufferWriter",
   :signature ["[sb]"],
   :type "type",
   :full-name "cljs.core/StringBufferWriter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "flush-print-queue!"
  {:ns "clojure.browser.repl",
   :name "flush-print-queue!",
   :signature ["[conn]"],
   :type "function",
   :full-name "clojure.browser.repl/flush-print-queue!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "while"
  {:description
   "Repeatedly executes `body` while `test` expression is true. Presumes some\nside-effect will cause `test` to become false or nil.\n\nReturns nil.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "while",
   :signature ["[test & body]"],
   :type "macro",
   :related ["cljs.core/loop"],
   :examples-strings [],
   :description-html
   "<p>Repeatedly executes <code>body</code> while <code>test</code> expression is true. Presumes some side-effect will cause <code>test</code> to become false or nil.</p><p>Returns nil.</p>",
   :full-name "cljs.core/while",
   :docstring
   "Repeatedly executes body while test expression is true. Presumes\nsome side-effect will cause test to become false/nil. Returns nil"},
  "queue-literal"
  {:description
   "Create a persistent queue. The form following `#queue` must be a vector.\n\nQueues are the only core collection type that requires a tagged literal to\ncreate, while the other collections have built-in delimiters `()` `[]` `{}` `#{}`.\n\nSee [doc:cljs.core/PersistentQueue] for data structure details.",
   :examples-htmls
   ["<pre><code class=\"clj\">#queue &#91;&#93;\n;;=&gt; #queue &#91;&#93;\n\n#queue &#91;1 2 3&#93;\n;;=&gt; #queue &#91;1 2 3&#93;\n</code></pre><p>Some operations:</p><pre><code class=\"clj\">&#40;def q #queue &#91;1 2 3&#93;&#41;\n;;=&gt; #queue &#91;1 2 3&#93;\n\n&#40;conj q 4&#41;\n;;=&gt; #queue &#91;1 2 3 4&#93;\n\n&#40;pop q&#41;\n;;=&gt; #queue &#91;2 3&#93;\n\n&#40;peek q&#41;\n;;=&gt; 1\n</code></pre>"],
   :ns "syntax",
   :name "queue-literal",
   :type "tagged literal",
   :related ["syntax/list" "syntax/vector" "syntax/map" "syntax/set"],
   :examples-strings
   [[["#queue [] ;;=> #queue []" "#queue [1 2 3] ;;=> #queue [1 2 3]"]
     ["(def q #queue [1 2 3]) ;;=> #queue [1 2 3]"
      "(conj q 4) ;;=> #queue [1 2 3 4]"
      "(pop q) ;;=> #queue [2 3]"
      "(peek q) ;;=> 1"]]],
   :description-html
   "<p>Create a persistent queue. The form following <code>#queue</code> must be a vector.</p><p>Queues are the only core collection type that requires a tagged literal to create, while the other collections have built-in delimiters <code>&#40;&#41;</code> <code>&#91;&#93;</code> <code>{}</code> <code>#{}</code>.</p><p>See [doc:cljs.core/PersistentQueue] for data structure details.</p>",
   :examples
   [{:id "f81c50",
     :content
     "```clj\n#queue []\n;;=> #queue []\n\n#queue [1 2 3]\n;;=> #queue [1 2 3]\n```\n\nSome operations:\n\n```clj\n(def q #queue [1 2 3])\n;;=> #queue [1 2 3]\n\n(conj q 4)\n;;=> #queue [1 2 3 4]\n\n(pop q)\n;;=> #queue [2 3]\n\n(peek q)\n;;=> 1\n```"}],
   :full-name "syntax/queue-literal"},
  "PersistentVector.fromArray"
  {:ns "cljs.core",
   :name "PersistentVector.fromArray",
   :signature ["[xs no-clone]"],
   :type "function",
   :full-name "cljs.core/PersistentVector.fromArray",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-print-fn!"
  {:ns "cljs.core",
   :name "set-print-fn!",
   :signature ["[f]"],
   :type "function",
   :full-name "cljs.core/set-print-fn!",
   :docstring "Set *print-fn* to f.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "floats"
  {:ns "cljs.core",
   :name "floats",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/floats",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reset-meta!"
  {:ns "cljs.core",
   :name "reset-meta!",
   :signature ["[iref m]"],
   :type "function",
   :full-name "cljs.core/reset-meta!",
   :docstring "Atomically resets the metadata for an atom",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "formatter"
  {:ns "cljs.pprint",
   :name "formatter",
   :signature ["[format-in]"],
   :type "macro",
   :full-name "cljs.pprint/formatter",
   :docstring
   "Makes a function which can directly run format-in. The function is\nfn [stream & args] ... and returns nil unless the stream is nil (meaning\noutput to a string) in which case it returns the resulting string.\n\nformat-in can be either a control string or a previously compiled format.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-shift-right"
  {:description
   "Bitwise shift right `n` bits.  Same as `x >> n` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-shift-right 2r1010 1&#41;\n;;=&gt; 5\n;; 5 = 2r0101\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-shift-right 10 1&#41;\n;;=&gt; 5\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-shift-right",
   :signature ["[x n]"],
   :type "function/macro",
   :related
   ["cljs.core/bit-shift-left" "cljs.core/unsigned-bit-shift-right"],
   :examples-strings
   [[["(bit-shift-right 2r1010 1) ;;=> 5 ;; 5 = 2r0101"]
     ["(bit-shift-right 10 1) ;;=> 5"]]],
   :description-html
   "<p>Bitwise shift right <code>n</code> bits.  Same as <code>x &gt;&gt; n</code> in JavaScript.</p>",
   :examples
   [{:id "5b75af",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-shift-right 2r1010 1)\n;;=> 5\n;; 5 = 2r0101\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-shift-right 10 1)\n;;=> 5\n```"}],
   :full-name "cljs.core/bit-shift-right",
   :docstring "Bitwise shift right"},
  "->>"
  {:description
   "The thread-last macro \"threads\" an expression through several forms as the last\nitem in a list.\n\nInserts `x` as the last item in the first form, making a list of it if it is not\na list already. If there are more forms, inserts the first form as the last item\nin second form, etc.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(->> x\n  (a b c)\n  d\n  (x y z))</pre></td>\n      <td><pre>\n(x y z (d (a b c x)))</pre></td></tr></tbody></table>",
   :examples-htmls
   ["<p>Sequence transformation functions often take a sequence as the last argument, thus the thread-last macro is commonly used with them.  Here we compute the sum of the first 10 even squares:</p><pre><code class=\"clj\">&#40;-&gt;&gt; &#40;range&#41;\n     &#40;map #&#40;&#42; % %&#41;&#41;\n     &#40;filter even?&#41;\n     &#40;take 10&#41;\n     &#40;reduce +&#41;&#41;\n;;=&gt; 1140\n</code></pre><p>This expands to:</p><pre><code class=\"clj\">&#40;reduce +\n  &#40;take 10\n    &#40;filter even?\n      &#40;map #&#40;&#42; % %&#41;\n        &#40;range&#41;&#41;&#41;&#41;&#41;\n;;=&gt; 1140\n</code></pre>"],
   :ns "cljs.core",
   :name "->>",
   :signature ["[x & forms]"],
   :type "macro",
   :related ["cljs.core/->"],
   :examples-strings
   [[["(->> (range)"
      "     (map #(* % %))"
      "     (filter even?)"
      "     (take 10)"
      "     (reduce +)) ;;=> 1140"]
     ["(reduce +"
      "  (take 10"
      "    (filter even?"
      "      (map #(* % %)"
      "        (range))))) ;;=> 1140"]]],
   :description-html
   "<p>The thread-last macro \"threads\" an expression through several forms as the last item in a list.</p><p>Inserts <code>x</code> as the last item in the first form, making a list of it if it is not a list already. If there are more forms, inserts the first form as the last item in second form, etc.</p><p><table class=\"code-tbl-9bef6\">   <thead><pre><code>&lt;tr&gt;\n  &lt;th&gt;Code&lt;/th&gt;\n  &lt;th&gt;Expands To&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; \n</code></pre>  <tbody><pre><code>&lt;tr&gt;\n  &lt;td&gt;&lt;pre&gt; \n</code></pre>(->> x   (a b c)   d   (x y z))</pre></td><pre><code>  &lt;td&gt;&lt;pre&gt; \n</code></pre>(x y z (d (a b c x)))</pre></td></tr></tbody></table></p>",
   :examples
   [{:id "1dc72c",
     :content
     "Sequence transformation functions often take a sequence as the last argument,\nthus the thread-last macro is commonly used with them.  Here we compute the sum\nof the first 10 even squares:\n\n```clj\n(->> (range)\n     (map #(* % %))\n     (filter even?)\n     (take 10)\n     (reduce +))\n;;=> 1140\n```\n\nThis expands to:\n\n```clj\n(reduce +\n  (take 10\n    (filter even?\n      (map #(* % %)\n        (range)))))\n;;=> 1140\n```"}],
   :full-name "cljs.core/->>",
   :docstring
   "Threads the expr through the forms. Inserts x as the\nlast item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nlast item in second form, etc."},
  "print"
  {:ns "cljs.core",
   :name "print",
   :type "function",
   :full-name "cljs.core/print",
   :docstring
   "Prints the object(s) using string-print.\nprint and println produce output for human consumption.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-length*"
  {:ns "cljs.core",
   :name "*print-length*",
   :type "dynamic var",
   :full-name "cljs.core/*print-length*",
   :docstring
   "When set to logical true, objects will be printed in a way that preserves\ntheir type when read in later.\n\nDefaults to false.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IAssociative"
  {:ns "cljs.core",
   :name "IAssociative",
   :type "protocol",
   :full-name "cljs.core/IAssociative",
   :docstring "Protocol for adding associativity to collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "instance?"
  {:description
   "Returns true if `o` is an instance of type `t`, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "instance?",
   :signature ["[t o]"],
   :type "function/macro",
   :related ["cljs.core/type"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>o</code> is an instance of type <code>t</code>, false otherwise.</p>",
   :full-name "cljs.core/instance?",
   :docstring
   "Evaluates x and tests if it is an instance of the type\nc. Returns true or false"},
  "volatile!"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "volatile!",
   :signature ["[val]"],
   :type "function",
   :related
   ["cljs.core/volatile?"
    "cljs.core/vswap!"
    "cljs.core/vreset!"
    "cljs.core/Volatile"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/volatile!",
   :docstring
   "Creates and returns a Volatile with an initial value of val."},
  "macros"
  {:ns "cljs.reader",
   :name "macros",
   :signature ["[c]"],
   :type "function",
   :full-name "cljs.reader/macros",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IAtom"
  {:ns "cljs.core",
   :name "IAtom",
   :type "protocol",
   :full-name "cljs.core/IAtom",
   :docstring "Marker protocol indicating an atom.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "analyze-str"
  {:ns "cljs.js",
   :name "analyze-str",
   :signature
   ["[state source cb]"
    "[state source name cb]"
    "[state source name opts cb]"],
   :type "function",
   :full-name "cljs.js/analyze-str",
   :docstring
   "Analyze ClojureScript source. The compiler state will be populated with\nthe results of analyzes. The parameters:\n\nstate (atom)\n  the compiler state\n\nsource (string)\n  the ClojureScript source\n\nname (symbol)\n  optional, the name of the source\n\nopts (map)\n  compilation options.\n\n:eval - the eval function to invoke, see *eval-fn*\n:load - library resolution function, see *load-fn*\n\ncb (function)\n  callback, will be invoked with a map. If successful the map will contain\n  a key :value, the actual value is not meaningful. If unsuccessful the\n  map will contain a key :error with an ex-info instance describing the cause\n  of failure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "stepper"
  {:ns "cljs.core",
   :name "stepper",
   :signature ["[xform iter]"],
   :type "function",
   :full-name "cljs.core/stepper",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-multiply-int"
  {:ns "cljs.core",
   :name "unchecked-multiply-int",
   :signature ["[]" "[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-multiply-int",
   :docstring "Returns the product of nums. (*) returns 1.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "quote"
  {:ns "special",
   :name "quote",
   :signature ["[form]"],
   :type "special form",
   :full-name "special/quote",
   :docstring "Yields the unevaluated form.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array-seq"
  {:description
   "Creates a `seq` from a JavaScript array, starting at index `i` if given.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;array-seq #js &#91;1 2 3&#93;&#41;\n;;=&gt; &#40;1 2 3&#41;\n\n&#40;array-seq #js &#91;1 2 3&#93; 1&#41;\n;;=&gt; &#40;2 3&#41;\n</code></pre>"],
   :ns "cljs.core",
   :name "array-seq",
   :signature ["[array]" "[array i]"],
   :type "function",
   :examples-strings
   [[["(array-seq #js [1 2 3]) ;;=> (1 2 3)"
      "(array-seq #js [1 2 3] 1) ;;=> (2 3)"]]],
   :description-html
   "<p>Creates a <code>seq</code> from a JavaScript array, starting at index <code>i</code> if given.</p>",
   :examples
   [{:id "9ef6de",
     :content
     "```clj\n(array-seq #js [1 2 3])\n;;=> (1 2 3)\n\n(array-seq #js [1 2 3] 1)\n;;=> (2 3)\n```"}],
   :full-name "cljs.core/array-seq",
   :docstring "Create a seq from a JavaScript array."},
  "memoize"
  {:description
   "Returns a memoized version of a referentially transparent function.\n\nA memoized version of a function keeps a cache of the mappings from arguments to\nresults in memory. When calls with the same arguments are repeated often, a\nmemoized function has higher performance at the expense of higher memory usage.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "memoize",
   :signature ["[f]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns a memoized version of a referentially transparent function.</p><p>A memoized version of a function keeps a cache of the mappings from arguments to results in memory. When calls with the same arguments are repeated often, a memoized function has higher performance at the expense of higher memory usage.</p>",
   :full-name "cljs.core/memoize",
   :docstring
   "Returns a memoized version of a referentially transparent function. The\nmemoized version of the function keeps a cache of the mapping from arguments\nto results and, when calls with the same arguments are repeated often, has\nhigher performance at the expense of higher memory use."},
  "unlisten-by-key"
  {:ns "clojure.browser.event",
   :name "unlisten-by-key",
   :signature ["[key]"],
   :type "function",
   :full-name "clojure.browser.event/unlisten-by-key",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array-map"
  {:description
   "Returns a new array map (a map implemented with arrays) with the supplied mappings.\n\n`keyvals` must be an even number of forms.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;array-map :a 10&#41;\n;;=&gt; {:a 10}\n\n&#40;array-map :a 10 :b 20&#41;\n;;=&gt; {:a 10 :b 20}\n</code></pre>"],
   :ns "cljs.core",
   :name "array-map",
   :signature ["[& keyvals]"],
   :type "function/macro",
   :related
   ["cljs.core/assoc" "cljs.core/hash-map" "cljs.core/sorted-map"],
   :examples-strings
   [[["(array-map :a 10) ;;=> {:a 10}"
      "(array-map :a 10 :b 20) ;;=> {:a 10 :b 20}"]]],
   :description-html
   "<p>Returns a new array map (a map implemented with arrays) with the supplied mappings.</p><p><code>keyvals</code> must be an even number of forms.</p>",
   :examples
   [{:id "198026",
     :content
     "```clj\n(array-map :a 10)\n;;=> {:a 10}\n\n(array-map :a 10 :b 20)\n;;=> {:a 10 :b 20}\n```"}],
   :full-name "cljs.core/array-map",
   :docstring
   "keyval => key val\nReturns a new array map with supplied mappings."},
  "defprotocol"
  {:ns "cljs.core",
   :name "defprotocol",
   :signature ["[psym & doc+methods]"],
   :type "macro",
   :full-name "cljs.core/defprotocol",
   :docstring
   "A protocol is a named set of named methods and their signatures:\n\n(defprotocol AProtocolName\n  ;optional doc string\n  \"A doc string for AProtocol abstraction\"\n\n;method signatures\n  (bar [this a b] \"bar docs\")\n  (baz [this a] [this a b] [this a b c] \"baz docs\"))\n\nNo implementations are provided. Docs can be specified for the\nprotocol overall and for each method. The above yields a set of\npolymorphic functions and a protocol object. All are\nnamespace-qualified by the ns enclosing the definition The resulting\nfunctions dispatch on the type of their first argument, which is\nrequired and corresponds to the implicit target object ('this' in\nJavaScript parlance). defprotocol is dynamic, has no special compile-time\neffect, and defines no new types.\n\n(defprotocol P\n  (foo [this])\n  (bar-me [this] [this y]))\n\n(deftype Foo [a b c]\n  P\n  (foo [this] a)\n  (bar-me [this] b)\n  (bar-me [this y] (+ c y)))\n\n(bar-me (Foo. 1 2 3) 42)\n=> 45\n\n(foo\n  (let [x 42]\n    (reify P\n      (foo [this] 17)\n      (bar-me [this] x)\n      (bar-me [this y] x))))\n=> 17",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "add-watch"
  {:description
   "Adds a watch function `f` to atom `a` that will execute when the value of `a`\nchanges.\n\nThe watch function takes 4 arguments: a key, the atom, its old state, and its\nnew state.\n\n`key` should be a keyword and can be used with `remove-watch` to remove the\nwatch function.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a &#40;atom {}&#41;&#41;\n\n&#40;add-watch a :logger\n  &#40;fn &#91;&#95;key &#95;atom old-state new-state&#93;\n    &#40;println &quot;old:&quot; old-state&#41;\n    &#40;println &quot;new:&quot; new-state&#41;&#41;&#41;\n\n&#40;swap! a assoc :foo &quot;bar&quot;&#41;\n;;=&gt; will print the following:\n;; old: {}\n;; new: {:foo &quot;bar&quot;}\n</code></pre>"],
   :ns "cljs.core",
   :name "add-watch",
   :signature ["[a key f]"],
   :type "function",
   :related ["cljs.core/remove-watch"],
   :examples-strings
   [[["(def a (atom {}))"
      "(add-watch a :logger"
      "  (fn [_key _atom old-state new-state]"
      "    (println \"old:\" old-state)"
      "    (println \"new:\" new-state)))"
      "(swap! a assoc :foo \"bar\") ;;=> will print the following: ;; old: {} ;; new: {:foo \"bar\"}"]]],
   :description-html
   "<p>Adds a watch function <code>f</code> to atom <code>a</code> that will execute when the value of <code>a</code> changes.</p><p>The watch function takes 4 arguments: a key, the atom, its old state, and its new state.</p><p><code>key</code> should be a keyword and can be used with <code>remove-watch</code> to remove the watch function.</p>",
   :examples
   [{:id "2f2fe0",
     :content
     "```clj\n(def a (atom {}))\n\n(add-watch a :logger\n  (fn [_key _atom old-state new-state]\n    (println \"old:\" old-state)\n    (println \"new:\" new-state)))\n\n(swap! a assoc :foo \"bar\")\n;;=> will print the following:\n;; old: {}\n;; new: {:foo \"bar\"}\n```"}],
   :full-name "cljs.core/add-watch",
   :docstring
   "Alpha - subject to change.\n\nAdds a watch function to an atom reference. The watch fn must be a\nfn of 4 args: a key, the reference, its old-state, its\nnew-state. Whenever the reference's state might have been changed,\nany registered watches will have their functions called. The watch\nfn will be called synchronously. Note that an atom's state\nmay have changed again prior to the fn call, so use old/new-state\nrather than derefing the reference. Keys must be unique per\nreference, and can be used to remove the watch with remove-watch,\nbut are otherwise considered opaque by the watch mechanism.  Bear in\nmind that regardless of the result or action of the watch fns the\natom's value will change.  Example:\n\n    (def a (atom 0))\n    (add-watch a :inc (fn [k r o n] (assert (== 0 n))))\n    (swap! a inc)\n    ;; Assertion Error\n    (deref a)\n    ;=> 1"},
  "zero?"
  {:description "Returns true if `n` is 0, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "zero?",
   :signature ["[n]"],
   :type "function/macro",
   :related ["cljs.core/pos?" "cljs.core/neg?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is 0, false otherwise.</p>",
   :full-name "cljs.core/zero?",
   :docstring "Returns true if num is zero, else false"},
  "ITransientAssociative"
  {:ns "cljs.core",
   :name "ITransientAssociative",
   :type "protocol",
   :full-name "cljs.core/ITransientAssociative",
   :docstring
   "Protocol for adding associativity to transient collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "extend-type"
  {:description
   "Extend a [type] to implement one or more [protocols].\n\n`type-sym` can be the result of a [doc:cljs.core/deftype] or any JS constructor\nfunction (e.g. `js/Date`).  But when targetting JS base types (e.g.\n`js/Number`, `js/String`), you must use special _type symbols_ instead.  These\ntype symbols are associated with type strings deduced by [`goog/typeOf`]:\n\n| type symbol  | corresponding `goog/typeOf` value |\n|--------------|-------------|\n| `nil`        | `\"null\"` |\n| `object`     | `\"object\"` |\n| `string`     | `\"string\"` |\n| `number`     | `\"number\"` |\n| `array`      | `\"array\"` |\n| `function`   | `\"function\"` |\n| `boolean`    | `\"boolean\"` |\n\n`type-sym` can also be specified as `default` in order to provide default\nimplementations for protocols.\n\n[`goog/typeOf`]:http://google.github.io/closure-library/api/namespace_goog.html#typeOf",
   :examples-htmls [],
   :ns "cljs.core",
   :name "extend-type",
   :signature ["[type-sym & impls]"],
   :type "macro",
   :related ["cljs.core/extend-protocol"],
   :examples-strings [],
   :description-html
   "<p>Extend a [type] to implement one or more [protocols].</p><p><code>type-sym</code> can be the result of a [doc:cljs.core/deftype] or any JS constructor function (e.g. <code>js/Date</code>).  But when targetting JS base types (e.g. <code>js/Number</code>, <code>js/String</code>), you must use special <i>type symbols</i> instead.  These type symbols are associated with type strings deduced by [<code>goog/typeOf</code>]:</p><p>| type symbol  | corresponding <code>goog/typeOf</code> value | |--------------|-------------| | <code>nil</code>        | <code>&quot;null&quot;</code> | | <code>object</code>     | <code>&quot;object&quot;</code> | | <code>string</code>     | <code>&quot;string&quot;</code> | | <code>number</code>     | <code>&quot;number&quot;</code> | | <code>array</code>      | <code>&quot;array&quot;</code> | | <code>function</code>   | <code>&quot;function&quot;</code> | | <code>boolean</code>    | <code>&quot;boolean&quot;</code> |</p><p><code>type-sym</code> can also be specified as <code>default</code> in order to provide default implementations for protocols.</p><p>[<code>goog/typeOf</code>]:http://google.github.io/closure-library/api/namespace_goog.html#typeOf</p>",
   :full-name "cljs.core/extend-type",
   :docstring
   "Extend a type to a series of protocols. Useful when you are\n supplying the definitions explicitly inline. Propagates the\n type as a type hint on the first argument of all fns.\n\n(extend-type MyType\n  ICounted\n  (-count [c] ...)\n  Foo\n  (bar [x y] ...)\n  (baz ([x] ...) ([x y & zs] ...))"},
  "make-hierarchy"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "make-hierarchy",
   :signature ["[]"],
   :type "function",
   :related
   ["cljs.core/ancestors"
    "cljs.core/descendants"
    "cljs.core/isa?"
    "cljs.core/derive"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/make-hierarchy",
   :docstring
   "Creates a hierarchy object for use with derive, isa? etc."},
  "array-iter"
  {:ns "cljs.core",
   :name "array-iter",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/array-iter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test-vars-block"
  {:ns "cljs.test",
   :name "test-vars-block",
   :signature ["[vars]"],
   :type "function",
   :full-name "cljs.test/test-vars-block",
   :docstring
   "Like test-vars, but returns a block for further composition and\nlater execution.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "uuid-literal"
  {:description
   "Creates a universally unique identifier (UUID), using the [doc:cljs.core/UUID] type.\n\nThe format is `#uuid \"8-4-4-4-12\"`, where the numbers represent the number of hex digits.\n\nRepresenting UUIDs with `#uuid` rather than just a plain string has the following benefits:\n\n- the reader will throw an exception on malformed UUIDs\n- its UUID type is preserved and shown when serialized to [edn].\n\nTo create a UUID from an evaluated expression, use [doc:cljs.core/uuid].\n\n[edn]:https://github.com/edn-format/edn",
   :examples-htmls
   ["<pre><code class=\"clj\">#uuid &quot;00000000-0000-0000-0000-000000000000&quot;\n;;=&gt; #uuid &quot;00000000-0000-0000-0000-000000000000&quot;\n\n#uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;\n;;=&gt; #uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;\n\n#uuid &quot;asdf&quot;\n;; clojure.lang.ExceptionInfo: Invalid UUID string: asdf\n</code></pre><p>Get as a string:</p><pre><code class=\"clj\">&#40;def foo #uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;&#41;\n&#40;str foo&#41;\n;;=&gt; &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;\n</code></pre>"],
   :ns "syntax",
   :name "uuid-literal",
   :type "tagged literal",
   :related ["cljs.core/uuid" "cljs.core/random-uuid"],
   :examples-strings
   [[["#uuid \"00000000-0000-0000-0000-000000000000\" ;;=> #uuid \"00000000-0000-0000-0000-000000000000\""
      "#uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\" ;;=> #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\""
      "#uuid \"asdf\" ;; clojure.lang.ExceptionInfo: Invalid UUID string: asdf"]
     ["(def foo #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\")"
      "(str foo) ;;=> \"97bda55b-6175-4c39-9e04-7c0205c709dc\""]]],
   :description-html
   "<p>Creates a universally unique identifier (UUID), using the [doc:cljs.core/UUID] type.</p><p>The format is <code>#uuid &quot;8-4-4-4-12&quot;</code>, where the numbers represent the number of hex digits.</p><p>Representing UUIDs with <code>#uuid</code> rather than just a plain string has the following benefits:</p><ul><li>the reader will throw an exception on malformed UUIDs</li><li>its UUID type is preserved and shown when serialized to [edn].</li></ul><p>To create a UUID from an evaluated expression, use [doc:cljs.core/uuid].</p><p>[edn]:https://github.com/edn-format/edn</p>",
   :examples
   [{:id "12c0f0",
     :content
     "```clj\n#uuid \"00000000-0000-0000-0000-000000000000\"\n;;=> #uuid \"00000000-0000-0000-0000-000000000000\"\n\n#uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\"\n;;=> #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\"\n\n#uuid \"asdf\"\n;; clojure.lang.ExceptionInfo: Invalid UUID string: asdf\n```\n\nGet as a string:\n\n```clj\n(def foo #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\")\n(str foo)\n;;=> \"97bda55b-6175-4c39-9e04-7c0205c709dc\"\n```"}],
   :full-name "syntax/uuid-literal"},
  "defn-"
  {:description
   "Same as `defn`, but adds `{:private true}` metadata to the definition.\n\nNote: `:private` metadata is not currently enforced by the ClojureScript\ncompiler.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "defn-",
   :signature ["[name & decls]"],
   :type "macro",
   :related ["cljs.core/defn"],
   :examples-strings [],
   :description-html
   "<p>Same as <code>defn</code>, but adds <code>{:private true}</code> metadata to the definition.</p><p>Note: <code>:private</code> metadata is not currently enforced by the ClojureScript compiler.</p>",
   :full-name "cljs.core/defn-",
   :docstring "same as defn, yielding non-public def"},
  "init-engine"
  {:ns "cljs.repl.nashorn",
   :name "init-engine",
   :signature ["[engine output-dir debug]"],
   :type "function",
   :full-name "cljs.repl.nashorn/init-engine",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "eval-str*"
  {:ns "cljs.js",
   :name "eval-str*",
   :signature ["[bound-vars source name opts cb]"],
   :type "function",
   :full-name "cljs.js/eval-str*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IVector"
  {:ns "cljs.core",
   :name "IVector",
   :type "protocol",
   :full-name "cljs.core/IVector",
   :docstring
   "Protocol for adding vector functionality to collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set"
  {:description "Create a literal set.  Values must be unique.",
   :examples-htmls
   ["<pre><code class=\"clj\">#{1 2 3}\n;;=&gt; #{1 2 3}\n</code></pre><p>Duplicate values will cause an error:</p><pre><code class=\"clj\">#{1 1 2 3}\n;; Error: Duplicate key: 1\n</code></pre>"],
   :ns "syntax",
   :name "set",
   :type "syntax",
   :related
   ["cljs.core/hash-set"
    "cljs.core/sorted-set"
    "cljs.core/sorted-set-by"],
   :examples-strings
   [[["#{1 2 3} ;;=> #{1 2 3}"]
     ["#{1 1 2 3} ;; Error: Duplicate key: 1"]]],
   :description-html
   "<p>Create a literal set.  Values must be unique.</p>",
   :examples
   [{:id "f11ab6",
     :content
     "```clj\n#{1 2 3}\n;;=> #{1 2 3}\n```\n\nDuplicate values will cause an error:\n\n```clj\n#{1 1 2 3}\n;; Error: Duplicate key: 1\n```"}],
   :full-name "syntax/set"},
  "inputs"
  {:ns "cljs.build.api",
   :name "inputs",
   :signature ["[& xs]"],
   :type "function",
   :full-name "cljs.build.api/inputs",
   :docstring
   "Given a list of directories and files, return a compilable object that may\nbe passed to build or watch.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "double-array"
  {:ns "cljs.core",
   :name "double-array",
   :signature ["[size-or-seq]" "[size init-val-or-seq]"],
   :type "function",
   :full-name "cljs.core/double-array",
   :docstring
   "Creates an array of doubles. Does not coerce array, provided for compatibility\nwith Clojure.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*3"
  {:description
   "Only usable from a REPL.\n\nHolds the result of the third to last expression.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;+ 1 2 3 4&#41;\n;;=&gt; 10\n\n&#40;+ 4 8&#41;\n;;=&gt; 12\n\n&#40;+ 1 2&#41;\n;;=&gt; 3\n\n&#42;3\n;;=&gt; 10\n\n&#40;inc &#42;3&#41;\n;;=&gt; 11\n</code></pre><p>Note that a standalone evaluation of <code>&#42;1</code>, <code>&#42;2</code>, <code>&#42;3</code>, or <code>&#42;e</code> is not a part of remembered history:</p><pre><code class=\"clj\">:first\n;;=&gt; :first\n\n:second\n;;=&gt; :second\n\n:third\n;;=&gt; :third\n\n&#42;3\n;;=&gt; :first\n\n&#42;2\n;;=&gt; :second\n\n&#42;1\n;;=&gt; :third\n</code></pre>"],
   :ns "cljs.core",
   :name "*3",
   :type "var",
   :related ["cljs.core/*1" "cljs.core/*2" "cljs.core/*e"],
   :examples-strings
   [[["(+ 1 2 3 4) ;;=> 10"
      "(+ 4 8) ;;=> 12"
      "(+ 1 2) ;;=> 3"
      "*3 ;;=> 10"
      "(inc *3) ;;=> 11"]
     [":first ;;=> :first"
      ":second ;;=> :second"
      ":third ;;=> :third"
      "*3 ;;=> :first"
      "*2 ;;=> :second"
      "*1 ;;=> :third"]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>Holds the result of the third to last expression.</p>",
   :examples
   [{:id "d7a6e9",
     :content
     "```clj\n(+ 1 2 3 4)\n;;=> 10\n\n(+ 4 8)\n;;=> 12\n\n(+ 1 2)\n;;=> 3\n\n*3\n;;=> 10\n\n(inc *3)\n;;=> 11\n```\n\nNote that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of\nremembered history:\n\n```clj\n:first\n;;=> :first\n\n:second\n;;=> :second\n\n:third\n;;=> :third\n\n*3\n;;=> :first\n\n*2\n;;=> :second\n\n*1\n;;=> :third\n```"}],
   :full-name "cljs.core/*3",
   :docstring
   "bound in a repl thread to the third most recent value printed"},
  "string-hash-cache"
  {:ns "cljs.core",
   :name "string-hash-cache",
   :type "var",
   :full-name "cljs.core/string-hash-cache",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "target-file-for-cljs-ns"
  {:ns "cljs.build.api",
   :name "target-file-for-cljs-ns",
   :signature ["[ns-sym]" "[ns-sym output-dir]"],
   :type "function",
   :full-name "cljs.build.api/target-file-for-cljs-ns",
   :docstring
   "Given an output directory and a clojurescript namespace return the\ncompilation target file for that namespace.\n\nFor example:\n(target-file-from-cljs-ns \"resources/out\" 'example.core) ->\n<File: \"resources/out/example/core.js\">",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "symbol-pattern"
  {:ns "cljs.reader",
   :name "symbol-pattern",
   :type "var",
   :full-name "cljs.reader/symbol-pattern",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "remove-children"
  {:ns "clojure.browser.dom",
   :name "remove-children",
   :signature ["[id]"],
   :type "function",
   :full-name "clojure.browser.dom/remove-children",
   :docstring
   "Remove all children from the element with the passed id.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-inc-int"
  {:ns "cljs.core",
   :name "unchecked-inc-int",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-inc-int",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-unmatched-delimiter"
  {:ns "cljs.reader",
   :name "read-unmatched-delimiter",
   :signature ["[rdr ch]"],
   :type "function",
   :full-name "cljs.reader/read-unmatched-delimiter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "end?"
  {:ns "clojure.zip",
   :name "end?",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/end?",
   :docstring
   "Returns true if loc represents the end of a depth-first walk",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "some"
  {:description
   "Returns the first logical true value of `(pred x)` for any `x` in `coll`, else\nnil.\n\nA common idiom is to use a set as pred, for example this will return `:fred` if\n`:fred` is in the sequence, otherwise nil: `(some #{:fred} coll)`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "some",
   :signature ["[pred coll]"],
   :type "function",
   :related
   ["cljs.core/every?"
    "cljs.core/not-any?"
    "cljs.core/keep"
    "cljs.core/keep-indexed"
    "cljs.core/some-fn"],
   :examples-strings [],
   :description-html
   "<p>Returns the first logical true value of <code>&#40;pred x&#41;</code> for any <code>x</code> in <code>coll</code>, else nil.</p><p>A common idiom is to use a set as pred, for example this will return <code>:fred</code> if <code>:fred</code> is in the sequence, otherwise nil: <code>&#40;some #{:fred} coll&#41;</code></p>",
   :full-name "cljs.core/some",
   :docstring
   "Returns the first logical true value of (pred x) for any x in coll,\nelse nil.  One common idiom is to use a set as pred, for example\nthis will return :fred if :fred is in the sequence, otherwise nil:\n(some #{:fred} coll)"},
  "PersistentHashSet.fromArray"
  {:ns "cljs.core",
   :name "PersistentHashSet.fromArray",
   :signature ["[items no-clone]"],
   :type "function",
   :full-name "cljs.core/PersistentHashSet.fromArray",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-unicode-char"
  {:ns "cljs.reader",
   :name "read-unicode-char",
   :signature ["[reader initch]"],
   :type "function",
   :full-name "cljs.reader/read-unicode-char",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "var?"
  {:ns "cljs.core",
   :name "var?",
   :signature ["[v]"],
   :type "function",
   :full-name "cljs.core/var?",
   :docstring "Returns true if v is of type cljs.core.Var",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "INext"
  {:ns "cljs.core",
   :name "INext",
   :type "protocol",
   :full-name "cljs.core/INext",
   :docstring "Protocol for accessing the next items of a collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "fn?"
  {:description "Returns true if `f` is a function, false otherwise.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "fn?",
   :signature ["[f]"],
   :type "function",
   :related ["cljs.core/ifn?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>f</code> is a function, false otherwise.</p>",
   :full-name "cljs.core/fn?",
   :docstring
   "Return true if f is a JavaScript function or satisfies the Fn protocol."},
  "IReset"
  {:ns "cljs.core",
   :name "IReset",
   :type "protocol",
   :full-name "cljs.core/IReset",
   :docstring "Protocol for adding resetting functionality.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "string-print"
  {:ns "cljs.core",
   :name "string-print",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/string-print",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "macroexpand"
  {:ns "cljs.repl.reflect",
   :name "macroexpand",
   :signature ["[form]"],
   :type "function",
   :full-name "cljs.repl.reflect/macroexpand",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test-all-vars-block"
  {:ns "cljs.test",
   :name "test-all-vars-block",
   :signature ["[[quote ns]]"],
   :type "macro",
   :full-name "cljs.test/test-all-vars-block",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns-interns"
  {:ns "cljs.analyzer.api",
   :name "ns-interns",
   :signature ["[ns]" "[state ns]"],
   :type "function",
   :full-name "cljs.analyzer.api/ns-interns",
   :docstring
   "Given a namespace return all the var analysis maps. Analagous to\nclojure.core/ns-interns but returns var analysis maps not vars.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Atom"
  {:ns "cljs.core",
   :name "Atom",
   :signature ["[state meta validator watches]"],
   :type "type",
   :full-name "cljs.core/Atom",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "aset"
  {:description
   "Sets `val` at index `i` in a JavaScript array.\n\n```clj\n(def a #js [1 2 3])\n(aset a 0 \"foo\")\na\n;;=> #js [\"foo\" 2 3]\n```\n\nSet nested elements with the additional `idxs` arguments.\n\n```clj\n(def a #js [1 2 #js [3 4]])\n(aset a 2 0 \"foo\")\na\n;;=> #js [1 2 #js [\"foo\" 4]]\n```\n\nFor JavaScript objects, use [`goog.object/set`].\n\n[`goog.object/set`]:http://google.github.io/closure-library/api/namespace_goog_object.html#set\n\n```clj\n(require 'goog.object)\n(def obj #js {:foo 1})\n\n(goog.object/set obj \"foo\" \"bar\")\nobj\n;;=> #js {:foo \"bar\"}\n```",
   :examples-htmls [],
   :ns "cljs.core",
   :name "aset",
   :signature ["[array i val]" "[array idx idx2 & idxv]"],
   :type "function/macro",
   :related ["cljs.core/aget" "special/set!" "cljs.core/assoc-in"],
   :examples-strings [],
   :description-html
   "<p>Sets <code>val</code> at index <code>i</code> in a JavaScript array.</p><pre><code class=\"clj\">&#40;def a #js &#91;1 2 3&#93;&#41;\n&#40;aset a 0 &quot;foo&quot;&#41;\na\n;;=&gt; #js &#91;&quot;foo&quot; 2 3&#93;\n</code></pre><p>Set nested elements with the additional <code>idxs</code> arguments.</p><pre><code class=\"clj\">&#40;def a #js &#91;1 2 #js &#91;3 4&#93;&#93;&#41;\n&#40;aset a 2 0 &quot;foo&quot;&#41;\na\n;;=&gt; #js &#91;1 2 #js &#91;&quot;foo&quot; 4&#93;&#93;\n</code></pre><p>For JavaScript objects, use [<code>goog.object/set</code>].</p><p>[<code>goog.object/set</code>]:http://google.github.io/closure-library/api/namespace<i>goog</i>object.html#set</p><pre><code class=\"clj\">&#40;require 'goog.object&#41;\n&#40;def obj #js {:foo 1}&#41;\n\n&#40;goog.object/set obj &quot;foo&quot; &quot;bar&quot;&#41;\nobj\n;;=&gt; #js {:foo &quot;bar&quot;}\n</code></pre>",
   :full-name "cljs.core/aset",
   :docstring "Sets the value at the index."},
  "*print-pprint-dispatch*"
  {:ns "cljs.pprint",
   :name "*print-pprint-dispatch*",
   :type "dynamic var",
   :full-name "cljs.pprint/*print-pprint-dispatch*",
   :docstring
   "The pretty print dispatch function. Use with-pprint-dispatch or\nset-pprint-dispatch to modify.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*print-newline*"
  {:ns "cljs.core",
   :name "*print-newline*",
   :type "dynamic var",
   :full-name "cljs.core/*print-newline*",
   :docstring
   "When set to logical false will drop newlines from printing calls.\nThis is to work around the implicit newlines emitted by standard JavaScript\nconsole objects.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "juxt"
  {:description
   "Takes a set of functions and returns a function that is the juxtaposition of\nthose functions.\n\nThe returned function takes a variable number of arguments, and returns a vector\ncontaining the result of applying each function to the arguments (left-to-\nright).\n\n`((juxt a b c) x)` => `[(a x) (b x) (c x)]`",
   :examples-htmls [],
   :ns "cljs.core",
   :name "juxt",
   :signature ["[f]" "[f g]" "[f g h]" "[f g h & fs]"],
   :type "function",
   :related ["cljs.core/partial" "cljs.core/comp"],
   :examples-strings [],
   :description-html
   "<p>Takes a set of functions and returns a function that is the juxtaposition of those functions.</p><p>The returned function takes a variable number of arguments, and returns a vector containing the result of applying each function to the arguments (left-to- right).</p><p><code>&#40;&#40;juxt a b c&#41; x&#41;</code> => <code>&#91;&#40;a x&#41; &#40;b x&#41; &#40;c x&#41;&#93;</code></p>",
   :full-name "cljs.core/juxt",
   :docstring
   "Takes a set of functions and returns a fn that is the juxtaposition\nof those fns.  The returned fn takes a variable number of args, and\nreturns a vector containing the result of applying each fn to the\nargs (left-to-right).\n((juxt a b c) x) => [(a x) (b x) (c x)]"},
  "seq?"
  {:description
   "Returns true if `x` is a sequence, false otherwise.\n\nAll collections can be converted into a sequence using `seq`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "seq?",
   :signature ["[x]"],
   :type "function",
   :related
   ["cljs.core/seq"
    "cljs.core/sequential?"
    "cljs.core/vector?"
    "cljs.core/coll?"
    "cljs.core/list?"
    "cljs.core/map?"
    "cljs.core/set?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>x</code> is a sequence, false otherwise.</p><p>All collections can be converted into a sequence using <code>seq</code>.</p>",
   :full-name "cljs.core/seq?",
   :docstring "Return true if s satisfies ISeq"},
  "with-pretty-writer"
  {:ns "cljs.pprint",
   :name "with-pretty-writer",
   :signature ["[base-writer & body]"],
   :type "macro",
   :full-name "cljs.pprint/with-pretty-writer",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "filterv"
  {:description
   "Returns a vector of the items in `coll` for which `(pred item)` returns true.\n\n`pred` must be free of side-effects.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "filterv",
   :signature ["[pred coll]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns a vector of the items in <code>coll</code> for which <code>&#40;pred item&#41;</code> returns true.</p><p><code>pred</code> must be free of side-effects.</p>",
   :full-name "cljs.core/filterv",
   :docstring
   "Returns a vector of the items in coll for which\n(pred item) returns true. pred must be free of side-effects."},
  "read-map"
  {:ns "cljs.reader",
   :name "read-map",
   :signature ["[rdr _]"],
   :type "function",
   :full-name "cljs.reader/read-map",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "repl*"
  {:ns "cljs.repl",
   :name "repl*",
   :signature
   ["[repl-env {:keys [init need-prompt quit-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap repl-requires compiler-env bind-err], :or {caught repl-caught, quit-prompt repl-quit-prompt, eval eval-cljs, print-no-newline print, flush flush, read repl-read, bind-err true, print println, source-map-inline true, prompt repl-prompt, repl-requires (quote [[cljs.repl :refer-macros [source doc find-doc apropos dir pst]] [cljs.pprint :refer [pprint] :refer-macros [pp]]]), reader (fn* [] (readers/source-logging-push-back-reader (PushbackReader. (io/reader *in*)) 1 \"NO_SOURCE_FILE\")), need-prompt (fn* [] (if (readers/indexing-reader? *in*) (== (readers/get-column-number *in*) 1) (identity true)))}, :as opts}]"],
   :type "function",
   :full-name "cljs.repl/repl*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-set"
  {:description
   "Set bit at index `n`.  Same as `x | (1 << y)` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-set 2r1100 1&#41;\n;;=&gt; 14\n;; 14 = 2r1110\n</code></pre><p>Same number in decimal:</p><pre><code class=\"clj\">&#40;bit-set 12 1&#41;\n;;=&gt; 14\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-set",
   :signature ["[x n]"],
   :type "function/macro",
   :related ["cljs.core/bit-clear"],
   :examples-strings
   [[["(bit-set 2r1100 1) ;;=> 14 ;; 14 = 2r1110"]
     ["(bit-set 12 1) ;;=> 14"]]],
   :description-html
   "<p>Set bit at index <code>n</code>.  Same as <code>x | &#40;1 &lt;&lt; y&#41;</code> in JavaScript.</p>",
   :examples
   [{:id "6a8a49",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-set 2r1100 1)\n;;=> 14\n;; 14 = 2r1110\n```\n\nSame number in decimal:\n\n```clj\n(bit-set 12 1)\n;;=> 14\n```"}],
   :full-name "cljs.core/bit-set",
   :docstring "Set bit at index n"},
  "unquote"
  {:description
   "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nIntended for use inside a [doc:syntax/syntax-quote].\n\nForces evaluation of the following form.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def foo 1&#41;\n`&#126;foo\n;;=&gt; 1\n\n`&#40;def foo &#126;foo&#41;\n;;=&gt; &#40;def cljs.user/foo 1&#41;\n</code></pre>"],
   :ns "syntax",
   :name "unquote",
   :type "syntax",
   :related ["syntax/syntax-quote" "syntax/unquote-splicing"],
   :examples-strings
   [[["(def foo 1)"
      "`~foo ;;=> 1"
      "`(def foo ~foo) ;;=> (def cljs.user/foo 1)"]]],
   :description-html
   "<p>(Only intended for use in Clojure macros, which can be used from but not written in ClojureScript.)</p><p>Intended for use inside a [doc:syntax/syntax-quote].</p><p>Forces evaluation of the following form.</p>",
   :examples
   [{:id "1ff51e",
     :content
     "```clj\n(def foo 1)\n`~foo\n;;=> 1\n\n`(def foo ~foo)\n;;=> (def cljs.user/foo 1)\n```"}],
   :full-name "syntax/unquote"},
  "quot"
  {:description
   "Returns the quotient of dividing numerator `n` by denominator `d`.\n\nReturns `NaN` when `d` is 0 (divide by 0 error).",
   :examples-htmls [],
   :ns "cljs.core",
   :name "quot",
   :signature ["[n d]"],
   :type "function",
   :related ["cljs.core/rem" "cljs.core/mod"],
   :examples-strings [],
   :description-html
   "<p>Returns the quotient of dividing numerator <code>n</code> by denominator <code>d</code>.</p><p>Returns <code>NaN</code> when <code>d</code> is 0 (divide by 0 error).</p>",
   :full-name "cljs.core/quot",
   :docstring "quot[ient] of dividing numerator by denominator."},
  "ns-specs"
  {:ns "cljs.analyzer.api",
   :name "ns-specs",
   :signature ["[ns]"],
   :type "function",
   :full-name "cljs.analyzer.api/ns-specs",
   :docstring
   "Given a namespace return all the original specs for a namspace as originally\nprovided in the source.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "valid-name?"
  {:ns "cljs.js",
   :name "valid-name?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.js/valid-name?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "def"
  {:description
   "Creates a global variable with the name of `symbol` and a namespace of the\ncurrent namespace.\n\nIf `init` is supplied, it is evaluated and the result is assigned to `symbol`.\n\n`doc-string` is an optional documentation string.\n\n`def` is one of ClojureScript's [special forms](http://clojure.org/special_forms)\nand is used by many macros to define common elements (ie: `defn`, `defmacro`,\netc).\n\nSupported metadata:\n\n- `^:private boolean` - make non-accessible from other namespaces\n- `^:dynamic boolean` - make [dynamically bindable][doc:cljs.core/binding] (usually named with [doc:syntax/earmuffs])\n- `^:const boolean` - prevents redef and allows it to be used in [doc:cljs.core/case].\n- `^:jsdoc [\"\"]` - vector of JSDoc Tags for [Google Closure][closure-jsdoc] or [standard][other-jsdoc].\n- `^:test (fn [] (assert ...))` - allows function to be tested with [doc:cljs.core/test].\n- `^:doc \"\"` - doc-string (prefer the use of the `(def symbol doc-string init)`)\n\n[closure-jsdoc]:https://developers.google.com/closure/compiler/docs/js-for-compiler?hl=en#tags\n[other-jsdoc]:http://usejsdoc.org/#block-tags\n\nCompiler will also add metadata:\n\n- `:ns`\n- `:name`\n- `:file`\n- `:line`, `:end-line`\n- `:column`, `:end-column`\n- `:source`\n- `:arglists`",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def a&#41;\na\n;;=&gt; nil\n\n&#40;def b 42&#41;\nb\n;;=&gt; 42\n\n&#40;def c &quot;an optional docstring&quot; 42&#41;\nc\n;;=&gt; 42\n</code></pre>"],
   :ns "special",
   :name "def",
   :signature ["[symbol]" "[symbol init]" "[symbol doc-string init]"],
   :type "special form",
   :related
   ["cljs.core/defn"
    "cljs.core/fn"
    "cljs.core/defmacro"
    "cljs.core/defmulti"],
   :examples-strings
   [[["(def a)"
      "a ;;=> nil"
      "(def b 42)"
      "b ;;=> 42"
      "(def c \"an optional docstring\" 42)"
      "c ;;=> 42"]]],
   :description-html
   "<p>Creates a global variable with the name of <code>symbol</code> and a namespace of the current namespace.</p><p>If <code>init</code> is supplied, it is evaluated and the result is assigned to <code>symbol</code>.</p><p><code>doc-string</code> is an optional documentation string.</p><p><code>def</code> is one of ClojureScript's <a href='http://clojure.org/special_forms'>special forms</a> and is used by many macros to define common elements (ie: <code>defn</code>, <code>defmacro</code>, etc).</p><p>Supported metadata:</p><ul><li><code>&#94;:private boolean</code> - make non-accessible from other namespaces</li><li><code>&#94;:dynamic boolean</code> - make [dynamically bindable][doc:cljs.core/binding] (usually named with [doc:syntax/earmuffs])</li><li><code>&#94;:const boolean</code> - prevents redef and allows it to be used in [doc:cljs.core/case].</li><li><code>&#94;:jsdoc &#91;&quot;&quot;&#93;</code> - vector of JSDoc Tags for [Google Closure][closure-jsdoc] or [standard][other-jsdoc].</li><li><code>&#94;:test &#40;fn &#91;&#93; &#40;assert ...&#41;&#41;</code> - allows function to be tested with [doc:cljs.core/test].</li><li><code>&#94;:doc &quot;&quot;</code> - doc-string (prefer the use of the <code>&#40;def symbol doc-string init&#41;</code>)</li></ul><p>[closure-jsdoc]:https://developers.google.com/closure/compiler/docs/js-for-compiler?hl=en#tags [other-jsdoc]:http://usejsdoc.org/#block-tags</p><p>Compiler will also add metadata:</p><ul><li><code>:ns</code></li><li><code>:name</code></li><li><code>:file</code></li><li><code>:line</code>, <code>:end-line</code></li><li><code>:column</code>, <code>:end-column</code></li><li><code>:source</code></li><li><code>:arglists</code></li></ul>",
   :examples
   [{:id "a5f898",
     :content
     "```clj\n(def a)\na\n;;=> nil\n\n(def b 42)\nb\n;;=> 42\n\n(def c \"an optional docstring\" 42)\nc\n;;=> 42\n```"}],
   :full-name "special/def",
   :docstring
   "Creates and interns a global var with the name\nof symbol in the current namespace (*ns*) or locates such a var if\nit already exists.  If init is supplied, it is evaluated, and the\nroot binding of the var is set to the resulting value.  If init is\nnot supplied, the root binding of the var is unaffected."},
  "set-pprint-dispatch"
  {:ns "cljs.pprint",
   :name "set-pprint-dispatch",
   :signature ["[function]"],
   :type "function",
   :full-name "cljs.pprint/set-pprint-dispatch",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "includes?"
  {:ns "clojure.string",
   :name "includes?",
   :signature ["[s substr]"],
   :type "function",
   :full-name "clojure.string/includes?",
   :docstring "True if s includes substr.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unchecked-byte"
  {:ns "cljs.core",
   :name "unchecked-byte",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/unchecked-byte",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "*timeout*"
  {:ns "clojure.browser.net",
   :name "*timeout*",
   :type "var",
   :full-name "clojure.browser.net/*timeout*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "forms-seq"
  {:ns "cljs.analyzer.api",
   :name "forms-seq",
   :signature ["[rdr]" "[rdr filename]"],
   :type "function",
   :full-name "cljs.analyzer.api/forms-seq",
   :docstring
   "Seq of Clojure/ClojureScript forms from rdr, a java.io.Reader. Optionally\naccepts a filename argument which will be used in any emitted errors.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "coll?"
  {:description
   "Returns true if `x` is a collection, false otherwise.\n\nLists, maps, sets, and vectors are collections.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;coll? &#91;1 2 3&#93;&#41;\n;;=&gt; true\n\n&#40;coll? '&#40;1 2 3&#41;&#41;\n;;=&gt; true\n\n&#40;coll? #{1 2 3}&#41;\n;;=&gt; true\n\n&#40;coll? {:foo 1 :bar 2}&#41;\n;;=&gt; true\n</code></pre><p>Not collections:</p><pre><code class=\"clj\">&#40;coll? &quot;foo&quot;&#41;\n;;=&gt; false\n\n&#40;coll? 123&#41;\n;;=&gt; false\n\n&#40;coll? nil&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "coll?",
   :signature ["[x]"],
   :type "function",
   :related
   ["cljs.core/seq?" "cljs.core/list?" "cljs.core/sequential?"],
   :examples-strings
   [[["(coll? [1 2 3]) ;;=> true"
      "(coll? '(1 2 3)) ;;=> true"
      "(coll? #{1 2 3}) ;;=> true"
      "(coll? {:foo 1 :bar 2}) ;;=> true"]
     ["(coll? \"foo\") ;;=> false"
      "(coll? 123) ;;=> false"
      "(coll? nil) ;;=> false"]]],
   :description-html
   "<p>Returns true if <code>x</code> is a collection, false otherwise.</p><p>Lists, maps, sets, and vectors are collections.</p>",
   :examples
   [{:id "d30884",
     :content
     "```clj\n(coll? [1 2 3])\n;;=> true\n\n(coll? '(1 2 3))\n;;=> true\n\n(coll? #{1 2 3})\n;;=> true\n\n(coll? {:foo 1 :bar 2})\n;;=> true\n```\n\nNot collections:\n\n```clj\n(coll? \"foo\")\n;;=> false\n\n(coll? 123)\n;;=> false\n\n(coll? nil)\n;;=> false\n```"}],
   :full-name "cljs.core/coll?",
   :docstring "Returns true if x satisfies ICollection"},
  "report"
  {:ns "cljs.test",
   :name "report",
   :type "multimethod",
   :full-name "cljs.test/report",
   :docstring
   "Generic reporting function, may be overridden to plug in\n   different report formats (e.g., TAP, JUnit).  Assertions such as\n   'is' call 'report' to indicate results.  The argument given to\n   'report' will be a map with a :type key.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reduce"
  {:ns "clojure.core.reducers",
   :name "reduce",
   :signature ["[f coll]" "[f init coll]"],
   :type "function",
   :full-name "clojure.core.reducers/reduce",
   :docstring
   "Like core/reduce except:\n  When init is not provided, (f) is used.\n  Maps are reduced with reduce-kv",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "not-native"
  {:ns "cljs.core",
   :name "not-native",
   :type "var",
   :full-name "cljs.core/not-native",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "testing-vars-str"
  {:ns "cljs.test",
   :name "testing-vars-str",
   :signature ["[m]"],
   :type "function",
   :full-name "cljs.test/testing-vars-str",
   :docstring
   "Returns a string representation of the current test.  Renders names\nin *testing-vars* as a list, then the source file and line of\ncurrent assertion.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-shift-left"
  {:description
   "Bitwise shift left `n` bits.  Same as `x << n` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-shift-left 2r0101 1&#41;\n;;=&gt; 10\n;; 10 = 2r1010\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-shift-left 5 1&#41;\n;;=&gt; 10\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-shift-left",
   :signature ["[x n]"],
   :type "function/macro",
   :related ["cljs.core/bit-shift-right"],
   :examples-strings
   [[["(bit-shift-left 2r0101 1) ;;=> 10 ;; 10 = 2r1010"]
     ["(bit-shift-left 5 1) ;;=> 10"]]],
   :description-html
   "<p>Bitwise shift left <code>n</code> bits.  Same as <code>x &lt;&lt; n</code> in JavaScript.</p>",
   :examples
   [{:id "67c34a",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-shift-left 2r0101 1)\n;;=> 10\n;; 10 = 2r1010\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-shift-left 5 1)\n;;=> 10\n```"}],
   :full-name "cljs.core/bit-shift-left",
   :docstring "Bitwise shift left"},
  "*2"
  {:description
   "Only usable from a REPL.\n\nHolds the result of the second to last expression.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;+ 1 2 3 4&#41;\n;;=&gt; 10\n\n&#40;+ 4 8&#41;\n;;=&gt; 12\n\n&#42;2\n;;=&gt; 10\n\n&#40;inc &#42;2&#41;\n;;=&gt; 11\n</code></pre><p>Note that a standalone evaluation of <code>&#42;1</code>, <code>&#42;2</code>, <code>&#42;3</code>, or <code>&#42;e</code> is not a part of remembered history:</p><pre><code class=\"clj\">:first\n;;=&gt; :first\n\n:second\n;;=&gt; :second\n\n:third\n;;=&gt; :third\n\n&#42;3\n;;=&gt; :first\n\n&#42;2\n;;=&gt; :second\n\n&#42;1\n;;=&gt; :third\n</code></pre>"],
   :ns "cljs.core",
   :name "*2",
   :type "var",
   :related ["cljs.core/*1" "cljs.core/*3" "cljs.core/*e"],
   :examples-strings
   [[["(+ 1 2 3 4) ;;=> 10"
      "(+ 4 8) ;;=> 12"
      "*2 ;;=> 10"
      "(inc *2) ;;=> 11"]
     [":first ;;=> :first"
      ":second ;;=> :second"
      ":third ;;=> :third"
      "*3 ;;=> :first"
      "*2 ;;=> :second"
      "*1 ;;=> :third"]]],
   :description-html
   "<p>Only usable from a REPL.</p><p>Holds the result of the second to last expression.</p>",
   :examples
   [{:id "208d41",
     :content
     "```clj\n(+ 1 2 3 4)\n;;=> 10\n\n(+ 4 8)\n;;=> 12\n\n*2\n;;=> 10\n\n(inc *2)\n;;=> 11\n```\n\nNote that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of\nremembered history:\n\n```clj\n:first\n;;=> :first\n\n:second\n;;=> :second\n\n:third\n;;=> :third\n\n*3\n;;=> :first\n\n*2\n;;=> :second\n\n*1\n;;=> :third\n```"}],
   :full-name "cljs.core/*2",
   :docstring
   "bound in a repl thread to the second most recent value printed"},
  "make-node"
  {:ns "clojure.zip",
   :name "make-node",
   :signature ["[loc node children]"],
   :type "function",
   :full-name "clojure.zip/make-node",
   :docstring
   "Returns a new branch node, given an existing node and new\nchildren. The loc is only used to supply the constructor.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "re-matches"
  {:description
   "Returns the result of `(re-find re s)` if `re` fully matches `s`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "re-matches",
   :signature ["[re s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns the result of <code>&#40;re-find re s&#41;</code> if <code>re</code> fully matches <code>s</code>.</p>",
   :full-name "cljs.core/re-matches",
   :docstring
   "Returns the result of (re-find re s) if re fully matches s."},
  "socket"
  {:ns "cljs.repl.node",
   :name "socket",
   :signature ["[host port]"],
   :type "function",
   :full-name "cljs.repl.node/socket",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "case*"
  {:ns "special",
   :name "case*",
   :type "special form",
   :full-name "special/case*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "destructure-vector"
  {:description
   "A helpful shorthand for destructuring a sequence into multiple names.\n\n```clj\n(let [ [a b c]   ;; <-- destructure vector\n       [1 2 3] ]\n  (println a b c))\n;; 1 2 3\n```\n\nUse `& foo` to name the rest of the items in the sequence:\n\n```clj\n(let [ [a b c & d]\n       [1 2 3 4 5] ]\n  (println a b c d))\n;; 1 2 3 (4 5)\n```\n\nUse `:as foo` to name the original value:\n\n```clj\n(let [ [a b c & d :as whole]\n       [1 2 3 4 5] ]\n  whole)\n;;=> [1 2 3 4 5]\n```\n\nUse the special destructure vector in place of any local name binding in the\nfollowing forms:\n\n- `(let [...])`\n- `(fn [...])`\n- `(loop [...])`\n\nDestructure vectors can be nested, even in place of names in [destructure\nmaps][doc:syntax/destructure-map].",
   :examples-htmls
   ["<p>Use destructure vectors in function parameters:</p><pre><code class=\"clj\">&#40;defn foo &#91;&#91;a b&#93; c&#93;\n  &#40;+ a b c&#41;&#41;\n\n&#40;foo &#91;1 2&#93; 3&#41;\n;;=&gt; 6\n</code></pre>"
    "<p>Destructure vectors can be nested:</p><pre><code class=\"clj\">&#40;let &#91; &#91;&#91;a b&#93; c&#93;\n       &#91;&#91;1 2&#93; 3&#93; &#93;\n  &#40;println a b c&#41;&#41;\n;; 1 2 3\n</code></pre>"],
   :ns "syntax",
   :name "destructure-vector",
   :type "binding",
   :related ["syntax/destructure-map"],
   :examples-strings
   [[["(defn foo [[a b] c]" "  (+ a b c))" "(foo [1 2] 3) ;;=> 6"]]
    [["(let [ [[a b] c]"
      "       [[1 2] 3] ]"
      "  (println a b c)) ;; 1 2 3"]]],
   :description-html
   "<p>A helpful shorthand for destructuring a sequence into multiple names.</p><pre><code class=\"clj\">&#40;let &#91; &#91;a b c&#93;   ;; &lt;-- destructure vector\n       &#91;1 2 3&#93; &#93;\n  &#40;println a b c&#41;&#41;\n;; 1 2 3\n</code></pre><p>Use <code>&amp; foo</code> to name the rest of the items in the sequence:</p><pre><code class=\"clj\">&#40;let &#91; &#91;a b c &amp; d&#93;\n       &#91;1 2 3 4 5&#93; &#93;\n  &#40;println a b c d&#41;&#41;\n;; 1 2 3 &#40;4 5&#41;\n</code></pre><p>Use <code>:as foo</code> to name the original value:</p><pre><code class=\"clj\">&#40;let &#91; &#91;a b c &amp; d :as whole&#93;\n       &#91;1 2 3 4 5&#93; &#93;\n  whole&#41;\n;;=&gt; &#91;1 2 3 4 5&#93;\n</code></pre><p>Use the special destructure vector in place of any local name binding in the following forms:</p><ul><li><code>&#40;let &#91;...&#93;&#41;</code></li><li><code>&#40;fn &#91;...&#93;&#41;</code></li><li><code>&#40;loop &#91;...&#93;&#41;</code></li></ul><p>Destructure vectors can be nested, even in place of names in [destructure maps][doc:syntax/destructure-map].</p>",
   :examples
   [{:id "acab87",
     :content
     "Use destructure vectors in function parameters:\n\n```clj\n(defn foo [[a b] c]\n  (+ a b c))\n\n(foo [1 2] 3)\n;;=> 6\n```"}
    {:id "fa4e05",
     :content
     "Destructure vectors can be nested:\n\n```clj\n(let [ [[a b] c]\n       [[1 2] 3] ]\n  (println a b c))\n;; 1 2 3\n```"}],
   :full-name "syntax/destructure-vector"},
  "apropos"
  {:description
   "Given a regular expression or stringable thing, return a seq of all\npublic definitions in all currently-loaded namespaces that match the\n`str-or-pattern`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;apropos &quot;some&quot;&#41;\n;;=&gt; &#40;cljs.core/if-some\n;;    cljs.core/some\n;;    cljs.core/some-&gt;\n;;    cljs.core/some-&gt;&gt;\n;;    cljs.core/some-fn\n;;    cljs.core/some?\n;;    cljs.core/when-some&#41;\n</code></pre>"],
   :ns "cljs.repl",
   :name "apropos",
   :signature ["[str-or-pattern]"],
   :type "macro",
   :related ["cljs.repl/find-doc"],
   :examples-strings
   [[["(apropos \"some\") ;;=> (cljs.core/if-some ;;    cljs.core/some ;;    cljs.core/some-> ;;    cljs.core/some->> ;;    cljs.core/some-fn ;;    cljs.core/some? ;;    cljs.core/when-some)"]]],
   :description-html
   "<p>Given a regular expression or stringable thing, return a seq of all public definitions in all currently-loaded namespaces that match the <code>str-or-pattern</code>.</p>",
   :examples
   [{:id "aceda4",
     :content
     "```clj\n(apropos \"some\")\n;;=> (cljs.core/if-some\n;;    cljs.core/some\n;;    cljs.core/some->\n;;    cljs.core/some->>\n;;    cljs.core/some-fn\n;;    cljs.core/some?\n;;    cljs.core/when-some)\n```"}],
   :full-name "cljs.repl/apropos",
   :docstring
   "Given a regular expression or stringable thing, return a seq of all\npublic definitions in all currently-loaded namespaces that match the\nstr-or-pattern."},
  "flatten"
  {:ns "clojure.core.reducers",
   :name "flatten",
   :signature ["[]" "[coll]"],
   :type "function",
   :full-name "clojure.core.reducers/flatten",
   :docstring
   "Takes any nested combination of sequential things (lists, vectors,\n  etc.) and returns their contents as a single, flat foldable\n  collection.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Cat"
  {:ns "clojure.core.reducers",
   :name "Cat",
   :signature ["[cnt left right]"],
   :type "type",
   :full-name "clojure.core.reducers/Cat",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "nil"
  {:description
   "`nil` is a representation of nothing.\n\nIt is common for operations to safely handle `nil` without\ncausing exceptions.\n\nExpressions evaluate to `nil` if there is no value to return.",
   :ns "syntax",
   :name "nil",
   :type "special symbol",
   :examples
   [{:id "17b92a",
     :content
     "```clj\nnil\n;;=> nil\n```\n\n`nil` can sometimes mean \"not found\":\n\n```clj\n(:foo {})\n;;=> nil\n```\n\n`nil` can also mean that the operation didn't make sense:\n\n```clj\n(:foo nil)\n;;=> nil\n```"}],
   :full-name "syntax/nil",
   :description-html
   "<p><code>nil</code> is a representation of nothing.</p><p>It is common for operations to safely handle <code>nil</code> without causing exceptions.</p><p>Expressions evaluate to <code>nil</code> if there is no value to return.</p>",
   :examples-strings
   [[["nil ;;=> nil"] ["(:foo {}) ;;=> nil"] ["(:foo nil) ;;=> nil"]]],
   :examples-htmls
   ["<pre><code class=\"clj\">nil\n;;=&gt; nil\n</code></pre><p><code>nil</code> can sometimes mean \"not found\":</p><pre><code class=\"clj\">&#40;:foo {}&#41;\n;;=&gt; nil\n</code></pre><p><code>nil</code> can also mean that the operation didn't make sense:</p><pre><code class=\"clj\">&#40;:foo nil&#41;\n;;=&gt; nil\n</code></pre>"]},
  "nnext"
  {:description "Same as `(next (next coll))`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "nnext",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/next"],
   :examples-strings [],
   :description-html
   "<p>Same as <code>&#40;next &#40;next coll&#41;&#41;</code>.</p>",
   :full-name "cljs.core/nnext",
   :docstring "Same as (next (next x))"},
  "ITransientVector"
  {:ns "cljs.core",
   :name "ITransientVector",
   :type "protocol",
   :full-name "cljs.core/ITransientVector",
   :docstring
   "Protocol for adding vector functionality to transient collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "LazyTransformer.createMulti"
  {:ns "cljs.core",
   :name "LazyTransformer.createMulti",
   :signature ["[xform colls]"],
   :type "function",
   :full-name "cljs.core/LazyTransformer.createMulti",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test-ns"
  {:ns "cljs.test",
   :name "test-ns",
   :signature ["[ns]" "[env [quote ns :as form]]"],
   :type "macro",
   :full-name "cljs.test/test-ns",
   :docstring
   "If the namespace defines a function named test-ns-hook, calls that.\nOtherwise, calls test-all-vars on the namespace.  'ns' is a\nnamespace object or a symbol.\n\nInternally binds *report-counters* to a ref initialized to\n*initial-report-counters*.  ",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "xpc-config-fields"
  {:ns "clojure.browser.net",
   :name "xpc-config-fields",
   :type "var",
   :full-name "clojure.browser.net/xpc-config-fields",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "deregister-tag-parser!"
  {:ns "cljs.reader",
   :name "deregister-tag-parser!",
   :signature ["[tag]"],
   :type "function",
   :full-name "cljs.reader/deregister-tag-parser!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "multi-stepper"
  {:ns "cljs.core",
   :name "multi-stepper",
   :signature ["[xform iters]" "[xform iters nexts]"],
   :type "function",
   :full-name "cljs.core/multi-stepper",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "create-client-js-file"
  {:ns "cljs.repl.browser",
   :name "create-client-js-file",
   :signature ["[opts file-path]"],
   :type "function",
   :full-name "cljs.repl.browser/create-client-js-file",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bit-clear"
  {:description
   "Clear bit at index `n`.  Same as `x & ~(1 << y)` in JavaScript.",
   :examples-htmls
   ["<p>Bits can be entered using radix notation:</p><pre><code class=\"clj\">&#40;bit-clear 2r1111 2&#41;\n;;=&gt; 11\n;; 11 = 2r1011\n</code></pre><p>Same numbers in decimal:</p><pre><code class=\"clj\">&#40;bit-clear 15 2&#41;\n;;=&gt; 11\n</code></pre>"],
   :ns "cljs.core",
   :name "bit-clear",
   :signature ["[x n]"],
   :type "function/macro",
   :related ["cljs.core/bit-set" "cljs.core/bit-flip"],
   :examples-strings
   [[["(bit-clear 2r1111 2) ;;=> 11 ;; 11 = 2r1011"]
     ["(bit-clear 15 2) ;;=> 11"]]],
   :description-html
   "<p>Clear bit at index <code>n</code>.  Same as <code>x &amp; &#126;&#40;1 &lt;&lt; y&#41;</code> in JavaScript.</p>",
   :examples
   [{:id "0f6748",
     :content
     "Bits can be entered using radix notation:\n\n```clj\n(bit-clear 2r1111 2)\n;;=> 11\n;; 11 = 2r1011\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-clear 15 2)\n;;=> 11\n```"}],
   :full-name "cljs.core/bit-clear",
   :docstring "Clear bit at index n"},
  "MultiFn"
  {:ns "cljs.core",
   :name "MultiFn",
   :signature
   ["[name dispatch-fn default-dispatch-val hierarchy method-table prefer-table method-cache cached-hierarchy]"],
   :type "type",
   :full-name "cljs.core/MultiFn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ensure-reduced"
  {:ns "cljs.core",
   :name "ensure-reduced",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/ensure-reduced",
   :docstring
   "If x is already reduced?, returns it, else returns (reduced x)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "namespace"
  {:description
   "Returns the namespace string of a possibly namespace-qualified keyword or symbol.\n\nReturns [doc:syntax/nil] if not present.",
   :examples-htmls
   ["<p>With namespaces:</p><pre><code class=\"clj\">&#40;namespace :foo/bar&#41;\n;;=&gt; &quot;foo&quot;\n\n&#40;namespace 'foo/bar&#41;\n;;=&gt; &quot;foo&quot;\n</code></pre><p>Without namespaces:</p><pre><code class=\"clj\">&#40;namespace :foo&#41;\n;;=&gt; nil\n\n&#40;namespace 'foo&#41;\n;;=&gt; nil\n</code></pre><p>Strings have no concept of a namespace:</p><pre><code class=\"clj\">&#40;name &quot;foo/bar&quot;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "namespace",
   :signature ["[x]"],
   :type "function",
   :related ["cljs.core/name"],
   :examples-strings
   [[["(namespace :foo/bar) ;;=> \"foo\""
      "(namespace 'foo/bar) ;;=> \"foo\""]
     ["(namespace :foo) ;;=> nil" "(namespace 'foo) ;;=> nil"]
     ["(name \"foo/bar\") ;;=> nil"]]],
   :description-html
   "<p>Returns the namespace string of a possibly namespace-qualified keyword or symbol.</p><p>Returns [doc:syntax/nil] if not present.</p>",
   :examples
   [{:id "5bd3b4",
     :content
     "With namespaces:\n\n```clj\n(namespace :foo/bar)\n;;=> \"foo\"\n\n(namespace 'foo/bar)\n;;=> \"foo\"\n```\n\nWithout namespaces:\n\n```clj\n(namespace :foo)\n;;=> nil\n\n(namespace 'foo)\n;;=> nil\n```\n\nStrings have no concept of a namespace:\n\n```clj\n(name \"foo/bar\")\n;;=> nil\n```"}],
   :full-name "cljs.core/namespace",
   :docstring
   "Returns the namespace String of a symbol or keyword, or nil if not present."},
  "repeatedly"
  {:description
   "Takes a function `f` of no args, presumably with side effects, and returns an\ninfinite (or length `n` if supplied) lazy sequence of calls to it.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "repeatedly",
   :signature ["[f]" "[n f]"],
   :type "function",
   :related
   ["cljs.core/repeat"
    "cljs.core/iterate"
    "cljs.core/lazy-seq"
    "cljs.core/dotimes"
    "cljs.core/constantly"],
   :examples-strings [],
   :description-html
   "<p>Takes a function <code>f</code> of no args, presumably with side effects, and returns an infinite (or length <code>n</code> if supplied) lazy sequence of calls to it.</p>",
   :full-name "cljs.core/repeatedly",
   :docstring
   "Takes a function of no args, presumably with side effects, and\nreturns an infinite (or length n if supplied) lazy sequence of calls\nto it"},
  "iter"
  {:ns "cljs.core",
   :name "iter",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/iter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "comment"
  {:description
   "Ignores all `body` forms (i.e. \"commenting out\"). Returns nil.\n\nThis is often used near the bottom of a file to hold expressions that test\ndifferent functions during development.  Specific expressions within the\n`comment` can then be selected and evaluated from some editors.\n\nYou can also use `;` to \"comment out\" code until the end of a line.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;comment 123&#41;\n;;=&gt; nil\n\n&#40;comment\n  &#40;foo 1 2 3&#41;\n  &#40;bar &quot;hello&quot;&#41;&#41;\n;;=&gt; nil\n</code></pre><p>Inner forms must still be syntactically correct:</p><pre><code class=\"clj\">&#40;comment &#91;1 2 3&#93;&#93;&#41;\n;; Error: Unmatched delimiter &#93;\n\n&#40;comment a : b&#41;\n;; Error: Invalid token :\n</code></pre>"],
   :ns "cljs.core",
   :name "comment",
   :signature ["[& body]"],
   :type "macro",
   :examples-strings
   [[["(comment 123) ;;=> nil"
      "(comment"
      "  (foo 1 2 3)"
      "  (bar \"hello\")) ;;=> nil"]
     ["(comment [1 2 3]]) ;; Error: Unmatched delimiter ]"
      "(comment a : b) ;; Error: Invalid token :"]]],
   :description-html
   "<p>Ignores all <code>body</code> forms (i.e. \"commenting out\"). Returns nil.</p><p>This is often used near the bottom of a file to hold expressions that test different functions during development.  Specific expressions within the <code>comment</code> can then be selected and evaluated from some editors.</p><p>You can also use <code>;</code> to \"comment out\" code until the end of a line.</p>",
   :examples
   [{:id "482fd7",
     :content
     "```clj\n(comment 123)\n;;=> nil\n\n(comment\n  (foo 1 2 3)\n  (bar \"hello\"))\n;;=> nil\n```\n\nInner forms must still be syntactically correct:\n\n```clj\n(comment [1 2 3]])\n;; Error: Unmatched delimiter ]\n\n(comment a : b)\n;; Error: Invalid token :\n```"}],
   :full-name "cljs.core/comment",
   :docstring "Ignores body, yields nil"},
  "compile*"
  {:ns "cljs.js",
   :name "compile*",
   :signature ["[bound-vars source name opts cb]"],
   :type "function",
   :full-name "cljs.js/compile*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "recur"
  {:ns "special",
   :name "recur",
   :signature ["[exprs*]"],
   :type "special form",
   :full-name "special/recur",
   :docstring
   "Evaluates the exprs in order, then, in parallel, rebinds\nthe bindings of the recursion point to the values of the exprs.\nExecution then jumps back to the recursion point, a loop or fn method.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parse-and-validate-timestamp"
  {:ns "cljs.reader",
   :name "parse-and-validate-timestamp",
   :signature ["[s]"],
   :type "function",
   :full-name "cljs.reader/parse-and-validate-timestamp",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-url-string"
  {:ns "cljs.repl.reflect",
   :name "read-url-string",
   :type "var",
   :full-name "cljs.repl.reflect/read-url-string",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Vector.fromArray"
  {:ns "cljs.core",
   :name "Vector.fromArray",
   :signature ["[xs]"],
   :type "function",
   :full-name "cljs.core/Vector.fromArray",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IEventType"
  {:ns "clojure.browser.event",
   :name "IEventType",
   :type "protocol",
   :full-name "clojure.browser.event/IEventType",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "safari-st-el->frame"
  {:ns "cljs.repl.browser",
   :name "safari-st-el->frame",
   :signature ["[repl-env st-el opts]"],
   :type "function",
   :full-name "cljs.repl.browser/safari-st-el->frame",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IPrintable"
  {:ns "cljs.core",
   :name "IPrintable",
   :type "protocol",
   :full-name "cljs.core/IPrintable",
   :docstring
   "Do not use this.  It is kept for backwards compatibility with existing\n   user code that depends on it, but it has been superceded by IPrintWithWriter\n   User code that depends on this should be changed to use -pr-writer instead.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "find-ns"
  {:ns "cljs.core",
   :name "find-ns",
   :signature ["[ns]"],
   :type "function",
   :full-name "cljs.core/find-ns",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "wrapping-reader"
  {:ns "cljs.reader",
   :name "wrapping-reader",
   :signature ["[sym]"],
   :type "function",
   :full-name "cljs.reader/wrapping-reader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ObjMap.HASHMAP_THRESHOLD"
  {:ns "cljs.core",
   :name "ObjMap.HASHMAP_THRESHOLD",
   :type "var",
   :full-name "cljs.core/ObjMap.HASHMAP_THRESHOLD",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "with-state"
  {:ns "cljs.js",
   :name "with-state",
   :signature ["[state & body]"],
   :type "macro",
   :full-name "cljs.js/with-state",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dotimes"
  {:description
   "Repeatedly executes `body` (presumably for side-effects) with `name` bound to\nintegers from 0 through `n`-1.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "dotimes",
   :signature ["[[name n] & body]"],
   :type "macro",
   :related ["cljs.core/repeat" "cljs.core/for" "cljs.core/doseq"],
   :examples-strings [],
   :description-html
   "<p>Repeatedly executes <code>body</code> (presumably for side-effects) with <code>name</code> bound to integers from 0 through <code>n</code>-1.</p>",
   :full-name "cljs.core/dotimes",
   :docstring
   "bindings => name n\n\nRepeatedly executes body (presumably for side-effects) with name\nbound to integers from 0 through n-1."},
  "CHAR_MAP"
  {:ns "cljs.core",
   :name "CHAR_MAP",
   :type "var",
   :full-name "cljs.core/CHAR_MAP",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-entries-iterator"
  {:ns "cljs.core",
   :name "set-entries-iterator",
   :signature ["[coll]"],
   :type "function",
   :full-name "cljs.core/set-entries-iterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "iterable?"
  {:ns "cljs.core",
   :name "iterable?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/iterable?",
   :docstring "Return true if x implements IIterable protocol.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-comment"
  {:ns "cljs.core",
   :name "js-comment",
   :signature ["[comment]"],
   :type "macro",
   :full-name "cljs.core/js-comment",
   :docstring
   "Emit a top-level JavaScript multi-line comment. New lines will create a\nnew comment line. Comment block will be preceded and followed by a newline",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "unicode-4-pattern"
  {:ns "cljs.reader",
   :name "unicode-4-pattern",
   :type "var",
   :full-name "cljs.reader/unicode-4-pattern",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "current-repl-env"
  {:ns "cljs.repl.rhino",
   :name "current-repl-env",
   :type "var",
   :full-name "cljs.repl.rhino/current-repl-env",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "branch?"
  {:ns "clojure.zip",
   :name "branch?",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/branch?",
   :docstring "Returns true if the node at loc is a branch",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "nfirst"
  {:description "Same as `(next (first coll))`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;nfirst &#91;&#91;1 2 3&#93; &#91;4 5&#93;&#93;&#41;\n;;=&gt; &#40;2 3&#41;\n\n&#40;nfirst &#91;&#91;1 2&#93; &#91;3 4&#93;&#93;&#41;\n;;=&gt; &#40;2&#41;\n\n&#40;nfirst &#91;&#91;1&#93; &#91;2 3&#93;&#93;&#41;\n;;=&gt; nil\n\n&#40;nfirst &#91;&#91;&#93; &#91;1 2&#93;&#93;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "nfirst",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/next"],
   :examples-strings
   [[["(nfirst [[1 2 3] [4 5]]) ;;=> (2 3)"
      "(nfirst [[1 2] [3 4]]) ;;=> (2)"
      "(nfirst [[1] [2 3]]) ;;=> nil"
      "(nfirst [[] [1 2]]) ;;=> nil"]]],
   :description-html
   "<p>Same as <code>&#40;next &#40;first coll&#41;&#41;</code>.</p>",
   :examples
   [{:id "60b8a4",
     :content
     "```clj\n(nfirst [[1 2 3] [4 5]])\n;;=> (2 3)\n\n(nfirst [[1 2] [3 4]])\n;;=> (2)\n\n(nfirst [[1] [2 3]])\n;;=> nil\n\n(nfirst [[] [1 2]])\n;;=> nil\n```"}],
   :full-name "cljs.core/nfirst",
   :docstring "Same as (next (first x))"},
  "sm-data"
  {:ns "cljs.js",
   :name "sm-data",
   :signature ["[]"],
   :type "function",
   :full-name "cljs.js/sm-data",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get-options"
  {:ns "cljs.analyzer.api",
   :name "get-options",
   :signature ["[]" "[state]"],
   :type "function",
   :full-name "cljs.analyzer.api/get-options",
   :docstring "Return the compiler options from compiler state.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "prefer-method"
  {:ns "cljs.core",
   :name "prefer-method",
   :signature ["[multifn dispatch-val-x dispatch-val-y]"],
   :type "function",
   :full-name "cljs.core/prefer-method",
   :docstring
   "Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y\nwhen there is a conflict",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "parse-param"
  {:ns "cljs.repl.reflect",
   :name "parse-param",
   :signature ["[path]"],
   :type "function",
   :full-name "cljs.repl.reflect/parse-param",
   :docstring
   "Parses the query parameter of a path of the form \"/reflect?var=foo\"\ninto the vector [\"var\" \"foo\"].",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dispatch-event"
  {:ns "clojure.browser.event",
   :name "dispatch-event",
   :signature ["[src event]"],
   :type "function",
   :full-name "clojure.browser.event/dispatch-event",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-headers"
  {:ns "cljs.repl.server",
   :name "read-headers",
   :signature ["[rdr]"],
   :type "function",
   :full-name "cljs.repl.server/read-headers",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "assoc-in"
  {:description
   "Associates a value in a nested associative structure, where `ks` is a sequence\nof keys and `v` is the new value. Returns a new nested structure.\n\nIf any levels do not exist, hash-maps will be created.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def users &#91;{:name &quot;James&quot; :age 26}\n            {:name &quot;John&quot; :age 43}&#93;&#41;\n</code></pre><p>Update the age of the second (index 1) user:</p><pre><code class=\"clj\">&#40;assoc-in users &#91;1 :age&#93; 44&#41;\n;;=&gt; &#91;{:name &quot;James&quot;, :age 26}\n;;    {:name &quot;John&quot;, :age 44}&#93;\n</code></pre><p>Insert the password of the second (index 1) user:</p><pre><code class=\"clj\">&#40;assoc-in users &#91;1 :password&#93; &quot;nhoJ&quot;&#41;\n;;=&gt; &#91;{:name &quot;James&quot;, :age 26}\n;;    {:password &quot;nhoJ&quot;, :name &quot;John&quot;, :age 43}&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "assoc-in",
   :signature ["[m [k & ks] v]"],
   :type "function",
   :related
   ["cljs.core/assoc" "cljs.core/update-in" "cljs.core/get-in"],
   :examples-strings
   [[["(def users [{:name \"James\" :age 26}"
      "            {:name \"John\" :age 43}])"]
     ["(assoc-in users [1 :age] 44) ;;=> [{:name \"James\", :age 26} ;;    {:name \"John\", :age 44}]"]
     ["(assoc-in users [1 :password] \"nhoJ\") ;;=> [{:name \"James\", :age 26} ;;    {:password \"nhoJ\", :name \"John\", :age 43}]"]]],
   :description-html
   "<p>Associates a value in a nested associative structure, where <code>ks</code> is a sequence of keys and <code>v</code> is the new value. Returns a new nested structure.</p><p>If any levels do not exist, hash-maps will be created.</p>",
   :examples
   [{:id "e76f20",
     :content
     "```clj\n(def users [{:name \"James\" :age 26}\n            {:name \"John\" :age 43}])\n```\n\nUpdate the age of the second (index 1) user:\n\n```clj\n(assoc-in users [1 :age] 44)\n;;=> [{:name \"James\", :age 26}\n;;    {:name \"John\", :age 44}]\n```\n\nInsert the password of the second (index 1) user:\n\n```clj\n(assoc-in users [1 :password] \"nhoJ\")\n;;=> [{:name \"James\", :age 26}\n;;    {:password \"nhoJ\", :name \"John\", :age 43}]\n```"}],
   :full-name "cljs.core/assoc-in",
   :docstring
   "Associates a value in a nested associative structure, where ks is a\nsequence of keys and v is the new value and returns a new nested structure.\nIf any levels do not exist, hash-maps will be created."},
  "code-dispatch"
  {:ns "cljs.pprint",
   :name "code-dispatch",
   :type "multimethod",
   :full-name "cljs.pprint/code-dispatch",
   :docstring
   "The pretty print dispatch function for pretty printing Clojure code.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js-reserved"
  {:ns "cljs.core",
   :name "js-reserved",
   :type "var",
   :full-name "cljs.core/js-reserved",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "assoc"
  {:description
   "assoc(iate)\n\nWhen applied to a map, returns a new map that contains the mapping of key(s) to\nval(s).\n\nHas no effect on the map type (hashed/sorted).\n\nWhen applied to a vector, returns a new vector that contains value `v` at index\n`k`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def my-map {:foo 1}&#41;\n\n&#40;assoc my-map :foo 2&#41;\n;;=&gt; {:foo 2}\n\n&#40;assoc my-map :bar 2&#41;\n;;=&gt; {:foo 1 :bar 2}\n\n&#40;assoc my-map :a 3 :b 4 :c 5 :d 6&#41;\n;;=&gt; {:foo 1 :a 3 :b 4 :c 5 :d 6}\n\n;; you must pass a value for every key\n&#40;assoc my-map :foo&#41;\n;;=&gt; WARNING: Wrong number of args &#40;2&#41; passed to cljs.core/assoc\n</code></pre>"
    "<pre><code class=\"clj\">&#40;def my-vec &#91;1 2 3&#93;&#41;\n\n&#40;assoc my-vec 0 &quot;foo&quot;&#41;\n;;=&gt; &#91;&quot;foo&quot; 2 3&#93;\n\n&#40;assoc my-vec 3 &quot;foo&quot;&#41;\n;;=&gt; Error: Index 3 out of bounds  &#91;0,0&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "assoc",
   :signature ["[coll k v]" "[coll k v & kvs]"],
   :type "function",
   :related
   ["cljs.core/assoc-in" "cljs.core/dissoc" "cljs.core/merge"],
   :examples-strings
   [[["(def my-map {:foo 1})"
      "(assoc my-map :foo 2) ;;=> {:foo 2}"
      "(assoc my-map :bar 2) ;;=> {:foo 1 :bar 2}"
      "(assoc my-map :a 3 :b 4 :c 5 :d 6) ;;=> {:foo 1 :a 3 :b 4 :c 5 :d 6} ;; you must pass a value for every key"
      "(assoc my-map :foo) ;;=> WARNING: Wrong number of args (2) passed to cljs.core/assoc"]]
    [["(def my-vec [1 2 3])"
      "(assoc my-vec 0 \"foo\") ;;=> [\"foo\" 2 3]"
      "(assoc my-vec 3 \"foo\") ;;=> Error: Index 3 out of bounds  [0,0]"]]],
   :description-html
   "<p>assoc(iate)</p><p>When applied to a map, returns a new map that contains the mapping of key(s) to val(s).</p><p>Has no effect on the map type (hashed/sorted).</p><p>When applied to a vector, returns a new vector that contains value <code>v</code> at index <code>k</code>.</p>",
   :examples
   [{:id "2fa7e0",
     :content
     "```clj\n(def my-map {:foo 1})\n\n(assoc my-map :foo 2)\n;;=> {:foo 2}\n\n(assoc my-map :bar 2)\n;;=> {:foo 1 :bar 2}\n\n(assoc my-map :a 3 :b 4 :c 5 :d 6)\n;;=> {:foo 1 :a 3 :b 4 :c 5 :d 6}\n\n;; you must pass a value for every key\n(assoc my-map :foo)\n;;=> WARNING: Wrong number of args (2) passed to cljs.core/assoc\n```"}
    {:id "c06eac",
     :content
     "```clj\n(def my-vec [1 2 3])\n\n(assoc my-vec 0 \"foo\")\n;;=> [\"foo\" 2 3]\n\n(assoc my-vec 3 \"foo\")\n;;=> Error: Index 3 out of bounds  [0,0]\n```"}],
   :full-name "cljs.core/assoc",
   :docstring
   "assoc[iate]. When applied to a map, returns a new map of the\nsame (hashed/sorted) type, that contains the mapping of key(s) to\nval(s). When applied to a vector, returns a new vector that\ncontains val at index."},
  "unchecked-long"
  {:ns "cljs.core",
   :name "unchecked-long",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/unchecked-long",
   :docstring
   "Coerce to long by stripping decimal places. Identical to `int'.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "write"
  {:ns "cljs.repl.node",
   :name "write",
   :signature ["[out js]"],
   :type "function",
   :full-name "cljs.repl.node/write",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mapv"
  {:description
   "Returns a vector consisting of the result of applying `f` to the set of first\nitems of each coll, followed by applying `f` to the set of second items in each\ncoll, until any one of the colls is exhausted. Any remaining items in other\ncolls are ignored.\n\nFunction `f` should accept number-of-colls arguments.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "mapv",
   :signature
   ["[f coll]" "[f c1 c2]" "[f c1 c2 c3]" "[f c1 c2 c3 & colls]"],
   :type "function",
   :related ["cljs.core/map"],
   :examples-strings [],
   :description-html
   "<p>Returns a vector consisting of the result of applying <code>f</code> to the set of first items of each coll, followed by applying <code>f</code> to the set of second items in each coll, until any one of the colls is exhausted. Any remaining items in other colls are ignored.</p><p>Function <code>f</code> should accept number-of-colls arguments.</p>",
   :full-name "cljs.core/mapv",
   :docstring
   "Returns a vector consisting of the result of applying f to the\nset of first items of each coll, followed by applying f to the set\nof second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments."},
  "into"
  {:description
   "Returns a new collection consisting of `to` with all of the items of `from`\n\"added\" using `conj`.\n\nA transducer may be supplied as `xform`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "into",
   :signature ["[to from]" "[to xform from]"],
   :type "function",
   :related ["cljs.core/conj"],
   :examples-strings [],
   :description-html
   "<p>Returns a new collection consisting of <code>to</code> with all of the items of <code>from</code> \"added\" using <code>conj</code>.</p><p>A transducer may be supplied as <code>xform</code>.</p>",
   :full-name "cljs.core/into",
   :docstring
   "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined. A transducer may be supplied."},
  "*clojurescript-version*"
  {:ns "cljs.core",
   :name "*clojurescript-version*",
   :type "var",
   :full-name "cljs.core/*clojurescript-version*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IJavaScriptEnv"
  {:ns "cljs.repl",
   :name "IJavaScriptEnv",
   :type "protocol",
   :full-name "cljs.repl/IJavaScriptEnv",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "int-pattern"
  {:ns "cljs.reader",
   :name "int-pattern",
   :type "var",
   :full-name "cljs.reader/int-pattern",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pprint-set"
  {:ns "cljs.pprint",
   :name "pprint-set",
   :type "var",
   :full-name "cljs.pprint/pprint-set",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IEncodeClojure"
  {:ns "cljs.core",
   :name "IEncodeClojure",
   :type "protocol",
   :full-name "cljs.core/IEncodeClojure",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "bootstrap-repl"
  {:ns "cljs.repl.nashorn",
   :name "bootstrap-repl",
   :signature ["[engine output-dir opts]"],
   :type "function",
   :full-name "cljs.repl.nashorn/bootstrap-repl",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "server-loop"
  {:ns "cljs.repl.browser",
   :name "server-loop",
   :signature ["[opts server-socket]"],
   :type "function",
   :full-name "cljs.repl.browser/server-loop",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "formatter-out"
  {:ns "cljs.pprint",
   :name "formatter-out",
   :signature ["[format-in]"],
   :type "macro",
   :full-name "cljs.pprint/formatter-out",
   :docstring
   "Makes a function which can directly run format-in. The function is\nfn [& args] ... and returns nil. This version of the formatter macro is\ndesigned to be used with *out* set to an appropriate Writer. In particular,\nthis is meant to be used as part of a pretty printer dispatch method.\n\nformat-in can be either a control string or a previously compiled format.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "special-symbol?"
  {:ns "cljs.core",
   :name "special-symbol?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/special-symbol?",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "when-not"
  {:description
   "Evaluates `test`. If logical false, evaluates `body` in an implicit `do`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "when-not",
   :signature ["[test & body]"],
   :type "macro",
   :related ["cljs.core/when" "cljs.core/when-let" "special/if"],
   :examples-strings [],
   :description-html
   "<p>Evaluates <code>test</code>. If logical false, evaluates <code>body</code> in an implicit <code>do</code>.</p>",
   :full-name "cljs.core/when-not",
   :docstring
   "Evaluates test. If logical false, evaluates body in an implicit do."},
  "browser-eval"
  {:ns "cljs.repl.browser",
   :name "browser-eval",
   :signature ["[form]"],
   :type "function",
   :full-name "cljs.repl.browser/browser-eval",
   :docstring
   "Given a string of JavaScript, evaluate it in the browser and return a map representing the\nresult of the evaluation. The map will contain the keys :type and :value. :type can be\n:success, :exception, or :error. :success means that the JavaScript was evaluated without\nexception and :value will contain the return value of the evaluation. :exception means that\nthere was an exception in the browser while evaluating the JavaScript and :value will\ncontain the error message. :error means that some other error has occured.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "dec"
  {:description "Returns a number one less than `x`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "dec",
   :signature ["[x]"],
   :type "function/macro",
   :related ["cljs.core/inc"],
   :examples-strings [],
   :description-html
   "<p>Returns a number one less than <code>x</code>.</p>",
   :full-name "cljs.core/dec",
   :docstring "Returns a number one less than num."},
  "trim-newline"
  {:description
   "Removes all trailing newline `\\n` or return `\\r` characters from string.\n\nSimilar to Perl's chomp.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "trim-newline",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Removes all trailing newline <code>\\n</code> or return <code>\\r</code> characters from string.</p><p>Similar to Perl's chomp.</p>",
   :full-name "clojure.string/trim-newline",
   :docstring
   "Removes all trailing newline \\n or return \\r characters from\nstring.  Similar to Perl's chomp."},
  "disj"
  {:description
   "disj(oin). Returns a new set of the same (hashed/sorted) type, that does not\ncontain key(s).",
   :examples-htmls [],
   :ns "cljs.core",
   :name "disj",
   :signature ["[coll]" "[coll k]" "[coll k & ks]"],
   :type "function",
   :related
   ["cljs.core/dissoc" "cljs.core/disj!" "clojure.set/difference"],
   :examples-strings [],
   :description-html
   "<p>disj(oin). Returns a new set of the same (hashed/sorted) type, that does not contain key(s).</p>",
   :full-name "cljs.core/disj",
   :docstring
   "disj[oin]. Returns a new set of the same (hashed/sorted) type, that\ndoes not contain key(s)."},
  "default-dispatch-val"
  {:ns "cljs.core",
   :name "default-dispatch-val",
   :signature ["[multifn]"],
   :type "function",
   :full-name "cljs.core/default-dispatch-val",
   :docstring "Given a multimethod, return it's default-dispatch-val.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "difference"
  {:description
   "Return a set that is the first set without elements of the remaining sets.",
   :examples-htmls [],
   :ns "clojure.set",
   :name "difference",
   :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
   :type "function",
   :related
   ["clojure.set/union"
    "clojure.set/intersection"
    "clojure.set/superset?"
    "clojure.set/project"],
   :examples-strings [],
   :description-html
   "<p>Return a set that is the first set without elements of the remaining sets.</p>",
   :full-name "clojure.set/difference",
   :docstring
   "Return a set that is the first set without elements of the remaining sets"},
  "=="
  {:description
   "This is an equality check for numbers of different types that was carried over from Clojure,\nto allow compatibility when converting code to ClojureScript.\n\nSince there is only a single number type in JavaScript, 64-bit floating point, there is no\nreason to use the `==` operator in ClojureScript.\n\nBehavior on non-number arguments is undefined.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;== 1 1&#41;\n;;=&gt; true\n\n&#40;== 1 2&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "==",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/=" "cljs.core/identical?"],
   :examples-strings [[["(== 1 1) ;;=> true" "(== 1 2) ;;=> false"]]],
   :description-html
   "<p>This is an equality check for numbers of different types that was carried over from Clojure, to allow compatibility when converting code to ClojureScript.</p><p>Since there is only a single number type in JavaScript, 64-bit floating point, there is no reason to use the <code>==</code> operator in ClojureScript.</p><p>Behavior on non-number arguments is undefined.</p>",
   :examples
   [{:id "5ac342",
     :content
     "```clj\n(== 1 1)\n;;=> true\n\n(== 1 2)\n;;=> false\n```"}],
   :full-name "cljs.core/==",
   :docstring
   "Returns non-nil if nums all have the equivalent\nvalue, otherwise false. Behavior on non nums is\nundefined."},
  "load-deps"
  {:ns "cljs.js",
   :name "load-deps",
   :signature
   ["[bound-vars ana-env lib deps cb]"
    "[bound-vars ana-env lib deps opts cb]"],
   :type "function",
   :full-name "cljs.js/load-deps",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "get"
  {:description
   "Returns the value mapped to key `k`.\n\nReturns `not-found` or nil if `k` is not present in `o`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "get",
   :signature ["[o k]" "[o k not-found]"],
   :type "function",
   :related ["cljs.core/get-in"],
   :examples-strings [],
   :description-html
   "<p>Returns the value mapped to key <code>k</code>.</p><p>Returns <code>not-found</code> or nil if <code>k</code> is not present in <code>o</code>.</p>",
   :full-name "cljs.core/get",
   :docstring
   "Returns the value mapped to key, not-found or nil if key not present."},
  "append-source-map"
  {:ns "cljs.js",
   :name "append-source-map",
   :signature
   ["[state name source sb sm-data {:keys [output-dir asset-path], :as opts}]"],
   :type "function",
   :full-name "cljs.js/append-source-map",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ex-cause"
  {:ns "cljs.core",
   :name "ex-cause",
   :signature ["[ex]"],
   :type "function",
   :full-name "cljs.core/ex-cause",
   :docstring
   "Alpha - subject to change.\nReturns exception cause (an Error / ExceptionInfo) if ex is an\nExceptionInfo.\nOtherwise returns nil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Cons"
  {:ns "cljs.core",
   :name "Cons",
   :signature ["[meta first rest __hash]"],
   :type "type",
   :full-name "cljs.core/Cons",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "distinct?"
  {:description "Returns true if no two of the arguments are `=`",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;distinct? 1&#41;\n;;=&gt; true\n\n&#40;distinct? 1 2&#41;\n;;=&gt; true\n\n&#40;distinct? 1 1&#41;\n;;=&gt; false\n\n&#40;distinct? 1 2 3&#41;\n;;=&gt; true\n\n&#40;distinct? 1 2 1&#41;\n;;=&gt; false\n</code></pre><p>Apply it a collection:</p><pre><code class=\"clj\">&#40;apply distinct? &#91;1 2 3&#93;&#41;\n;;=&gt; true\n\n&#40;apply distinct? &#91;1 2 1&#93;&#41;\n;;=&gt; false\n</code></pre>"],
   :ns "cljs.core",
   :name "distinct?",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function",
   :related ["cljs.core/distinct"],
   :examples-strings
   [[["(distinct? 1) ;;=> true"
      "(distinct? 1 2) ;;=> true"
      "(distinct? 1 1) ;;=> false"
      "(distinct? 1 2 3) ;;=> true"
      "(distinct? 1 2 1) ;;=> false"]
     ["(apply distinct? [1 2 3]) ;;=> true"
      "(apply distinct? [1 2 1]) ;;=> false"]]],
   :description-html
   "<p>Returns true if no two of the arguments are <code>=</code></p>",
   :examples
   [{:id "b32799",
     :content
     "```clj\n(distinct? 1)\n;;=> true\n\n(distinct? 1 2)\n;;=> true\n\n(distinct? 1 1)\n;;=> false\n\n(distinct? 1 2 3)\n;;=> true\n\n(distinct? 1 2 1)\n;;=> false\n```\n\nApply it a collection:\n\n```clj\n(apply distinct? [1 2 3])\n;;=> true\n\n(apply distinct? [1 2 1])\n;;=> false\n```"}],
   :full-name "cljs.core/distinct?",
   :docstring "Returns true if no two of the arguments are ="},
  "merge"
  {:description
   "Returns a map that consists of the rest of the maps `conj`-ed onto the first.\n\nIf a key occurs in more than one map, the mapping from the rightmost map will\n\"win\".",
   :examples-htmls [],
   :ns "cljs.core",
   :name "merge",
   :signature ["[& maps]"],
   :type "function",
   :related ["cljs.core/merge-with" "cljs.core/hash-map"],
   :examples-strings [],
   :description-html
   "<p>Returns a map that consists of the rest of the maps <code>conj</code>-ed onto the first.</p><p>If a key occurs in more than one map, the mapping from the rightmost map will \"win\".</p>",
   :full-name "cljs.core/merge",
   :docstring
   "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping from\nthe latter (left-to-right) will be the mapping in the result."},
  "Var"
  {:ns "cljs.core",
   :name "Var",
   :signature ["[val sym _meta]"],
   :type "type",
   :full-name "cljs.core/Var",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "BitmapIndexedNode"
  {:ns "cljs.core",
   :name "BitmapIndexedNode",
   :signature ["[edit bitmap arr]"],
   :type "type",
   :full-name "cljs.core/BitmapIndexedNode",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cljs-dependents-for-macro-namespaces"
  {:ns "cljs.build.api",
   :name "cljs-dependents-for-macro-namespaces",
   :signature ["[namespaces]" "[state namespaces]"],
   :type "function",
   :full-name "cljs.build.api/cljs-dependents-for-macro-namespaces",
   :docstring
   "Takes a list of Clojure (.clj) namespaces that define macros and\nreturns a list ClojureScript (.cljs) namespaces that depend on those macro\nnamespaces.\n\nFor example where example.macros is defined in the clojure file\n\"example/macros.clj\" and both 'example.core and 'example.util are\nClojureScript namespaces that require and use the macros from\n'example.macros :\n(cljs-dependents-for-macro-namespaces 'example.macros) ->\n('example.core 'example.util)",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "lefts"
  {:ns "clojure.zip",
   :name "lefts",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/lefts",
   :docstring "Returns a seq of the left siblings of this loc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "whitespace"
  {:description
   "The amount of whitespace between syntax forms does not affect syntax\ncorrectness.  Elements are free to be aligned as desired.\n\nIndentation is conventionally two spaces, no tab characters.\n[More indentation conventions here](https://github.com/bbatsov/clojure-style-guide#source-code-layout--organization)\n\nWhitespace around collection delimiters is not required:\n\n```clj\n(a(b(c)))\n```\n\n```clj\n#js[1 2 3]\n#inst\"2015-10-12\"\n```\n\nA [comma][doc:syntax/comma] is considered whitespace:\n\n```clj\n[1, 2, 3]\n{:foo 1, :bar 2}\n```",
   :ns "syntax",
   :name "whitespace",
   :type "special character",
   :related ["syntax/comma"],
   :full-name "syntax/whitespace",
   :description-html
   "<p>The amount of whitespace between syntax forms does not affect syntax correctness.  Elements are free to be aligned as desired.</p><p>Indentation is conventionally two spaces, no tab characters. <a href='https://github.com/bbatsov/clojure-style-guide#source-code-layout--organization'>More indentation conventions here</a></p><p>Whitespace around collection delimiters is not required:</p><pre><code class=\"clj\">&#40;a&#40;b&#40;c&#41;&#41;&#41;\n</code></pre><pre><code class=\"clj\">#js&#91;1 2 3&#93;\n#inst&quot;2015-10-12&quot;\n</code></pre><p>A [comma][doc:syntax/comma] is considered whitespace:</p><pre><code class=\"clj\">&#91;1, 2, 3&#93;\n{:foo 1, :bar 2}\n</code></pre>",
   :examples-strings [],
   :examples-htmls []},
  "+"
  {:description "Returns the sum of nums.\n\n`(+)` returns 0.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;+&#41;\n;;=&gt; 0\n\n&#40;+ 1&#41;\n;;=&gt; 1\n\n&#40;+ -10&#41;\n;;=&gt; -10\n\n&#40;+ 1 2&#41;\n;;=&gt; 3\n\n&#40;+ 1 2 3&#41;\n;;=&gt; 6\n</code></pre>"],
   :ns "cljs.core",
   :name "+",
   :signature ["[]" "[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/*" "cljs.core/-"],
   :examples-strings
   [[["(+) ;;=> 0"
      "(+ 1) ;;=> 1"
      "(+ -10) ;;=> -10"
      "(+ 1 2) ;;=> 3"
      "(+ 1 2 3) ;;=> 6"]]],
   :description-html
   "<p>Returns the sum of nums.</p><p><code>&#40;+&#41;</code> returns 0.</p>",
   :examples
   [{:id "650668",
     :content
     "```clj\n(+)\n;;=> 0\n\n(+ 1)\n;;=> 1\n\n(+ -10)\n;;=> -10\n\n(+ 1 2)\n;;=> 3\n\n(+ 1 2 3)\n;;=> 6\n```"}],
   :full-name "cljs.core/+",
   :docstring "Returns the sum of nums. (+) returns 0."},
  "list*"
  {:description
   "Creates a new list containing the items prepended to the rest, the last of which\nwill be treated as a sequence.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "list*",
   :signature
   ["[args]"
    "[a args]"
    "[a b args]"
    "[a b c args]"
    "[a b c d & more]"],
   :type "function",
   :related ["cljs.core/list"],
   :examples-strings [],
   :description-html
   "<p>Creates a new list containing the items prepended to the rest, the last of which will be treated as a sequence.</p>",
   :full-name "cljs.core/list*",
   :docstring
   "Creates a new list containing the items prepended to the rest, the\nlast of which will be treated as a sequence."},
  "IEquiv"
  {:ns "cljs.core",
   :name "IEquiv",
   :type "protocol",
   :full-name "cljs.core/IEquiv",
   :docstring
   "Protocol for adding value comparison functionality to a type.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "LazySeq"
  {:ns "cljs.core",
   :name "LazySeq",
   :signature ["[meta fn s __hash]"],
   :type "type",
   :full-name "cljs.core/LazySeq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "even?"
  {:description
   "Returns true if `n` is an even number.\n\nThrows an exception if `n` is not an integer.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "even?",
   :signature ["[n]"],
   :type "function",
   :related ["cljs.core/odd?"],
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>n</code> is an even number.</p><p>Throws an exception if <code>n</code> is not an integer.</p>",
   :full-name "cljs.core/even?",
   :docstring
   "Returns true if n is even, throws an exception if n is not an integer"},
  "spread"
  {:ns "cljs.core",
   :name "spread",
   :signature ["[arglist]"],
   :type "function",
   :full-name "cljs.core/spread",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IWriter"
  {:ns "cljs.core",
   :name "IWriter",
   :type "protocol",
   :full-name "cljs.core/IWriter",
   :docstring
   "Protocol for writing. Currently only implemented by StringBufferWriter.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "NeverEquiv"
  {:ns "cljs.core",
   :name "NeverEquiv",
   :signature ["[]"],
   :type "type",
   :full-name "cljs.core/NeverEquiv",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array"
  {:description
   "Creates a JavaScript array containing `args`.\n\nThe tagged literal `#js [1 2 3]` is equivalent to `(array 1 2 3)`",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;array 1 2 3&#41;\n;;=&gt; #js &#91;1 2 3&#93;\n\n&#40;apply array &#91;1 2 3&#93;&#41;\n;;=&gt; #js &#91;1 2 3&#93;\n\n#js &#91;1 2 3&#93;\n;;=&gt; #js &#91;1 2 3&#93;\n</code></pre>"
    "<p>When creating nested JavaScript arrays, you can opt to use <code>clj-&gt;js</code> instead:</p><pre><code class=\"clj\">&#40;array 1 2 &#40;array 3 4&#41;&#41;\n;;=&gt; #js &#91;1 2 #js &#91;3 4&#93;&#93;\n\n&#40;clj-&gt;js &#91;1 2 &#91;3 4&#93;&#93;&#41;\n;;=&gt; #js &#91;1 2 #js &#91;3 4&#93;&#93;\n</code></pre>"],
   :ns "cljs.core",
   :name "array",
   :signature ["[& args]"],
   :type "function/macro",
   :related
   ["cljs.core/aclone" "cljs.core/make-array" "cljs.core/clj->js"],
   :examples-strings
   [[["(array 1 2 3) ;;=> #js [1 2 3]"
      "(apply array [1 2 3]) ;;=> #js [1 2 3]"
      "#js [1 2 3] ;;=> #js [1 2 3]"]]
    [["(array 1 2 (array 3 4)) ;;=> #js [1 2 #js [3 4]]"
      "(clj->js [1 2 [3 4]]) ;;=> #js [1 2 #js [3 4]]"]]],
   :description-html
   "<p>Creates a JavaScript array containing <code>args</code>.</p><p>The tagged literal <code>#js &#91;1 2 3&#93;</code> is equivalent to <code>&#40;array 1 2 3&#41;</code></p>",
   :examples
   [{:id "3a546d",
     :content
     "```clj\n(array 1 2 3)\n;;=> #js [1 2 3]\n\n(apply array [1 2 3])\n;;=> #js [1 2 3]\n\n#js [1 2 3]\n;;=> #js [1 2 3]\n```"}
    {:id "cca945",
     :content
     "When creating nested JavaScript arrays, you can opt to use `clj->js` instead:\n\n```clj\n(array 1 2 (array 3 4))\n;;=> #js [1 2 #js [3 4]]\n\n(clj->js [1 2 [3 4]])\n;;=> #js [1 2 #js [3 4]]\n```"}],
   :full-name "cljs.core/array",
   :docstring
   "Creates a new javascript array.\n@param {...*} var_args"},
  "xpc-connection"
  {:ns "clojure.browser.repl",
   :name "xpc-connection",
   :type "var",
   :full-name "clojure.browser.repl/xpc-connection",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ICloneable"
  {:ns "cljs.core",
   :name "ICloneable",
   :type "protocol",
   :full-name "cljs.core/ICloneable",
   :docstring "Protocol for cloning a value.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cond->>"
  {:description
   "Takes an expression and a set of test/form pairs. Threads `expr` (via `->>`)\nthrough each form for which the corresponding test expression is true.\n\nNote that, unlike `cond` branching, `cond->>` threading does not short circuit\nafter the first true test expression.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;def filter? true&#41;\n&#40;def sum? true&#41;\n\n&#40;cond-&gt;&gt; &#91;1 2 3 4&#93;\n  filter? &#40;filter even?&#41;\n  sum?    &#40;reduce +&#41;&#41;\n;;=&gt; 6\n</code></pre>"],
   :ns "cljs.core",
   :name "cond->>",
   :signature ["[expr & clauses]"],
   :type "macro",
   :related
   ["cljs.core/->"
    "cljs.core/->>"
    "cljs.core/cond->"
    "cljs.core/cond"],
   :examples-strings
   [[["(def filter? true)"
      "(def sum? true)"
      "(cond->> [1 2 3 4]"
      "  filter? (filter even?)"
      "  sum?    (reduce +)) ;;=> 6"]]],
   :description-html
   "<p>Takes an expression and a set of test/form pairs. Threads <code>expr</code> (via <code>-&gt;&gt;</code>) through each form for which the corresponding test expression is true.</p><p>Note that, unlike <code>cond</code> branching, <code>cond-&gt;&gt;</code> threading does not short circuit after the first true test expression.</p>",
   :examples
   [{:id "e07a05",
     :content
     "```clj\n(def filter? true)\n(def sum? true)\n\n(cond->> [1 2 3 4]\n  filter? (filter even?)\n  sum?    (reduce +))\n;;=> 6\n```"}],
   :full-name "cljs.core/cond->>",
   :docstring
   "Takes an expression and a set of test/form pairs. Threads expr (via ->>)\nthrough each form for which the corresponding test expression\nis true.  Note that, unlike cond branching, cond->> threading does not short circuit\nafter the first true test expression."},
  "rsubseq"
  {:description
   "`sc` must be a sorted collection.\n\n`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.\n\nReturns a reverse sequence of those entries with keys `ek` for which\n`(test (.. sc comparator (compare ek key)) 0)` is true.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "rsubseq",
   :signature
   ["[sc test key]" "[sc start-test start-key end-test end-key]"],
   :type "function",
   :related ["cljs.core/subseq"],
   :examples-strings [],
   :description-html
   "<p><code>sc</code> must be a sorted collection.</p><p><code>test</code>, <code>start-test</code>, <code>end-test</code> must be <code>&lt;</code>, <code>&lt;=</code>, <code>&gt;</code> or <code>&gt;=</code>.</p><p>Returns a reverse sequence of those entries with keys <code>ek</code> for which <code>&#40;test &#40;.. sc comparator &#40;compare ek key&#41;&#41; 0&#41;</code> is true.</p>",
   :full-name "cljs.core/rsubseq",
   :docstring
   "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a reverse seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true"},
  "IList"
  {:ns "cljs.core",
   :name "IList",
   :type "protocol",
   :full-name "cljs.core/IList",
   :docstring "Marker interface indicating a persistent list",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "throw"
  {:description
   "`expr` is evaluated and thrown, hopefully to be caught by a `try` expression.\n\n`(throw (js/Error. \"Oops!\"))`",
   :examples-htmls [],
   :ns "special",
   :name "throw",
   :signature ["[expr]"],
   :type "special form",
   :related ["special/try" "special/catch" "special/finally"],
   :examples-strings [],
   :description-html
   "<p><code>expr</code> is evaluated and thrown, hopefully to be caught by a <code>try</code> expression.</p><p><code>&#40;throw &#40;js/Error. &quot;Oops!&quot;&#41;&#41;</code></p>",
   :full-name "special/throw",
   :docstring "The expr is evaluated and thrown."},
  "ITransientMap"
  {:ns "cljs.core",
   :name "ITransientMap",
   :type "protocol",
   :full-name "cljs.core/ITransientMap",
   :docstring
   "Protocol for adding mapping functionality to transient collections.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "add-in-order"
  {:ns "cljs.repl.browser",
   :name "add-in-order",
   :signature ["[{:keys [expecting fns]} order f]"],
   :type "function",
   :full-name "cljs.repl.browser/add-in-order",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cat"
  {:ns "clojure.core.reducers",
   :name "cat",
   :signature ["[]" "[ctor]" "[left right]"],
   :type "function",
   :full-name "clojure.core.reducers/cat",
   :docstring
   "A high-performance combining fn that yields the catenation of the\nreduced values. The result is reducible, foldable, seqable and\ncounted, providing the identity collections are reducible, seqable\nand counted. The single argument version will build a combining fn\nwith the supplied identity constructor. Tests for identity\nwith (zero? (count x)). See also foldcat.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "mk-bound-fn"
  {:ns "cljs.core",
   :name "mk-bound-fn",
   :signature ["[sc test key]"],
   :type "function",
   :full-name "cljs.core/mk-bound-fn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "handle-get"
  {:ns "cljs.repl.browser",
   :name "handle-get",
   :signature ["[opts conn request]"],
   :type "function",
   :full-name "cljs.repl.browser/handle-get",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-keyword"
  {:ns "cljs.reader",
   :name "read-keyword",
   :signature ["[reader initch]"],
   :type "function",
   :full-name "cljs.reader/read-keyword",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "char?"
  {:ns "cljs.core",
   :name "char?",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/char?",
   :docstring "Returns true if x is a JavaScript char.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr"
  {:ns "cljs.core",
   :name "pr",
   :signature ["[& objs]"],
   :type "function",
   :full-name "cljs.core/pr",
   :docstring
   "Prints the object(s) using string-print.  Prints the\nobject(s), separated by spaces if there is more than one.\nBy default, pr and prn print in a way that objects can be\nread by the reader",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "with-read-known"
  {:ns "cljs.repl",
   :name "with-read-known",
   :signature ["[& body]"],
   :type "macro",
   :full-name "cljs.repl/with-read-known",
   :docstring
   "Evaluates body with *read-eval* set to a \"known\" value,\ni.e. substituting true for :unknown if necessary.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "create-engine"
  {:ns "cljs.repl.nashorn",
   :name "create-engine",
   :signature ["[]" "[{:keys [code-cache], :or {code-cache true}}]"],
   :type "function",
   :full-name "cljs.repl.nashorn/create-engine",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "js*"
  {:ns "special",
   :name "js*",
   :type "special form",
   :full-name "special/js*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Eduction"
  {:ns "cljs.core",
   :name "Eduction",
   :signature ["[xform coll]"],
   :type "type",
   :full-name "cljs.core/Eduction",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "run-block"
  {:ns "cljs.test",
   :name "run-block",
   :signature ["[fns]"],
   :type "function",
   :full-name "cljs.test/run-block",
   :docstring
   "Invoke all functions in fns with no arguments. A fn can optionally\nreturn\n\nan async test - is invoked with a continuation running left fns\n\na seq of fns tagged per block - are invoked immediately after fn",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "SeqIter"
  {:ns "cljs.core",
   :name "SeqIter",
   :signature ["[_seq _next]"],
   :type "type",
   :full-name "cljs.core/SeqIter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Iteration"
  {:ns "cljs.core",
   :name "Iteration",
   :signature ["[xform coll]"],
   :type "type",
   :full-name "cljs.core/Iteration",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "tagged-literal"
  {:description
   "A tagged literal is a way to tag another core syntax literal to represent a\nsingle, new literal.\n\n- `#foo []`\n- `#foo {}`\n- `#foo \"bar\"`\n- `#foo 123`\n- ...\n\nIf a [symbol][doc:syntax/symbol] is prefixed by `#`, that symbol is considered a\n__tag__ for the following form.  Together they represent a new value.  Real\nexamples:\n\n- `#js {:foo 1}`, map -> JavaScript object\n- `#inst \"2015-01-12\"` string -> Date\n\nIn these examples, the values `{:foo 1}` and `\"2015-01-12\"` are read normally,\nbut are further interpretted by their registered tag handlers to produce new\nvalues: a JavaScript object and Date, respectively.\n\nThese tagged literals are the \"extensible\" part of extensible data notation\n([edn]), with ClojureScript being a superset of edn.\n\n[edn]:https://github.com/edn-format/edn#tagged-elements\n\nClojureScript supports the following tagged literals:\n\n- [doc:syntax/inst-literal]\n- [doc:syntax/uuid-literal]\n- [doc:syntax/js-literal]\n- [doc:syntax/queue-literal]",
   :examples-htmls
   ["<p>(Tagged literals are printed as themselves, just like core syntax literals.)</p><p>literal JavaScript object:</p><pre><code class=\"clj\">#js {:foo 1}\n;;=&gt; #js {:foo 1}\n\n&#40;def foo 1&#41;\n#js {:foo foo}\n;;=&gt; #js {:foo 1}\n</code></pre><p>literal queue:</p><pre><code class=\"clj\">#queue &#91;1 2 3&#93;\n;;=&gt; #queue &#91;1 2 3&#93;\n\n&#40;conj #queue &#91;1 2 3&#93; 4&#41;\n;;=&gt; #queue &#91;1 2 3 4&#93;\n</code></pre><p>literal instant of time (date):</p><pre><code class=\"clj\">#inst &quot;2014-10-13&quot;\n;;=&gt; #inst &quot;2014-10-13T00:00:00.000-00:00&quot;\n</code></pre><p>literal UUID:</p><pre><code class=\"clj\">#uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;\n;;=&gt; #uuid &quot;97bda55b-6175-4c39-9e04-7c0205c709dc&quot;\n</code></pre>"],
   :ns "syntax",
   :name "tagged-literal",
   :type "syntax",
   :related ["syntax/dispatch"],
   :examples-strings
   [[["#js {:foo 1} ;;=> #js {:foo 1}"
      "(def foo 1)"
      "#js {:foo foo} ;;=> #js {:foo 1}"]
     ["#queue [1 2 3] ;;=> #queue [1 2 3]"
      "(conj #queue [1 2 3] 4) ;;=> #queue [1 2 3 4]"]
     ["#inst \"2014-10-13\" ;;=> #inst \"2014-10-13T00:00:00.000-00:00\""]
     ["#uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\" ;;=> #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\""]]],
   :description-html
   "<p>A tagged literal is a way to tag another core syntax literal to represent a single, new literal.</p><ul><li><code>#foo &#91;&#93;</code></li><li><code>#foo {}</code></li><li><code>#foo &quot;bar&quot;</code></li><li><code>#foo 123</code></li><li>...</li></ul><p>If a [symbol][doc:syntax/symbol] is prefixed by <code>#</code>, that symbol is considered a <b>tag</b> for the following form.  Together they represent a new value.  Real examples:</p><ul><li><code>#js {:foo 1}</code>, map -> JavaScript object</li><li><code>#inst &quot;2015-01-12&quot;</code> string -> Date</li></ul><p>In these examples, the values <code>{:foo 1}</code> and <code>&quot;2015-01-12&quot;</code> are read normally, but are further interpretted by their registered tag handlers to produce new values: a JavaScript object and Date, respectively.</p><p>These tagged literals are the \"extensible\" part of extensible data notation ([edn]), with ClojureScript being a superset of edn.</p><p>[edn]:https://github.com/edn-format/edn#tagged-elements</p><p>ClojureScript supports the following tagged literals:</p><ul><li>[doc:syntax/inst-literal]</li><li>[doc:syntax/uuid-literal]</li><li>[doc:syntax/js-literal]</li><li>[doc:syntax/queue-literal]</li></ul>",
   :examples
   [{:id "e84f6a",
     :content
     "(Tagged literals are printed as themselves, just like core syntax literals.)\n\nliteral JavaScript object:\n\n```clj\n#js {:foo 1}\n;;=> #js {:foo 1}\n\n(def foo 1)\n#js {:foo foo}\n;;=> #js {:foo 1}\n```\n\nliteral queue:\n\n```clj\n#queue [1 2 3]\n;;=> #queue [1 2 3]\n\n(conj #queue [1 2 3] 4)\n;;=> #queue [1 2 3 4]\n```\n\nliteral instant of time (date):\n\n```clj\n#inst \"2014-10-13\"\n;;=> #inst \"2014-10-13T00:00:00.000-00:00\"\n```\n\nliteral UUID:\n\n```clj\n#uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\"\n;;=> #uuid \"97bda55b-6175-4c39-9e04-7c0205c709dc\"\n```"}],
   :full-name "syntax/tagged-literal"},
  "use-fixtures"
  {:ns "cljs.test",
   :name "use-fixtures",
   :signature ["[type & fns]"],
   :type "macro",
   :full-name "cljs.test/use-fixtures",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "load-file*"
  {:ns "cljs.core",
   :name "load-file*",
   :signature ["[f]"],
   :type "macro",
   :full-name "cljs.core/load-file*",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "doc"
  {:description
   "Prints documentation for the var or special form with the name `name`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;doc map&#41;\n;; Prints:\n;;  -------------------------\n;;  cljs.core/map\n;;  &#91;f coll&#93;\n;;    Returns a lazy sequence consisting of the result of applying f to\n;;    the set of first items of each coll, followed by applying f to the\n;;    set of second items in each coll, until any one of the colls is\n;;    exhausted.  Any remaining items in other colls are ignored. Function\n;;    f should accept number-of-colls arguments. Returns a transducer when\n;;    no collection is provided.\n;;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.repl",
   :name "doc",
   :signature ["[name]"],
   :type "macro",
   :related ["cljs.repl/find-doc" "cljs.core/meta" "special/var"],
   :examples-strings
   [[["(doc map) ;; Prints: ;;  ------------------------- ;;  cljs.core/map ;;  [f coll] ;;    Returns a lazy sequence consisting of the result of applying f to ;;    the set of first items of each coll, followed by applying f to the ;;    set of second items in each coll, until any one of the colls is ;;    exhausted.  Any remaining items in other colls are ignored. Function ;;    f should accept number-of-colls arguments. Returns a transducer when ;;    no collection is provided. ;; ;;=> nil"]]],
   :description-html
   "<p>Prints documentation for the var or special form with the name <code>name</code>.</p>",
   :examples
   [{:id "4d2768",
     :content
     "```clj\n(doc map)\n;; Prints:\n;;  -------------------------\n;;  cljs.core/map\n;;  [f coll]\n;;    Returns a lazy sequence consisting of the result of applying f to\n;;    the set of first items of each coll, followed by applying f to the\n;;    set of second items in each coll, until any one of the colls is\n;;    exhausted.  Any remaining items in other colls are ignored. Function\n;;    f should accept number-of-colls arguments. Returns a transducer when\n;;    no collection is provided.\n;;\n;;=> nil\n```"}],
   :full-name "cljs.repl/doc",
   :docstring
   "Prints documentation for a var or special form given its name"},
  "vreset!"
  {:examples-htmls [],
   :ns "cljs.core",
   :name "vreset!",
   :signature ["[vol newval]"],
   :type "function",
   :related ["cljs.core/vswap!" "cljs.core/volatile!"],
   :examples-strings [],
   :description-html nil,
   :full-name "cljs.core/vreset!",
   :docstring
   "Sets the value of volatile to newval without regard for the\ncurrent value. Returns newval."},
  "EntriesIterator"
  {:ns "cljs.core",
   :name "EntriesIterator",
   :signature ["[s]"],
   :type "type",
   :full-name "cljs.core/EntriesIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reversible?"
  {:description
   "Returns true if `coll` implements the `IReversible` protocol, false otherwise.\n\nVectors, sorted maps, and sorted sets implement `IReversible`.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "reversible?",
   :signature ["[coll]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Returns true if <code>coll</code> implements the <code>IReversible</code> protocol, false otherwise.</p><p>Vectors, sorted maps, and sorted sets implement <code>IReversible</code>.</p>",
   :full-name "cljs.core/reversible?",
   :docstring "Returns true if coll satisfies? IReversible."},
  "left"
  {:ns "clojure.zip",
   :name "left",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/left",
   :docstring
   "Returns the loc of the left sibling of the node at this loc, or nil",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-env!"
  {:ns "cljs.test",
   :name "set-env!",
   :signature ["[new-env]"],
   :type "function",
   :full-name "cljs.test/set-env!",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "assert"
  {:description
   "Evaluates expression `expr` and throws an exception if it does not evaluate to\nlogical true.  Exception will include `message` if given.\n\nReturns `nil`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;assert true&#41;\n;;=&gt; nil\n\n&#40;assert false&#41;\n;;=&gt; Uncaught Error: Assert failed: false\n\n&#40;assert &#40;= 1 2&#41; &quot;1 is not 2&quot;&#41;\n;;=&gt; Uncaught Error: Assert failed: 1 is not 2\n;;   &#40;= 1 2&#41;\n</code></pre>"],
   :ns "cljs.core",
   :name "assert",
   :signature ["[expr]" "[expr message]"],
   :type "macro",
   :examples-strings
   [[["(assert true) ;;=> nil"
      "(assert false) ;;=> Uncaught Error: Assert failed: false"
      "(assert (= 1 2) \"1 is not 2\") ;;=> Uncaught Error: Assert failed: 1 is not 2 ;;   (= 1 2)"]]],
   :description-html
   "<p>Evaluates expression <code>expr</code> and throws an exception if it does not evaluate to logical true.  Exception will include <code>message</code> if given.</p><p>Returns <code>nil</code>.</p>",
   :examples
   [{:id "1dc16f",
     :content
     "```clj\n(assert true)\n;;=> nil\n\n(assert false)\n;;=> Uncaught Error: Assert failed: false\n\n(assert (= 1 2) \"1 is not 2\")\n;;=> Uncaught Error: Assert failed: 1 is not 2\n;;   (= 1 2)\n```"}],
   :full-name "cljs.core/assert",
   :docstring
   "Evaluates expr and throws an exception if it does not evaluate to\nlogical true."},
  "finally"
  {:description
   "`finally` should be the last form inside of a `try` expression. It is optional.\n\n`finally` clauses are always evaluated for their side effects whether there was\nan error or not, but they are never the return value of a `try` expression.",
   :examples-htmls [],
   :ns "special",
   :name "finally",
   :signature ["[expr*]"],
   :type "special form",
   :related ["special/try" "special/catch" "special/throw"],
   :examples-strings [],
   :description-html
   "<p><code>finally</code> should be the last form inside of a <code>try</code> expression. It is optional.</p><p><code>finally</code> clauses are always evaluated for their side effects whether there was an error or not, but they are never the return value of a <code>try</code> expression.</p>",
   :full-name "special/finally",
   :docstring
   "catch-clause => (catch classname name expr*)\nfinally-clause => (finally expr*)\nCatches and handles JavaScript exceptions."},
  "byte"
  {:ns "cljs.core",
   :name "byte",
   :signature ["[x]"],
   :type "function/macro",
   :full-name "cljs.core/byte",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "trimr"
  {:description "Removes whitespace from the right side of string.",
   :examples-htmls [],
   :ns "clojure.string",
   :name "trimr",
   :signature ["[s]"],
   :type "function",
   :examples-strings [],
   :description-html
   "<p>Removes whitespace from the right side of string.</p>",
   :full-name "clojure.string/trimr",
   :docstring "Removes whitespace from the right side of string."},
  "prefers"
  {:ns "cljs.core",
   :name "prefers",
   :signature ["[multifn]"],
   :type "function",
   :full-name "cljs.core/prefers",
   :docstring
   "Given a multimethod, returns a map of preferred value -> set of other values",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "special-doc-map"
  {:ns "cljs.repl",
   :name "special-doc-map",
   :type "var",
   :full-name "cljs.repl/special-doc-map",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "array-chunk"
  {:ns "cljs.core",
   :name "array-chunk",
   :signature ["[arr]" "[arr off]" "[arr off end]"],
   :type "function",
   :full-name "cljs.core/array-chunk",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "keep-indexed"
  {:description
   "Returns a lazy sequence of the non-nil results of `(f index item)`. Note, this\nmeans false return values will be included.\n\n`f` must be free of side-effects.\n\nReturns a stateful transducer when no collection is provided.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "keep-indexed",
   :signature ["[f]" "[f coll]"],
   :type "function",
   :related ["cljs.core/map-indexed" "cljs.core/keep"],
   :examples-strings [],
   :description-html
   "<p>Returns a lazy sequence of the non-nil results of <code>&#40;f index item&#41;</code>. Note, this means false return values will be included.</p><p><code>f</code> must be free of side-effects.</p><p>Returns a stateful transducer when no collection is provided.</p>",
   :full-name "cljs.core/keep-indexed",
   :docstring
   "Returns a lazy sequence of the non-nil results of (f index item). Note,\nthis means false return values will be included.  f must be free of\nside-effects.  Returns a stateful transducer when no collection is\nprovided."},
  "letfn"
  {:description
   "Takes a vector of function definitions `fnspecs` and binds the functions to\ntheir names. All of the names are available in all of the definitions of the\nfunctions as well as `body`.\n\n`fnspecs` must be a vector with an even number of forms. See `let`.\n\n`letfn` is a wrapper over one of ClojureScript's [special forms].\n\n[special forms]:http://clojure.org/special_forms",
   :examples-htmls [],
   :ns "cljs.core",
   :name "letfn",
   :signature ["[fnspecs & body]"],
   :type "macro",
   :related ["cljs.core/let"],
   :examples-strings [],
   :description-html
   "<p>Takes a vector of function definitions <code>fnspecs</code> and binds the functions to their names. All of the names are available in all of the definitions of the functions as well as <code>body</code>.</p><p><code>fnspecs</code> must be a vector with an even number of forms. See <code>let</code>.</p><p><code>letfn</code> is a wrapper over one of ClojureScript's [special forms].</p><p>[special forms]:http://clojure.org/special_forms</p>",
   :full-name "cljs.core/letfn",
   :docstring
   "fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)\n\nTakes a vector of function specs and a body, and generates a set of\nbindings of functions to their names. All of the names are available\nin all of the definitions of the functions, as well as the body."},
  "string-iter"
  {:ns "cljs.core",
   :name "string-iter",
   :signature ["[x]"],
   :type "function",
   :full-name "cljs.core/string-iter",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ArrayNodeIterator"
  {:ns "cljs.core",
   :name "ArrayNodeIterator",
   :signature ["[arr i next-iter]"],
   :type "type",
   :full-name "cljs.core/ArrayNodeIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "TransientHashSet"
  {:ns "cljs.core",
   :name "TransientHashSet",
   :signature ["[transient-map]"],
   :type "type",
   :full-name "cljs.core/TransientHashSet",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "simple-dispatch"
  {:ns "cljs.pprint",
   :name "simple-dispatch",
   :type "multimethod",
   :full-name "cljs.pprint/simple-dispatch",
   :docstring
   "The pretty print dispatch function for simple data structure format.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "output-unoptimized"
  {:ns "cljs.build.api",
   :name "output-unoptimized",
   :signature ["[opts & sources]"],
   :type "function",
   :full-name "cljs.build.api/output-unoptimized",
   :docstring
   "Ensure that all JavaScript source files are on disk (not in jars),\nwrite the goog deps file including only the libraries that are being\nused and write the deps file for the current project.\n\nThe deps file for the current project will include third-party\nlibraries.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "node"
  {:ns "clojure.zip",
   :name "node",
   :signature ["[loc]"],
   :type "function",
   :full-name "clojure.zip/node",
   :docstring "Returns the node at loc",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ArrayList"
  {:ns "cljs.core",
   :name "ArrayList",
   :signature ["[arr]"],
   :type "type",
   :full-name "cljs.core/ArrayList",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "test"
  {:ns "cljs.core",
   :name "test",
   :signature ["[v]"],
   :type "function",
   :full-name "cljs.core/test",
   :docstring
   "test [v] finds fn at key :test in var metadata and calls it,\npresuming failure will throw exception",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "stacktrace"
  {:ns "cljs.repl.rhino",
   :name "stacktrace",
   :type "multimethod",
   :full-name "cljs.repl.rhino/stacktrace",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IMapEntry"
  {:ns "cljs.core",
   :name "IMapEntry",
   :type "protocol",
   :full-name "cljs.core/IMapEntry",
   :docstring "Protocol for examining a map entry.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "UUID"
  {:description
   "A type representing a universally unique identifier ([UUID]).\n\nUse [doc:cljs.core/uuid] or [doc:syntax/uuid-literal] to create one.\n\n[UUID]:https://en.wikipedia.org/wiki/Universally_unique_identifier",
   :examples-htmls [],
   :ns "cljs.core",
   :name "UUID",
   :signature ["[uuid __hash]"],
   :type "type",
   :related
   ["syntax/uuid-literal" "cljs.core/random-uuid" "cljs.core/uuid"],
   :examples-strings [],
   :description-html
   "<p>A type representing a universally unique identifier ([UUID]).</p><p>Use [doc:cljs.core/uuid] or [doc:syntax/uuid-literal] to create one.</p><p>[UUID]:https://en.wikipedia.org/wiki/Universally<i>unique</i>identifier</p>",
   :full-name "cljs.core/UUID"},
  "DOMBuilder"
  {:ns "clojure.browser.dom",
   :name "DOMBuilder",
   :type "protocol",
   :full-name "clojure.browser.dom/DOMBuilder",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "read-response"
  {:ns "cljs.repl.node",
   :name "read-response",
   :signature ["[in]"],
   :type "function",
   :full-name "cljs.repl.node/read-response",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "format"
  {:ns "cljs.core",
   :name "format",
   :signature ["[fmt & args]"],
   :type "function",
   :full-name "cljs.core/format",
   :docstring "Formats a string using goog.string.format.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "key-test"
  {:ns "cljs.core",
   :name "key-test",
   :signature ["[key other]"],
   :type "function",
   :full-name "cljs.core/key-test",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ns"
  {:description
   "Sets the namespace of the file.\n\n`ns` must be the first form in a `.cljs` file and there can only be one `ns`\ndeclaration per file. Namespaces must match the file name of their respective\n`.cljs` files, with the exception that dashes in namespaces become underscores\nin filenames. Thus, `(ns foo.bar-biz.baz)` should be the first form in file\n`foo/bar_biz/baz.cljs`.\n\n`references` can be zero or more forms used to import other namespaces, symbols,\nand libraries into the current namespace.\n\n```clj\n(ns example.core\n\n  ;; for excluding clojure symbols\n  (:refer-clojure :exclude [])\n\n  ;; for importing goog classes and enums\n  (:import\n    lib.ns\n    [lib.ns Ctor*])\n\n  (:require-macros\n    [lib.ns :refer []\n            :as alias\n            :reload\n            :reload-all])\n\n  (:require\n    [lib.ns :refer []\n            :refer-macros []\n            :include-macros true|false\n            :as alias\n            :reload\n            :reload-all])\n\n  (:use\n    [lib.ns :only []\n            :reload\n            :reload-all])\n\n  (:use-macros\n    [lib.ns :only []\n            :reload\n            :reload-all]))\n```",
   :examples-htmls [],
   :ns "special",
   :name "ns",
   :signature ["[name & references]"],
   :type "special form",
   :related
   ["specialrepl/in-ns"
    "specialrepl/load-namespace"
    "specialrepl/import"
    "specialrepl/require"
    "specialrepl/require-macros"],
   :examples-strings [],
   :description-html
   "<p>Sets the namespace of the file.</p><p><code>ns</code> must be the first form in a <code>.cljs</code> file and there can only be one <code>ns</code> declaration per file. Namespaces must match the file name of their respective <code>.cljs</code> files, with the exception that dashes in namespaces become underscores in filenames. Thus, <code>&#40;ns foo.bar-biz.baz&#41;</code> should be the first form in file <code>foo/bar&#95;biz/baz.cljs</code>.</p><p><code>references</code> can be zero or more forms used to import other namespaces, symbols, and libraries into the current namespace.</p><pre><code class=\"clj\">&#40;ns example.core\n\n  ;; for excluding clojure symbols\n  &#40;:refer-clojure :exclude &#91;&#93;&#41;\n\n  ;; for importing goog classes and enums\n  &#40;:import\n    lib.ns\n    &#91;lib.ns Ctor&#42;&#93;&#41;\n\n  &#40;:require-macros\n    &#91;lib.ns :refer &#91;&#93;\n            :as alias\n            :reload\n            :reload-all&#93;&#41;\n\n  &#40;:require\n    &#91;lib.ns :refer &#91;&#93;\n            :refer-macros &#91;&#93;\n            :include-macros true|false\n            :as alias\n            :reload\n            :reload-all&#93;&#41;\n\n  &#40;:use\n    &#91;lib.ns :only &#91;&#93;\n            :reload\n            :reload-all&#93;&#41;\n\n  &#40;:use-macros\n    &#91;lib.ns :only &#91;&#93;\n            :reload\n            :reload-all&#93;&#41;&#41;\n</code></pre>",
   :full-name "special/ns",
   :docstring
   "You must currently use the ns form only with the following caveats\n\n  * You must use the :only form of :use\n  * :require supports :as and :refer\n    - both options can be skipped\n    - in this case a symbol can be used as a libspec directly\n      - that is, (:require lib.foo) and (:require [lib.foo]) are both\n        supported and mean the same thing\n    - prefix lists are not supported\n  * The only option for :refer-clojure is :exclude\n  * :import is available for importing Google Closure classes\n    - ClojureScript types and records should be brought in with :use\n      or :require :refer, not :import ed\n  * Macros are written in Clojure, and are referenced via the new\n    :require-macros / :use-macros options to ns\n    - :require-macros and :use-macros support the same forms that\n      :require and :use do\n\nImplicit macro loading: If a namespace is required or used, and that\nnamespace itself requires or uses macros from its own namespace, then\nthe macros will be implicitly required or used using the same\nspecifications. This oftentimes leads to simplified library usage,\nsuch that the consuming namespace need not be concerned about\nexplicitly distinguishing between whether certain vars are functions\nor macros.\n\nInline macro specification: As a convenience, :require can be given\neither :include-macros true or :refer-macros [syms...]. Both desugar\ninto forms which explicitly load the matching Clojure file containing\nmacros. (This works independently of whether the namespace being\nrequired internally requires or uses its own macros.) For example:\n\n(ns testme.core\n(:require [foo.core :as foo :refer [foo-fn] :include-macros true]\n          [woz.core :as woz :refer [woz-fn] :refer-macros [app jx]]))\n\nis sugar for\n\n(ns testme.core\n(:require [foo.core :as foo :refer [foo-fn]]\n          [woz.core :as woz :refer [woz-fn]])\n(:require-macros [foo.core :as foo]\n                 [woz.core :as woz :refer [app jx]]))"},
  "log-obj"
  {:ns "clojure.browser.dom",
   :name "log-obj",
   :signature ["[obj]"],
   :type "function",
   :full-name "clojure.browser.dom/log-obj",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "cl-format"
  {:ns "cljs.pprint",
   :name "cl-format",
   :signature ["[writer format-in & args]"],
   :type "function",
   :full-name "cljs.pprint/cl-format",
   :docstring
   "An implementation of a Common Lisp compatible format function. cl-format formats its\narguments to an output stream or string based on the format control string given. It\nsupports sophisticated formatting of structured data.\n\nWriter satisfies IWriter, true to output via *print-fn* or nil to output\nto a string, format-in is the format control string and the remaining arguments\nare the data to be formatted.\n\nThe format control string is a string to be output with embedded 'format directives'\ndescribing how to format the various arguments passed in.\n\nIf writer is nil, cl-format returns the formatted result string. Otherwise, cl-format\nreturns nil.\n\nFor example:\n (let [results [46 38 22]]\n        (cl-format true \"There ~[are~;is~:;are~]~:* ~d result~:p: ~{~d~^, ~}~%\"\n                   (count results) results))\n\nPrints via *print-fn*:\n There are 3 results: 46, 38, 22\n\nDetailed documentation on format control strings is available in the \"Common Lisp the\nLanguage, 2nd edition\", Chapter 22 (available online at:\nhttp://www.cs.cmu.edu/afs/cs.cmu.edu/project/ai-repository/ai/html/cltl/clm/node200.html#SECTION002633000000000000000)\nand in the Common Lisp HyperSpec at\nhttp://www.lispworks.com/documentation/HyperSpec/Body/22_c.htm",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentArrayMap.HASHMAP-THRESHOLD"
  {:ns "cljs.core",
   :name "PersistentArrayMap.HASHMAP-THRESHOLD",
   :type "var",
   :full-name "cljs.core/PersistentArrayMap.HASHMAP-THRESHOLD",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "reduced?"
  {:ns "cljs.core",
   :name "reduced?",
   :signature ["[r]"],
   :type "function",
   :full-name "cljs.core/reduced?",
   :docstring "Returns true if x is the result of a call to reduced",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ffirst"
  {:description "Same as `(first (first coll))`.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;ffirst &#91;&#91;1 2&#93; &#91;3 4&#93; &#91;5 6&#93;&#93;&#41;\n;;=&gt; 1\n</code></pre>"],
   :ns "cljs.core",
   :name "ffirst",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/first" "cljs.core/fnext" "cljs.core/nfirst"],
   :examples-strings [[["(ffirst [[1 2] [3 4] [5 6]]) ;;=> 1"]]],
   :description-html
   "<p>Same as <code>&#40;first &#40;first coll&#41;&#41;</code>.</p>",
   :examples
   [{:id "575ba2",
     :content "```clj\n(ffirst [[1 2] [3 4] [5 6]])\n;;=> 1\n```"}],
   :full-name "cljs.core/ffirst",
   :docstring "Same as (first (first x))"},
  "remove-all-methods"
  {:ns "cljs.core",
   :name "remove-all-methods",
   :signature ["[multifn]"],
   :type "function",
   :full-name "cljs.core/remove-all-methods",
   :docstring "Removes all of the methods of multimethod.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "flatmap"
  {:ns "cljs.core",
   :name "flatmap",
   :signature ["[f]" "[f coll]"],
   :type "function",
   :full-name "cljs.core/flatmap",
   :docstring
   "maps f over coll and concatenates the results.  Thus function f\nshould return a collection.  Returns a transducer when no collection\nis provided.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "pr-str*"
  {:ns "cljs.core",
   :name "pr-str*",
   :signature ["[obj]"],
   :type "function",
   :full-name "cljs.core/pr-str*",
   :docstring
   "Support so that collections can implement toString without\nloading all the printing machinery.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "first"
  {:description
   "Returns the first item in `coll` and calls `seq` on its argument.\n\nReturns nil when `coll` is nil.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;first &#91;1 2 3&#93;&#41;\n;;=&gt; 1\n\n&#40;first &#91;&#93;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "first",
   :signature ["[coll]"],
   :type "function",
   :related
   ["cljs.core/rest"
    "cljs.core/next"
    "cljs.core/nth"
    "cljs.core/second"
    "cljs.core/take"
    "cljs.core/ffirst"],
   :examples-strings
   [[["(first [1 2 3]) ;;=> 1" "(first []) ;;=> nil"]]],
   :description-html
   "<p>Returns the first item in <code>coll</code> and calls <code>seq</code> on its argument.</p><p>Returns nil when <code>coll</code> is nil.</p>",
   :examples
   [{:id "40e413",
     :content
     "```clj\n(first [1 2 3])\n;;=> 1\n\n(first [])\n;;=> nil\n```"}],
   :full-name "cljs.core/first",
   :docstring
   "Returns the first item in the collection. Calls seq on its\nargument. If coll is nil, returns nil."},
  "prim-seq"
  {:ns "cljs.core",
   :name "prim-seq",
   :signature ["[prim]" "[prim i]"],
   :type "function",
   :full-name "cljs.core/prim-seq",
   :docstring "Create seq from a primitive JavaScript Array-like.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Volatile"
  {:ns "cljs.core",
   :name "Volatile",
   :signature ["[state]"],
   :type "type",
   :related ["cljs.core/volatile!" "cljs.core/volatile?"],
   :full-name "cljs.core/Volatile",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IEncodeJS"
  {:ns "cljs.core",
   :name "IEncodeJS",
   :type "protocol",
   :full-name "cljs.core/IEncodeJS",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "Set"
  {:ns "cljs.core",
   :name "Set",
   :signature ["[meta hash-map]"],
   :type "type",
   :full-name "cljs.core/Set",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "val"
  {:description "Returns the value in the map entry.",
   :examples-htmls [],
   :ns "cljs.core",
   :name "val",
   :signature ["[map-entry]"],
   :type "function",
   :related ["cljs.core/vals"],
   :examples-strings [],
   :description-html "<p>Returns the value in the map entry.</p>",
   :full-name "cljs.core/val",
   :docstring "Returns the value in the map entry."},
  "ex-message"
  {:ns "cljs.core",
   :name "ex-message",
   :signature ["[ex]"],
   :type "function",
   :full-name "cljs.core/ex-message",
   :docstring
   "Alpha - subject to change.\nReturns the message attached to the given Error / ExceptionInfo object.\nFor non-Errors returns nil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "set-from-indexed-seq"
  {:ns "cljs.core",
   :name "set-from-indexed-seq",
   :signature ["[iseq]"],
   :type "function",
   :full-name "cljs.core/set-from-indexed-seq",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "deftype"
  {:ns "cljs.core",
   :name "deftype",
   :signature ["[t fields & impls]"],
   :type "macro",
   :full-name "cljs.core/deftype",
   :docstring
   "(deftype name [fields*]  options* specs*)\n\nCurrently there are no options.\n\nEach spec consists of a protocol or interface name followed by zero\nor more method bodies:\n\nprotocol-or-Object\n(methodName [args*] body)*\n\nThe type will have the (by default, immutable) fields named by\nfields, which can have type hints. Protocols and methods\nare optional. The only methods that can be supplied are those\ndeclared in the protocols/interfaces.  Note that method bodies are\nnot closures, the local environment includes only the named fields,\nand those fields can be accessed directly. Fields can be qualified\nwith the metadata :mutable true at which point (set! afield aval) will be\nsupported in method bodies. Note well that mutable fields are extremely\ndifficult to use correctly, and are present only to facilitate the building\nof higherlevel constructs, such as ClojureScript's reference types, in\nClojureScript itself. They are for experts only - if the semantics and\nimplications of :mutable are not immediately apparent to you, you should not\nbe using them.\n\nMethod definitions take the form:\n\n(methodname [args*] body)\n\nThe argument and return types can be hinted on the arg and\nmethodname symbols. If not supplied, they will be inferred, so type\nhints should be reserved for disambiguation.\n\nMethods should be supplied for all methods of the desired\nprotocol(s). You can also define overrides for methods of Object. Note that\na parameter must be supplied to correspond to the target object\n('this' in JavaScript parlance). Note also that recur calls to the method\nhead should *not* pass the target object, it will be supplied\nautomatically and can not be substituted.\n\nIn the method bodies, the (unqualified) name can be used to name the\nclass (for calls to new, instance? etc).\n\nOne constructor will be defined, taking the designated fields.  Note\nthat the field names __meta and __extmap are currently reserved and\nshould not be used when defining your own types.\n\nGiven (deftype TypeName ...), a factory function called ->TypeName\nwill be defined, taking positional parameters for the fields",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "defmacro"
  {:description
   "Defines a macro, which is essentially a function that runs at compile time.\nMacros can be used to define syntactic constructs which would require\nprimitives or built-in support in other languages.\n\nUsing macros is as easy as using functions, but writing them is a little more\ndifficult.  Also, creating macros is generally discouraged if you can\naccomplish the same goal with a function.\n\n## Rules and Details\n\nThere is a strict rule for when you can use `defmacro` -- you can only use it\nin what we call a _macro namespace_, effectively forcing you to separate your\ncompile time and runtime code.\n\nA side effect of this is that you cannot use `defmacro` from a REPL.  Sorry!\n\nThis strict rule is due to the nature of differing compile time environments\nfor the optimized \"ClojureScript JVM\" compiler and the newer bootstrapped\n\"ClojureScript JS\" compiler.\n\nIn order to create macros that are portable between either compiler version,\nyou must place macros in a `.cljc` file, but a `.clj` file is sufficient if no\n[reader conditionals][doc:syntax/cond] are needed.  Why would they be needed?\nBecause ClojureScript macro namespaces may be handed off to Clojure for\nevaluation, depending on the compiler version:\n\n| compiler version  | macro namespaces evaluated by |\n|-------------------|-------------------------------|\n| ClojureScript JVM | Clojure                       |\n| ClojureScript JS  | ClojureScript                 |\n\nPlease see the examples section below for a more concrete look.",
   :examples-htmls
   ["<p>Here is a <code>str-&gt;int</code> macro that works for either ClojureScript compiler version.  It simply expands to a <code>js/parseInt</code> call:</p><pre><code class=\"clj\">;; in macros.clj\n&#40;ns foo.macros&#41;\n\n;; expands to a runtime call\n&#40;defmacro str-&gt;int &#91;s&#93;\n  `&#40;js/parseInt s&#41;&#41;\n</code></pre><p>If we want to evaluate the conversion at <i>compile time</i> instead of expanding it to a runtime call, we must use reader conditionals (in a <code>.cljc</code> file) to choose the function appropriate for each compiler's evaluation environment.</p><pre><code class=\"clj\">;; in macros.cljc\n&#40;ns foo.macros&#41;\n\n;; expands to the result of the conversion\n&#40;defmacro str-&gt;int &#91;s&#93;\n  #?&#40;:clj  &#40;Integer/parseInt s&#41;\n     :cljs &#40;js/parseInt s&#41;&#41;&#41;\n</code></pre>"],
   :ns "cljs.core",
   :name "defmacro",
   :signature
   ["[name doc-string? attr-map? [params*] body]"
    "[name doc-string? attr-map? ([params*] body) + attr-map?]"],
   :type "macro",
   :related
   ["syntax/syntax-quote"
    "syntax/unquote"
    "cljs.core/macroexpand"
    "cljs.core/macroexpand-1"],
   :examples-strings
   [[[" ;; in macros.clj"
      "(ns foo.macros) ;; expands to a runtime call"
      "(defmacro str->int [s]"
      "  `(js/parseInt s))"]
     [" ;; in macros.cljc"
      "(ns foo.macros) ;; expands to the result of the conversion"
      "(defmacro str->int [s]"
      "  #?(:clj  (Integer/parseInt s)"
      "     :cljs (js/parseInt s)))"]]],
   :description-html
   "<p>Defines a macro, which is essentially a function that runs at compile time. Macros can be used to define syntactic constructs which would require primitives or built-in support in other languages.</p><p>Using macros is as easy as using functions, but writing them is a little more difficult.  Also, creating macros is generally discouraged if you can accomplish the same goal with a function.</p><h2>Rules and Details</h2><p>There is a strict rule for when you can use <code>defmacro</code> -- you can only use it in what we call a <i>macro namespace</i>, effectively forcing you to separate your compile time and runtime code.</p><p>A side effect of this is that you cannot use <code>defmacro</code> from a REPL.  Sorry!</p><p>This strict rule is due to the nature of differing compile time environments for the optimized \"ClojureScript JVM\" compiler and the newer bootstrapped \"ClojureScript JS\" compiler.</p><p>In order to create macros that are portable between either compiler version, you must place macros in a <code>.cljc</code> file, but a <code>.clj</code> file is sufficient if no [reader conditionals][doc:syntax/cond] are needed.  Why would they be needed? Because ClojureScript macro namespaces may be handed off to Clojure for evaluation, depending on the compiler version:</p><p>| compiler version  | macro namespaces evaluated by | |-------------------|-------------------------------| | ClojureScript JVM | Clojure                       | | ClojureScript JS  | ClojureScript                 |</p><p>Please see the examples section below for a more concrete look.</p>",
   :examples
   [{:id "8040c8",
     :content
     "Here is a `str->int` macro that works for either ClojureScript compiler\nversion.  It simply expands to a `js/parseInt` call:\n\n```clj\n;; in macros.clj\n(ns foo.macros)\n\n;; expands to a runtime call\n(defmacro str->int [s]\n  `(js/parseInt s))\n```\n\nIf we want to evaluate the conversion at _compile time_ instead of expanding it\nto a runtime call, we must use reader conditionals (in a `.cljc` file) to\nchoose the function appropriate for each compiler's evaluation environment.\n\n```clj\n;; in macros.cljc\n(ns foo.macros)\n\n;; expands to the result of the conversion\n(defmacro str->int [s]\n  #?(:clj  (Integer/parseInt s)\n     :cljs (js/parseInt s)))\n```"}],
   :full-name "cljs.core/defmacro",
   :docstring
   "Like defn, but the resulting function name is declared as a\nmacro and will be used as a macro by the compiler when it is\ncalled."},
  "IParseError"
  {:ns "cljs.repl",
   :name "IParseError",
   :type "protocol",
   :full-name "cljs.repl/IParseError",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "NodeIterator"
  {:ns "cljs.core",
   :name "NodeIterator",
   :signature ["[arr i next-entry next-iter]"],
   :type "type",
   :full-name "cljs.core/NodeIterator",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "special-symbols"
  {:ns "cljs.reader",
   :name "special-symbols",
   :signature ["[t not-found]"],
   :type "function",
   :full-name "cljs.reader/special-symbols",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "inc-report-counter!"
  {:ns "cljs.test",
   :name "inc-report-counter!",
   :signature ["[name]"],
   :type "function",
   :full-name "cljs.test/inc-report-counter!",
   :docstring
   "Increments the named counter in *report-counters*, a ref to a map.\nDoes nothing if *report-counters* is nil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ensure-element"
  {:ns "clojure.browser.dom",
   :name "ensure-element",
   :signature ["[e]"],
   :type "function",
   :full-name "clojure.browser.dom/ensure-element",
   :docstring "Coerce the argument to a dom element if possible.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "ex-data"
  {:ns "cljs.core",
   :name "ex-data",
   :signature ["[ex]"],
   :type "function",
   :full-name "cljs.core/ex-data",
   :docstring
   "Alpha - subject to change.\nReturns exception data (a map) if ex is an ExceptionInfo.\nOtherwise returns nil.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  ">"
  {:description
   "Returns true if each successive number argument is less than the previous\none, false otherwise.",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;&gt; 1 2&#41;\n;;=&gt; false\n\n&#40;&gt; 2 1&#41;\n;;=&gt; true\n\n&#40;&gt; 2 2&#41;\n;;=&gt; false\n\n&#40;&gt; 6 5 4 3 2&#41;\n;;=&gt; true\n</code></pre>"],
   :ns "cljs.core",
   :name ">",
   :signature ["[x]" "[x y]" "[x y & more]"],
   :type "function/macro",
   :related ["cljs.core/>="],
   :examples-strings
   [[["(> 1 2) ;;=> false"
      "(> 2 1) ;;=> true"
      "(> 2 2) ;;=> false"
      "(> 6 5 4 3 2) ;;=> true"]]],
   :description-html
   "<p>Returns true if each successive number argument is less than the previous one, false otherwise.</p>",
   :examples
   [{:id "67180c",
     :content
     "```clj\n(> 1 2)\n;;=> false\n\n(> 2 1)\n;;=> true\n\n(> 2 2)\n;;=> false\n\n(> 6 5 4 3 2)\n;;=> true\n```"}],
   :full-name "cljs.core/>",
   :docstring
   "Returns non-nil if nums are in monotonically decreasing order,\notherwise false."},
  "specify!"
  {:ns "cljs.core",
   :name "specify!",
   :signature ["[expr & impls]"],
   :type "macro",
   :full-name "cljs.core/specify!",
   :docstring "Identical to reify but mutates its first argument.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "PersistentHashMap.fromArrays"
  {:ns "cljs.core",
   :name "PersistentHashMap.fromArrays",
   :signature ["[ks vs]"],
   :type "function",
   :full-name "cljs.core/PersistentHashMap.fromArrays",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "validate-unicode-escape"
  {:ns "cljs.reader",
   :name "validate-unicode-escape",
   :signature ["[unicode-pattern reader escape-char unicode-str]"],
   :type "function",
   :full-name "cljs.reader/validate-unicode-escape",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "fnext"
  {:description "Same as `(first (next coll))`",
   :examples-htmls
   ["<pre><code class=\"clj\">&#40;fnext &#91;1 2 3&#93;&#41;\n;;=&gt; 2\n\n&#40;fnext &#91;1 2&#93;&#41;\n;;=&gt; 2\n\n&#40;fnext &#91;1&#93;&#41;\n;;=&gt; nil\n\n&#40;fnext &#91;&#93;&#41;\n;;=&gt; nil\n</code></pre>"],
   :ns "cljs.core",
   :name "fnext",
   :signature ["[coll]"],
   :type "function",
   :related ["cljs.core/ffirst" "cljs.core/second"],
   :examples-strings
   [[["(fnext [1 2 3]) ;;=> 2"
      "(fnext [1 2]) ;;=> 2"
      "(fnext [1]) ;;=> nil"
      "(fnext []) ;;=> nil"]]],
   :description-html
   "<p>Same as <code>&#40;first &#40;next coll&#41;&#41;</code></p>",
   :examples
   [{:id "92383f",
     :content
     "```clj\n(fnext [1 2 3])\n;;=> 2\n\n(fnext [1 2])\n;;=> 2\n\n(fnext [1])\n;;=> nil\n\n(fnext [])\n;;=> nil\n```"}],
   :full-name "cljs.core/fnext",
   :docstring "Same as (first (next x))"},
  "with-out-str"
  {:ns "cljs.core",
   :name "with-out-str",
   :signature ["[& body]"],
   :type "macro",
   :full-name "cljs.core/with-out-str",
   :docstring
   "Evaluates exprs in a context in which *print-fn* is bound to .append\non a fresh StringBuffer.  Returns the string created by any nested\nprinting calls.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []},
  "IAsyncTest"
  {:ns "cljs.test",
   :name "IAsyncTest",
   :type "protocol",
   :full-name "cljs.test/IAsyncTest",
   :docstring
   "Marker protocol denoting CPS function to begin asynchronous\n  testing.",
   :description-html nil,
   :examples-strings [],
   :examples-htmls []}},
 :release
 {:gclosure-lib "0.0-20150805-acd8b553",
  :cljs-version "1.7.145",
  :treader-version "0.10.0-alpha3",
  :cljs-date "2015-10-13",
  :clj-version "1.7.0"}}
)