/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("bc690429-879b-4e0f-b419-274b425374ee")
    public static final String STEREOTYPE_NAME = "SwConcurrentResource_Link";

    @objid ("f8134a29-6e7b-4bb8-b439-60749421ee06")
    public static final String SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE = "SwConcurrentResource_Link_activateServices";

    @objid ("42d875df-e696-4e6e-a4c2-04975331e65a")
    public static final String SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE = "SwConcurrentResource_Link_activationCapacity";

    @objid ("472d44f7-8b96-4197-8132-2c5bf6c23b52")
    public static final String SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE = "SwConcurrentResource_Link_adressSpace";

    @objid ("7425c94f-e266-49d5-91fa-827c4375bc66")
    public static final String SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Link_disableConcurrencyServices";

    @objid ("4f1fc508-fdb9-4930-a8af-3459726e1356")
    public static final String SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE = "SwConcurrentResource_Link_enableConcurrencyServices";

    @objid ("72feb55f-32fc-4b4f-965e-6cb5346ad114")
    public static final String SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE = "SwConcurrentResource_Link_entryPoints";

    @objid ("28d7e44a-e383-4fb2-ba6b-d5301c3939ef")
    public static final String SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Link_heapSizeElements";

    @objid ("5f28717c-50c6-4ab1-b06b-2f38eb7a9364")
    public static final String SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE = "SwConcurrentResource_Link_messageResources";

    @objid ("d2b525e6-3db0-4054-890e-7eeaedb01fff")
    public static final String SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE = "SwConcurrentResource_Link_mutualExclusionResources";

    @objid ("0754bd77-5415-4d42-b990-d246b5c4cb6a")
    public static final String SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE = "SwConcurrentResource_Link_notificationResources";

    @objid ("f2fc2540-9391-404a-9c6d-8faa3249e5d0")
    public static final String SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE = "SwConcurrentResource_Link_periodElements";

    @objid ("ce8c8ef8-7b4a-43cb-9e28-383baca18f60")
    public static final String SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE = "SwConcurrentResource_Link_priorityElements";

    @objid ("971ae1b2-01f4-44dd-bcb2-329333c23e9e")
    public static final String SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE = "SwConcurrentResource_Link_resumeServices";

    @objid ("de8c7413-89c7-4a28-942e-deb84fe66514")
    public static final String SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE = "SwConcurrentResource_Link_shareDataResources";

    @objid ("b3bfbcfd-53f9-4759-ad45-324ec8619aae")
    public static final String SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE = "SwConcurrentResource_Link_stackSizeElements";

    @objid ("3c8f47b6-54fd-40e3-8a1e-4aaa9a82f8a7")
    public static final String SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE = "SwConcurrentResource_Link_suspendServices";

    @objid ("d25993d2-47bc-4893-9aac-a68dd19ca843")
    public static final String SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE = "SwConcurrentResource_Link_terminateServices";

    @objid ("352f11f5-7fe7-42a7-9bd8-17decd80c923")
    public static final String SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE = "SwConcurrentResource_Link_type";

    /**
     * Tells whether a {@link SwConcurrentResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwConcurrentResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fdce1ca6-7e1b-4322-8f87-48f38eaf7373")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwConcurrentResource_Link >> then instantiate a {@link SwConcurrentResourceLink} proxy.
     * 
     * @return a {@link SwConcurrentResourceLink} proxy on the created {@link Link}.
     */
    @objid ("fe8dfc3b-3a73-492c-8f77-4de7a0da4871")
    public static SwConcurrentResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwConcurrentResourceLink.STEREOTYPE_NAME);
        return SwConcurrentResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwConcurrentResourceLink} proxy from a {@link Link} stereotyped << SwConcurrentResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwConcurrentResourceLink} proxy or <i>null</i>.
     */
    @objid ("94874449-57d4-4dbe-9f56-383f27c02512")
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
    @objid ("118abf31-fbd4-4b45-bd8b-09e1d9031fd9")
    public static SwConcurrentResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwConcurrentResourceLink.canInstantiate(obj))
        	return new SwConcurrentResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwConcurrentResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1a6aeab-d675-4c7c-a825-f41b11234a04")
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
    @objid ("bb1d807a-8a81-46d7-95e5-50947e12a089")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_activateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("55aeaaa6-9e82-4348-8fb7-f82734159c1c")
    public List<String> getSwConcurrentResource_Link_activateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Link_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("687ae258-5af1-47bf-8248-e9878f32057d")
    public String getSwConcurrentResource_Link_activationCapacity() {
        return this.elt.getTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_adressSpace'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6494adff-8457-491d-81f4-d43d43a4d1ba")
    public List<String> getSwConcurrentResource_Link_adressSpace() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_disableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("95ad0c11-4ccb-4800-b40a-c3742918eaf9")
    public List<String> getSwConcurrentResource_Link_disableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_enableConcurrencyServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d8372176-cc24-4ad8-aab5-6c41042bf705")
    public List<String> getSwConcurrentResource_Link_enableConcurrencyServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_entryPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e1398512-e372-4fd7-9f20-6996342f6819")
    public List<String> getSwConcurrentResource_Link_entryPoints() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_heapSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0484b98e-2abd-4421-8a95-d1e76e18f160")
    public List<String> getSwConcurrentResource_Link_heapSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_messageResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8522e3eb-9f10-4e5b-b074-f7a30c788d25")
    public List<String> getSwConcurrentResource_Link_messageResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_mutualExclusionResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f6233e6-f111-45e3-ab5c-ee1cc040553a")
    public List<String> getSwConcurrentResource_Link_mutualExclusionResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_notificationResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("21965cd5-8f07-4f25-ae64-66ac09a5d11c")
    public List<String> getSwConcurrentResource_Link_notificationResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_periodElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0b9eff23-0004-4b73-ba12-a2753dd05392")
    public List<String> getSwConcurrentResource_Link_periodElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_priorityElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ba62ecaa-2e2c-43de-bb5e-1e0eb8bdf058")
    public List<String> getSwConcurrentResource_Link_priorityElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_resumeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6d44b582-9537-4186-859f-249936df6eff")
    public List<String> getSwConcurrentResource_Link_resumeServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_shareDataResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b71ab38a-2fe0-4d1f-af13-0e37e9f4bf3c")
    public List<String> getSwConcurrentResource_Link_shareDataResources() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_stackSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34ec4835-af07-4124-814c-b53007dbe51d")
    public List<String> getSwConcurrentResource_Link_stackSizeElements() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_suspendServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("10d0360b-8faf-4860-af2a-48952aea7e55")
    public List<String> getSwConcurrentResource_Link_suspendServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwConcurrentResource_Link_terminateServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d6f32a71-10c2-4370-81db-d465353f008b")
    public List<String> getSwConcurrentResource_Link_terminateServices() {
        return this.elt.getTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwConcurrentResource_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("602a28d4-5a15-482a-bdee-8fcfb2e0ca3a")
    public String getSwConcurrentResource_Link_type() {
        return this.elt.getTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT);
    }

    @objid ("fc701666-5ac1-4c1f-b04d-ee78a1054f0b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_activateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5e0eb52-47f6-4be4-bf71-5ddc445fb5c7")
    public void setSwConcurrentResource_Link_activateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Link_activationCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0ffa768-f59a-487c-b512-5fc57ff4b5b8")
    public void setSwConcurrentResource_Link_activationCapacity(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_adressSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd8e8e32-8e1d-4cee-b01a-00f7491d97e5")
    public void setSwConcurrentResource_Link_adressSpace(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_disableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17266078-96e6-4368-9b4d-2b7ab497ced2")
    public void setSwConcurrentResource_Link_disableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_enableConcurrencyServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c9479a8-9fd8-4d2c-83a9-6a6f4a37fa3c")
    public void setSwConcurrentResource_Link_enableConcurrencyServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_entryPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d577844-257a-45bd-a8fa-4a4b8acbd7f2")
    public void setSwConcurrentResource_Link_entryPoints(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_heapSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e74e98c-f65f-4c8d-af70-7c3012128bf4")
    public void setSwConcurrentResource_Link_heapSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_messageResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2013187-2fdd-449e-a282-7079037a1141")
    public void setSwConcurrentResource_Link_messageResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_mutualExclusionResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae1d62d7-3518-4b77-b141-e1d66821f16f")
    public void setSwConcurrentResource_Link_mutualExclusionResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_notificationResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c23835ce-f7e2-4567-8533-589a54ce6e05")
    public void setSwConcurrentResource_Link_notificationResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_periodElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a55de387-597a-4a0e-ac43-ec35ef155923")
    public void setSwConcurrentResource_Link_periodElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_priorityElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2682f42-898f-42ce-a9f1-944374015915")
    public void setSwConcurrentResource_Link_priorityElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_resumeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d22d08d-e192-440c-a73a-8682d5e4ad78")
    public void setSwConcurrentResource_Link_resumeServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_shareDataResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf510eff-f619-4e3b-82eb-37e7601698d8")
    public void setSwConcurrentResource_Link_shareDataResources(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_stackSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a3c686d-2233-4cd3-82a0-b26a986fe6f8")
    public void setSwConcurrentResource_Link_stackSizeElements(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_suspendServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d3d920b-cf33-4b5f-a98a-d285efb91f96")
    public void setSwConcurrentResource_Link_suspendServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwConcurrentResource_Link_terminateServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d4cd6b17-9d09-477c-901f-55350a06cd19")
    public void setSwConcurrentResource_Link_terminateServices(final List<String> values) {
        this.elt.putTagValues(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwConcurrentResource_Link_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("073714a5-519a-4aec-83d0-f739b3e2c8d8")
    public void setSwConcurrentResource_Link_type(final String value) {
        this.elt.putTagValue(SwConcurrentResourceLink.MdaTypes.SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("67193877-4e57-4d36-9b2d-85d360d3d9ae")
    protected SwConcurrentResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("9bdc2c69-8f0c-4a07-b361-6fb338ddfdcb")
    public static final class MdaTypes {
        @objid ("a9f7e8e0-9f3b-4258-84d5-a5fabf63628b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("564d16b1-1830-46c5-9acf-76a4fc60ec4e")
        public static TagType SWCONCURRENTRESOURCE_LINK_TYPE_TAGTYPE_ELT;

        @objid ("2c340486-9d4b-4d72-ace6-08b9b37da107")
        public static TagType SWCONCURRENTRESOURCE_LINK_ACTIVATIONCAPACITY_TAGTYPE_ELT;

        @objid ("8f6122a5-2fae-43a9-9b3b-056a6915950d")
        public static TagType SWCONCURRENTRESOURCE_LINK_ENTRYPOINTS_TAGTYPE_ELT;

        @objid ("cadf36af-f1ab-48fb-b82d-15d67c9c000f")
        public static TagType SWCONCURRENTRESOURCE_LINK_ADRESSSPACE_TAGTYPE_ELT;

        @objid ("cf513609-374a-48e3-9b78-6ea58c73af0b")
        public static TagType SWCONCURRENTRESOURCE_LINK_PERIODELEMENTS_TAGTYPE_ELT;

        @objid ("e47285ec-fc3c-463b-a259-c7e086b27275")
        public static TagType SWCONCURRENTRESOURCE_LINK_PRIORITYELEMENTS_TAGTYPE_ELT;

        @objid ("71e47468-1d4f-4ed1-a96d-4fad09450aa6")
        public static TagType SWCONCURRENTRESOURCE_LINK_STACKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("f9b6187e-9d45-449f-b050-440405ab2b34")
        public static TagType SWCONCURRENTRESOURCE_LINK_ACTIVATESERVICES_TAGTYPE_ELT;

        @objid ("78f9caa6-a17e-4697-865d-7c8f06386c9e")
        public static TagType SWCONCURRENTRESOURCE_LINK_ENABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("a7d6717a-bf32-4333-8e52-76fc77717943")
        public static TagType SWCONCURRENTRESOURCE_LINK_RESUMESERVICES_TAGTYPE_ELT;

        @objid ("8f5ea3d2-f337-4bed-a251-e4383686d2c8")
        public static TagType SWCONCURRENTRESOURCE_LINK_SUSPENDSERVICES_TAGTYPE_ELT;

        @objid ("23186dd1-a61b-4982-bd81-a5f9a32b90a4")
        public static TagType SWCONCURRENTRESOURCE_LINK_TERMINATESERVICES_TAGTYPE_ELT;

        @objid ("15d1a9af-6fea-4303-bbd2-32f22b9627f1")
        public static TagType SWCONCURRENTRESOURCE_LINK_DISABLECONCURRENCYSERVICES_TAGTYPE_ELT;

        @objid ("0e7848f0-ad51-4da2-90f6-380c444df84d")
        public static TagType SWCONCURRENTRESOURCE_LINK_SHAREDATARESOURCES_TAGTYPE_ELT;

        @objid ("4300c14c-6418-4d23-97b0-4dd6bcdb2b4f")
        public static TagType SWCONCURRENTRESOURCE_LINK_MESSAGERESOURCES_TAGTYPE_ELT;

        @objid ("f22e36ee-9d32-4677-9882-d81ac55d3574")
        public static TagType SWCONCURRENTRESOURCE_LINK_MUTUALEXCLUSIONRESOURCES_TAGTYPE_ELT;

        @objid ("3995d85c-000e-4bd6-b39d-887876e096de")
        public static TagType SWCONCURRENTRESOURCE_LINK_NOTIFICATIONRESOURCES_TAGTYPE_ELT;

        @objid ("7a1aeb09-1b18-446f-9ada-c8778bf5affb")
        public static TagType SWCONCURRENTRESOURCE_LINK_HEAPSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("040fccfe-74d6-4d82-931d-57541323f6ee")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed5cb36f-16c2-4cf8-89d7-255a6f679a8b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be8f02ae-eed8-4f86-b4d5-4297d7df59d3")
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
