/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
@objid ("52580e54-18ee-491b-b053-d574f39230a0")
public class ResourceParameter {
    @objid ("b3aa8b8a-5019-4821-9d39-a9815579bd34")
    public static final String STEREOTYPE_NAME = "Resource_Parameter";

    @objid ("7952963a-4106-47df-b6d9-4d37af0710e0")
    public static final String RESOURCE_PARAMETER_ISACTIVE_TAGTYPE = "Resource_Parameter_isActive";

    @objid ("de7dc498-2a1e-48cc-9f77-fefd41926db7")
    public static final String RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE = "Resource_Parameter_isProtected";

    @objid ("f98a542d-60e8-48f2-b12f-5520bfcc88d0")
    public static final String RESOURCE_PARAMETER_RESMULT_TAGTYPE = "Resource_Parameter_resMult";

    /**
     * The underlying {@link Parameter} represented by this proxy, never null.
     */
    @objid ("714e69f3-5b91-42c4-b782-fbeefcf933cb")
    protected final Parameter elt;

    /**
     * Tells whether a {@link ResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Resource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0ca30d3c-18dc-4feb-b903-93b75d97bc14")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Resource_Parameter >> then instantiate a {@link ResourceParameter} proxy.
     * 
     * @return a {@link ResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("36c70e6c-ef5f-47a7-80a3-58ca257d4e35")
    public static ResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceParameter.STEREOTYPE_NAME);
        return ResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ResourceParameter} proxy from a {@link Parameter} stereotyped << Resource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ResourceParameter} proxy or <i>null</i>.
     */
    @objid ("8e9fc75b-c252-4c6c-abcd-5cb2324f584d")
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
    @objid ("2b0467aa-9ccd-4012-ac4e-c12c5a0c6bce")
    public static ResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ResourceParameter.canInstantiate(obj))
        	return new ResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aef5cd28-4be2-4a3a-b71f-cd081d0acafe")
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
    @objid ("2748c7b3-cfca-470b-b24d-68513e8cb0b9")
    public Parameter getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Parameter_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92dd76ee-c914-4216-aec6-de84d2572ba6")
    public String getResource_Parameter_resMult() {
        return this.elt.getTagValue(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT);
    }

    @objid ("d5cc9f90-c5c9-4239-a693-3827401830d0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Parameter_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01ef6979-bd9f-4a36-9e3c-0845d5c11b7c")
    public boolean isResource_Parameter_isActive() {
        return this.elt.isTagged(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Parameter_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("285623c5-e5b6-4de7-a0ee-cab60df3f632")
    public boolean isResource_Parameter_isProtected() {
        return this.elt.isTagged(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Parameter_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("714752fb-7b0f-43c6-9d6b-c889c1333d3c")
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
    @objid ("4e7df1b1-4b2a-402a-848b-53bc0bd21842")
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
    @objid ("6081c30a-cb43-4b0c-a51c-d7bf1de883e7")
    public void setResource_Parameter_resMult(final String value) {
        this.elt.putTagValue(ResourceParameter.MdaTypes.RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("ef4eb064-e044-473e-bc65-2a0a5abfb8c3")
    protected ResourceParameter(final Parameter elt) {
        this.elt = elt;
    }

    @objid ("a68dec33-5bac-40c3-bac7-ed816cb48643")
    public static final class MdaTypes {
        @objid ("18240bc8-eb9f-4b34-973a-5c73edc3e06c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d733a89-f537-4f62-98db-a0e8ffe68ab5")
        public static TagType RESOURCE_PARAMETER_RESMULT_TAGTYPE_ELT;

        @objid ("c0740a99-8d87-4d99-abdd-8c39df1d6f73")
        public static TagType RESOURCE_PARAMETER_ISPROTECTED_TAGTYPE_ELT;

        @objid ("f5905502-424a-43b0-9f91-12ff2aca6ebb")
        public static TagType RESOURCE_PARAMETER_ISACTIVE_TAGTYPE_ELT;

        @objid ("2172ef4d-9495-4ef0-a7e0-3f3ace3b2fe7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a59dba8d-122e-46fe-bcef-97087a34925a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cca41e1a-6c9b-4bff-94a6-87d1c9277680")
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
