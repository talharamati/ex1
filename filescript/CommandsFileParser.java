package filescript;

import java.util.ArrayList;

/**
 * This class gets a path to commands text file, opens and parses it.
 * Finally it returns a sections list
 * @author ab
 *
 */
public class CommandsFileParser {

	// define instance variables
	private ArrayList<Section> sections;
	
	/**
	 * 
	 * @param commandFile
	 */
	public CommandsFileParser(String commandFile) {
		// init variables
		sections = new ArrayList<Section>();
		
		// open file
		
		// read lines
		
	}
	
	public ArrayList<Section> getSections() {
		return sections;
	}
	
	/*

try 2 (good!)
================
read_sections(lines)
  sections = array()
  i = 0
  subsection = null
  while i<n
    line = lines[i]
    if UPPERCASE(line) is ('FILTER'/'ACTION'/'ORDER')
      subsection = change_subsection (subsection, sections, line)
    else
      add_line (subsection, sections, line)
  validate_commands(sections)


validate_commands(sections)
  for each section
    if section['filters'].length=0
      error
    if section['actions'].length=0
      error


add_line (subsection, sections, line)
  if sections.length=0
    // no sections - hence first line is a comment
    throw...

  section = sections[sections.length-1]

  if line is comment
    section['comments'][subsection].append(line)
  else
    switch subsection
      case FILTER
        basic_filters = line.split(' ')
        for each basic_filter
          check_basic_filter_validity(basic_filter)
        section['filters'].append(basic_filters)
        break
      case ACTION
        check_action_validity(line)
        section['actions'].append(line)
        break
      case ORDER
        if section['order'] != null
          error
        check_order_validity(line)
        section['order'] = line
        break


change_subsection (String prevSubSection, SectionsList sections, String line)
  current = sections.length-1
  switch line:
    case FILTER
      if prevSubSection == filter // is not - null / order / action
        error
      // check validity of last section
      if (num of filters)=0
        error
      if (num of actions)=0
        error
      if ()
      // create new section
      sections[++current] = array()
      sections[current]['filters'] = array()
      sections[current]['actions'] = array()
      sections[current]['order'] = (DEFAULT)
      sections[current]['comments'] = array()
      sections[current]['comments']['filters'] = array()
      sections[current]['comments']['actions'] = array()
      sections[current]['comments']['order'] = array()
      break
    case ACTION
      if prevSubSection != filter
        error
      break
    case ORDER
      if prevSubSection != action
        error
      break
    default
      error
  return line

	 */
}
