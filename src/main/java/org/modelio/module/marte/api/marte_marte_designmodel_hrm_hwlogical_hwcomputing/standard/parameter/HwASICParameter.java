/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("91582f6e-b1f8-4813-b6de-fc226992cdbb")
    public static final String STEREOTYPE_NAME = "HwASIC_Parameter";

    /**
     * Tells whether a {@link HwASICParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwASIC_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cbdaff83-5e6d-4cdf-8e14-e9f6c9ee3e5a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwASIC_Parameter >> then instantiate a {@link HwASICParameter} proxy.
     * 
     * @return a {@link HwASICParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a44ad28c-ca29-47ae-a3b4-553cb1c195bb")
    public static HwASICParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICParameter.STEREOTYPE_NAME);
        return HwASICParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwASICParameter} proxy from a {@link Parameter} stereotyped << HwASIC_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwASICParameter} proxy or <i>null</i>.
     */
    @objid ("6a4d04f9-c7db-48a7-b0a7-c859387f4b74")
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
    @objid ("364a82a1-0ebd-479e-8375-66bed350de04")
    public static HwASICParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwASICParameter.canInstantiate(obj))
        	return new HwASICParameter(obj);
        else
        	throw new IllegalArgumentException("HwASICParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b545047-b796-482a-8936-a06c70fb50b4")
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
    @objid ("be9ef2e9-f21c-4c35-a980-745ae3799316")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("39556711-8b6e-4b72-a74b-74feed0b9c70")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b49e6ed7-10a7-440d-bbb1-4d2ee7820ad2")
    protected HwASICParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("d71371b8-8c34-4824-9163-3eb3e3a387f2")
    public static final class MdaTypes {
        @objid ("ded42743-85a0-4d2a-b467-75c407ed1f5c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60afa6b2-3779-427b-93c3-5f590d8a56bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("27904357-b11c-4787-bf98-64e44522784a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8aae913-7d6b-4d99-a048-5322b9a900e1")
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
