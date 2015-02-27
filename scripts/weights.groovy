if (doc.containsKey('_type')) {
  type=doc['_type'].value;
  return ( type in weights ) ? _score * weights[ type ] : _score 
} else { 
  return _score
}