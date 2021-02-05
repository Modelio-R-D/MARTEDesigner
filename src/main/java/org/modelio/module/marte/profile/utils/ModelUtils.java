package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.editors.ErrorMessageBox;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Provides some functions to add, set and search model elements.
 * @author ehouziaux
 */
@objid ("c6f3f32f-5973-415d-8297-f518920e94bd")
public class ModelUtils {
    @objid ("0df518ea-b604-4a11-9ff8-6129b144809b")
    private static String namespacingSeparator = "::";

    @objid ("af505d39-5e24-41d9-9fde-5729ca5b1eb6")
    private static String add = org.modelio.module.marte.i18n.I18nMessageService.getString("Ui.Add");

    @objid ("cfd80b8d-5fa1-483e-95dd-29b827436355")
    private static String remove = org.modelio.module.marte.i18n.I18nMessageService.getString("Ui.Remove");

    @objid ("0f7416fc-6755-4afd-a2cb-79a087461c46")
    private static final String valueSeparator = ",";

    @objid ("7d44092f-2716-4094-aa8d-a3b6d4f90c8a")
    public static Stereotype getStereotype(IMetamodelExtensions extensions, Class<? extends Element> metaclass, String sterotypeName) {
        return extensions.getStereotype(IMARTEDesignerPeerModule.MODULE_NAME, sterotypeName, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(metaclass));
    }

    /**
     * Adds a new stereotype to the this.element.
     */
    @objid ("ac4b5065-06ed-4a53-a45b-6cccf1fc2121")
    public static void setStereotype(final ModelElement element, final String stereotype) {
        // the stereotype is created here



        try ( ITransaction tr = MARTEModule.getInstance().getModuleContext().getModelingSession().createTransaction("setStereotype")){

            // element stereotypes
            List<Stereotype> exist = new ArrayList<>();

            // for each element stereotypes
            for(Stereotype my_ster : element.getExtension()){
                // the stereotype is added to the existing list
                exist.add(my_ster);
                // the stereotype is deleted to the element
                element.getExtension().remove(my_ster);
            }

            // new stereotype creating
            Stereotype ster = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getStereotype(IMARTEDesignerPeerModule.MODULE_NAME, stereotype, element.getMClass());

            // new stereotype adding
            element.getExtension().add(ster);

            // all stereotypes adding
            for(Stereotype my_ster : exist){
                element.getExtension().add(my_ster);
            }
            tr.commit();

        }
    }

    /**
     * Allows the tagged value getting
     *
     * @param tagtypeName : tagged value name
     * @param element : owner element
     * @return the tagged value values in a string form
     */
    @objid ("d25d4d90-a97d-40d0-be37-d1faaa08eeaa")
    public static List<String> getTaggedValues(final String tagtypeName, final ModelElement element) {
        List<String> result = new ArrayList<>();
        for (TaggedValue tag : element.getTag()) {
            TagType type = tag.getDefinition();
            String tagname = type.getName();
            if (tagname.equals(tagtypeName)) {
                if (!tag.getActual().isEmpty()) {

                    for (TagParameter tp : tag.getActual()) {
                        result.add(tp.getValue());
                    }

                }
            }
        }
        return result;
    }

    @objid ("6ef49bc5-dee9-419f-85ca-ae202afc4b8f")
    public static List<Element> getTargetElements(final ModelElement source, final String linkStereotype) {
        List<Element> result = new ArrayList<>();

        // dependency adding
        for (Dependency dependency : source.getDependsOnDependency()){
            if (dependency.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkStereotype))
                result.add(dependency.getDependsOn());
        }
        return result;
    }

    @objid ("ff2bd1de-c8f1-4573-a717-6de2fd59d051")
    public static List<Element> getSourceElements(final ModelElement source, final String linkStereotype) {
        List<Element> result = new ArrayList<>();

        // dependency adding
        for (Dependency dependency : source.getImpactedDependency()){
            if (dependency.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkStereotype))
                result.add(dependency.getImpacted());
        }
        return result;
    }

    @objid ("f439b3df-d0ac-4fe3-8449-b5fff14dda26")
    public static List<Element> getRelatedElements(final ModelElement source, final String linkStereotype) {
        List<Element> result = new ArrayList<>();

        // dependency adding
        for (Dependency dependency : source.getImpactedDependency()){
            if (dependency.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkStereotype))
                result.add(dependency.getImpacted());
        }

        for (Dependency dependency : source.getDependsOnDependency()){
            if ((dependency.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkStereotype)) && !(result.contains(dependency)))
                result.add(dependency.getDependsOn());
        }
        return result;
    }

    /**
     * Allows the tagged value adding.
     * @param name : tagged value name
     * @param values : values to add
     *
     * @param element : owner element
     */
    @objid ("3e98219e-60c7-4f62-b767-7abeeff70721")
    public static void addStringValue(final ModelElement element, final String tagtypeName, final String value) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        TaggedValue tvFound = null;

        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {

                TagType type = tag.getDefinition();
                String tagname = type.getName();

                if (tagname.equals(tagtypeName)) {
                    exist = true;
                    tvFound = tag;
                }
            }
        }

        // if the tagged value doesn't exist yet, we create this
        if (!exist) {

            TaggedValue v;
            try {
                v = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, tagtypeName, element);
                if (!v.getDefinition().getParamNumber().equals("0")) {
                    setTaggedValue(element, tagtypeName, value);
                }

            } catch (ExtensionNotFoundException e) {
                MARTEModule.getInstance().getModuleContext().getLogService().error(e);
            }


        }
        // if the tagged value already exists
        else {
            if (tvFound.getDefinition().getParamNumber().equals("0")) {
                tvFound.delete();
            }
            else {
                setTaggedValue(element, tagtypeName, value);
            }
        }
    }

    /**
     * Allows the tagged value getting
     *
     * @param tagtypeName : tagged value name
     * @param element : owner element
     * @return the tagged value values in a string form
     */
    @objid ("e375d147-ba54-4e32-aa9d-9fb2bb74eb1a")
    public static String getTaggedValue(final String tagtypeName, final ModelElement element) {
        for (TaggedValue tag : element.getTag()) {
            TagType type = tag.getDefinition();
            String tagname = type.getName();
            if (tagname.equals(tagtypeName)) {
                if (!tag.getActual().isEmpty()) {
                    String result = "";
                    for (TagParameter tp:tag.getActual()) {
                        if (tag.getDefinition().getParamNumber().equals("1")) {

                            result = tp.getValue();
                        }
                        else {
                            result = result + tp.getValue() + " ";
                        }
                    }
                    return result;
                }
            }
        }
        return "";
    }

    /**
     * Allows the tagged value adding.
     *
     * @param element : owner elements
     * @param tagtypeName : tagged value name
     * @param values : string tab to add as the tagged parameters
     */
    @objid ("6611c59f-71b1-4b2e-b36b-f38ed0921c54")
    public static void addMultipleStringValue(final ModelElement element, final String tagtypeName, final String[] values) {
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        TaggedValue tvFound = null;

        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {

                TagType type = tag.getDefinition();
                String tagname = type.getName();

                if (tagname.equals(tagtypeName)) {
                    exist = true;
                    // Modelio.out.println("tvFound FOUND");
                    tvFound = tag;
                }
            }
        }
        // if the tagged value doesn't exist yet, we create this
        if (!exist) {

            //Modelio.out.println("tvFound don't exist");

            TaggedValue v;
            try {
                v = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, tagtypeName, element);
                if (!v.getDefinition().getParamNumber().equals("0")) {
                    setTaggedValue(element, tagtypeName, values);
                }

            } catch (ExtensionNotFoundException e) {
                MARTEModule.getInstance().getModuleContext().getLogService().error(e);
            }


        }
        // if the tagged value already exists
        else {
            if (tvFound.getDefinition().getParamNumber().equals("0")) {
                //Modelio.out.println("tvFound.getDefinition().getParamNumber().equals(0), the tv is deleted");
                tvFound.delete();
            }
            else {
                setTaggedValue(element, tagtypeName, values);
            }
        }
    }

    /**
     * Allows the tagged value presence detecting
     * @param tagtype ; tagged value name
     *
     * @param _element : owner element
     * @return true if the tagged value exists false else
     */
    @objid ("3e8c31d4-40dd-4cd5-b71f-27f37b317a46")
    public static boolean hasTaggedValue(final String tagtypeName, final ModelElement _element) {
        List<TaggedValue> tagElements = _element.getTag();
        for (TaggedValue tag : tagElements){
            TagType type = tag.getDefinition();
            String tagname = type.getName();
            if (tagname.equals(tagtypeName)) {
                return true;
            }

        }
        return false;
    }

    /**
     * Allows to attach an Link between two IInstances
     *
     * @param link : the Link which will be attached
     * @param source : the first ObIntance related to the link
     * @param destination : the second ObIntance related to the link
     */
    @objid ("23c7c56d-590a-4f3b-b1ed-e1de6d7e0340")
    public static void attachLink(final Link link, final Instance source, final Instance destination) {
        LinkEnd sourceEnd = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLinkEnd();
        sourceEnd.setSource(source);
        sourceEnd.setLink(link);

        LinkEnd destinationEnd = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLinkEnd();
        destinationEnd.setTarget(destination);
        destinationEnd.setLink(link);
    }

    /**
     * Allows to attach an Connector between two IInstances
     *
     * @param connector : the Connector which will be attached
     * @param source : the first ObIntance related to the connector
     * @param destination : the second ObIntance related to the connector
     */
    @objid ("c2723fd2-3ba6-4f75-8cca-07b2816b9f41")
    public static void attachConnector(final Connector connector, final Instance source, final Instance destination) {
        ConnectorEnd sourceEnd = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        sourceEnd.setSource(source);
        sourceEnd.setLink(connector);

        ConnectorEnd destinationEnd = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        destinationEnd.setTarget(destination);
        destinationEnd.setLink(connector);
    }

    /**
     * Allows to attach an Association between two classifier
     *
     * @param assoc : association element to be attached
     * @param classA : first classifier owning the association element
     * @param classB : second classifier owning the association element
     */
    @objid ("8dc6f746-8ccb-439d-aec7-a79438313ade")
    public static void attachAssociation(final Association assoc, final Classifier classA, final Classifier classB) {
        AssociationEnd sourceEnd = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        sourceEnd.setSource(classA);
        sourceEnd.setAssociation(assoc);

        AssociationEnd destinationEnd = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        destinationEnd.setTarget(classB);
        destinationEnd.setAssociation(assoc);
    }

    /**
     * Allows the tagged value setting
     *
     * @param elt : owner element
     * @param tagtypeName : name of the tagtype
     * @param value : taggeValue value
     */
    @objid ("1796f882-ad98-47c1-aae9-7afa6c10e72e")
    public static void setTaggedValue(final ModelElement elt, final String tagtypeName, final String value) {
        // if the element has tagged values
        if (!elt.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : elt.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(tagtypeName)) {
                    // if the parameter number is one
                    if (tag.getDefinition().getParamNumber().equals("1")) {
                        if(tag.getActual().size() != 0) {
                            tag.getActual().get(0).setValue(value);
                        }
                        else {
                            tag.getActual().add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(value, tag));
                        }
                    }
                    //if the parameter number is multiple
                    else if (tag.getDefinition().getParamNumber().equals("*")) {

                        // string transformation to string tab
                        String[] tabValues = parseValuesToStringTab(value);

                        // array List<MObject> for the news tag parameters
                        List<TagParameter> listTagParam = new ArrayList<>();

                        // old tag parameters deleting
                        Iterator<TagParameter> itr = listTagParam.iterator();
                        while (itr.hasNext())
                        {
                            itr.next();
                            itr.remove();
                        }

                        // new List<MObject> creating
                        for (String s:tabValues) {
                            listTagParam.add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(s+" ", tag));
                        }

                        // new tag parameters adding
                        for (TagParameter tpl:listTagParam) {
                            tag.getActual().add(tpl);
                        }
                    }
                    else {
                        // else, the parameter number is another number, 2, 3 4 etc.

                        int nbParam = Integer.parseInt(tag.getDefinition().getParamNumber());

                        // string transformation to string tab
                        String[] tabValues = parseValuesToStringTab(value);

                        /* if (tabValues.length > nbParam) {
                                //JOptionPane.showMessageDialog(null,  "You have too many parameter numbers, only "+tag.getDefinition().getParamNumber()+" has been set.", "Too many parameter numbers", JOptionPane.ERROR_MESSAGE);
                                //MessageDialog.openError(null, "Too many parameter numbers", "You have too many parameter numbers, only "+tag.getDefinition().getParamNumber()+" has been set.");
                                //MARTEFrame.marteShowMessageDialog(null, "Too many parameter numbers", "You have too many parameter numbers, only "+tag.getDefinition().getParamNumber()+" has been set.", JOptionPane.ERROR_MESSAGE);
                                MARTEFrame f = new MARTEFrame("You have to enter integers.");
                                f.show();

                            }*/
                        // array List<MObject> for the news tag parameters
                        List<TagParameter> listTagParam = new ArrayList<>();

                        // old tag parameters deleting
                        Iterator<TagParameter> itr = listTagParam.iterator();
                        while (itr.hasNext())
                        {
                            itr.next();
                            itr.remove();
                        }

                        // new List<MObject> creating
                        for (int i = 0; i <tabValues.length;i++) {
                            if (i<nbParam) {
                                listTagParam.add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(tabValues[i]+" ", tag));
                            }
                        }

                        // new tag parameters adding
                        for (TagParameter tpl:listTagParam) {
                            tag.getActual().add(tpl);
                        }
                    }
                }
            }
        }
        else {
            MARTEModule.getInstance().getModuleContext().getLogService().error("-- Internal ERROR -- The tag parameters List<MObject> is empty");
        }
    }

    /**
     * Allows the element searching by extended class
     *
     * @return a ListUtils object with the found elements
     */
    @objid ("38b50ad2-a14c-4aa8-b5df-1c607a48eba6")
    @SuppressWarnings("unchecked")
    public static ListUtils searchElementList(final Class<? extends MObject> extendedClass) {
        // attribut
        ListUtils result;

        // dynamic elements List<MObject> creating
        List<ModelElement> listElements = (List<ModelElement>)((Object) MARTEModule.getInstance().getModuleContext().getModelingSession().findByClass(extendedClass));

        // arraylists creating (names + elements)
        ArrayList<String> listEltName = new ArrayList<>();
        List<ModelElement> listElement2 = new ArrayList<>();

        // arraylists initialization
        for (ModelElement elt : listElements) {
            listEltName.add(((ModelElement)elt.getCompositionOwner()).getName()
                    + namespacingSeparator + elt.getName());
            listElement2.add(elt);
        }

        // name List<MObject> converting
        String[] listString = listEltName.toArray(new String[listEltName.size()]);

        // result initialization
        if (listElement2.size() != 0) {
            result = new ListUtils(listString, listElement2);
        }
        else {
            result = new ListUtils();
        }
        return result;
    }

    /**
     * Allows the element searching by extended class and with the parent "parent"
     *
     * @return a ListUtils object with the found elements which have the parent like owner element
     */
    @objid ("e30d0a82-c576-4dda-b20d-8e3271ec6d8d")
    @SuppressWarnings("unchecked")
    public static List<ModelElement> searchElement(final Class<? extends MObject> extendedClass, final ModelElement parent) {
        // dynamic elements List<MObject> creating
        List<ModelElement> listElements = (List<ModelElement>)((Object) MARTEModule.getInstance().getModuleContext().getModelingSession().findByClass(extendedClass));

        List<ModelElement> result = new ArrayList<>();

        // arraylists initialization
        for (ModelElement elt : listElements) {
            if (elt.getCompositionOwner().equals(parent)) {
                result.add(elt);
            }
        }
        return result;
    }

    /**
     * Allows a string tab creating. The string tab element has this form : parentName::elementName
     *
     * @return a string tab
     */
    @objid ("964a5d3f-d45f-43fc-8e6e-0e36b942c3b2")
    public static String[] createListString(final List<ModelElement> listElement) {
        List<String> listEltName = new ArrayList<>();
        listEltName.add("");

        for (ModelElement elt: listElement) {
            listEltName.add(getMARTEName(elt));
        }

        Collections.sort(listEltName);
        String[] result = (String[])listEltName.toArray(new String[listEltName.size()]);
        return result;
    }

    /**
     * Allows to verify if the string "string" is present in the string tab "listString"
     *
     * @return a boolean which gives the string presence
     */
    @objid ("fbd1b291-d40e-4f9f-8048-01e31b5f5240")
    public static boolean existYet(final String[] listString, final String string) {
        for (String s : listString) {
            if (s.equals(string)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts the number of element with the extended class "extendedClass" and the stereotype "stereotype" in all the model
     *
     * @param extendedClass : Element extended class
     * @param stereotype : Element stereotype
     * @return an integer which represents the number of element with the extended class "extendedClass" and the stereotype "stereotype" in all model
     */
    @objid ("0a5b06bc-1a87-4609-a6d0-0e4b112f1ece")
    @SuppressWarnings("unchecked")
    public static int getNbElement(final Class<? extends MObject> extendedClass, final String stereotype) {
        int result = 0;
        List<ModelElement> listElements = (List<ModelElement>)((Object) MARTEModule.getInstance().getModuleContext().getModelingSession().findByClass(extendedClass));

        for (ModelElement elt : listElements) {
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotype)) {
                result+= 1;
            }
        }
        return result;
    }

    /**
     * Returns the "MARTE" name
     *
     * @param elt : the element
     * @return String : the marte name of the this.element.
     */
    @objid ("5f50cd7b-a92a-4b32-8470-21d5b9d806fc")
    public static String getMARTEName(final ModelElement elt) {
        String result = elt.getName();
        MObject owner = elt.getCompositionOwner();
        if (owner instanceof ModelElement){
            result = ((ModelElement) owner).getName() + namespacingSeparator + result;
        }
        return result;
    }

    /**
     * Allows the string tab with the "add" or "remove" prefix creating
     * @param List<MObject> : Model elements list
     *
     * @param listElt : Elements List<MObject> already depends on the element
     * @return a string tab with the "add" or "remove" prefix
     */
    @objid ("e1ddc833-47d5-478d-a062-98b60722bb45")
    public static String[] createListAddRemove(final List<ModelElement> listElt, final ListUtils list) {
        List<ModelElement> listEltModel = list.getListElement();
        List<String> eltPresent = new ArrayList<>();
        List<String> eltMissing = new ArrayList<>();


        // present and missing elements separation
        for (int i=0; i < listEltModel.size(); i++) {
            ModelElement o = listEltModel.get(i);
            if (listElt.contains(o)) {
                eltPresent.add("remove " +o.getName());
                list.getListString()[i] = "remove " +o.getName();
            }
            else {
                eltMissing.add("add "+o.getName());
                list.getListString()[i] = "add "+o.getName();
            }
        }

        // global List<MObject> creating
        List<String> allElt = new ArrayList<>(eltPresent);
        allElt.addAll(eltMissing);

        // final string List<MObject> creating
        String[] result = allElt.toArray(new String[allElt.size()]);
        return result;
    }

        /**
         * Gets all target dependency name.
         * @param element is the owner this.element.
         * @param stereotype is the dependency stereotype name.
         * @return a String with the dependency name.
         */
        @objid ("db94fad2-47a3-4529-8b50-0781a81402cc")
        public static String getTargetDependencyName(final String stereotype, final ModelElement element) {
            String result = "";
            ModelElement o = LinkManager.getTarget(element, stereotype);
            if (o != null)
                return getMARTEName(o);
            return result;
        }


    /**
     * Gets all target dependency names.
     *
     * @param stereotype is the dependency stereotype name.
     * @param element is the owner this.element.
     * @return a String with all dependency names.
     */
    @objid ("103e6577-1daa-4164-b218-b400d5b3729b")
    public static String getTargetDependencyNames(final String stereotype, final ModelElement element) {
        String result = "";
        List<ModelElement> targets = LinkManager.getAllTargets(element, stereotype);
        if (targets.size() > 0){
            for (int i = 0; i< targets.size() - 1 ; i++){
                result += getMARTEName(targets.get(i)) + valueSeparator + " " ;
            }
            result += getMARTEName(targets.get(targets.size() -1));
        }
        return result;
    }

    /**
     * Gets all target dependency names.
     *
     * @param stereotype is the dependency stereotype.
     * @param element is the owner this.element.
     * @return a String with all dependency names.
     */
    public static String getTargetDependencyNames(final Stereotype stereotype, final ModelElement element) {
        String result = "";
        List<ModelElement> targets = LinkManager.getAllTargets(element, stereotype);
        if (targets.size() > 0){
            for (int i = 0; i< targets.size() - 1 ; i++){
                result += getMARTEName(targets.get(i)) + valueSeparator + " " ;
            }
            result += getMARTEName(targets.get(targets.size() -1));
        }
        return result;
    }

    /**
     * Gets first dependency names.
     *
     * @param element is the owner this.element.
     * @param stereotype is the dependency stereotype name.
     * @return a String with all dependency names.
     */
    @objid ("8b30963e-4161-4b3e-a807-24b81edffbc7")
    public static String getDependencyName(final ModelElement element, final String stereotype) {
        String result = "";

        List<ModelElement> targets = LinkManager.getAllTargets(element, stereotype);
        if (targets.size() > 0){
            return getMARTEName(targets.get(0));
        }

        List<ModelElement> sources = LinkManager.getAllSources(element, stereotype);
        if (sources.size() > 0){
            return getMARTEName(sources.get(0));
        }
        return result;
    }

    /**
     * Gets first dependency names.
     *
     * @param element is the owner this.element.
     * @param stereotype is the dependency stereotype.
     * @return a String with all dependency names.
     */
    public static String getDependencyName(final ModelElement element, final Stereotype stereotype) {
        String result = "";

        List<ModelElement> targets = LinkManager.getAllTargets(element, stereotype);
        if (targets.size() > 0){
            return getMARTEName(targets.get(0));
        }

        List<ModelElement> sources = LinkManager.getAllSources(element, stereotype);
        if (sources.size() > 0){
            return getMARTEName(sources.get(0));
        }
        return result;
    }

    /**
     * Allows the tagged value values parsing to string tab
     *
     * @return a string tab with many string values
     */
    @objid ("8e791d8f-6d0e-4308-8440-fbf8eebd62b5")
    public static String[] parseValuesToStringTab(final String values) {
        ArrayList<String> dynamicList = new ArrayList<>();
        String current = "";
        boolean hasManyElts = false;

        for (int i=0; i < values.length(); i++) {
            if (values.charAt(i) != ' ') {
                current = current +values.charAt(i);

                if ((i == values.length()-1) && (hasManyElts)) {
                    dynamicList.add(current);
                }
            }

            if ((values.charAt(i) == ' ')&&(!current.equals(""))) {
                dynamicList.add(current);
                current = "";
                hasManyElts = true;
            }
            else if (current.length()==values.length()) {
                dynamicList.add(current);
                current = "";
            }
        }

        String[] result = dynamicList.toArray(new String[dynamicList.size()]);
        return result;
    }

    /**
     * Allows the tagged value adding when the tagged value is not a primitive type and which has a "*" multiplicity
     * @param name : tagged value name
     *
     * @param element : owner element
     */
    @objid ("bd1cc812-668f-4058-adac-58f8b3a75b34")
    public static void addValueManyTarget(final ModelElement element, final String tagTypeName, final String stereotypeAssociationName) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();

        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
                if (tag.getDefinition().getName().equals(tagTypeName)) {
                    exist = true;
                    break;
                }
            }
        }

        // if the tagged value doesn't exist yet, we create this
        if (!exist) {

            try {
                MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, tagTypeName, element);
            } catch (ExtensionNotFoundException e) {
                MARTEModule.getInstance().getModuleContext().getLogService().error(e);
            }
            setTaggedValueManyTarget(element, tagTypeName, stereotypeAssociationName);

        }
        // if the tagged value already exists
        else {
            setTaggedValueManyTarget(element, tagTypeName, stereotypeAssociationName);
        }
    }

    /**
     * Allows the element searching by extended class and stereotype
     *
     * @return a ListUtils object with the found elements
     */
    @objid ("0b2d3c58-a686-4eed-8ddd-3dffd466574d")
    @SuppressWarnings("unchecked")
    public static ListUtils searchElement(final Class<? extends MObject> extendedClass, final String stereotype) {
        // attribut
        ListUtils result;

        // dynamic elements List<MObject> creating
        List<ModelElement> listElements = (List<ModelElement>)((Object) MARTEModule.getInstance().getModuleContext().getModelingSession().findByClass(extendedClass));

        // arraylists creating (names + elements)
        ArrayList<String> listEltName = new ArrayList<>();
        List<ModelElement> listElement2 = new ArrayList<>();

        // arraylists initialization
        for (ModelElement elt : listElements) {
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotype)) {
                listElement2.add(elt);
                listEltName.add(((ModelElement)elt.getCompositionOwner()).getName()
                        + namespacingSeparator + elt.getName());
            }
        }

        // name List<MObject> converting
        String[] listString = (String[])listEltName.toArray(new String[listEltName.size()]);

        // result initialization
        if (listElement2.size() != 0) {
            result = new ListUtils(listString, listElement2);
        }
        else {
            result = new ListUtils();
        }
        return result;
    }

    @objid ("e5ad3b8e-0c6c-44b1-953c-c74ff292a2d9")
    public static void removeTagParameter(final String nameTaggedValue, final ModelElement elt, final String value) {
        // if the element has tagged values
        if (!elt.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : elt.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(nameTaggedValue)) {
                    // parameter deleting
                    for (TagParameter tp:tag.getActual()) {
                        if (tp.getValue().equals(value)) {
                            tag.getActual().remove(tp);
                            tp.delete();
                        }
                    }
                }
            }
        }
    }

    /**
     * Allows to create the add - remove list.
     * It is used by the property box when the tagged value nature is multiple model this.element.
     * @param completList<MObject> is the available elements.
     *
     * @param values is the current target elements.
     * @param valMax is the max value if the tag parameter number is defined.
     * @return a string table with the different add and remove string.
     */
    @objid ("b2544893-f8ea-4707-acd3-ee487f14904e")
    public static String[] createListAddRemoveEnum(final String[] completList, final String[] values, final int valMax) {
        String[] result = new String[completList.length];
        boolean contains = false;

        for (int i=0; i<completList.length; i++) {
            for (int j=0; j<values.length; j++) {
                if(completList[i].equals(values[j])) {
                    contains = true;
                }
            }
            if(contains) {
                result[i] = "remove "+completList[i];
            }
            else {
                if (values.length== valMax) {
                    result[i] = completList[i];
                }
                else {
                    result[i] = "add "+completList[i];
                }
            }
            contains = false;
        }

        if (values.length==0) {
            for (int i=0; i<completList.length; i++) {
                result[i] = "add "+completList[i];
            }
        }
        return result;
    }

    /**
     * Allows us to check the parsing of the getting value
     *
     * @param value is the getting value
     * @return a boolean which gives the parsing of the getting value
     */
    @objid ("42b39d71-b3c9-4631-9575-94c566b666f8")
    public static boolean isInteger(final String value) {
        try {
            Integer.parseInt(value);

        }catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Allows us to check the parsing of the different getting values
     *
     * @param values are the different getting values
     * @return a boolean which gives the parsing of the different getting values
     */
    @objid ("0b57fe63-85c2-459c-9eb5-12f811575c7a")
    public static boolean isInteger(final String[] values) {
        for (String s : values) {

            if (s.equals("")) {
                s = "0";
            }

            try {
                Integer.parseInt(s);

            }catch (Exception e) {

                return false;
            }
        }
        return true;
    }

    /**
     * Allows us to check the parsing of the different double getting values
     *
     * @param values are the different getting values
     * @return a boolean which gives the parsing of the different getting values
     */
    @objid ("f26924be-f422-4335-9f93-7f623b262b11")
    public static boolean isParseableDouble(final String[] values) {
        for (String s : values) {

            if (s.equals("")) {
                s = "0";
            }
            try {
                Double.parseDouble(s);

            }
            catch (Exception e) {
                new ErrorMessageBox(Display.getDefault().getActiveShell()
                        ,"The value " + s + " is not a real. You have to enter another value");
                return false;
            }
        }
        return true;
    }

    /**
     * Allows us to check the parsing of the getting value
     *
     * @param value is the getting value
     * @return a boolean which gives the parsing of the getting value
     */
    @objid ("97605714-5bb6-46ed-8bdb-6e80cd026bba")
    public static boolean isDouble(final String value) {
        try {
            Double.parseDouble(value);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Allows the tagged value getting.
     *
     * @param tagtype : tagged value name
     * @param element : owner element
     * @return the tagged value values in a string form
     */
    @objid ("c743574e-15bf-41be-a4b8-3c7eb3e8cc9e")
    public static String[] getComplexTaggedValue(final String tagtype, final ModelElement element) {
        String[] result = new String[0];

        for (TaggedValue tag : element.getTag()) {
            TagType type = tag.getDefinition();
            String tagname = type.getName();
            if (tagname.equals(tagtype)) {
                if (!tag.getActual().isEmpty()) {
                    result = new String[tag.getActual().size()];
                    for (int i =0; i < tag.getActual().size();i++) {
                        result[i] = tag.getActual().get(i).getValue();
                    }
                }
            }
        }
        return result;
    }

    /**
     * Allows the tagged value adding for a boolean parameter number
     *
     * @param element : owner element
     * @param tagtypeName : tagged value name
     * @param value : true or false
     */
    @objid ("1a87c49f-7156-4a7e-9487-b418a7b5a6ab")
    public static void addBooleanValue(final ModelElement element, final String tagtypeName, final boolean value) {
        // attributs
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        TaggedValue tvFound = null;

        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {

                if (tag.getDefinition().getName().equals(tagtypeName)) {
                    exist = true;
                    tvFound = tag;
                }
            }
        }
        if (!exist && value) {

            try {
                MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, tagtypeName, element);
            } catch (ExtensionNotFoundException e) {
                MARTEModule.getInstance().getModuleContext().getLogService().error(e);
            }

        }
        if (!value && exist) {
            tvFound.delete();
        }
    }

    /**
     * Allows the tagged value setting.
     *
     * @param elt is the owner this.element.
     * @param tagtypeName is the tagged value name.
     * @param values are the values to add.
     */
    @objid ("e8ead268-944b-4cb6-88d0-f8b36804fdf3")
    public static void setTaggedValue(final ModelElement elt, final String tagtypeName, final String[] values) {
        if (!elt.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : elt.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(tagtypeName)) {

                    // string transformation to string tab
                    String[] tabValues = values;

                    // array List<MObject> for the news tag parameters
                    List<TagParameter> listTagParam = new ArrayList<>();

                    // old tag parameters deleting
                    listTagParam = tag.getActual();
                    Iterator<TagParameter> itr = listTagParam.iterator();
                    while (itr.hasNext())
                    {
                        itr.next();
                        itr.remove();
                    }

                    // new List<MObject> creating
                    for (String s:tabValues) {
                        listTagParam.add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(s+" ", tag));
                    }

                    // new tag parameters adding
                    for (TagParameter tpl:listTagParam) {
                        tag.getActual().add(tpl);
                    }
                }
            }
        }
    }

    /**
     * Allows the tagged value getting
     *
     * @param tagtype : tagged value name
     * @param element : owner element
     * @return the tagged value values in a string table
     */
    @objid ("eef959d9-2d2c-4871-b166-713cca6169d7")
    public static String[] getMultipleTaggedValue(final String tagtype, final ModelElement element) {
        String result[] = null;
        for (TaggedValue tag : element.getTag()) {
            TagType type = tag.getDefinition();
            String tagname = type.getName();
            if (tagname.equals(tagtype)) {
                if (!tag.getActual().isEmpty()) {
                    result = new String[tag.getActual().size()];
                    for (int i = 0; i<tag.getActual().size(); i++) {
                        TagParameter tp = tag.getActual().get(i);
                        result[i] = tp.getValue();
                    }
                }
            }
        }
        return result;
    }

    /**
     * Allows two lists creation. It is used by the add - remove interface.
     * @param List<MObject> : Model elements list.
     *
     * @param listElt : Elements List<MObject> already depends on the this.element.
     * @return two lists which are the available element names and the current owner elements.
     */
    @objid ("113b6c3b-6db3-4d73-8fe4-636d56f27c33")
    public static ArrayList<String[]> createExistYet(final List<ModelElement> listElt, final ListUtils list) {
        List<ModelElement> listEltModel = list.getListElement();
        ArrayList<String> eltPresent = new ArrayList<>();
        ArrayList<String> eltMissing = new ArrayList<>();

        // present and missing elements separation
        for (int i=0; i < listEltModel.size(); i++) {
            ModelElement o = listEltModel.get(i);
            if (listElt.contains(o)) {
                // current elements
                eltPresent.add(o.getName());
            }
            else {
                // available elements
                eltMissing.add(o.getName());
            }
        }
        // final string lists creating
        String[] s1 = eltPresent.toArray(new String[eltPresent.size()]);
        String[] s2 = eltMissing.toArray(new String[eltMissing.size()]);
        ArrayList<String[]> result = new ArrayList<String[]>();
        result.add(s1);
        result.add(s2);
        return result;
    }

    /**
     * Allows the String table transformation for the complex structure.
     * The ";" is the separating char.
     *
     * @param values is the String value which contains some values.
     * @return a String table with the different values.
     */
    @objid ("255dafb0-358b-45de-96da-65828724484e")
    public static String[] evaluateComplexString(final String values, final int nb) {
        String[] result = null;
        if (evaluateBracket(values)) {
            // temporary list
            ArrayList<String> dynamicList = new ArrayList<>();

            // current string evaluation
            String current ="";

            // for each String char
            for (int i=0; i < values.length(); i++) {

                // if the char is an enter char
                if (values.charAt(i) == '<') {

                    // if the current string is empty
                    if (values.charAt(i+1) == '>') {
                        dynamicList.add(current);
                    }
                }
                // if the char is an end char
                else if (values.charAt(i) == '>') {
                    dynamicList.add(current);
                    current = "";
                }
                // or if the char is a space between 2 brackets.
                else if ((values.charAt(i) == ' ') && (values.charAt(i-1) == '>')) {
                    // we have to do nothing
                }
                else {
                    current = current + values.charAt(i);
                }
            }

            if (dynamicList.size() < nb) {
                while (dynamicList.size() < nb) {
                    dynamicList.add("");
                }
            }
            result = dynamicList.toArray(new String[dynamicList.size()]);
        }
        return result;
    }

    /**
     * Allows the bracket evaluation in a String.
     *
     * @param s is the String to evaluate;
     * @return the evaluation result.
     */
    @objid ("0ab9a8d9-9eef-45b0-8f35-0440747f60ef")
    public static boolean evaluateBracket(final String s) {
        boolean result = true;

        if (s.length() != 0) {

            int openedBracket = 0;
            int closedBracket = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '<') {
                    openedBracket += 1;
                }
                else if (s.charAt(i) == '>') {
                    closedBracket += 1;
                }
            }

            if ((openedBracket != closedBracket) || (openedBracket == 0 && closedBracket == 0)) {
                result = false;
            }

            if (s.charAt(0) == '>') {
                result = false;
            }
            else if (s.charAt(s.length()-1) == '<') {
                result =false;
            }

            int tmpOpened = openedBracket;
            int tmpClosed = closedBracket;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == '<') {
                    tmpOpened --;
                    int h = j+1;
                    boolean next = true;
                    while (h < s.length() && next) {
                        if(s.charAt(h) == '>') {
                            tmpClosed --;
                            next = false;
                        }
                        h++;
                    }
                }

                if (tmpClosed != tmpOpened) {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * Update the tagtype "tagtypeName", owned by the element "element", according to the links
     * specified by dependecies ingoing to "element" and stereotypes "linkName"
     */
    @objid ("2cb49906-f19f-4fd3-b666-c30ae30ca855")
    public static void updateTarget(final ModelElement element, final String tagtypeName, final String linkName) {
        Stereotype tagOwner = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getTagType(IMARTEDesignerPeerModule.MODULE_NAME, tagtypeName, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(element.getClass())).getOwnerStereotype();

        ArrayList<Dependency> linkList = new ArrayList<>();
        for (Dependency existingLinks : element.getImpactedDependency()){
            if (existingLinks.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkName)){
                linkList.add(existingLinks);
            }
        }
        if (linkList.size() > 0 && (tagOwner != null)){

            if (!element.getExtension().contains(tagOwner)){
                element.getExtension().add(tagOwner);

            }

            List<TaggedValue> tagList = element.getTag();
            for(TaggedValue taggedValue: tagList){
                if (taggedValue.getDefinition().getName().equals(tagtypeName)){
                    List<TagParameter> actuals = taggedValue.getActual();
                    IUmlModel model = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel();
                    for(TagParameter actual: actuals){
                        actual.delete();
                    }

                    for(Dependency link : linkList){
                        addStringValue(element, tagtypeName, getAbsoluteName(link.getImpacted()));
                    }

                    break;
                }
            }
        }else{
            boolean linkNotExist = true;
            for (Dependency existingLinks : element.getDependsOnDependency()){
                if (existingLinks.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkName)){
                    linkNotExist = false;
                    break;
                }
            }
            if (linkNotExist && (tagOwner != null)){
                element.getExtension().remove(tagOwner);
            }
        }
    }

    /**
     * Update the tagtype "tagtypeName", owned by the element "element", according to the links
     * specified by dependecies outgoing from "element" and stereotypes "linkName"
     */
    @objid ("6f20c7bc-0640-46f9-bba0-06c44e62fd7e")
    public static void updateSource(final ModelElement element, final String tagtypeName, final String linkName) {
        Stereotype tagOwner = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().getTagType(IMARTEDesignerPeerModule.MODULE_NAME, tagtypeName, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(element.getClass()) ).getOwnerStereotype();

        List<Dependency> linkList = new ArrayList<>();
        for (Dependency existingLinks : element.getDependsOnDependency()){
            if (existingLinks.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkName)){
                linkList.add(existingLinks);
            }
        }

        if ((linkList.size() > 0) && (tagOwner != null)){
            if (!element.getExtension().contains(tagOwner)){
                element.getExtension().add(tagOwner);

            }

            List<TaggedValue> tagList = element.getTag();
            for(TaggedValue taggedValue: tagList){
                if (taggedValue.getDefinition().getName().equals(tagtypeName)){
                    List<TagParameter> actuals = taggedValue.getActual();
                    IUmlModel model = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel();
                    for(TagParameter actual: actuals){
                        actual.delete();
                    }


                    for(Dependency link : linkList){
                        addStringValue(element, tagtypeName, getAbsoluteName(link.getImpacted()));
                    }

                    break;
                }
            }
        }else{

            boolean linkNotExist = true;

            for (Dependency existingLinks : element.getImpactedDependency()){
                if (existingLinks.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, linkName)){
                    linkNotExist = false;
                    break;
                }
            }
            if (linkNotExist && (tagOwner != null)){
                element.getExtension().remove(tagOwner);
            }
        }
    }

    /**
     * Returns the name with its namespacing of an this.element.
     *
     * @param elt : the element
     * @return String : the absolute name of the this.element.
     */
    @objid ("9eab3ea2-f932-4517-8544-18d92720f3e7")
    public static String getAbsoluteName(final ModelElement elt) {
        String result = elt.getName();
        MObject temp = elt;
        while (temp.getCompositionOwner() != null){
            temp = temp.getCompositionOwner();
            if (temp instanceof ModelElement){
                result = ((ModelElement) temp).getName() + namespacingSeparator + result;
            }
        }
        return result;
    }

    @objid ("4f76c3b5-e835-4d1c-bb3a-7a864cb86f6f")
    public static void clean(final ModelElement element, final String tagtypeName, final String stereotypelink) {
        IUmlModel model = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel();
        for (Dependency existingLinks : element.getDependsOnDependency()){
            if (existingLinks.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypelink)){
                existingLinks.delete();
            }
        }

        List<TaggedValue> tagList = element.getTag();
        for(TaggedValue taggedValue: tagList){
            if (taggedValue.getDefinition().getName().equals(tagtypeName)){
                List<TagParameter> actuals = taggedValue.getActual();

                for(TagParameter actual: actuals){
                    actual.delete();
                }

                taggedValue.getActual().add(model.createTagParameter("", taggedValue));
                break;
            }
        }
    }

    @objid ("fecb2b80-68c3-4685-8a64-202c0796c6aa")
    public static void manageOneToMultipleLink(final ModelElement target, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeOneName, final List<String> tagtypeMultipleNames, final String value) {
        List<ModelElement> sources = LinkManager.removeAllLinks(target, linkStereotype);
        for (ModelElement oldSource : sources){
            ModelUtils.removeTaggedValue(tagtypeMultipleNames, oldSource);
        }

        if (value.equals("")) {
            //dependency remove
            ModelUtils.removeTaggedValue(tagtypeOneName, target);
        }else {
            // dependency adding

            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(value)){
                    LinkManager.setLink(temp, target, linkStereotype);
                    addValueManyElt(temp, tagtypeMultipleNames, linkStereotype);
                    addValueElt(target, tagtypeOneName, linkStereotype);
                }
            }
        }
    }

    /**
     * Allows the tagged value setting when the tagged value is not a primitive type and which has a "*" multiplicity
     * @param values : tagged value values
     *
     * @param element : owner element
     * @param tagTypeName : tagged value name
     */
    @objid ("99be3c78-d553-4d69-b67a-0ca1af323b52")
    public static void setTaggedValueElt(final ModelElement element, final String tagTypeName, final String stereotypeName) {
        // if the element has tagged values
        if (!element.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : element.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(tagTypeName)) {

                    // old tag parameters deleting
                    List<TagParameter> listTagParam = tag.getActual();
                    Iterator<TagParameter> itr = listTagParam.iterator();
                    while (itr.hasNext())
                    {
                        itr.next();
                        itr.remove();
                    }

                    // array List<MObject> for the news tag parameters
                    listTagParam = new ArrayList<>();

                    // new List<MObject> creating

                    for (ModelElement ob : LinkManager.getAllTargets(element, stereotypeName)) {
                        listTagParam.add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(
                                getMARTEName(ob), tag));
                    }

                    // new tag parameters adding
                    for (TagParameter tpl : listTagParam) {
                        tag.getActual().add(tpl);
                    }
                }
            }
        }
    }

    @objid ("ecd01819-6742-4c0f-a1ec-7245d1df934e")
    public static void setTaggedValueManySource(final ModelElement element, final String tagTypeName, final String stereotypeName) {
        // if the element has tagged values
        if (!element.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : element.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(tagTypeName)) {

                    // old tag parameters deleting
                    List<TagParameter> listTagParam = tag.getActual();
                    Iterator<TagParameter> itr = listTagParam.iterator();
                    while (itr.hasNext())
                    {
                        itr.next();
                        itr.remove();
                    }
                    // array List<MObject> for the news tag parameters
                    listTagParam = new ArrayList<>();

                    // new List<MObject> creating

                    for (ModelElement ob : LinkManager.getAllSources(element, stereotypeName)) {
                        listTagParam.add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(
                                getMARTEName(ob), tag));
                    }

                    // new tag parameters adding
                    for (TagParameter tpl : listTagParam) {
                        tag.getActual().add(tpl);
                    }
                }
            }
        }
    }

    /**
     * Allows the tagged value setting when the tagged value is not a primitive type and which has a "*" multiplicity
     * @param values : tagged value values
     *
     * @param element : owner element
     * @param tagTypeName : tagged value name
     */
    @objid ("2710ce64-f2b2-432c-8ca5-6f0f210f39e0")
    public static void setTaggedValueManyTarget(final ModelElement element, final String tagTypeName, final String stereotypeName) {
        // if the element has tagged values
        if (!element.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : element.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(tagTypeName)) {

                    // old tag parameters deleting
                    List<TagParameter> listTagParam = tag.getActual();
                    Iterator<TagParameter> itr = listTagParam.iterator();
                    while (itr.hasNext())
                    {
                        itr.next();
                        itr.remove();
                    }

                    // array List<MObject> for the news tag parameters
                    listTagParam = new ArrayList<>();

                    // new List<MObject> creating

                    for (ModelElement ob : LinkManager.getAllTargets(element, stereotypeName)) {
                        listTagParam.add(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTagParameter(
                                getMARTEName(ob), tag));
                    }

                    // new tag parameters adding
                    for (TagParameter tpl : listTagParam) {
                        tag.getActual().add(tpl);
                    }
                }
            }
        }
    }

    @objid ("51ee8dcd-446a-4065-b4de-a5d0432a0fde")
    public static void manageSingleOrientedLink(final ModelElement element, final List<ModelElement> allElt, final String linkStereotype, final String value) {
        if (value.equals("")) {
            LinkManager.removeAllLinks(element, linkStereotype);
        }else  {

            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(value)){
                    LinkManager.setLink(element, temp, linkStereotype);
                    break;
                }
            }
        }
    }

    @objid ("50f3909a-eff1-4876-80e5-14fc2ae76854")
    public static void manageOneToMultipleLink(final ModelElement target, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeOneName, final String tagtypeMultipleName, final String value) {
        List<ModelElement> sources = LinkManager.removeAllLinks(target, linkStereotype);
        for (ModelElement oldSource : sources){
            ModelUtils.removeTaggedValue(tagtypeMultipleName, oldSource);
        }

        if (value.equals("")) {
            ModelUtils.removeTaggedValue(tagtypeOneName, target);
        }else{
            // dependency adding

            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(value)){
                    LinkManager.setLink(temp, target, linkStereotype);
                    addValueManyTarget(temp, tagtypeMultipleName, linkStereotype);
                    addValueElt(target, tagtypeOneName, linkStereotype);
                }
            }
        }
    }

    @objid ("9558f6dc-110d-4088-ac84-c96be6b5aaf0")
    public static void manageOneToOneLink(final ModelElement elt1, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeElt1Name, final String tagtypeElt2Name, final String value) {
        LinkManager.removeAllLinks(elt1, linkStereotype);

        if (value.equals("")) {
            ModelUtils.removeTaggedValue(tagtypeElt1Name, elt1);
        }else{
            // dependency adding

            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(value)){
                    LinkManager.removeAllLinks(temp, linkStereotype);
                    LinkManager.setLink(temp, elt1, linkStereotype);
                    addValueElt(elt1, tagtypeElt1Name, linkStereotype);
                    addValueElt(temp, tagtypeElt2Name, linkStereotype);
                }
            }
        }
    }

    @objid ("6d88cad8-5ea4-4ea2-afce-a9e26362db79")
    public static void manageMultipleToOneLink(final ModelElement source, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeOneName, final String tagtypeMultipleName, final String value) {
        if (!value.equals("")) {
            ModelElement target = null;
            if (value.startsWith(add)) {
                // dependency adding

                String addingName = value.replaceFirst(add + " ", "");
                for (ModelElement temp : allElt){
                    if (getMARTEName(temp).equals(addingName)){
                        target = temp;
                        break;
                    }
                }
                LinkManager.addLink(source, target, linkStereotype);

            }else if (value.startsWith(remove)) {
                //dependency remove
                String removingName = value.replaceFirst(remove + " ", "");
                for (ModelElement temp : allElt){
                    if (getMARTEName(temp).equals(removingName)){
                        target = temp;
                        break;
                    }
                }
                LinkManager.removeLink(source, target, linkStereotype);
            }
            addValueManyTarget(source, tagtypeMultipleName, linkStereotype);
            addValueElt(source, tagtypeOneName, linkStereotype);

        }
    }

    @objid ("f08a5a7c-3659-4d12-8910-3514bdc41b6a")
    public static void manageMultipleOrientedLink(final ModelElement source, final List<ModelElement> allElt, final String linkStereotype, final String value) {
        //    public static void manageMultipleOrientedLink(final ModelElement source, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeName, final String value) {
        ModelElement target = null;
        if (value.startsWith(add)) {
            // dependency adding

            String addingName = value.replaceFirst(add + " ", "");
            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(addingName)){
                    target = temp;
                    break;
                }
            }
            LinkManager.addLink(source, target, linkStereotype);

        }else if (value.startsWith(remove)) {
            //dependency remove
            String removingName = value.replaceFirst(remove + " ", "");
            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(removingName)){
                    target = temp;
                    break;
                }
            }
            LinkManager.removeLink(source, target, linkStereotype);
        }
        //        addValueManyTarget(source, tagtypeName, linkStereotype);
    }

    @objid ("3e206a3d-6364-42a2-b320-476db626f6d8")
    public static void addMultipleOrientedLink(final ModelElement source, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeName) {
        // dependency adding

        for (ModelElement target : allElt){

            LinkManager.addLink(source, target, linkStereotype);
        }

        addValueManyTarget(source, tagtypeName, linkStereotype);
    }

    @objid ("fb7bec8e-a953-4b25-9113-040e16083af1")
    public static void setTaggedValue(final ModelElement elt, final ModelElement related, final String stereotypeLink, final String tagtypeName, final String value) {
        List<TaggedValue> tagElements = elt.getTag();
        TaggedValue tvFound = null;
        IUmlModel model = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel();

        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
                String tagname = tag.getDefinition().getName();
                if (tagname.equals(tagtypeName)) {
                    tvFound = tag;
                    List<TagParameter> listTagPar = tvFound.getActual();
                    TagParameter firstElt = null;
                    if (listTagPar.size()!= 0){
                        firstElt = listTagPar.get(0);
                        for (Dependency existingLinks : elt.getDependsOnDependency()){
                            if (existingLinks.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotypeLink)){
                                existingLinks.delete();
                            }
                        }
                    }else
                        firstElt = model.createTagParameter(value,tvFound);

                    if (value.equals("false")) {
                        tvFound.delete();
                    }else {
                        firstElt.setValue(value);

                        try {
                            model.createDependency(elt, related, IMARTEDesignerPeerModule.MODULE_NAME, stereotypeLink);
                        } catch (ExtensionNotFoundException e) {
                            MARTEModule.getInstance().getModuleContext().getLogService().error(e);
                        }

                    }
                }
            }
        }
    }

    /**
     * Allows the string tab with the "add" or "remove" prefix creating
     * @param listElt : Elements List<MObject> already depends on the element
     * @param List<MObject> : Model elements list
     *
     * @return a string tab with the "add" or "remove" prefix
     */
    @objid ("1eb1e148-7424-46f5-bdef-08cbb1448088")
    public static String[] createListAddRemove(final List<ModelElement> existingElt, final List<ModelElement> allElt) {
        List<String> eltPresent = new ArrayList<>();
        List<String> eltMissing = new ArrayList<>();

        // present and missing elements separation
        for (ModelElement currentElt : allElt){
            if (existingElt.contains(currentElt)) {
                eltPresent.add(createRemove(currentElt));
            }else {
                eltMissing.add(createAdd(currentElt));
            }
        }

        Collections.sort(eltMissing);

        // global List<MObject> creating
        List<String> unionElt = new ArrayList<>(eltPresent);
        unionElt.addAll(eltMissing);

        // final string List<MObject> creating
        String[] result = unionElt.toArray(new String[unionElt.size()]);
        return result;
    }

    @objid ("fa9b7783-1943-4aef-94f1-7b34d7fc2b03")
    public static String createAdd(final ModelElement currentElt) {
        return org.modelio.module.marte.i18n.I18nMessageService.getString("Ui.Add") + " " + getMARTEName(currentElt) ;
    }

    @objid ("24e7a291-c7a6-417d-aa8e-e7240822bb70")
    public static String createRemove(final ModelElement currentElt) {
        return org.modelio.module.marte.i18n.I18nMessageService.getString("Ui.Remove") + " " + getMARTEName(currentElt) ;
    }

    @objid ("61c78bc6-272e-4f89-9daf-c35db5fddab4")
    public static void addValueElt(final ModelElement element, final String tagTypeName, final String stereotypeAssociationName) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();

        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
                if (tag.getDefinition().getName().equals(tagTypeName)) {
                    exist = true;
                }
            }
        }

        // if the tagged value doesn't exist yet, we create this
        if (!exist) {

            try {
                MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, tagTypeName, element);
            } catch (ExtensionNotFoundException e) {
                MARTEModule.getInstance().getModuleContext().getLogService().error(e);
            }
            setTaggedValueElt(element, tagTypeName, stereotypeAssociationName);

        }
        // if the tagged value already exists
        else {
            setTaggedValueManyTarget(element, tagTypeName, stereotypeAssociationName);
        }
    }

    /**
     * Allows to have the tab of name corresponding of the list
     *
     * @param listElt : a ArrayList<MObject> of ModelElemnt
     * @return String[] : a tab with the name of each element and an white space at the first place
     */
    @objid ("a85df35b-a18c-40e2-a1d3-2ac9e9862fba")
    public static String[] getNamesWithDefaut(final List<ModelElement> listElt) {
        String[] result = new String[listElt.size() + 1];

        result[0] = "";
        int i = 1;
        for (ModelElement elt : listElt){
            result[i] = getAbsoluteName(elt);
            i++;
        }
        return result;
    }

    /**
     * Allows the element searching by extended class and stereotype
     *
     * @return a ArrayList<MObject> of ModelElement with the found elements
     */
    @objid ("1f42d77c-adff-45c5-803e-062ff389815f")
    public static List<ModelElement> searchElementStereotyped(final Class<? extends ModelElement> extendedClass, final String stereotype) {
        //initialize the result
        List<ModelElement> result = new ArrayList<>();

        // dynamic elements List<MObject> creating
        Collection<? extends ModelElement> listElements = MARTEModule.getInstance().getModuleContext().getModelingSession().findByClass(extendedClass);

        // vector initialization
        for (ModelElement elt : listElements) {

            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, stereotype)) {
                result.add(elt);
            }

        }
        return result;
    }

    /**
     * Allows the element searching by extended class and stereotype
     *
     * @return a ArrayList<MObject> of ModelElement with the found elements
     */
    @objid ("46d59fa2-4a21-4919-abba-e4f623259daa")
    public static List<ModelElement> searchElement(final Class<? extends ModelElement> extendedClass) {
        //initialize the result
        List<ModelElement> result = new ArrayList<>();

        // dynamic elements List<MObject> creating
        Collection<? extends ModelElement> listElements = MARTEModule.getInstance().getModuleContext().getModelingSession().findByClass(extendedClass);

        // vector initialization
        for (ModelElement elt : listElements) {
            result.add(elt);
        }
        return result;
    }

    /**
     * Gets all target dependency names.
     *
     * @param element is the owner this.element.
     * @param stereotype is the dependency stereotype name.
     * @return a String with all dependency names.
     */
    @objid ("a7d88804-6ecf-475f-850c-57c9ac3ebe4e")
    public static String getSourceDependencyNames(final ModelElement element, final String stereotype) {
        String result = "";
        List<ModelElement> sources = LinkManager.getAllSources(element, stereotype);
        if (sources.size() > 0){
            for (int i = 0; i< sources.size() - 1 ; i++){
                result += getMARTEName(sources.get(i)) + valueSeparator + " " ;
            }

            result += getMARTEName(sources.get(sources.size() -1));
        }
        return result;
    }

    /**
     * Allows the tagged value adding when the tagged value is not a primitive type and which has a "*" multiplicity
     * @param name : tagged value name
     *
     * @param element : owner element
     */
    @objid ("3a7508de-ab4a-4a48-98ef-c11153864e58")
    public static void addValueManyElt(final ModelElement element, final List<String> tagTypeNames, final String stereotypeAssociationName) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        String tagTypeName = "";
        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
                for (String currentTagTypeName : tagTypeNames){
                    if (tag.getDefinition().getName().equals(currentTagTypeName)) {
                        exist = true;
                        tagTypeName = currentTagTypeName;
                        break;
                    }
                }
            }
        }

        // if the tagged value doesn't exist yet, we create this
        if (!exist) {

            for (String currentTagTypeName : tagTypeNames){

                try {
                    MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, currentTagTypeName, element);
                } catch (ExtensionNotFoundException e) {
                    MARTEModule.getInstance().getModuleContext().getLogService().error(e);
                }
                setTaggedValueManyTarget(element, currentTagTypeName, stereotypeAssociationName);

            }

        }
        // if the tagged value already exists
        else {
            setTaggedValueManyTarget(element, tagTypeName, stereotypeAssociationName);
        }
    }

    /**
     * Allows the tag parameter removing
     * @param value is the value to delete.
     *
     * @param nameTaggedValue is the tagged value name.
     * @param elt is the owner this.element.
     */
    @objid ("fd1cee84-d9fe-46f6-ab23-4f5dbb6fa563")
    public static void removeTaggedValue(final String nameTaggedValue, final ModelElement elt) {
        // if the element has tagged values
        if (!elt.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : elt.getTag()) {
                //good tagged value getting
                if (tag.getDefinition().getName().equals(nameTaggedValue)) {
                    // taggedvalue deleting
                    tag.delete();
                }
            }
        }
    }

    /**
     * Allows the tag parameter removing
     * @param nameTaggedValue is the tagged value name.
     * @param value is the value to delete.
     *
     * @param elt is the owner this.element.
     */
    @objid ("b6c18a7b-43d1-4041-9980-2c4f4f9cf498")
    public static void removeTaggedValue(final List<String> nameTaggedValues, final ModelElement elt) {
        for (String nameTaggedValue : nameTaggedValues){
            removeTaggedValue(nameTaggedValue, elt);
        }
    }

    /**
     * Allows the tag parameter removing
     *
     * @param nameTaggedValues is the tagged value name.
     * @param elt is the owner this.element.
     * @param value is the value to delete.
     */
    @objid ("259d3928-6fb1-4952-a0f5-c533ac31cba2")
    public static void removeTagParameter(final List<String> nameTaggedValues, final ModelElement elt, final String value) {
        // if the element has tagged values
        if (!elt.getTag().isEmpty()) {
            // for each tagged values
            for (TaggedValue tag : elt.getTag()) {
                //good tagged value getting
                for (String nameTaggedValue : nameTaggedValues){
                    if (tag.getDefinition().getName().equals(nameTaggedValue)) {
                        // parameter deleting
                        for (TagParameter tp : tag.getActual()) {
                            if (tp.getValue().equals(value)) {
                                tag.getActual().remove(tp);
                                tp.delete();
                            }
                        }
                    }
                }
            }
        }
    }

    @objid ("8e7f5aa0-5117-42c7-b7aa-b9f9eb78e0ed")
    public static void manageMultipleToOneLink(final ModelElement source, final List<ModelElement> allElt, final String linkStereotype, final List<String> tagtypeOneNames, final String tagtypeMultipleName, final String value) {
        if (!value.equals("")) {
            ModelElement target = null;
            if (value.startsWith(add)) {
                // dependency adding

                String addingName = value.replaceFirst(add + " ", "");
                for (ModelElement temp : allElt){
                    if (getMARTEName(temp).equals(addingName)){
                        target = temp;
                        break;
                    }
                }

                LinkManager.removeAllLinks(target, linkStereotype);
                removeTaggedValue(tagtypeOneNames, target);

                LinkManager.addLink(source, target, linkStereotype);
                addValueElt(target, tagtypeOneNames, linkStereotype);
                addValueManyTarget(source, tagtypeMultipleName, linkStereotype);

            }else if (value.startsWith(remove)) {
                //dependency remove
                String removingName = value.replaceFirst(remove + " ", "");
                for (ModelElement temp : allElt){
                    if (getMARTEName(temp).equals(removingName)){
                        target = temp;
                        break;
                    }
                }
                LinkManager.removeLink(source, target, linkStereotype);
                removeTaggedValue(tagtypeOneNames, target);
            }
        }
    }

    @objid ("d50b2450-079d-4da6-84f3-d4f7417b51a5")
    public static void addValueElt(final ModelElement element, final List<String> tagTypeNames, final String stereotypeAssociationName) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();
        String tagTypeName = "";
        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
                for (String currentTagTypeName : tagTypeNames){
                    if (tag.getDefinition().getName().equals(currentTagTypeName)) {
                        tagTypeName = currentTagTypeName;
                        exist = true;
                    }
                }
            }
        }

        // if the tagged value doesn't exist yet, we create this
        if (!exist) {
            for (String currentTagTypeName : tagTypeNames){

                try {
                    MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, currentTagTypeName, element);
                } catch (ExtensionNotFoundException e) {
                    MARTEModule.getInstance().getModuleContext().getLogService().error(e);
                }
                setTaggedValueElt(element, currentTagTypeName, stereotypeAssociationName);

            }
        }
        // if the tagged value already exists
        else {
            setTaggedValueManyTarget(element, tagTypeName, stereotypeAssociationName);
        }
    }

    /**
     * Allows us to check the parsing of the getting value
     *
     * @param value is the getting value
     * @return a boolean which gives the parsing of the getting value
     */
    @objid ("662541e6-215e-4466-a593-ef815eaaad98")
    public static boolean isDuration(final String value) {
        try {
            String[] tabDuration = value.split(valueSeparator);
            if (tabDuration.length == 2){
            }

        }catch (Exception e) {
            return false;
        }
        return false;
    }

    @objid ("47b9b674-943a-4e41-b592-3f12cfb5484c")
    public static String[] getNoteNames(final ModelElement element, final String noteTypeName) {
        List<Note> notes = element.getDescriptor();
        List<ModelElement> notesSorted = new ArrayList<>();
        for (Note note : notes){
            if (note.getModel().getName().equals(noteTypeName)){
                notesSorted.add(note);
            }
        }
        return getNamesWithDefaut(notesSorted);
    }

    @objid ("c41307f9-6bdd-4b4e-9e2c-8b40251b82a8")
    public static String getNotesNames(final ModelElement element, final String noteTypeName) {
        String result = "";

        List<Note> notes = element.getDescriptor();
        for (Note note : notes){
            if (note.getModel().getName().equals(noteTypeName)){
                result += " " + note.getName();
            }
        }
        return result;
    }

    @objid ("c3ef8c22-403d-4355-865f-f8936e9d69c6")
    public static List<Stereotype> computePropertyList(final ModelElement element) {
        List<Stereotype> result = new ArrayList<>();
        int i = 0;

        for (Stereotype ster : element.getExtension()){
            if (ster.getOwner().getOwnerModule().getName().equals("MARTEDesigner")){
                if (!(result.contains(ster))){
                    result.add(ster);

                    Stereotype parent = ster.getParent();
                    while ((parent != null) && (!(result.contains(parent)))){
                        result.add(i, parent);
                        ster = parent;
                        parent = ster.getParent();
                    }
                    i = result.size();
                }

            }
        }
        return result;
    }

    @objid ("ac6fc9d4-de67-4d23-a5cd-67a33a18c896")
    public static void addValueManySource(final ModelElement element, final String tagTypeName, final String stereotypeAssociationName) {
        // DON'T place Transition HERE
        boolean exist = false;
        List<TaggedValue> tagElements = element.getTag();

        // existing verification
        if (!tagElements.isEmpty()) {
            for (TaggedValue tag : tagElements) {
                if (tag.getDefinition().getName().equals(tagTypeName)) {
                    exist = true;
                    break;
                }
            }
        }

        // if the tagged value doesn't exist yet, we create this
        if (!exist) {

            try {
                MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(IMARTEDesignerPeerModule.MODULE_NAME, tagTypeName, element);
            } catch (ExtensionNotFoundException e) {
                MARTEModule.getInstance().getModuleContext().getLogService().error(e);
            }
            setTaggedValueManySource(element, tagTypeName, stereotypeAssociationName);

        }
        // if the tagged value already exists
        else {
            setTaggedValueManySource(element, tagTypeName, stereotypeAssociationName);
        }
    }

    @objid ("e2e5b47d-6276-4198-8beb-ee599c10e7aa")
    public static void addValueManySource(final ModelElement element, final List<String> tagTypeNames, final String stereotypeAssociationName) {
        List<TagType> tagtypes = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().findTagTypes(IMARTEDesignerPeerModule.MODULE_NAME, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(element.getClass()));

        for (TagType tagType: tagtypes){
            if (tagTypeNames.contains(tagType.getName())){
                addValueManySource(element, tagType.getName(), stereotypeAssociationName);
            }
        }
    }

    @objid ("32595734-20bb-4c8c-9d62-100198dc3da9")
    public static void addValueManyTarget(final ModelElement element, final List<String> tagTypeNames, final String stereotypeAssociationName) {
        List<TagType> tagtypes = MARTEModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions().findTagTypes(IMARTEDesignerPeerModule.MODULE_NAME, MARTEModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(element.getClass()));

        for (TagType tagType: tagtypes){
            if (tagTypeNames.contains(tagType.getName())){
                addValueManyTarget(element, tagType.getName(), stereotypeAssociationName);
            }
        }
    }

    @objid ("02e69104-9e98-455c-94b2-1d90eb9b02d9")
    public static void manageSourceMultipleLink(final ModelElement source, final List<ModelElement> allElt, final String linkStereotype, final String tagtypeNameSource, final List<String> tagtypeNameTarget, final String value) {
        ModelElement target = null;
        if (value.startsWith(add)) {
            // dependency adding

            String addingName = value.replaceFirst(add + " ", "");
            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(addingName)){
                    target = temp;
                    break;
                }
            }
            LinkManager.addLink(source, target, linkStereotype);

        }else if (value.startsWith(remove)) {
            //dependency remove
            String removingName = value.replaceFirst(remove + " ", "");
            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(removingName)){
                    target = temp;
                    break;
                }
            }
            LinkManager.removeLink(source, target, linkStereotype);
        }
        addValueManyTarget(source, tagtypeNameSource, linkStereotype);
        addValueManySource(target, tagtypeNameTarget, linkStereotype);
    }

    @objid ("edd9e140-f091-45ff-86b7-fa9a2977a7b7")
    public static void manageTargetMultipleLink(final ModelElement target, final List<ModelElement> allElt, final String linkStereotype, final List<String> tagtypeNameSource, final String tagtypeNameTarget, final String value) {
        ModelElement source = null;
        if (value.startsWith(add)) {
            // dependency adding

            String addingName = value.replaceFirst(add + " ", "");
            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(addingName)){
                    source = temp;
                    break;
                }
            }
            LinkManager.addLink(source, target, linkStereotype);

        }else if (value.startsWith(remove)) {
            //dependency remove
            String removingName = value.replaceFirst(remove + " ", "");
            for (ModelElement temp : allElt){
                if (getMARTEName(temp).equals(removingName)){
                    source = temp;
                    break;
                }
            }
            LinkManager.removeLink(source, target, linkStereotype);
        }
        addValueManyTarget(source, tagtypeNameSource, linkStereotype);
        addValueManySource(target, tagtypeNameTarget, linkStereotype);
    }

    @objid ("42980fdf-1769-487e-8278-1bb5811fdf01")
    public static List<ModelElement> searchElementStereotyped(final Class<? extends ModelElement> extendedClass, final List<String> stereotypes) {
        //initialize the result
        List<ModelElement> result = new ArrayList<>();

        for (String stereotype : stereotypes){
            result.addAll(searchElementStereotyped(extendedClass, stereotype));
        }
        return result;
    }

    @objid ("a16170e0-6efd-4a25-b9c7-e53362ecd785")
    public static List<Interface> getRequiredInterfaces(final Port port) {
        List<Interface> result = new ArrayList<Interface>();
        for (RequiredInterface reqInt : port.getRequired()){
            result.addAll(reqInt.getRequiredElement());
        }
        return result;
    }

    @objid ("34986896-c7a8-49eb-b57c-c2b976c36e8d")
    public static List<Interface> getProvidedInterfaces(final Port port) {
        List<Interface> result = new ArrayList<Interface>();
        for (ProvidedInterface reqInt : port.getProvided()){
            result.addAll(reqInt.getProvidedElement());
        }
        return result;
    }

    @objid ("eceeaa10-dcca-4d1c-97cf-2477d9598af1")
    public static String getProvidedNames(final Port port) {
        String result = "";
        for (ModelElement o : getProvidedInterfaces(port)) {
            result += " " +  o.getName();
        }
        return result;
    }

    @objid ("fabd25dd-6148-4c9c-9d63-5bc40d1dd6c0")
    public static String getRequiredNames(final Port port) {
        String result = "";
        for (ModelElement o : getRequiredInterfaces(port)) {
            result += " " +  o.getName();
        }
        return result;
    }

}
