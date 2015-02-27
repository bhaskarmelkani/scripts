if (doc.containsKey('population')) { 
  return _score * log10(doc['population'].value +1)
} else {
  return _score
}