if (doc.containsKey('popularity')) { 
  return _score * log10(doc['popularity'].value +1)
} else {
  return _score
}