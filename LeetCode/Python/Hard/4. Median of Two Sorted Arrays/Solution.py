class Solution(object):
    def findMedianSortedArrays(self, n1, n2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        
        l1=len(n1)
        l2=len(n2)
        l1i=0
        l2i=0
        l=l1+l2
        a=[0]*l
        i=0
        while i<l and l1i<l1 and l2i<l2:
            if n1[l1i]<=n2[l2i]:
                a[i]=n1[l1i]
                l1i+=1
            elif n2[l2i]<n1[l1i]:
                a[i]=n2[l2i]
                l2i+=1
            i+=1
        
        if l1i==l1:
            while l2i <l2:
                a[i]=n2[l2i]
                i+=1
                l2i+=1
        elif l2i==l2:
            while l1i <l1:
                a[i]=n1[l1i]
                i+=1
                l1i+=1
        b=0
        
        if l%2==0:
            j=l/2
            b=a[j-1]+a[j]
            b/=2.0
            return b
        elif l%2!=0:
            j=l/2
            print(2)
            return a[j]

         
            



        