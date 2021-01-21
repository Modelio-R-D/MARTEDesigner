/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwSupport_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d96c583b-febd-433d-953a-4bfed908c7d0")
public class HwSupportClassifier extends HwDeviceClassifier {
    @objid ("f5743fac-8863-4b50-8c1a-e7be033830a0")
    public static final String STEREOTYPE_NAME = "HwSupport_Classifier";

    /**
     * Tells whether a {@link HwSupportClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwSupport_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fb3f2ce3-6fb1-4dca-8079-878daecb460b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwSupport_Classifier >> then instantiate a {@link HwSupportClassifier} proxy.
     * 
     * @return a {@link HwSupportClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("6a44e44c-e202-423d-b711-5e916e025f1a")
    public static HwSupportClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportClassifier.STEREOTYPE_NAME);
        return HwSupportClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportClassifier} proxy from a {@link Classifier} stereotyped << HwSupport_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwSupportClassifier} proxy or <i>null</i>.
     */
    @objid ("7f98e46a-b53c-4e16-8e55-46dde96603af")
    public static HwSupportClassifier instantiate(final Classifier obj) {
        return HwSupportClassifier.canInstantiate(obj) ? new HwSupportClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportClassifier} proxy from a {@link Classifier} stereotyped << HwSupport_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwSupportClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("951983a1-8017-4745-9f5f-d7cdf00586e1")
    public static HwSupportClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwSupportClassifier.canInstantiate(obj))
        	return new HwSupportClassifier(obj);
        else
        	throw new IllegalArgumentException("HwSupportClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0203389-489c-46aa-ac32-d030a9dd0d40")
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
        HwSupportClassifier other = (HwSupportClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("e1164abf-29a3-4eee-bf21-9b209aa9066d")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("8dfae581-6e92-471b-afa2-64866940a6a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e0843f71-95cb-478a-83c5-3b8b91cec139")
    protected HwSupportClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("a36475f2-8998-4d91-ada3-578f64c98349")
    public static final class MdaTypes {
        @objid ("5280dd7b-33ca-46db-9366-bc30264419ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("56cf7d37-7eae-4036-8836-3c2ac14105ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("75fcdb2a-6086-477b-8e6b-1ae179f7584a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96a9c445-7c2f-4812-ae18-6cb79e816369")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "791c2674-10b0-11df-81d9-0014222a9f79");
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
