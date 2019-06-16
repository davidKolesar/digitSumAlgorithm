
/*
 *
 * Consider problem and solution explanation at : https://math.stackexchange.com/questions/3256551/algorithm-for-evaluating-a-sequence-while-removing-from-that-sequence/3256564%233256564
 *
 * Since we know : sumOfAllNumbers * i = sum - sumOfAllNumbers - i
 * If we add 'sumOfAllNumbers' to both sides :  sumOfAllNumbers * i + sumOfAllNumbers = sum - i
 * Simplify each side: sumOfAllNumbers * i + sumOfAllNumbers * 1
 * Simply further :  sumOfAllNumbers(i+1)
 * divide both sides by i+1 : sumOfAllNumbers = (sum-i) / (i+1)
 *
 * Consider problem and solution explanation at : https://math.stackexchange.com/questions/3256551/algorithm-for-evaluating-a-sequence-while-removing-from-that-sequence/3256564%233256564
 */     
function removeNb (n) {
    // get sum of all numbers in list
    var sumOfAllNumbers =  (n*(n+1))/2;
    var retVal = [];

		for(var numberToCompare = n; numberToCompare > 0; numberToCompare--) {
		  var secondNumberToCompare = (sumOfAllNumbers -  numberToCompare) / (numberToCompare + 1 );
			  if (secondNumberToCompare < n && Number.isInteger(secondNumberToCompare) ){
				retVal.push([secondNumberToCompare, numberToCompare]);
			  }
		}
	return retVal;
}
