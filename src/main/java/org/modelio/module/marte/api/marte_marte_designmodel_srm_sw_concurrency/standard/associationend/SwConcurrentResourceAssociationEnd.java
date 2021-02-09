/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwConcurrentResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwConcurrentResourceAssociationEnd extends SwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_AssociationEnd";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_activateServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_AssociationEnd_activationCapacity";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_AssociationEnd_adressSpace";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_disableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_enableConcurrencyServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_entryPoints";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_heapSizeElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_messageResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_mutualExclusionResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_notificationResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_periodElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_priorityElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_resumeServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_AssociationEnd_shareDataResources";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_AssociationEnd_stackSizeElements";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_suspendServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_AssociationEnd_terminateServices";

    public static final String SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE = "SwConcurrentResource_AssociationEnd_type";

    /**
     * Tells whether a {@link SwConcurrentResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >> then instantiate a {@link SwConcurrentResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwConcurrentResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SwConcurrentResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceAssociationEnd.STEREOTYPE_NAME);
        return SwConcurrentResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwConcurrentResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static SwConcurrentResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwConcurrentResourceAssociationEnd.canInstantiate(obj) ? new SwConcurrentResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwConcurrentResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwConcurrentResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwConcurrentResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwConcurrentResourceAssociationEnd.canInstantiate(obj))
        	return new SwConcurrentResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SwConcurrentResourceAssociationEnd other = (SwConcurrentResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_AssociationEnd_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_AssociationEnd_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_AssociationEnd_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwConcurrentResource_AssociationEnd_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwConcurrentResource_AssociationEnd_type() {
        return this.elt.getTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_AssociationEnd_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_AssociationEnd_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwConcurrentResource_AssociationEnd_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceAssociationEnd.MdaTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    protected SwConcurrentResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        public static TagType SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69a-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec59-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5a-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5b-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5c-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5d-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5e-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec5f-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec60-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec61-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec62-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec63-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec64-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec65-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec66-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec67-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec68-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec69-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d3d2ec6a-172b-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
