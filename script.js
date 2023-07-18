var strStr = function(haystack, needle) {
    if(needle.length > haystack.length) return -1;

    let i = 0;
    let k = needle.length;
    let length = haystack.length;
    console.log(needle.includes(haystack.substring(i, k)));

    while(k <= length) {
        if(k <= length && needle.includes(haystack.substring(i, k))) {
            console.log(i);
        } 
        i++;
        k++;
    } return -1;
};

console.log(strStr("mississippi", "issip"));