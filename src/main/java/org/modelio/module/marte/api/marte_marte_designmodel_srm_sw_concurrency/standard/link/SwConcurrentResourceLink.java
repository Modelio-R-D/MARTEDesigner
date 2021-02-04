/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SwConcurrentResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0387bfff-36ce-4d2d-b082-e517a2737140")
public class SwConcurrentResourceLink extends SwResourceLink {
    @objid ("77fc7f8e-9746-415a-84a9-20ed10abd796")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Link";

    @objid ("f969ce8a-b360-4a82-8bde-d6da4961aa53")
    public static final String SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Link_activateServices";

    @objid ("b183645a-bc82-443c-81f0-b97391ad1040")
    public static final String SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Link_activationCapacity";

    @objid ("3de09c95-a449-4f63-8fa8-b6bb2f4c836c")
    public static final String SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Link_adressSpace";

    @objid ("7170e89e-58d4-4993-93de-a777e049e822")
    public static final String SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Link_disableConcurrencyServices";

    @objid ("3eebb6a0-3f27-492a-8dcc-55dafcd3be62")
    public static final String SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Link_enableConcurrencyServices";

    @objid ("29d242d9-408e-4297-ba28-6a458e661360")
    public static final String SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Link_entryPoints";

    @objid ("5cd8fb3d-7a9c-4f44-b923-8adbbd66e6fc")
    public static final String SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Link_heapSizeElements";

    @objid ("22992fdb-ca23-457b-8bd6-8db78085177b")
    public static final String SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Link_messageResources";

    @objid ("9da9f259-62b1-4d60-b1ae-7c97008a663d")
    public static final String SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Link_mutualExclusionResources";

    @objid ("20b4e5af-d59e-402f-9f54-c4a235a0e3ab")
    public static final String SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Link_notificationResources";

    @objid ("a8b7b144-4f6f-41cb-981b-1bc6b18f11f5")
    public static final String SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Link_periodElements";

    @objid ("3daa4244-b551-4742-a30e-f3e87c08a348")
    public static final String SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Link_priorityElements";

    @objid ("0de8e760-fb5c-4e92-8f11-ed128ccc88eb")
    public static final String SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Link_resumeServices";

    @objid ("518437c2-b440-4d6e-94e0-a0da5eb5f7ba")
    public static final String SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Link_shareDataResources";

    @objid ("7288f08a-98b0-4065-a535-38bdf71e54ed")
    public static final String SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Link_stackSizeElements";

    @objid ("71de4dfc-d9b8-4275-ac2e-6d84452c22d0")
    public static final String SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Link_suspendServices";

    @objid ("cdd8466a-8cfb-471c-8fac-29c6f6ff553a")
    public static final String SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Link_terminateServices";

    @objid ("16a8da94-d1c2-4ce8-a5d5-1f5fca5c4bfd")
    public static final String SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE = "SwConcurrentResource_Link_type";

    /**
     * Tells whether a {@link SwConcurrentResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwConcurrentResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2db499fe-598d-4c23-9b8d-4d0adb09532e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwConcurrentResource_Link >> then instantiate a {@link SwConcurrentResourceLink} proxy.
     * 
     * @return a {@link SwConcurrentResourceLink} proxy on the created {@link Link}.
     */
    @objid ("fc185872-db31-4c0a-b0c2-f48e0134664b")
    public static SwConcurrentResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLink.STEREOTYPE_NAME);
        return SwConcurrentResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLink} proxy from a {@link Link} stereotyped << SwConcurrentResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwConcurrentResourceLink} proxy or <i>null</i>.
     */
    @objid ("78f607f0-38e0-4d4c-bf28-a53135eda979")
    public static SwConcurrentResourceLink instantiate(final Link obj) {
        return SwConcurrentResourceLink.canInstantiate(obj) ? new SwConcurrentResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLink} proxy from a {@link Link} stereotyped << SwConcurrentResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwConcurrentResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bf939cf0-2a1f-4aca-9e1c-aa2e8cf779fd")
    public static SwConcurrentResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwConcurrentResourceLink.canInstantiate(obj))
        	return new SwConcurrentResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("88efef41-fc93-4d28-9ff3-be833275f6c6")
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
        SwConcurrentResourceLink other = (SwConcurrentResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("c6368548-8af8-4d7d-8fb3-c1c003790b5a")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d7fb1491-8ef2-4c2f-b474-3239257c4fe4")
    public List<String> getSwConcurrentResource_Link_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Link_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3079973-e6d9-4125-8d34-8b20bd4b85b9")
    public String getSwConcurrentResource_Link_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4b335bfe-eaf1-4bf1-8860-ab0f371ce8bf")
    public List<String> getSwConcurrentResource_Link_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b8947572-1dd1-40df-a8f9-5084183f42cf")
    public List<String> getSwConcurrentResource_Link_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d7b6b41f-d01f-4c2d-b12a-530d8a6c5194")
    public List<String> getSwConcurrentResource_Link_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f058b0d1-de99-4994-8beb-f38c6e70eb77")
    public List<String> getSwConcurrentResource_Link_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d6e9298a-ca9f-4c94-a875-b3aee2306e88")
    public List<String> getSwConcurrentResource_Link_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("80a7fc56-3d4e-43cc-9fc5-fcf78892115a")
    public List<String> getSwConcurrentResource_Link_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("536b8c79-b2a3-423c-95e3-f01db063cd92")
    public List<String> getSwConcurrentResource_Link_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("719ffba7-fd31-49e7-8fd3-70ff0783fcd9")
    public List<String> getSwConcurrentResource_Link_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f0eaf637-c635-44e1-8850-c6d314949d82")
    public List<String> getSwConcurrentResource_Link_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("75dd82c7-4478-4c1f-a05d-6aa5235b7beb")
    public List<String> getSwConcurrentResource_Link_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3a4c4bd4-7901-4db1-9959-e1e32f520bf7")
    public List<String> getSwConcurrentResource_Link_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e01e4cdd-916b-4a51-bf0a-3f1d08982b19")
    public List<String> getSwConcurrentResource_Link_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0fc14922-6207-4678-81bd-2898769009cf")
    public List<String> getSwConcurrentResource_Link_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8d4528e8-473c-4f38-985f-3bb06dbfbe98")
    public List<String> getSwConcurrentResource_Link_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ec109223-9596-44d9-8bb7-d6173e5d65b9")
    public List<String> getSwConcurrentResource_Link_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3dafe733-5dac-4f90-a1e7-617f3eddca76")
    public String getSwConcurrentResource_Link_type() {
        return this.elt.getTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT);
    }

    @objid ("4c7091e7-9d31-49da-ba16-7a57fa2cb294")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17ce9167-1738-4fb0-a677-1d3e881fbde6")
    public void setSwConcurrentResource_Link_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Link_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16bed0b0-5f35-4445-8fd5-defd901742bb")
    public void setSwConcurrentResource_Link_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d6d28c3-8bdd-41c9-8312-805b935fdc2b")
    public void setSwConcurrentResource_Link_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2dab6899-93b0-425a-8325-b261842fe27f")
    public void setSwConcurrentResource_Link_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84ca70dd-8ecd-4b1c-a813-f9a03a1720a8")
    public void setSwConcurrentResource_Link_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03bd801d-41ce-474a-8fb2-5e7e110cef63")
    public void setSwConcurrentResource_Link_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60c4a3a6-3d2a-4442-b855-2d514067a4dd")
    public void setSwConcurrentResource_Link_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cbc48c6f-549c-4dd0-85cd-38774f3358c4")
    public void setSwConcurrentResource_Link_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4e6d540-7b68-4a59-994d-fc60bd5507a0")
    public void setSwConcurrentResource_Link_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0895083-ee22-4839-bbf2-e9e0c4492eb4")
    public void setSwConcurrentResource_Link_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("532faebe-066b-4527-875c-9d1f98071a6c")
    public void setSwConcurrentResource_Link_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1458974-d120-4935-8141-f14ff0448b54")
    public void setSwConcurrentResource_Link_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("738f7b63-2954-460b-a461-8123a4ac2a9c")
    public void setSwConcurrentResource_Link_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7290094-2547-451a-bda2-d66829e050e6")
    public void setSwConcurrentResource_Link_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c95a711b-df9e-45bf-a8ed-81b65ad84688")
    public void setSwConcurrentResource_Link_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3fca724e-7021-4c76-947c-c8ebf550437b")
    public void setSwConcurrentResource_Link_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4484ff1c-f33a-4ea5-a71a-b9f752d72f00")
    public void setSwConcurrentResource_Link_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("814aa6be-60ad-4c48-909a-81addb9b7876")
    public void setSwConcurrentResource_Link_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("22ee2e5f-37aa-4057-9b1a-9b97fcc8a01e")
    protected SwConcurrentResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("9bdc2c69-8f0c-4a07-b361-6fb338ddfdcb")
    public static final class MdaTypes {
        @objid ("ac3e3e68-36e6-48de-9f29-b9789cc93cc2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db6c0351-2803-42f6-bc89-7917dc00587a")
        public static TagType SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT;

        @objid ("05516bba-a792-4252-9b13-8a09baa77590")
        public static TagType SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("1c702a88-bdb5-4c67-8468-96f8038aae9e")
        public static TagType SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("d7dab5e6-d778-4729-88fd-df299fb03bb2")
        public static TagType SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("da96ced3-842c-4c3e-9532-a50ec9b67c66")
        public static TagType SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("6558a535-400c-4d11-93cd-634a6c2262e7")
        public static TagType SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("7aac9a82-08ac-4f76-be5f-0de67a0b25f4")
        public static TagType SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("da5592f6-a89f-426e-8013-63ec0ac06cf4")
        public static TagType SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("56aa18d1-52dc-4b6a-b8d8-110a72672501")
        public static TagType SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("2f40dc5d-7698-44f3-a612-c5859d1459b3")
        public static TagType SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("6c2dcf52-304c-4772-9724-f9d54a61e92a")
        public static TagType SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("1414ca31-1c41-45b4-b60c-2df518eaa3a4")
        public static TagType SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("717bef8e-0482-42af-a283-55fe40040ef1")
        public static TagType SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("985b3f8f-e86b-45d8-b6c1-458fbd4a32e6")
        public static TagType SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("9a32d4c5-95d6-4097-bb9a-1fc3f9f8c428")
        public static TagType SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("c1c95e46-d349-4290-a7e7-b2277518e14b")
        public static TagType SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("6d9befa4-6dc5-4b5a-aadb-2987357b0948")
        public static TagType SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("6d2a2aa0-1fdd-44c1-b890-e771e6dc7f4c")
        public static TagType SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("d575123d-5e41-4ece-bfbe-88c960572eaa")
        private static Stereotype MDAASSOCDEP;

        @objid ("3101fe5b-5082-4564-8e2c-ca4ba41f258c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4be03dd9-d2fa-4eb1-acb1-6bb68bb87730")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01b3d69e-0ccf-11df-8525-001302895b2b");
            SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f5-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f6-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f7-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f8-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435f9-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fa-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fb-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fc-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fd-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435fe-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b435ff-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43600-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43601-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43602-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43603-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43604-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43605-172b-11df-b92a-0014222a9f79");
            SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0b43606-172b-11df-b92a-0014222a9f79");
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
