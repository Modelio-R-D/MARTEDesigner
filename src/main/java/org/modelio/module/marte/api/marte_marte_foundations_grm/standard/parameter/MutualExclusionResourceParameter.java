/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << MutualExclusionResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MutualExclusionResourceParameter extends ResourceParameter {
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Parameter";

    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE = "MutualExclusionResource_Parameter_ceiling";

    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Parameter_otherProtectProtocol";

    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Parameter_protectKind";

    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE = "MutualExclusionResource_Parameter_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> then instantiate a {@link MutualExclusionResourceParameter} proxy.
     * 
     * @return a {@link MutualExclusionResourceParameter} proxy on the created {@link Parameter}.
     */
    public static MutualExclusionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceParameter.STEREOTYPE_NAME);
        return MutualExclusionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MutualExclusionResourceParameter} proxy or <i>null</i>.
     */
    public static MutualExclusionResourceParameter instantiate(final Parameter obj) {
        return MutualExclusionResourceParameter.canInstantiate(obj) ? new MutualExclusionResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link MutualExclusionResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MutualExclusionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MutualExclusionResourceParameter.canInstantiate(obj))
        	return new MutualExclusionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MutualExclusionResourceParameter other = (MutualExclusionResourceParameter) obj;
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
     * Getter for string property 'MutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Parameter_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Parameter_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Parameter_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Parameter_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Parameter_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Parameter_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Parameter_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Parameter_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected MutualExclusionResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002a77c3-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77ca-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda12-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda19-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda20-0ccf-11df-8525-001302895b2b");
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
