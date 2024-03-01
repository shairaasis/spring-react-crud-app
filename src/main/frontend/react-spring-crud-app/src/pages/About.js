import React, { useEffect, useState } from 'react';
import axios from 'axios';

export function AboutPage() {
  const [pageContent, setPageContent] = useState('');



  useEffect(() => {
    loadAbout();
  }, []);

  const loadAbout = async () => {
    const result = await axios.get(`http://localhost:8080/about`, {
 
    });
    setPageContent(result.data);
  };

  return (
    <><div dangerouslySetInnerHTML={{ __html: pageContent }} /><div><h1>Heloo</h1></div></>
  );
}

export default AboutPage;
