/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwMutualExclusionResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a998c7d9-9d3f-4d4e-bb91-4ab3f0273941")
public class SwMutualExclusionResourceInstance extends SwSynchronizationResourceInstance {
    @objid ("31b7a250-0693-4008-ab86-ca212798fd68")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Instance";

    @objid ("3049afc6-1258-4c1d-aee1-4ce4dcb04430")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Instance_accessTokenElements";

    @objid ("158eee9c-7a38-40b4-be83-c2cd09090e37")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Instance_acquireServices";

    @objid ("0efdf9fc-bd97-4630-a662-8008cde66d25")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE = "SwMutualExclusionResource_Instance_ceiling";

    @objid ("64982e5a-ecb2-42b2-831e-155ffb68d136")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Instance_concurrentAccessProtocol";

    @objid ("cf83cb5f-abe0-492f-a032-d16c271b5928")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Instance_mechanism";

    @objid ("2a6ed597-6b64-4d44-b9cf-e346c3cf85cc")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Instance_otherProtectProtocol";

    @objid ("c62f3dcf-fb3c-4e5a-a974-3965ff7b69a3")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Instance_protectKind";

    @objid ("0e12f028-a301-4953-adf1-159afbf40613")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Instance_releaseServices";

    @objid ("1c437356-67e5-4f1d-a909-876ac1031191")
    public static final String SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Instance_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwMutualExclusionResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("315da76a-33d1-4f50-a204-ea6932ee7ad2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwMutualExclusionResource_Instance >> then instantiate a {@link SwMutualExclusionResourceInstance} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("99a0d5e4-4501-4106-a901-3db21b709e01")
    public static SwMutualExclusionResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceInstance.STEREOTYPE_NAME);
        return SwMutualExclusionResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceInstance} proxy from a {@link Instance} stereotyped << SwMutualExclusionResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwMutualExclusionResourceInstance} proxy or <i>null</i>.
     */
    @objid ("0532af2b-438c-48c6-a2dc-650146ccb8af")
    public static SwMutualExclusionResourceInstance instantiate(final Instance obj) {
        return SwMutualExclusionResourceInstance.canInstantiate(obj) ? new SwMutualExclusionResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceInstance} proxy from a {@link Instance} stereotyped << SwMutualExclusionResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwMutualExclusionResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9e6622c9-4789-4e92-9ad4-a25778ec8f32")
    public static SwMutualExclusionResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceInstance.canInstantiate(obj))
        	return new SwMutualExclusionResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f39e4c12-1068-4e69-971a-ff7fd45c4ebf")
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
        SwMutualExclusionResourceInstance other = (SwMutualExclusionResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("0af8dccc-eeec-4a69-ba47-39f00a8a29ab")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Instance_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4cb79b90-fd74-4d2f-9776-76a0fb25ad3f")
    public List<String> getSwMutualExclusionResource_Instance_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Instance_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b72a8969-f23e-4b83-ab34-a20d828a88a7")
    public List<String> getSwMutualExclusionResource_Instance_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b061e995-1247-44eb-8ce9-9965c769ff51")
    public String getSwMutualExclusionResource_Instance_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1320525-c5bb-4d6b-aa38-1a298937a93e")
    public String getSwMutualExclusionResource_Instance_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("257d5ed8-3a2c-40ff-a044-3ebe5c55e0aa")
    public String getSwMutualExclusionResource_Instance_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fb07a70-2406-4a59-aff2-2f89814123d9")
    public String getSwMutualExclusionResource_Instance_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e4ff8d71-ca84-4a89-8093-8299dc5bb347")
    public String getSwMutualExclusionResource_Instance_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Instance_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("05171721-4cc1-46ec-bef8-825fe6c0423d")
    public List<String> getSwMutualExclusionResource_Instance_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Instance_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d8919b8-d699-410c-9c60-3761241f4fe9")
    public String getSwMutualExclusionResource_Instance_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("841c02d3-75b3-460a-8f75-31fded64a6f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Instance_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1ab3a16-f190-4875-a897-71e986b6195f")
    public void setSwMutualExclusionResource_Instance_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Instance_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bdcaa7b-07d3-4059-939f-cf0359397161")
    public void setSwMutualExclusionResource_Instance_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("679d8afd-5783-4785-af93-02b1e95b8b84")
    public void setSwMutualExclusionResource_Instance_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9aa93eb2-f2e3-4f12-87fa-34801c464d35")
    public void setSwMutualExclusionResource_Instance_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("332df7c1-fd05-4878-81f8-8d2b56366ee0")
    public void setSwMutualExclusionResource_Instance_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("709c009f-3f35-4bd1-8680-fdf6fcee4824")
    public void setSwMutualExclusionResource_Instance_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b0b98d0-d7fb-4965-b091-a844cbe4c6a1")
    public void setSwMutualExclusionResource_Instance_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Instance_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18cd9b43-9949-48a2-a5de-c0f03a5de01e")
    public void setSwMutualExclusionResource_Instance_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Instance_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5682a980-724c-4a24-bc25-dba3acb6f4aa")
    public void setSwMutualExclusionResource_Instance_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceInstance.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("01110e72-1c50-4e91-a1f9-d82959baa665")
    protected SwMutualExclusionResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("c8e37eea-0e80-4b9a-90bf-647394314422")
    public static final class MdaTypes {
        @objid ("7b290ca0-34d6-4038-95c1-3debdf4ba2f6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e57deab-6248-4b91-8ad2-3f5c1862c7e4")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT;

        @objid ("2ada968d-da62-4b50-ad39-d9c04ffc0005")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("7394b94b-a4e5-4e8d-a304-5a666a541538")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("c1aec6f6-dd3a-4872-b33b-18742b8e3041")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("d3312ec7-9342-484e-adef-1c4ecdf53ee3")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("843857dd-7083-47f9-b7a6-4333c11cd834")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("c17f5781-910e-4096-bdf0-52be67cbd481")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT;

        @objid ("210d2084-db83-4fa0-b77b-58f8cc56cd3a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("2e5f8625-b35f-4829-9470-269ecc4dffc7")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT;

        @objid ("dc963235-66a5-474f-92a8-774efce42d85")
        private static Stereotype MDAASSOCDEP;

        @objid ("efef73dc-f577-47c0-b677-c266e32d6a95")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("690d8c77-7161-4d1b-b257-177601de4f26")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0242e1d5-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442a-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454431-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454438-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245443f-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454446-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e26328c0-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e26328c1-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e2634fd1-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e2634fd2-92ad-11e0-a69d-0027103f347c");
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
