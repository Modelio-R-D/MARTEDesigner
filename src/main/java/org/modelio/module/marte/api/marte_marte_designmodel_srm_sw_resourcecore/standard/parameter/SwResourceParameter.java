/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwResourceParameter extends ResourceParameter {
    public static final String STEREOTYPE_NAME = "SwResource_Parameter";

    public static final String SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE = "SwResource_Parameter_createServices";

    public static final String SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE = "SwResource_Parameter_deleteServices";

    public static final String SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Parameter_identifierElements";

    public static final String SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE = "SwResource_Parameter_initializeServices";

    public static final String SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Parameter_memorySizeFootprint";

    public static final String SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE = "SwResource_Parameter_stateElements";

    /**
     * Tells whether a {@link SwResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwResource_Parameter >> then instantiate a {@link SwResourceParameter} proxy.
     * 
     * @return a {@link SwResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SwResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceParameter.STEREOTYPE_NAME);
        return SwResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceParameter} proxy from a {@link Parameter} stereotyped << SwResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwResourceParameter} proxy or <i>null</i>.
     */
    public static SwResourceParameter instantiate(final Parameter obj) {
        return SwResourceParameter.canInstantiate(obj) ? new SwResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceParameter} proxy from a {@link Parameter} stereotyped << SwResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwResourceParameter.canInstantiate(obj))
        	return new SwResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceParameter other = (SwResourceParameter) obj;
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
     * Getter for List<String> property 'SwResource_Parameter_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Parameter_createServices() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Parameter_deleteServices() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Parameter_identifierElements() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Parameter_initializeServices() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Parameter_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Parameter_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Parameter_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Parameter_stateElements() {
        return this.elt.getTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Parameter_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Parameter_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Parameter_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Parameter_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Parameter_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Parameter_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Parameter_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Parameter_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceParameter.MdaTypes.SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a0c40a-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32662-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32669-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32670-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b0-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b7-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_PARAMETER_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588be-0ccf-11df-8525-001302895b2b");
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
