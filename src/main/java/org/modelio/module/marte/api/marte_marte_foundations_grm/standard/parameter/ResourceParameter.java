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
 * Proxy class to handle a {@link Parameter} with << Resource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ResourceParameter {
    public static final String STEREOTYPE_NAME = "Resource_Parameter";

    public static final String RESOURCE_PARAMETER_ISACTIVE_TAGTYPE = "Resource_Parameter_isActive";

    public static final String RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE = "Resource_Parameter_isProtected";

    public static final String RESOURCE_PARAMETER_RESMULT_TAGTYPE = "Resource_Parameter_resMult";

    /**
     * The underlying {@link Parameter} represented by this proxy, never null.
     */
    protected final Parameter elt;

    /**
     * Tells whether a {@link ResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Resource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Resource_Parameter >> then instantiate a {@link ResourceParameter} proxy.
     * 
     * @return a {@link ResourceParameter} proxy on the created {@link Parameter}.
     */
    public static ResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceParameter.STEREOTYPE_NAME);
        return ResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ResourceParameter} proxy from a {@link Parameter} stereotyped << Resource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ResourceParameter} proxy or <i>null</i>.
     */
    public static ResourceParameter instantiate(final Parameter obj) {
        return ResourceParameter.canInstantiate(obj) ? new ResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceParameter} proxy from a {@link Parameter} stereotyped << Resource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link ResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ResourceParameter.canInstantiate(obj))
        	return new ResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ResourceParameter other = (ResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    public Parameter getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Parameter_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_Parameter_resMult() {
        return this.elt.getTagValue(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Parameter_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Parameter_isActive() {
        return this.elt.isTagged(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Parameter_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Parameter_isProtected() {
        return this.elt.isTagged(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Parameter_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Parameter_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Parameter_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Parameter_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Parameter_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setResource_Parameter_resMult(final String value) {
        this.elt.putTagValue(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceParameter(final Parameter elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcee4-0cce-11df-8525-001302895b2b");
            RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29380-0cce-11df-8525-001302895b2b");
            RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29387-0cce-11df-8525-001302895b2b");
            RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2938e-0cce-11df-8525-001302895b2b");
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
