/**
 * Problem Link : https://leetcode.com/problems/product-sales-analysis-i/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

#include <bits/stdc++.h>
using namespace std;

select P.product_name, S.year, S.price from Sales S inner join Product P
ON S.product_id = P.product_id
