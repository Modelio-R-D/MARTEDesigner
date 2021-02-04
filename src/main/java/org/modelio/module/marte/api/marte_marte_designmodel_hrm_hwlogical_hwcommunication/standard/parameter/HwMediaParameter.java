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
 * Proxy class to handle a {@link Parameter} with << HwMedia_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dfa7716b-27b3-4618-a811-17de200c8757")
public class HwMediaParameter extends HwCommunicationResourceParameter {
    @objid ("5634d0a0-b4b3-49ed-83e6-804764082873")
    public static final String STEREOTYPE_NAME = "HwMedia_Parameter";

    @objid ("a1c2e47d-8472-4ca6-b70d-07e08cdae880")
    public static final String HWMEDIA_PARAMETER_ARBITERS_TAGTYPE = "HwMedia_Parameter_arbiters";

    @objid ("f493132f-bbb1-4514-a3fe-9dd8640fb1d9")
    public static final String HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE = "HwMedia_Parameter_bandwidth";

    /**
     * Tells whether a {@link HwMediaParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMedia_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13177377-917d-4b95-8ad5-1775d948381e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMedia_Parameter >> then instantiate a {@link HwMediaParameter} proxy.
     * 
     * @return a {@link HwMediaParameter} proxy on the created {@link Parameter}.
     */
    @objid ("ecef0f66-1783-4e00-8508-92cb55fa489f")
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
    @objid ("45897cf4-5a0e-475a-a9b5-8b4637abc4d2")
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
    @objid ("6c18636a-12ab-4788-8a70-6bdab6dd245c")
    public static HwMediaParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMediaParameter.canInstantiate(obj))
        	return new HwMediaParameter(obj);
        else
        	throw new IllegalArgumentException("HwMediaParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47f3910c-f2dd-4dac-b338-97a5bdee621f")
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
    @objid ("d777f776-51b8-452a-a736-43e046af9925")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Parameter_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a2fbe7fc-3857-495f-b343-bcbe318ca02a")
    public List<String> getHwMedia_Parameter_arbiters() {
        return this.elt.getTagValues(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Parameter_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0419e786-b38c-453d-8897-d3db76ee9a8d")
    public String getHwMedia_Parameter_bandwidth() {
        return this.elt.getTagValue(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("8ac83310-ff2f-4683-be44-a866594afb7a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Parameter_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5b9b7f7-25b7-4cb2-8180-bdaa5adc7aec")
    public void setHwMedia_Parameter_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Parameter_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d589c27b-1c05-4979-b6d7-8c14e5d3e517")
    public void setHwMedia_Parameter_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("a60c60b7-2097-4fa3-8c75-85d92eb5554b")
    protected HwMediaParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("42289eba-1702-4574-a834-e043c9b594b6")
    public static final class MdaTypes {
        @objid ("3eaabae4-2d61-4ad1-8103-a7ef5f921a5f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd1ae2ef-1246-4117-afb0-0a3dd036c417")
        public static TagType HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT;

        @objid ("a9b84a0e-16ea-4410-91f6-2cf9a0ceac37")
        public static TagType HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT;

        @objid ("cd29ee27-4cc6-4f5b-8765-9e86ec092aa0")
        private static Stereotype MDAASSOCDEP;

        @objid ("30902479-de76-4e43-b2cc-b2cd27426037")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5ced56c-af35-48b9-b64f-cca2026af8ec")
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
