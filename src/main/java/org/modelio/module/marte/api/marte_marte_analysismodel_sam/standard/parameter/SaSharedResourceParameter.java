/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.MutualExclusionResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SaSharedResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaSharedResourceParameter extends MutualExclusionResourceParameter {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Parameter";

    public static final String SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE = "SaSharedResource_Parameter_acquisT";

    public static final String SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE = "SaSharedResource_Parameter_capacity";

    public static final String SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE = "SaSharedResource_Parameter_isConsum";

    public static final String SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE = "SaSharedResource_Parameter_isPreemp";

    public static final String SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE = "SaSharedResource_Parameter_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SaSharedResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SaSharedResource_Parameter >> then instantiate a {@link SaSharedResourceParameter} proxy.
     * 
     * @return a {@link SaSharedResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SaSharedResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceParameter.STEREOTYPE_NAME);
        return SaSharedResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceParameter} proxy from a {@link Parameter} stereotyped << SaSharedResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SaSharedResourceParameter} proxy or <i>null</i>.
     */
    public static SaSharedResourceParameter instantiate(final Parameter obj) {
        return SaSharedResourceParameter.canInstantiate(obj) ? new SaSharedResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceParameter} proxy from a {@link Parameter} stereotyped << SaSharedResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SaSharedResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaSharedResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SaSharedResourceParameter.canInstantiate(obj))
        	return new SaSharedResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceParameter other = (SaSharedResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Parameter_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Parameter_acquisT() {
        return this.elt.getTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Parameter_capacity() {
        return this.elt.getTagValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Parameter_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Parameter_releaseT() {
        return this.elt.getTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Parameter_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Parameter_isConsum() {
        return this.elt.isTagged(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Parameter_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Parameter_isPreemp() {
        return this.elt.isTagged(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Parameter_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Parameter_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Parameter_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Parameter_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Parameter_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Parameter_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Parameter_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Parameter_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Parameter_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03956b4e-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b55-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b5c-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b63-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda3-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cdaa-0ccf-11df-8525-001302895b2b");
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
