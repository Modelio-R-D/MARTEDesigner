/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SharedDataComResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3a0c3707-f2e3-40f5-bed4-858eefc8dd28")
public class SharedDataComResourceClassifier extends SwCommunicationResourceClassifier {
    @objid ("fff4e5ab-5925-42f6-934b-174cc3ced013")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Classifier";

    @objid ("001ffd4f-636a-4c43-a4bc-41fcaf8fd14a")
    public static final String SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE = "SharedDataComResource_Classifier_readServices";

    @objid ("657b4035-4793-4920-87bb-9bcdb1af7b9e")
    public static final String SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE = "SharedDataComResource_Classifier_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SharedDataComResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0689325b-0ee5-431c-b5b7-d268325daa2d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SharedDataComResource_Classifier >> then instantiate a {@link SharedDataComResourceClassifier} proxy.
     * 
     * @return a {@link SharedDataComResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c3ada59c-a37f-4d2c-ab29-f512422fe389")
    public static SharedDataComResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceClassifier.STEREOTYPE_NAME);
        return SharedDataComResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceClassifier} proxy from a {@link Classifier} stereotyped << SharedDataComResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SharedDataComResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("994c7938-6f56-4aba-9dd0-4d24c0239cab")
    public static SharedDataComResourceClassifier instantiate(final Classifier obj) {
        return SharedDataComResourceClassifier.canInstantiate(obj) ? new SharedDataComResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceClassifier} proxy from a {@link Classifier} stereotyped << SharedDataComResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SharedDataComResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b4d08006-7490-4654-87f4-21f71537ec2f")
    public static SharedDataComResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SharedDataComResourceClassifier.canInstantiate(obj))
        	return new SharedDataComResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91529936-8a7f-49ee-95e2-b15c8fbbb670")
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
        SharedDataComResourceClassifier other = (SharedDataComResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("3ee66e11-fd97-48bb-b8d0-0e502576a547")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Classifier_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a00b13f-4f13-4bfd-88b4-5005575fcfb7")
    public List<String> getSharedDataComResource_Classifier_readServices() {
        return this.elt.getTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Classifier_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1c99933e-215f-4777-985e-5b717e3d9c40")
    public List<String> getSharedDataComResource_Classifier_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("5333d856-ac17-4a62-88ad-cee0cf8439d5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Classifier_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("691ef074-5035-4bbc-b947-00820cb1b432")
    public void setSharedDataComResource_Classifier_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Classifier_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("010cdf4e-6787-4988-b129-e16b97630e3b")
    public void setSharedDataComResource_Classifier_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceClassifier.MdaTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("ab3e55f1-90e7-414e-9725-fe1cbaf164b3")
    protected SharedDataComResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("92674742-39f3-40f6-9198-f277a707a570")
    public static final class MdaTypes {
        @objid ("9a3c5819-9340-4018-ba63-3f0b91f15eec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a8e5aa93-7305-4a58-9078-f0db71e6f4ec")
        public static TagType SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT;

        @objid ("893c3c00-acbf-417e-9ed4-81223decb0fb")
        public static TagType SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT;

        @objid ("cc684761-ea92-4a34-8f02-9b0b6dd407d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("decd5371-b63e-4632-88ba-82a95f5c1a93")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c656ceb-18eb-4a5c-8dfe-663e56e9dd25")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2dc3de00-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2dc3de01-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2dc3de02-10d8-11df-81d9-0014222a9f79");
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
