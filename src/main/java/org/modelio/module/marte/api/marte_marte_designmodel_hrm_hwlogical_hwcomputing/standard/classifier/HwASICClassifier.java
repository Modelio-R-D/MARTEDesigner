/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("b2010776-eddf-46cb-abed-dbb5248f17b2")
    public static final String STEREOTYPE_NAME = "HwASIC_Classifier";

    /**
     * Tells whether a {@link HwASICClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwASIC_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("388c573d-59e8-41cd-ab5a-c1c10ed27318")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwASIC_Classifier >> then instantiate a {@link HwASICClassifier} proxy.
     * 
     * @return a {@link HwASICClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("367a77b0-f3ca-4624-a5f5-89799581b447")
    public static HwASICClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICClassifier.STEREOTYPE_NAME);
        return HwASICClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwASICClassifier} proxy from a {@link Classifier} stereotyped << HwASIC_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwASICClassifier} proxy or <i>null</i>.
     */
    @objid ("a3e89308-733f-4632-8b30-c307ddbcbea5")
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
    @objid ("2b051ab3-c1d4-4d50-bb65-0b0506fd3863")
    public static HwASICClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwASICClassifier.canInstantiate(obj))
        	return new HwASICClassifier(obj);
        else
        	throw new IllegalArgumentException("HwASICClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cde5ffdb-ba6b-40d0-a906-e8c305ee8893")
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
    @objid ("fb8c4923-e410-458f-ab31-acb4ed935014")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("004ee409-32c0-482d-8d6e-5f67fb7b0de2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ed8fb5d6-8300-4f55-8ba0-6b4b395b5fc8")
    protected HwASICClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("2891b319-9cc7-4369-b6b5-d51677045f6d")
    public static final class MdaTypes {
        @objid ("39040c22-24b4-49e5-9715-e0fdea1c485b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c94d32a8-e375-4926-91ea-b95e46f6d66e")
        private static Stereotype MDAASSOCDEP;

        @objid ("60f58da9-a369-4643-a328-5402b5b6ab52")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8e13485-c8d7-4645-8dbc-b5474edae38a")
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
