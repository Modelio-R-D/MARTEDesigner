/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << HwASIC_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("594b9910-37ac-4705-8792-5c11a92bc1d7")
public class HwASICParameter extends HwComputingResourceParameter {
    @objid ("b8397d1d-1c8c-4b43-be15-584b1ebc2529")
    public static final String STEREOTYPE_NAME = "HwASIC_Parameter";

    /**
     * Tells whether a {@link HwASICParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwASIC_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("db799325-792c-4616-b883-490a936a1798")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwASIC_Parameter >> then instantiate a {@link HwASICParameter} proxy.
     * 
     * @return a {@link HwASICParameter} proxy on the created {@link Parameter}.
     */
    @objid ("c960571f-59b7-4e98-aae5-2c81625c7adc")
    public static HwASICParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICParameter.STEREOTYPE_NAME);
        return HwASICParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwASICParameter} proxy from a {@link Parameter} stereotyped << HwASIC_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwASICParameter} proxy or <i>null</i>.
     */
    @objid ("7a26571d-48b5-4875-93f5-de02d7a165d6")
    public static HwASICParameter instantiate(final Parameter obj) {
        return HwASICParameter.canInstantiate(obj) ? new HwASICParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICParameter} proxy from a {@link Parameter} stereotyped << HwASIC_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwASICParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eeda9980-a1db-452c-8eed-1deb66853ec9")
    public static HwASICParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwASICParameter.canInstantiate(obj))
        	return new HwASICParameter(obj);
        else
        	throw new IllegalArgumentException("HwASICParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("94571e27-4447-47ef-a9a3-e4c4596812e7")
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
        HwASICParameter other = (HwASICParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("fcac1b15-01d7-4013-88e7-ec5c9e51f35e")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("56317124-eedb-418a-9414-7784f51097d6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("649c9ddc-525a-4294-850e-0b5c765859d0")
    protected HwASICParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("d71371b8-8c34-4824-9163-3eb3e3a387f2")
    public static final class MdaTypes {
        @objid ("1721b5a9-bc18-4205-add1-41a5d94bd2dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("edd76fba-a6e3-46d5-942d-710caa46c360")
        private static Stereotype MDAASSOCDEP;

        @objid ("b20ab230-32fe-45d6-a257-b03c8c495c3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e69d9ac-a485-462c-b776-ed6bd2ff1554")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00e93160-0ccf-11df-8525-001302895b2b");
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
