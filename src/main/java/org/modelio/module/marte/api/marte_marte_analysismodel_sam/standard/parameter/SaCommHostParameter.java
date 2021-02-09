/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaCommHostParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SaCommHost_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaCommHostParameter extends GaCommHostParameter {
    public static final String STEREOTYPE_NAME = "SaCommHost_Parameter";

    public static final String SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE = "SaCommHost_Parameter_isSched";

    public static final String SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE = "SaCommHost_Parameter_schSlack";

    /**
     * Tells whether a {@link SaCommHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SaCommHost_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SaCommHost_Parameter >> then instantiate a {@link SaCommHostParameter} proxy.
     * 
     * @return a {@link SaCommHostParameter} proxy on the created {@link Parameter}.
     */
    public static SaCommHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostParameter.STEREOTYPE_NAME);
        return SaCommHostParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostParameter} proxy from a {@link Parameter} stereotyped << SaCommHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SaCommHostParameter} proxy or <i>null</i>.
     */
    public static SaCommHostParameter instantiate(final Parameter obj) {
        return SaCommHostParameter.canInstantiate(obj) ? new SaCommHostParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostParameter} proxy from a {@link Parameter} stereotyped << SaCommHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SaCommHostParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaCommHostParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SaCommHostParameter.canInstantiate(obj))
        	return new SaCommHostParameter(obj);
        else
        	throw new IllegalArgumentException("SaCommHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaCommHostParameter other = (SaCommHostParameter) obj;
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
     * Getter for string property 'SaCommHost_Parameter_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommHost_Parameter_schSlack() {
        return this.elt.getTagValue(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Parameter_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaCommHost_Parameter_isSched() {
        return this.elt.isTagged(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Parameter_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Parameter_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Parameter_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Parameter_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostParameter.MdaTypes.SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT, value);
    }

    protected SaCommHostParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT;

        public static TagType SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9244-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_PARAMETER_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c924b-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9252-0ccf-11df-8525-001302895b2b");
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
