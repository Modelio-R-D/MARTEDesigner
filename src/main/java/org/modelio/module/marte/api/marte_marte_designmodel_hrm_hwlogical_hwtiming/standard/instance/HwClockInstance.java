/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwClock_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cd499dfc-f66b-4819-b5d3-084da18b5829")
public class HwClockInstance extends HwTimingResourceInstance {
    @objid ("67fef5c0-fedd-40f0-bad3-433347bd893f")
    public static final String STEREOTYPE_NAME = "HwClock_Instance";

    @objid ("178a2fc7-1413-4c12-bbda-209ead8d424a")
    public static final String HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE = "HwClock_Instance_frequency";

    /**
     * Tells whether a {@link HwClockInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwClock_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3f69beb8-8ee0-4bb1-b279-1ee6e63603b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwClockInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwClock_Instance >> then instantiate a {@link HwClockInstance} proxy.
     * 
     * @return a {@link HwClockInstance} proxy on the created {@link Instance}.
     */
    @objid ("a3bc012e-31d5-41cf-a7b8-22b64f489fa7")
    public static HwClockInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwClockInstance.STEREOTYPE_NAME);
        return HwClockInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwClockInstance} proxy from a {@link Instance} stereotyped << HwClock_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwClockInstance} proxy or <i>null</i>.
     */
    @objid ("15ef23ba-6b8a-42ce-af35-bbd7636a5b70")
    public static HwClockInstance instantiate(final Instance obj) {
        return HwClockInstance.canInstantiate(obj) ? new HwClockInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwClockInstance} proxy from a {@link Instance} stereotyped << HwClock_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwClockInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("548f5935-33b7-4fe1-8c2f-808418b73979")
    public static HwClockInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwClockInstance.canInstantiate(obj))
        	return new HwClockInstance(obj);
        else
        	throw new IllegalArgumentException("HwClockInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ee8c5e1a-667c-474e-8941-b0b6a4dccc89")
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
        HwClockInstance other = (HwClockInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("ceedadf1-d665-4aef-8031-9e7dfc83fd23")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwClock_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56902660-64cb-416c-8c57-a0633e7bad0b")
    public String getHwClock_Instance_frequency() {
        return this.elt.getTagValue(HwClockInstance.MdaTypes.HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    @objid ("1627f347-c10c-4cf4-9450-0a3e6f4d94c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwClock_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d3a1dc9f-4e4c-4dc9-89b1-961312018201")
    public void setHwClock_Instance_frequency(final String value) {
        this.elt.putTagValue(HwClockInstance.MdaTypes.HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    @objid ("50f99722-2c2e-4ecf-b4ab-3e14e692381f")
    protected HwClockInstance(final Instance elt) {
        super(elt);
    }

    @objid ("331bc33a-3120-44c0-a52c-871f96c0c6bd")
    public static final class MdaTypes {
        @objid ("584adceb-b141-4520-89f6-94cb4085ab0d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2773379e-128c-415e-b0c2-61666dbefa48")
        public static TagType HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("b34d4f1c-2634-41cb-bc50-acefd767200b")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2ed6056-78b8-40b7-846e-9618642d672f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8aa18db6-e51c-4d1a-9e30-7602c5dcf59a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01272dba-0ccf-11df-8525-001302895b2b");
            HWCLOCK_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f73f97a1-123c-11df-8f55-0014222a9f79");
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
