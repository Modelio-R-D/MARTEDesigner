/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SharedDataComResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SharedDataComResourceParameter extends SwCommunicationResourceParameter {
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Parameter";

    public static final String SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE = "SharedDataComResource_Parameter_readServices";

    public static final String SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE = "SharedDataComResource_Parameter_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SharedDataComResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SharedDataComResource_Parameter >> then instantiate a {@link SharedDataComResourceParameter} proxy.
     * 
     * @return a {@link SharedDataComResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SharedDataComResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceParameter.STEREOTYPE_NAME);
        return SharedDataComResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceParameter} proxy from a {@link Parameter} stereotyped << SharedDataComResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SharedDataComResourceParameter} proxy or <i>null</i>.
     */
    public static SharedDataComResourceParameter instantiate(final Parameter obj) {
        return SharedDataComResourceParameter.canInstantiate(obj) ? new SharedDataComResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceParameter} proxy from a {@link Parameter} stereotyped << SharedDataComResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SharedDataComResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SharedDataComResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SharedDataComResourceParameter.canInstantiate(obj))
        	return new SharedDataComResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SharedDataComResourceParameter other = (SharedDataComResourceParameter) obj;
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
     * Getter for List<String> property 'SharedDataComResource_Parameter_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Parameter_readServices() {
        return this.elt.getTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Parameter_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Parameter_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Parameter_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Parameter_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Parameter_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Parameter_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceParameter.MdaTypes.SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected SharedDataComResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "021a5a60-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_PARAMETER_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0221815c-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_PARAMETER_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218163-0ccf-11df-8525-001302895b2b");
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
