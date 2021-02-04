/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("7995c8d0-7382-4f54-a48f-acb305b549c4")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Lifeline";

    @objid ("56a023e6-14e6-41a6-9f22-42a803c662c1")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Lifeline_accessTokenElements";

    @objid ("d4e2b75f-4088-40b9-98af-855f1d2e66b7")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Lifeline_acquireServices";

    @objid ("fd44cf67-ee0e-46d5-9cf6-8df11cae013e")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE = "SwMutualExclusionResource_Lifeline_ceiling";

    @objid ("359cea82-29e6-45d3-84f6-861b965b0ecf")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Lifeline_concurrentAccessProtocol";

    @objid ("81ef6b48-e349-4860-86bd-a61dfab48f02")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Lifeline_mechanism";

    @objid ("23ff7370-dd69-4dc5-a85b-d4d1a42d84b2")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Lifeline_otherProtectProtocol";

    @objid ("03ea89ed-9bd1-4cb9-ab36-ef969dee6784")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Lifeline_protectKind";

    @objid ("24d63b73-82c6-41bc-a241-1204969076fc")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Lifeline_releaseServices";

    @objid ("a6c9a8ba-6164-4701-89ea-0bfa43271fdb")
    public static final String SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Lifeline_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2e7adb52-5853-4462-8f9f-02b8a4a4b7d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> then instantiate a {@link SwMutualExclusionResourceLifeline} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("99854f28-1a52-437e-8de4-ae7806f70616")
    public static SwMutualExclusionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceLifeline.STEREOTYPE_NAME);
        return SwMutualExclusionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwMutualExclusionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwMutualExclusionResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("8967d5f4-a30c-468c-b058-df88db5f06df")
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
    @objid ("6a6b373d-4c0b-46c9-a8ac-87604e2efb9e")
    public static SwMutualExclusionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceLifeline.canInstantiate(obj))
        	return new SwMutualExclusionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d409c8b-c648-4dd2-819c-2126f8d6049c")
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
    @objid ("3c45eab3-a233-4e98-8c6a-f59d8cc1a40a")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cc3356ee-99e2-4afa-af2a-6ffc02cb4868")
    public List<String> getSwMutualExclusionResource_Lifeline_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cf7a724b-395b-4537-87ea-4342e397b210")
    public List<String> getSwMutualExclusionResource_Lifeline_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("715732ef-027a-42a1-a8da-66904aff65c8")
    public String getSwMutualExclusionResource_Lifeline_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a949e387-6307-42fd-9f31-5732bb0d0bd1")
    public String getSwMutualExclusionResource_Lifeline_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94dcdcc0-b106-47a7-915e-7fe2e025be6d")
    public String getSwMutualExclusionResource_Lifeline_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe0a0f2f-cc9a-4949-997a-567c76adfc8c")
    public String getSwMutualExclusionResource_Lifeline_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60db51e4-f0a0-4a01-985b-e3bfe062586f")
    public String getSwMutualExclusionResource_Lifeline_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Lifeline_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("55cdd588-eaa8-48c4-a472-aa3f42dc3e01")
    public List<String> getSwMutualExclusionResource_Lifeline_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1025055-01d5-4b67-8e2c-5b1859bd7434")
    public String getSwMutualExclusionResource_Lifeline_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("898c191c-b0a1-40b2-b45e-8546d35a37f5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05715dd3-d87b-4d7c-94a7-9be74fd23491")
    public void setSwMutualExclusionResource_Lifeline_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fca2daac-7d92-4c51-a3c5-1e075353276a")
    public void setSwMutualExclusionResource_Lifeline_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17772e9f-2744-4fbc-b738-2d111ab21619")
    public void setSwMutualExclusionResource_Lifeline_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c1f45d5-d96f-43b4-a258-7f054fdbc5bf")
    public void setSwMutualExclusionResource_Lifeline_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecfa7d98-1875-45ba-8137-b4e4380ef7f3")
    public void setSwMutualExclusionResource_Lifeline_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d0b8312-9f59-4dda-9d7f-1455e37a178a")
    public void setSwMutualExclusionResource_Lifeline_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("283ef698-6c02-46aa-96cb-8bf374233aab")
    public void setSwMutualExclusionResource_Lifeline_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Lifeline_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd29623a-cbdc-4c53-8149-f5fa026bac4e")
    public void setSwMutualExclusionResource_Lifeline_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cd73e66-4c55-4cee-b79c-4c13c8e03e7c")
    public void setSwMutualExclusionResource_Lifeline_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceLifeline.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("8c4380fc-5572-404e-aa04-22de6f7af485")
    protected SwMutualExclusionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("4d9bfe11-651a-4995-bc9d-589a827f3397")
    public static final class MdaTypes {
        @objid ("cc9e2c40-d58c-41ad-80cc-81021aea218b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4ae05fd8-3042-4a06-afc0-e9ab5efdf0d5")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_MECHANISM_TAGTYPE_ELT;

        @objid ("0678861d-78d6-486a-8265-67cc4dc75508")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("d17d3e17-b253-4c3e-ba0d-6efb84ff664b")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("b3e0fb00-c199-40d5-b1d1-70c8af03aad6")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("e5f4b76c-104d-4e37-86b1-a471ec6bcc23")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("58f63b4e-70a7-4d15-9f68-be1e2ccd17dc")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("f48f96a9-83bc-4536-a341-f406ca875f53")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT;

        @objid ("297375ee-b82e-4e2e-9da2-3912fc10c996")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("8f3c7376-6a3a-4802-bb4a-017b0fcf3da0")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT;

        @objid ("b5bfb1a3-dfcd-43f4-a726-3063a7fc6df3")
        private static Stereotype MDAASSOCDEP;

        @objid ("da7e4da2-27fd-44f7-89f2-565a832bcab0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5624e893-08b9-4580-b5d7-3baaf18f3c53")
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
