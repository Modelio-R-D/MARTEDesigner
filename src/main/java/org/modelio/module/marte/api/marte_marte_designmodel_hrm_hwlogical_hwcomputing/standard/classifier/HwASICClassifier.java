/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwASIC_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b86bd0a6-8364-4ad5-bbd8-d280390777c7")
public class HwASICClassifier extends HwComputingResourceClassifier {
    @objid ("76afd183-96b9-4fa5-aa49-9446af9f9323")
    public static final String STEREOTYPE_NAME = "HwASIC_Classifier";

    /**
     * Tells whether a {@link HwASICClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwASIC_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2113ef4d-8e78-4c08-a391-f3c3406c8846")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwASIC_Classifier >> then instantiate a {@link HwASICClassifier} proxy.
     * 
     * @return a {@link HwASICClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("26b99614-c18b-4109-b803-1f05886d508e")
    public static HwASICClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICClassifier.STEREOTYPE_NAME);
        return HwASICClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwASICClassifier} proxy from a {@link Classifier} stereotyped << HwASIC_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwASICClassifier} proxy or <i>null</i>.
     */
    @objid ("44d08f92-cc5b-4594-bb19-23568f4792b3")
    public static HwASICClassifier instantiate(final Classifier obj) {
        return HwASICClassifier.canInstantiate(obj) ? new HwASICClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICClassifier} proxy from a {@link Classifier} stereotyped << HwASIC_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwASICClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3c80ebc8-1121-40b4-a719-a64f7cab3808")
    public static HwASICClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwASICClassifier.canInstantiate(obj))
        	return new HwASICClassifier(obj);
        else
        	throw new IllegalArgumentException("HwASICClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0aa3270d-8c1d-45ff-8dc8-1a1fbd21d827")
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
        HwASICClassifier other = (HwASICClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("5f147066-e689-4ab7-afcf-a538e21a44cf")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("30792105-1c05-4bf5-a718-7d631a858d07")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5473c8be-e00b-4427-9bf1-d64222e8215c")
    protected HwASICClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("2891b319-9cc7-4369-b6b5-d51677045f6d")
    public static final class MdaTypes {
        @objid ("71b3016c-c17b-4704-b956-066ca8599084")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("009ee9ac-7b30-4602-8fc6-01f74370ab58")
        private static Stereotype MDAASSOCDEP;

        @objid ("ec1b8b48-0c74-4239-a27b-ebd7a0e6a8ff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("41c4a54c-2cf6-4105-ae15-3ec2a068b773")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bbaee73f-10a3-11df-81d9-0014222a9f79");
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
