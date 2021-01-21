/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Instance} with << MutualExclusionResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8bbcbb37-e062-4506-9b24-7d5bf975b268")
public class MutualExclusionResourceInstance extends ResourceInstance {
    @objid ("258433cc-a25f-42eb-884c-0a3ea2551cc8")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Instance";

    @objid ("0f8ef4aa-2108-47d3-a1a1-24a27daa26f4")
    public static final String MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE = "MutualExclusionResource_Instance_ceiling";

    @objid ("f5688228-397a-4c3f-987f-b05b95fce678")
    public static final String MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Instance_otherProtectProtocol";

    @objid ("b0e45486-68cc-427d-a067-26d943a6b0c1")
    public static final String MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Instance_protectKind";

    @objid ("1c5a6a92-34bb-4c14-83f3-43a70f10aef9")
    public static final String MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE = "MutualExclusionResource_Instance_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MutualExclusionResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9724f500-f658-47fe-9cc7-04c012308806")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MutualExclusionResource_Instance >> then instantiate a {@link MutualExclusionResourceInstance} proxy.
     * 
     * @return a {@link MutualExclusionResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("1ddc11ad-2a6c-4203-bfb5-e1e90a51e330")
    public static MutualExclusionResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceInstance.STEREOTYPE_NAME);
        return MutualExclusionResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceInstance} proxy from a {@link Instance} stereotyped << MutualExclusionResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MutualExclusionResourceInstance} proxy or <i>null</i>.
     */
    @objid ("40491b9a-ca74-45b9-a2a5-83f61817bf3c")
    public static MutualExclusionResourceInstance instantiate(final Instance obj) {
        return MutualExclusionResourceInstance.canInstantiate(obj) ? new MutualExclusionResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceInstance} proxy from a {@link Instance} stereotyped << MutualExclusionResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MutualExclusionResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("955b4396-7e51-43c9-836f-928659202a70")
    public static MutualExclusionResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MutualExclusionResourceInstance.canInstantiate(obj))
        	return new MutualExclusionResourceInstance(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e90428ae-cc55-4ee1-a251-5f7437c89a58")
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
        MutualExclusionResourceInstance other = (MutualExclusionResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("14c8dfe9-8f24-4134-a50d-54d8a230278d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Instance_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b27a2ba-2e45-49f6-a123-d250c28da802")
    public String getMutualExclusionResource_Instance_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Instance_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e6662bae-ebb4-4058-9bc3-4ffb4b5ed8b8")
    public String getMutualExclusionResource_Instance_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Instance_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7f2110b-56de-44ea-a622-6fcdcdc0e004")
    public String getMutualExclusionResource_Instance_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Instance_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5966bc9a-96a2-4163-a596-15f659ddea28")
    public String getMutualExclusionResource_Instance_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("aefefc95-dbb0-4fe7-86a6-458682da734e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Instance_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b499f155-3fc2-4964-957f-29edb463dd59")
    public void setMutualExclusionResource_Instance_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Instance_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b253d83-7a44-489d-a940-1b936961b049")
    public void setMutualExclusionResource_Instance_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Instance_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29bd42e4-f8a2-4f0a-b68a-b5e388a9848a")
    public void setMutualExclusionResource_Instance_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Instance_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bf3035a-0497-45a0-9e13-a1340255c99f")
    public void setMutualExclusionResource_Instance_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceInstance.MdaTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("f6be87b4-79e1-46b9-b3eb-df80e8846225")
    protected MutualExclusionResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("a181f40e-8787-4799-b907-6a4d179aa6e9")
    public static final class MdaTypes {
        @objid ("02e62200-fb50-4826-9673-1f9e5531614c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d31a4553-3d4c-41e6-8da4-5f8516264390")
        public static TagType MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("e91a25eb-4aaa-464e-a014-536894cccfff")
        public static TagType MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT;

        @objid ("591468bc-a85b-4863-ab33-5687d55bfe93")
        public static TagType MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("d0cabaea-9b09-4d76-b19d-4eb0f460d0e9")
        public static TagType MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT;

        @objid ("a75b376b-8bd2-4094-a0b6-7a35a293d76f")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc70c572-1681-4596-8867-df4e293baa01")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac31479f-830c-425a-bac3-83d0013da8ea")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002a77c9-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_INSTANCE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77d0-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_INSTANCE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda18-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_INSTANCE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda1f-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda26-0ccf-11df-8525-001302895b2b");
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
