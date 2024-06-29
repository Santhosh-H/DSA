<h2><a href="https://www.geeksforgeeks.org/problems/remaining-string3515/1">Remaining String</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a string <strong>s</strong> without spaces, a character <strong>ch</strong>, and an integer&nbsp;<strong>count</strong>, the task is to find the string after the specified character has occurred count number of times.<br><strong>Note:&nbsp;</strong> Assume upper case and lower case alphabets are different. “Empty string” should be returned in case of any unsatisfying conditions (Given character is not present, or present but less than given count, or given count completes on the last index). If the given count is 0, then the given character doesn’t matter, just return the whole string.<br></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "Thisisdemostring", ch = 'i', count = 3
<strong>Output:</strong> ng
<strong>Explanation: </strong>Substring of S after the 3rd
occurrence of 'i' is "ng"</span><br><span style="font-size: 18px;"><strong>Input: </strong>s = "Thisisdemostri", ch = 'i', count = 3
<strong>Output: </strong>Empty string
<strong>Explanation:</strong> 'i' occurce 3rd time at 
last index
</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(|s|)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(1)<br></span><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= |s| &lt;= 10<sup>5</sup><br>1&lt;=count&lt;=s.length()</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Zoho</code>&nbsp;<code>Oracle</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;