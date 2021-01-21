/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwMutualExclusionResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2905a70e-841c-4307-bd9d-47e1e02bc49d")
public class SwMutualExclusionResourceAttribute extends SwSynchronizationResourceAttribute {
    @objid ("4ec18c05-546f-43ff-bb4c-f40d0c6ff922")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Attribute";

    @objid ("0a9621ed-1c26-43a7-8365-3e5c711621f1")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Attribute_accessTokenElements";

    @objid ("6a9ec562-ecf1-4c84-bb48-9c7c7b086306")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Attribute_acquireServices";

    @objid ("f27cc6bd-9fdc-48ca-8386-8ba16245c558")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE = "SwMutualExclusionResource_Attribute_ceiling";

    @objid ("5ceb0b98-d165-404b-bece-afc48bb864be")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Attribute_concurrentAccessProtocol";

    @objid ("d26a5fd3-5880-4232-a6a0-a187d01e5655")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Attribute_mechanism";

    @objid ("4447aab7-1e74-48ad-a398-19152793b0e1")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Attribute_otherProtectProtocol";

    @objid ("a8ee9aa7-0cde-4db7-a785-b17ddc1ac68f")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Attribute_protectKind";

    @objid ("9a9c2804-6aa0-48e4-8c4f-91ff4ee48179")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Attribute_releaseServices";

    @objid ("39d6c768-fc61-411c-a8d4-f7af396717a1")
    public static final String SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Attribute_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("13610875-b34a-4777-9364-4136a770319b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >> then instantiate a {@link SwMutualExclusionResourceAttribute} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("4f982c09-86f4-4732-bf09-6bb46a2d1d1f")
    public static SwMutualExclusionResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceAttribute.STEREOTYPE_NAME);
        return SwMutualExclusionResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwMutualExclusionResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("3358d0f6-6966-4eb3-be8b-6ba2e7308a5e")
    public static SwMutualExclusionResourceAttribute instantiate(final Attribute obj) {
        return SwMutualExclusionResourceAttribute.canInstantiate(obj) ? new SwMutualExclusionResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwMutualExclusionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwMutualExclusionResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("48f91287-fdf3-439d-9f1a-4b89a80da939")
    public static SwMutualExclusionResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceAttribute.canInstantiate(obj))
        	return new SwMutualExclusionResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e2076392-b670-4b61-a425-37598f5e1b74")
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
        SwMutualExclusionResourceAttribute other = (SwMutualExclusionResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("5352a327-295b-4e34-9ebb-ee03a48be393")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Attribute_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ef83d2b5-bf96-4595-96f7-d6199de1db3e")
    public List<String> getSwMutualExclusionResource_Attribute_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Attribute_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4140b147-f976-4a96-bbb5-a446552152e8")
    public List<String> getSwMutualExclusionResource_Attribute_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ef443ba-7d89-4768-8831-9c1ca17310ce")
    public String getSwMutualExclusionResource_Attribute_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5785ba67-b3ae-4c64-8a1d-5ede28a18dcf")
    public String getSwMutualExclusionResource_Attribute_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f3ed8a5-9728-4c96-9bc8-cdf0090a9f05")
    public String getSwMutualExclusionResource_Attribute_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8f2769a-e599-4cee-b544-618101271656")
    public String getSwMutualExclusionResource_Attribute_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("927f0398-bfb5-42f2-a382-0a040bfdf110")
    public String getSwMutualExclusionResource_Attribute_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Attribute_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a6a8f154-1f1b-4154-9728-e8eb38446d35")
    public List<String> getSwMutualExclusionResource_Attribute_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34944aa8-1edf-421a-bd32-cbcdb0ea9911")
    public String getSwMutualExclusionResource_Attribute_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("929fc149-2584-441d-affd-9b912e85b59b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Attribute_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9bd1fcf-7e20-4b64-a069-de2b5bcd0f17")
    public void setSwMutualExclusionResource_Attribute_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Attribute_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b949546-5258-47c4-ae08-bf33c789c658")
    public void setSwMutualExclusionResource_Attribute_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57ab3adf-4c21-43d7-9801-0f500e882223")
    public void setSwMutualExclusionResource_Attribute_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52dfb2be-28b3-4907-b4f9-aba6f072b639")
    public void setSwMutualExclusionResource_Attribute_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83d76ec5-dfa0-477e-8b8b-e2b6145b4fe8")
    public void setSwMutualExclusionResource_Attribute_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b46fa7fe-deae-4dd8-87c4-0dec24a1713e")
    public void setSwMutualExclusionResource_Attribute_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("abfb5bfa-070b-416b-b243-c1922e70fa2f")
    public void setSwMutualExclusionResource_Attribute_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Attribute_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b787c03-a21f-4d59-b8bf-71118dbb6102")
    public void setSwMutualExclusionResource_Attribute_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4725dbe6-c031-4e02-840f-39458e91d168")
    public void setSwMutualExclusionResource_Attribute_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceAttribute.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("16ca4f4a-1cdb-4afe-a3fa-b97d36cc43d5")
    protected SwMutualExclusionResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("d9606ee6-9a5d-4095-9843-cc63512d6d96")
    public static final class MdaTypes {
        @objid ("05ce383e-e87c-4050-becf-0a18ecf319bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a64977c4-1397-4a4e-a120-89a34e627a5e")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT;

        @objid ("411fffb0-c491-48b3-b662-8189f7a1d3d7")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("3d1f6f80-6251-483b-976a-aaee50cf5b1f")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("46e0312e-d69d-49b7-95f9-63d99ac06453")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("ed2cad38-a9be-47f8-9281-2af9432f246d")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("d2634cd0-1dda-4419-a79d-df9714e3a7f8")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("c510b982-6ccb-4e80-9b1a-07f0882b516c")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT;

        @objid ("7b94316d-ca29-4ea9-80b7-bc1923803b42")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("e98aa8f4-a020-45d2-bac2-88e73ddd20c6")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT;

        @objid ("dc649905-0561-4255-9848-06dd4ff160a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa3c5f0e-0089-42c5-9137-1a342dc00cd0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9531664c-1392-497c-8bb6-2b381c6ce2a0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0242e1d2-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454427-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442e-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454435-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443c-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454443-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201c-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201d-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dfe5201e-92ad-11e0-a69d-0027103f347c");
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
