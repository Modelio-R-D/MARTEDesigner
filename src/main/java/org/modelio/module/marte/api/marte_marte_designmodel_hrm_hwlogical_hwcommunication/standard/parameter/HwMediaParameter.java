/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << HwMedia_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMediaParameter extends HwCommunicationResourceParameter {
    public static final String STEREOTYPE_NAME = "HwMedia_Parameter";

    public static final String HWMEDIA_PARAMETER_ARBITERS_TAGTYPE = "HwMedia_Parameter_arbiters";

    public static final String HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE = "HwMedia_Parameter_bandwidth";

    /**
     * Tells whether a {@link HwMediaParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMedia_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMedia_Parameter >> then instantiate a {@link HwMediaParameter} proxy.
     * 
     * @return a {@link HwMediaParameter} proxy on the created {@link Parameter}.
     */
    public static HwMediaParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaParameter.STEREOTYPE_NAME);
        return HwMediaParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaParameter} proxy from a {@link Parameter} stereotyped << HwMedia_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwMediaParameter} proxy or <i>null</i>.
     */
    public static HwMediaParameter instantiate(final Parameter obj) {
        return HwMediaParameter.canInstantiate(obj) ? new HwMediaParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaParameter} proxy from a {@link Parameter} stereotyped << HwMedia_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwMediaParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMediaParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMediaParameter.canInstantiate(obj))
        	return new HwMediaParameter(obj);
        else
        	throw new IllegalArgumentException("HwMediaParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMediaParameter other = (HwMediaParameter) obj;
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
     * Getter for List<String> property 'HwMedia_Parameter_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMedia_Parameter_arbiters() {
        return this.elt.getTagValues(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Parameter_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMedia_Parameter_bandwidth() {
        return this.elt.getTagValue(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Parameter_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Parameter_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Parameter_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMedia_Parameter_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwMediaParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT;

        public static TagType HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036af3-0ccf-11df-8525-001302895b2b");
            HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0c99c146-1727-11df-b92a-0014222a9f79");
            HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a371b149-5d9c-11df-9e91-0014222a9f79");
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
