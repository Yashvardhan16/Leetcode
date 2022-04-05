# Lowest Common Ancestor in a Binary Tree
## Medium 
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">Given a Binary Tree with all <strong>unique</strong> values and two nodes value,&nbsp;<strong>n1</strong> and <strong>n2</strong>. The task is to find the<strong>&nbsp;lowest common ancestor</strong> of the given two nodes. We may assume that either both n1 and n2 are present in the tree or none of them are&nbsp;present. </span></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n1 = 2 , n2 = 3  
&nbsp;      1 
&nbsp;     / \ 
&nbsp;    2   3
<strong>Output: </strong><span style="font-family:arial,helvetica,sans-serif">1
</span><strong>Explanation:
</strong></span><span style="font-size:18px">LCA of 2 and 3 is 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n1 = 3 , n2 = 4
           5    
      &nbsp;   /    
      &nbsp;  2  
      &nbsp; / \  
      &nbsp;3   4
<strong>Output: </strong><span style="font-family:arial,helvetica,sans-serif">2
</span><strong>Explanation:
</strong>LCA of 3 and 4 is 2.<strong> </strong></span></pre>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Your Task:</strong><br>
You don't have to read, input, or print anything. Your task is to complete the function <strong>lca()&nbsp;</strong>that takes nodes, <strong>n1, and n2</strong> as parameters and returns the&nbsp;<strong>LCA </strong>node as output. Otherwise, return a node with a value of&nbsp;<strong>-1</strong> if both <strong>n1 </strong>and <strong>n2 </strong>are not present in the tree.</span></span></p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Expected Time Complexity:</strong>O(N).<br>
<strong>Expected Auxiliary Space:</strong>O(Height of Tree).</span></span></p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Constraints:</strong><br>
1 ≤ Number of nodes ≤ 10<sup>5</sup><br>
1 ≤ Data of a node ≤ 10<sup>5</sup></span></span></p>
 <p></p>
            </div>