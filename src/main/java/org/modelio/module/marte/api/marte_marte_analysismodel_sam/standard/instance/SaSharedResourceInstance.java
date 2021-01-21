/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.MutualExclusionResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SaSharedResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d956894d-7a0f-47ba-a576-4f2f5648d5cb")
public class SaSharedResourceInstance extends MutualExclusionResourceInstance {
    @objid ("e711fdca-ca65-4f00-87a1-e61af0289e29")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Instance";

    @objid ("557a8b57-c6b8-46cc-b2ad-16dd5b1b61ec")
    public static final String SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE = "SaSharedResource_Instance_acquisT";

    @objid ("27f80e38-a868-4771-807a-e8427e7394f9")
    public static final String SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE = "SaSharedResource_Instance_capacity";

    @objid ("fee2d659-3b60-4afd-a89a-446d54cb3073")
    public static final String SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE = "SaSharedResource_Instance_isConsum";

    @objid ("19ad2142-c071-4f15-8448-739dce029789")
    public static final String SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE = "SaSharedResource_Instance_isPreemp";

    @objid ("7f2111bf-7374-4028-a52e-ced82519a9af")
    public static final String SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE = "SaSharedResource_Instance_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SaSharedResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7538dde3-dd64-4a82-b3ba-4484c952cdd4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SaSharedResource_Instance >> then instantiate a {@link SaSharedResourceInstance} proxy.
     * 
     * @return a {@link SaSharedResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("a9dc7068-4aea-4253-8ae6-e633a40d53dc")
    public static SaSharedResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceInstance.STEREOTYPE_NAME);
        return SaSharedResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceInstance} proxy from a {@link Instance} stereotyped << SaSharedResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SaSharedResourceInstance} proxy or <i>null</i>.
     */
    @objid ("faf194c0-72c3-4645-9ad9-aa31b7aa8b76")
    public static SaSharedResourceInstance instantiate(final Instance obj) {
        return SaSharedResourceInstance.canInstantiate(obj) ? new SaSharedResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceInstance} proxy from a {@link Instance} stereotyped << SaSharedResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SaSharedResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d3d40256-b933-423f-ae43-9e4890b48b56")
    public static SaSharedResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SaSharedResourceInstance.canInstantiate(obj))
        	return new SaSharedResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b115676-beeb-42c4-9fd6-e6ae6262a75d")
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
        SaSharedResourceInstance other = (SaSharedResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("829040c2-0dfa-4acf-9fde-567839ccdebc")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Instance_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("609d3eb1-756e-4139-bd92-496dbea1626c")
    public List<String> getSaSharedResource_Instance_acquisT() {
        return this.elt.getTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8287904-56de-44f1-a037-eb12bb3d234c")
    public String getSaSharedResource_Instance_capacity() {
        return this.elt.getTagValue(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Instance_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fa76c799-0be5-42bd-a8de-d059de52e160")
    public List<String> getSaSharedResource_Instance_releaseT() {
        return this.elt.getTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT);
    }

    @objid ("eee7f3d4-2194-42ea-add8-4ebeed63c31e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Instance_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2808e853-c7df-4240-9e3a-273e5f15094f")
    public boolean isSaSharedResource_Instance_isConsum() {
        return this.elt.isTagged(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Instance_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c804d98-b43d-46cf-a3b3-5adaa98704f1")
    public boolean isSaSharedResource_Instance_isPreemp() {
        return this.elt.isTagged(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Instance_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6189841b-0df9-431d-b83d-dd2052356c88")
    public void setSaSharedResource_Instance_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ec653c5-d8a7-4d4d-adac-1e11675c4294")
    public void setSaSharedResource_Instance_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Instance_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("204b7bf2-20b4-4d55-b9e2-36e3682f1088")
    public void setSaSharedResource_Instance_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Instance_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c42b797c-0e56-4aff-ac5f-7528cafa120e")
    public void setSaSharedResource_Instance_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Instance_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c2952de-8c78-45e2-8d17-3e367c65a337")
    public void setSaSharedResource_Instance_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("2eafe5b3-8ccc-4f5a-9ccd-47e3de4bc2b6")
    protected SaSharedResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("742d7f47-548d-4583-96c7-b53205083d73")
    public static final class MdaTypes {
        @objid ("9ec31f60-8017-4d52-9848-d9afbf08eee6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b6088159-636f-4061-bb28-01546a2b9d04")
        public static TagType SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT;

        @objid ("def03125-6874-480c-8a54-c635f307cb4f")
        public static TagType SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT;

        @objid ("a309dce4-70c7-4409-a01e-8097dce10d5f")
        public static TagType SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT;

        @objid ("43c4d981-0d3b-43d2-bdb1-2bb591fcd9c9")
        public static TagType SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT;

        @objid ("b2d2ed9e-e754-4635-aafa-f445518c372c")
        public static TagType SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT;

        @objid ("6207b4bf-b5df-402a-8b34-debe902416b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("dbbf9621-e291-4328-a767-3da222d42d69")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2dc4c08f-28b1-414b-98a9-0cce89d5e824")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03956b54-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b5b-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b62-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda2-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda9-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cdb0-0ccf-11df-8525-001302895b2b");
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
