/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance;

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
public class SaSharedResourceInstance extends MutualExclusionResourceInstance {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Instance";

    public static final String SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE = "SaSharedResource_Instance_acquisT";

    public static final String SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE = "SaSharedResource_Instance_capacity";

    public static final String SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE = "SaSharedResource_Instance_isConsum";

    public static final String SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE = "SaSharedResource_Instance_isPreemp";

    public static final String SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE = "SaSharedResource_Instance_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SaSharedResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SaSharedResource_Instance >> then instantiate a {@link SaSharedResourceInstance} proxy.
     * 
     * @return a {@link SaSharedResourceInstance} proxy on the created {@link Instance}.
     */
    public static SaSharedResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceInstance.STEREOTYPE_NAME);
        return SaSharedResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceInstance} proxy from a {@link Instance} stereotyped << SaSharedResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SaSharedResourceInstance} proxy or <i>null</i>.
     */
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
    public static SaSharedResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SaSharedResourceInstance.canInstantiate(obj))
        	return new SaSharedResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceInstance other = (SaSharedResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Instance_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Instance_acquisT() {
        return this.elt.getTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Instance_capacity() {
        return this.elt.getTagValue(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Instance_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Instance_releaseT() {
        return this.elt.getTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Instance_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Instance_isConsum() {
        return this.elt.isTagged(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Instance_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Instance_isPreemp() {
        return this.elt.isTagged(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Instance_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Instance_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Instance_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Instance_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Instance_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setSaSharedResource_Instance_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceInstance.MdaTypes.SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_INSTANCE_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_INSTANCE_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_INSTANCE_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_INSTANCE_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_INSTANCE_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
