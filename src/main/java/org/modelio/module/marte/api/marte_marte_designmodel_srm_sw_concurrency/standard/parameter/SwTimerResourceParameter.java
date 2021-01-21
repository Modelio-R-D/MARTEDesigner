/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimerResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwTimerResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9dc45126-3cfb-4819-aa59-5b1e74215aff")
public class SwTimerResourceParameter extends TimerResourceParameter {
    @objid ("da308b5f-c043-4185-88a4-549174fd91c6")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Parameter";

    /**
     * Tells whether a {@link SwTimerResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwTimerResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("02c2588b-2722-4233-b37e-51b9967132e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwTimerResource_Parameter >> then instantiate a {@link SwTimerResourceParameter} proxy.
     * 
     * @return a {@link SwTimerResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("62562299-1e21-4768-9eee-e1f926898a27")
    public static SwTimerResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceParameter.STEREOTYPE_NAME);
        return SwTimerResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceParameter} proxy from a {@link Parameter} stereotyped << SwTimerResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwTimerResourceParameter} proxy or <i>null</i>.
     */
    @objid ("1ed763e0-19ec-42a8-90f4-e1b0ba211f68")
    public static SwTimerResourceParameter instantiate(final Parameter obj) {
        return SwTimerResourceParameter.canInstantiate(obj) ? new SwTimerResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceParameter} proxy from a {@link Parameter} stereotyped << SwTimerResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwTimerResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("33fcf6bd-09e8-4c05-aca3-3fd24f97eddd")
    public static SwTimerResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwTimerResourceParameter.canInstantiate(obj))
        	return new SwTimerResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d800d1f-bb71-4eaa-a7f3-b8b260391319")
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
        SwTimerResourceParameter other = (SwTimerResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("0805c91d-2cd3-42f8-8fa1-9cdfc2f58789")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("84e126a8-e0f1-4e5f-9635-c862014c4d4d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dd55abfa-8a1e-4e9c-8701-a76f60c998c0")
    protected SwTimerResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("0923cc48-fa93-45cd-878c-12a6f854d9f2")
    public static final class MdaTypes {
        @objid ("0fd33362-6da5-4677-8e41-572fc197d701")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba8bb452-44e9-459f-96ae-f3145fe0a408")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c91c627-190e-417a-b8e1-067859e9cf44")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e550d0c7-dc69-4ed3-ad52-b1a7c0632d04")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01dec05e-0ccf-11df-8525-001302895b2b");
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
