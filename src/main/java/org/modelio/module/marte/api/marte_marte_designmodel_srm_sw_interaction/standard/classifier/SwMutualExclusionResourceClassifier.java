/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwMutualExclusionResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("be1b890c-83de-4c87-a905-754e754a8588")
public class SwMutualExclusionResourceClassifier extends SwSynchronizationResourceClassifier {
    @objid ("3c17bc74-fa33-473b-9539-89d9ca2ae4ff")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Classifier";

    @objid ("00cc1274-3a82-49a7-b37e-ac50b0ec8c0f")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Classifier_accessTokenElements";

    @objid ("23447997-c929-4226-9ae0-167b47492c98")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Classifier_acquireServices";

    @objid ("54f106cb-3df6-48d3-9c6c-ee0f1f53b69b")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE = "SwMutualExclusionResource_Classifier_ceiling";

    @objid ("adedbb32-68a7-4604-8a0f-7be6f56f5265")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Classifier_concurrentAccessProtocol";

    @objid ("9127551b-3ddd-45db-9c0f-0ab21e62e29b")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Classifier_mechanism";

    @objid ("671da508-c6b4-47d5-bbf3-cb40c581ff1e")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Classifier_otherProtectProtocol";

    @objid ("335c1292-9116-476c-bbe1-65d091bfbc14")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Classifier_protectKind";

    @objid ("90cc6b00-b4d5-4214-8402-c936e932b20c")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Classifier_releaseServices";

    @objid ("5b669177-6367-4911-bd99-d1e897b551b9")
    public static final String SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Classifier_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8c17c8df-9eff-460f-b90c-436b3e0126ee")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >> then instantiate a {@link SwMutualExclusionResourceClassifier} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("18329c7e-d9fc-4a53-b0b4-5868309c2826")
    public static SwMutualExclusionResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceClassifier.STEREOTYPE_NAME);
        return SwMutualExclusionResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwMutualExclusionResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("dc314801-8c07-47a4-a5e8-4ead26bd03cb")
    public static SwMutualExclusionResourceClassifier instantiate(final Classifier obj) {
        return SwMutualExclusionResourceClassifier.canInstantiate(obj) ? new SwMutualExclusionResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << SwMutualExclusionResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwMutualExclusionResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0d4eb541-2faf-42c7-8a50-5b711f7657aa")
    public static SwMutualExclusionResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceClassifier.canInstantiate(obj))
        	return new SwMutualExclusionResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("431286b2-819e-4c00-916d-752430e53e4d")
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
        SwMutualExclusionResourceClassifier other = (SwMutualExclusionResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("73c2d64e-8eaf-4bc6-84f0-15b9002254bf")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Classifier_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("138b7ef6-55cd-4af9-8eec-bfcb19d2fb27")
    public List<String> getSwMutualExclusionResource_Classifier_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Classifier_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cf61e8d3-2f15-40e8-a9f2-afcbd8999749")
    public List<String> getSwMutualExclusionResource_Classifier_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bf7ecce-2741-442d-bce2-e97be22e5294")
    public String getSwMutualExclusionResource_Classifier_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe272a29-4117-492d-9223-7dcf5cdda4e3")
    public String getSwMutualExclusionResource_Classifier_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db67dec7-a3c8-4514-996a-b164a61643be")
    public String getSwMutualExclusionResource_Classifier_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7024869a-d64d-4ce4-a924-40734d4a0489")
    public String getSwMutualExclusionResource_Classifier_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("403b21fe-71d8-4fff-a5e6-60368823ce2b")
    public String getSwMutualExclusionResource_Classifier_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Classifier_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b43cc199-8891-4651-a546-090d8223d12c")
    public List<String> getSwMutualExclusionResource_Classifier_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("411d90cd-37c3-4272-bb6c-22fe71330ffa")
    public String getSwMutualExclusionResource_Classifier_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("5c8e75a5-fc18-4c77-b019-599b88783619")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Classifier_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1463eb9d-2509-4a55-a646-70b7bae1ede3")
    public void setSwMutualExclusionResource_Classifier_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Classifier_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3d86ab2-3129-49a3-907f-2e3acc159943")
    public void setSwMutualExclusionResource_Classifier_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c540b9c-e6f2-47fe-a253-aab61add7c90")
    public void setSwMutualExclusionResource_Classifier_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57c9c210-9331-4824-80be-4ab10c9a7dbc")
    public void setSwMutualExclusionResource_Classifier_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c222c6dd-80ac-4a30-ab31-5d9062237488")
    public void setSwMutualExclusionResource_Classifier_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1828cef4-0ebf-4a90-bdbb-9e7428926e94")
    public void setSwMutualExclusionResource_Classifier_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39302f45-9b33-4879-a65a-6eb1c7a31351")
    public void setSwMutualExclusionResource_Classifier_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Classifier_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78958cff-05a0-4ccb-9ef3-aff973bb1a02")
    public void setSwMutualExclusionResource_Classifier_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2d1d331-ce29-4d2a-9205-46ead3640ba3")
    public void setSwMutualExclusionResource_Classifier_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceClassifier.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("af4d6d37-c40e-40b0-93d6-6d02fde23c42")
    protected SwMutualExclusionResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("768dc29b-d61f-4781-81a8-91a300a1bf54")
    public static final class MdaTypes {
        @objid ("d3abd493-aed8-41c7-8ae3-7da9ada39d84")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96e4d4e4-08cb-4528-bd21-45e1693dabef")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT;

        @objid ("7896ddf5-1b7b-4e99-8da1-7c8a3c906ef3")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("320de578-b828-4264-a4c7-21d05a80aa51")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("1984f339-865e-44da-83a9-15616a75127a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("904faba5-fd3f-478f-be1b-cca15556c443")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("38623e29-8aed-4a4c-abb1-c8dd8ddf4bc1")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT;

        @objid ("18ca9946-bdb1-427f-a8e6-b96f05e03837")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT;

        @objid ("f2b7bffe-adab-4c11-807f-1559394446cc")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("87e11140-8509-42eb-8476-c3fedd2b646e")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT;

        @objid ("32331332-064e-4f87-83a1-301494357c42")
        private static Stereotype MDAASSOCDEP;

        @objid ("61759055-d9b1-47eb-9347-1441809d635c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9305a230-f98f-4226-9017-d7be698393f2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "851a905d-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a905e-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a905f-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a9060-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a9061-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851a9062-10d9-11df-81d9-0014222a9f79");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d5ff2-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d8703-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d8704-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e12d8705-92ad-11e0-a69d-0027103f347c");
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
