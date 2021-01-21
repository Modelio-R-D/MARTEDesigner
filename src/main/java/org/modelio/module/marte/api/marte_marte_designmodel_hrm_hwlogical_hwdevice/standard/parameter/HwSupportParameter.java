/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << HwSupport_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c07a40a9-b61d-4092-837d-daeccc21fe46")
public class HwSupportParameter extends HwDeviceParameter {
    @objid ("af6608a7-1d82-4d6a-a788-c60552e92bce")
    public static final String STEREOTYPE_NAME = "HwSupport_Parameter";

    /**
     * Tells whether a {@link HwSupportParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwSupport_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("13fcecbd-beee-4e0e-9756-eb6ec4fd6ddc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwSupport_Parameter >> then instantiate a {@link HwSupportParameter} proxy.
     * 
     * @return a {@link HwSupportParameter} proxy on the created {@link Parameter}.
     */
    @objid ("06c15219-6ff9-4c8e-b6f7-0f9312d8d894")
    public static HwSupportParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportParameter.STEREOTYPE_NAME);
        return HwSupportParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportParameter} proxy from a {@link Parameter} stereotyped << HwSupport_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwSupportParameter} proxy or <i>null</i>.
     */
    @objid ("2ba9c32c-baef-4c68-bd81-fff091f724e9")
    public static HwSupportParameter instantiate(final Parameter obj) {
        return HwSupportParameter.canInstantiate(obj) ? new HwSupportParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportParameter} proxy from a {@link Parameter} stereotyped << HwSupport_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwSupportParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("042feb33-13c0-4654-9a48-a59c300a885b")
    public static HwSupportParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwSupportParameter.canInstantiate(obj))
        	return new HwSupportParameter(obj);
        else
        	throw new IllegalArgumentException("HwSupportParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04060388-5699-441f-a70b-7a12b7861478")
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
        HwSupportParameter other = (HwSupportParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("5ef12287-f178-45c1-8e65-ab0c03eecdc5")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("e036e580-c9d5-4f78-a5b5-6a4f91a40e17")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("26930c41-4b97-4bbf-a453-2486e76809b9")
    protected HwSupportParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("f1875941-f466-460f-879c-e091d4f7767e")
    public static final class MdaTypes {
        @objid ("fa4bd89e-07bf-4a54-9040-50d602ffc947")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b38ae0ea-3a6a-4a6a-95fa-0dbda1cb511c")
        private static Stereotype MDAASSOCDEP;

        @objid ("0159fb25-fa3e-4c2c-a376-ff8922213e31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fbd77660-f3b4-476d-9a3e-dee55b8a2328")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "013ca296-0ccf-11df-8525-001302895b2b");
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
