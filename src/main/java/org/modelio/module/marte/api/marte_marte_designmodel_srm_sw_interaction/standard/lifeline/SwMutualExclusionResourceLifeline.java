/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwMutualExclusionResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("626e975c-ff2f-4a85-9224-b90e81752e2b")
public class SwMutualExclusionResourceLifeline extends SwSynchronizationResourceLifeline {
    @objid ("0206e92c-6bc6-45be-aa6a-5c9e436df804")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Lifeline";

    @objid ("758466f1-be08-4064-b0b7-ec63134a0ca4")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Lifeline_accessTokenElements";

    @objid ("0eca987a-d4cc-45f3-af51-dcdfd9975ef4")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Lifeline_acquireServices";

    @objid ("4f8bd2b3-b378-40a2-9d98-1646381b51d8")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE = "SwMutualExclusionResource_Lifeline_ceiling";

    @objid ("a5aa61c6-9950-469e-9e24-0f1c108b8a3d")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Lifeline_concurrentAccessProtocol";

    @objid ("714ac6e2-c947-4104-baca-45e5601ba425")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Lifeline_mechanism";

    @objid ("08ce0eaf-2c7d-456c-8302-a6f6a2b3b173")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Lifeline_otherProtectProtocol";

    @objid ("8b375002-48fb-47c0-8eff-c2b0d692f15b")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Lifeline_protectKind";

    @objid ("e146ba29-d9a0-4a2b-a475-56a88fb22569")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Lifeline_releaseServices";

    @objid ("e3d83eb7-4902-4d79-8dc2-505511e7830e")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Lifeline_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b641df15-66c4-4395-ade3-f2a40bf4b122")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> then instantiate a {@link SwMutualExclusionResourceLifeline} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("ccfdc2ee-3057-4450-891f-2f6139b81c4d")
    public static SwMutualExclusionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLifeline.STEREOTYPE_NAME);
        return SwMutualExclusionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwMutualExclusionResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("dc8bcef1-962e-487c-8519-9d8809fb1dba")
    public static SwMutualExclusionResourceLifeline instantiate(final Lifeline obj) {
        return SwMutualExclusionResourceLifeline.canInstantiate(obj) ? new SwMutualExclusionResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwMutualExclusionResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b75ebf97-6835-4b95-9f88-64a14c213f72")
    public static SwMutualExclusionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceLifeline.canInstantiate(obj))
        	return new SwMutualExclusionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d7a97a8-5762-4513-8e49-c519bb00f9d9")
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
        SwMutualExclusionResourceLifeline other = (SwMutualExclusionResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("057730de-583a-4a3b-af8a-5a0406fa9b5d")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cc5d6f3f-beef-4971-ad9d-e8d58ff7b70d")
    public List<String> getSwMutualExclusionResource_Lifeline_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8bce9d0a-9fe3-42b9-bef5-f443a8f787ed")
    public List<String> getSwMutualExclusionResource_Lifeline_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa62ae7d-5cde-499f-a91a-fc2f9c98e75f")
    public String getSwMutualExclusionResource_Lifeline_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b480d73-52ed-4643-9e64-c7ea9762caed")
    public String getSwMutualExclusionResource_Lifeline_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52dd2801-a7a7-4ffd-8707-5cd07312c384")
    public String getSwMutualExclusionResource_Lifeline_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c52e8e87-3a8a-45de-a4d8-d099c99a7bc0")
    public String getSwMutualExclusionResource_Lifeline_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77145c7d-c532-46c7-9931-ba79a4623fa1")
    public String getSwMutualExclusionResource_Lifeline_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e49231fa-3d4e-41b2-a01b-9795e476f014")
    public List<String> getSwMutualExclusionResource_Lifeline_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fa2f36c-c1f0-4a22-9e80-faf6ec1f20f7")
    public String getSwMutualExclusionResource_Lifeline_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("8b03127a-1610-4ae5-a3ef-d0c99676ab3f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e19ded7-3ece-4099-bc6b-50a55bf392de")
    public void setSwMutualExclusionResource_Lifeline_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8d9eee8-4710-4b35-bf3f-3b2ed4772afb")
    public void setSwMutualExclusionResource_Lifeline_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04d566d1-4ab4-4728-8206-a988db00424e")
    public void setSwMutualExclusionResource_Lifeline_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f709e74-d680-40a7-a20b-a4caf0842953")
    public void setSwMutualExclusionResource_Lifeline_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b27f09c7-cc4a-4564-a24c-073296c0c124")
    public void setSwMutualExclusionResource_Lifeline_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c49db7e3-4afd-4cff-b86c-05d4dcbc345e")
    public void setSwMutualExclusionResource_Lifeline_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38ada62e-3b99-40b7-ab62-12dc1bc8c2a5")
    public void setSwMutualExclusionResource_Lifeline_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d85df71-fd5c-4192-897c-1c1922c0ad9a")
    public void setSwMutualExclusionResource_Lifeline_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7498a901-8479-4442-a32f-e4e4c28bfe34")
    public void setSwMutualExclusionResource_Lifeline_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("ba2a9e43-bad0-46ff-9253-47b5a84a5c9d")
    protected SwMutualExclusionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("4d9bfe11-651a-4995-bc9d-589a827f3397")
    public static final class MdaTypes {
        @objid ("1effbc0a-65c1-4e24-a414-70b4e3c36fb8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e2889b2-6db4-459a-b327-7a95f72e08e2")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT;

        @objid ("dc8b0782-1b3b-4d39-bcdc-540d5df5b5a9")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("4796aeee-3316-4a4d-a498-1b778aeef2cb")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("7cbc7183-9664-4014-8107-48d9dcb17e18")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("47fa1e35-2572-47c6-b7d1-eb870b05e511")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("1dd8446d-3164-4291-bdf7-66e33eab5cbd")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("bfca2a3e-b120-45c7-bab5-3f255b7a9142")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT;

        @objid ("a87a656e-e2a0-4a45-9402-0fc835f3a623")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("a007e1ab-d6b8-4628-9ddb-1c708cce6d5b")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT;

        @objid ("77df2c1b-b37d-478d-907b-ce30b60e2ab8")
        private static Stereotype MDAASSOCDEP;

        @objid ("e19e17a5-5801-4f12-81c7-42381a7b6369")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac1b5bfb-d875-4722-a832-a77ff8e18699")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84f6ccea-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6cceb-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6ccec-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6cced-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6ccee-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "84f6ccef-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36ed33a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36ed33b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36ed33c-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e36efa4b-92ad-11e0-a69d-0027103f347c");
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
